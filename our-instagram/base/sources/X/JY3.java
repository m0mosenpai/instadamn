package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class JY3 extends C1KC {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C70783Fq A01;
    public final /* synthetic */ RecyclerView A02;
    public final /* synthetic */ C66362zD A03;
    public final /* synthetic */ JR2 A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JY3(C70783Fq c70783Fq, RecyclerView recyclerView, C66362zD c66362zD, JR2 jr2, int i) {
        super("prepopulateRecycledViewPoolForDirectInbox");
        this.A04 = jr2;
        this.A01 = c70783Fq;
        this.A00 = i;
        this.A03 = c66362zD;
        this.A02 = recyclerView;
    }

    @Override // X.C1KC
    public final boolean onQueueIdle() {
        C70783Fq c70783Fq;
        int i;
        JR2 jr2 = this.A04;
        if (!jr2.A1C && jr2.A1D) {
            UserSession A0p = jr2.A0p();
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, A0p, 36322516949215527L)) {
                InterfaceC09390do interfaceC09390do = jr2.A2M;
                if (((AbstractC69603Au) interfaceC09390do.getValue()).A01 || ((AbstractC69603Au) jr2.A0v()).A01) {
                    jr2.A0v().A0E("skip_preload_views_during_ttrc");
                    ((AbstractC69603Au) interfaceC09390do.getValue()).A0E("skip_preload_views_during_ttrc");
                    return C18U.A06(c06090Tz, jr2.A0p(), 36322516949346600L);
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            while (true) {
                c70783Fq = this.A01;
                i = this.A00;
                if (C70783Fq.A00(c70783Fq, i).A03.size() >= ((int) C18U.A01(c06090Tz, jr2.A0p(), 36603991925986312L)) || System.currentTimeMillis() - currentTimeMillis >= 8) {
                    break;
                }
                c70783Fq.A03(this.A03.createViewHolder(this.A02, i));
            }
            return !AbstractC43593JPy.A1Z(C70783Fq.A00(c70783Fq, i).A03.size(), AbstractC25225BEi.A07(c06090Tz, jr2.A0p(), 36603991925986312L));
        }
        return false;
    }
}
