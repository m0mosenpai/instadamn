package X;

import android.content.Context;

/* renamed from: X.0x8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0x8 extends AbstractRunnableC14200nk {
    public final /* synthetic */ C11860jl A00;
    public final /* synthetic */ AbstractC12990ll A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0x8(C11860jl c11860jl, AbstractC12990ll abstractC12990ll, String str) {
        super(1771305862, 3, true, false);
        this.A00 = c11860jl;
        this.A01 = abstractC12990ll;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        if (!C1AD.A06(C06090Tz.A05, 18299627287611773L)) {
            C11860jl c11860jl = this.A00;
            SYS sys = new SYS(new C11840jj(this.A01), new C11850jk(c11860jl));
            String str2 = this.A02;
            C16030qx c16030qx = C16030qx.A02;
            Context context = c11860jl.A00;
            String A05 = c16030qx.A05(context);
            if (AbstractC14490oL.A09(context)) {
                str = "3419628305025917";
            } else {
                str = "567067343352427";
            }
            sys.A00(str2, A05, str);
        }
    }
}
