package X;

import java.util.Map;

/* renamed from: X.B8s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C25096B8s extends C0YY implements InterfaceC16660sJ {
    public static final C25096B8s A00 = new C25096B8s();

    public C25096B8s() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        StackTraceElement stackTraceElement;
        String str;
        Map map = (Map) obj;
        C14360o3.A0B(map, 0);
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String className = stackTrace[i2].getClassName();
            Map map2 = C0YZ.A03;
            if (className.equals(AbstractC13230m9.A00(AbstractC51572Yf.class))) {
                i = C17s.A03(i2 - 2, 0, length - 1);
            }
        }
        if (i != 0 && i != length - 1) {
            stackTraceElement = stackTrace[i];
        } else {
            stackTraceElement = null;
        }
        if (stackTraceElement != null) {
            str = stackTraceElement.getClassName();
        } else {
            str = null;
        }
        Object obj2 = "nothing";
        if (str == null) {
            str = "nothing";
        }
        String A0g = AnonymousClass001.A0g("<cls>", str, "</cls>");
        map.put("isSpec", false);
        map.put("component", A0g);
        StringBuilder A11 = AbstractC166997dE.A11(A0g);
        A11.append(':');
        if (stackTraceElement != null) {
            obj2 = Integer.valueOf(stackTraceElement.getLineNumber());
        }
        map.put("location", AbstractC166997dE.A0v(obj2, A11));
        return C0eB.A00;
    }
}
