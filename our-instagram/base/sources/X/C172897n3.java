package X;

/* renamed from: X.7n3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C172897n3 {
    public AbstractC115105If A00;
    public final C191258dU A01;
    public final String A02;
    public final InterfaceC09390do A03;

    public C172897n3(C191258dU c191258dU, String str) {
        C14360o3.A0B(c191258dU, 1);
        this.A01 = c191258dU;
        this.A02 = str;
        this.A03 = AbstractC09440dt.A01(C172907n4.A00);
    }

    public final void A01(int i, Integer num) {
        C14360o3.A0B(num, 0);
        C006802i c006802i = C006802i.A0p;
        switch (num.intValue()) {
            case 0:
            case 1:
            case 2:
            case 3:
                c006802i.markerAnnotate(17631244, A00(this), "cache_type", AbstractC173337nl.A00(num));
                break;
            case 4:
            case 5:
                break;
            default:
                throw new RuntimeException();
        }
        c006802i.markerAnnotate(17631244, A00(this), "effects_count", i);
        c006802i.markerEnd(17631244, A00(this), (short) 2);
    }

    public static final int A00(C172897n3 c172897n3) {
        return ((Number) c172897n3.A03.getValue()).intValue();
    }
}
