package X;

import android.widget.ListView;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* loaded from: classes6.dex */
public final class Eg7 extends C1I2 implements GYO {
    public final ListView A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C31552Dtc A03;
    public final C68850Vd6 A04;
    public final java.util.Set A05;

    public Eg7(ListView listView, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C68850Vd6 c68850Vd6) {
        C14360o3.A0B(c68850Vd6, 3);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A04 = c68850Vd6;
        this.A00 = listView;
        this.A03 = new C31552Dtc(userSession, this);
        this.A05 = AbstractC166987dD.A1H();
    }

    @Override // X.GYO
    public final void EHl(UserSession userSession, int i) {
        Hashtag hashtag;
        String id;
        if (this.A04.A00.mUserVisibleHint) {
            Object itemAtPosition = this.A00.getItemAtPosition(i);
            if ((itemAtPosition instanceof Hashtag) && (hashtag = (Hashtag) itemAtPosition) != null) {
                java.util.Set set = this.A05;
                if (!AbstractC001800i.A0u(set, hashtag.getId()) && (id = hashtag.getId()) != null) {
                    set.add(id);
                }
            }
        }
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int A0N = AbstractC167017dG.A0N(c3fq, 1243050441);
        this.A03.onScroll(c3fq, i, i2, i3, i4, i5);
        C0f9.A0A(-2029326405, A0N);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        int A0N = AbstractC167017dG.A0N(c3fq, 1814557651);
        this.A03.onScrollStateChanged(c3fq, i);
        C0f9.A0A(1921945171, A0N);
    }
}
