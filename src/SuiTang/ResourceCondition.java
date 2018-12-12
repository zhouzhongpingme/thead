package SuiTang;

/**
 * 宇宙的能量系统
 * 遵循能量守恒定律：
 * 能量不会凭空产生或消失,只会从一处转移到另一处
 */
public class ResourceCondition {
    //能量盒子,能量存储的地方
    private final double[] energyBoxes;

    public ResourceCondition(double[] energyBoxes) {
        this.energyBoxes = energyBoxes;
    }
}
