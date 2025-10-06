const { sum, sub, mul, div } = require("./index");

describe("calculadora", () => {
  describe("soma", () => {
    test("dois números positivos", () => {
      const result = sum(1, 2);
      expect(result).toBe(3);
    });
  });

  describe("subtração", () => {
    test("dois números positivos", () => {
      const result = sub(5, 2);
      expect(result).toBe(3);
    });
  });

  describe("multiplicação", () => {
    test("dois números positivos", () => {
      const result = mul(5, 2);
      expect(result).toBe(10);
    });
  });

  describe("divisão", () => {
    test("dois números positivos", () => {
      const result = div(10, 2);
      expect(result).toBe(5);
    });
  });
});

