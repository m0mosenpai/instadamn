package X;

import java.io.Serializable;

/* renamed from: X.461, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass461 implements Serializable {
    public final AnonymousClass464[] A00;
    public final AnonymousClass463[] A01;
    public final AnonymousClass462[] A02;
    public final AnonymousClass467[] A03;
    public final AnonymousClass465[] A04;
    public static final AnonymousClass462[] A07 = new AnonymousClass462[0];
    public static final AnonymousClass463[] A06 = new AnonymousClass463[0];
    public static final AnonymousClass464[] A05 = new AnonymousClass464[0];
    public static final AnonymousClass465[] A09 = new AnonymousClass465[0];
    public static final AnonymousClass467[] A08 = {new Object()};

    public AnonymousClass461(AnonymousClass464[] anonymousClass464Arr, AnonymousClass463[] anonymousClass463Arr, AnonymousClass462[] anonymousClass462Arr, AnonymousClass467[] anonymousClass467Arr, AnonymousClass465[] anonymousClass465Arr) {
        this.A02 = anonymousClass462Arr == null ? A07 : anonymousClass462Arr;
        this.A03 = anonymousClass467Arr == null ? A08 : anonymousClass467Arr;
        this.A01 = anonymousClass463Arr == null ? A06 : anonymousClass463Arr;
        this.A00 = anonymousClass464Arr == null ? A05 : anonymousClass464Arr;
        this.A04 = anonymousClass465Arr == null ? A09 : anonymousClass465Arr;
    }

    public AnonymousClass461() {
        this(null, null, null, null, null);
    }
}
