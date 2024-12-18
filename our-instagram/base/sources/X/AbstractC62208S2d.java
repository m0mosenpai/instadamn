package X;

@Deprecated
/* renamed from: X.S2d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62208S2d {
    public static void A00(String str, Object obj) {
        C60687RMf c60687RMf = C60687RMf.A00;
        if (c60687RMf != null) {
            c60687RMf.A0G(str, obj);
            return;
        }
        if (obj != null) {
            String valueOf = String.valueOf(obj);
            StringBuilder A15 = AbstractC58320PtC.A15(valueOf, AbstractC58319PtB.A05(str) + 1);
            A15.append(str);
            str = MSZ.A0u(":", valueOf, A15);
        }
        android.util.Log.e((String) SVM.A0D.A00, str);
    }
}
