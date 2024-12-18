package X;

import com.facebook.systrace.Systrace;

/* renamed from: X.60M, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C60M extends C58J implements InterfaceC114155Db, InterfaceC1129458d {
    public C114205Dh A00;
    public InterfaceC136496Gd A01;
    public String A02;
    public InterfaceC16620sF A03;
    public boolean A04;
    public final C18240vB A05;

    public C60M(InterfaceC136496Gd interfaceC136496Gd, String str, InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(interfaceC136496Gd, 2);
        C14360o3.A0B(interfaceC16620sF, 3);
        this.A02 = str;
        this.A01 = interfaceC136496Gd;
        this.A03 = interfaceC16620sF;
        this.A05 = new C18240vB(AbstractC14350nz.A00());
    }

    private final void A00() {
        if (false != this.A04) {
            this.A04 = false;
            if (Systrace.A0E(1L)) {
                C0fO.A01("VisibilityDetectorModifier.onItemVisibleChange", 808849646);
            }
            try {
                this.A03.invoke(this.A02, false);
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-307198566);
                }
            } catch (Throwable th) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(1151075023);
                }
                throw th;
            }
        }
    }

    @Override // X.InterfaceC114155Db
    public final void DJc(final InterfaceC1131459c interfaceC1131459c) {
        C14360o3.A0B(interfaceC1131459c, 0);
        if (C18U.A06(C06090Tz.A05, (AbstractC12990ll) C5Zy.A00(AbstractC117935Vd.A00, this), 36326266455406382L)) {
            A01(interfaceC1131459c, this);
        } else {
            this.A05.ATO(new AbstractRunnableC14200nk() { // from class: X.6Ky
                @Override // java.lang.Runnable
                public final void run() {
                    C60M.A01(interfaceC1131459c, this);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1719668807, 3, false, false);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8 A[Catch: IndexOutOfBoundsException -> 0x0109, IllegalArgumentException -> 0x0114, IllegalStateException -> 0x011f, NullPointerException -> 0x012a, all -> 0x0145, TryCatch #7 {IllegalArgumentException -> 0x0114, IllegalStateException -> 0x011f, blocks: (B:15:0x0014, B:17:0x001a, B:33:0x00a8, B:36:0x00c1, B:37:0x00c4, B:39:0x00c8, B:41:0x00d2, B:44:0x00e3, B:46:0x00e9, B:49:0x00f1, B:52:0x0105, B:53:0x0108, B:60:0x00b8, B:64:0x00fc), top: B:14:0x0014, outer: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.InterfaceC1131459c r12, X.C60M r13) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60M.A01(X.59c, X.60M):void");
    }
}
