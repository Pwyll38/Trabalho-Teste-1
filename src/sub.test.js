const { sub } = require("./index");

describe("calculadora", () => {
  describe("subtração", () => {
    test("dois números positivos", () => {
      const result = sub(5, 2);
      expect(result).toBe(3);
    });
  });
});
