package X;

import com.instagram.music.profile.musiconprofile.MusicOnProfileProvider;
import java.util.Collections;

/* loaded from: classes7.dex */
public final class HG3 extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    public HG3(Object obj, Object obj2, String str, int i, boolean z) {
        this.A00 = i;
        this.A04 = z;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = obj2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N;
        int i;
        if (this.A00 != 0) {
            A0N = C0f9.A03(136909761);
            MusicOnProfileProvider musicOnProfileProvider = (MusicOnProfileProvider) this.A02;
            if (AbstractC167007dF.A1Z(musicOnProfileProvider.A05)) {
                musicOnProfileProvider.A04(null, this.A03);
            } else {
                musicOnProfileProvider.A00 = true;
            }
            ((InterfaceC23621Ds) this.A01).resumeWith(null);
            i = -562374916;
        } else {
            A0N = AbstractC167017dG.A0N(abstractC115105If, 1487462280);
            super.onFail(abstractC115105If);
            ((JH1) this.A01).DGi();
            i = 207526091;
        }
        C0f9.A0A(i, A0N);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(1522347716);
            H95 h95 = (H95) obj;
            int A0N = AbstractC167017dG.A0N(h95, -142189475);
            MusicOnProfileProvider musicOnProfileProvider = (MusicOnProfileProvider) this.A02;
            MWW A00 = MusicOnProfileProvider.A00(h95);
            if (AbstractC167007dF.A1Z(musicOnProfileProvider.A05)) {
                musicOnProfileProvider.A04(A00, this.A03);
            } else if (this.A04) {
                musicOnProfileProvider.A00 = true;
                musicOnProfileProvider.A01.A0A(A00);
            }
            ((InterfaceC23621Ds) this.A01).resumeWith(A00);
            C0f9.A0A(1707674091, A0N);
            i = 875940716;
        } else {
            A03 = C0f9.A03(-1791544082);
            C38894HAq c38894HAq = (C38894HAq) obj;
            int A0N2 = AbstractC167017dG.A0N(c38894HAq, -1816331032);
            super.onSuccess(c38894HAq);
            C35003Fba c35003Fba = new C35003Fba(c38894HAq.A02, Collections.unmodifiableList(c38894HAq.A04), Collections.unmodifiableMap(c38894HAq.A03), c38894HAq.A00, c38894HAq.A01);
            if (this.A04) {
                C42341Ip3 c42341Ip3 = (C42341Ip3) ((AbstractC12990ll) this.A02).A01(C42341Ip3.class, J7Y.A00);
                c42341Ip3.A00.put(this.A03, new C26076Bg5(System.currentTimeMillis(), c35003Fba, 5));
            }
            ((JH1) this.A01).DVY(c35003Fba);
            C0f9.A0A(-1018805453, A0N2);
            i = -661194785;
        }
        C0f9.A0A(i, A03);
    }
}
