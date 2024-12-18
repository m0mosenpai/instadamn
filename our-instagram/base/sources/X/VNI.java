package X;

/* loaded from: classes11.dex */
public abstract class VNI {
    public static final VEM A00(String str) {
        C14360o3.A0B(str, 0);
        VEM vem = (VEM) VEM.A02.get(str);
        if (vem != null) {
            return vem;
        }
        throw AbstractC167007dF.A0c("ContainerType Type is not found for identifier => ", str);
    }
}
