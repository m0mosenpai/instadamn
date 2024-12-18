package X;

import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class EQC extends C2US implements InterfaceC65242xM {
    public InterfaceC65642y0 A00;
    public C155696yy A01;
    public C155706yz A02;
    public boolean A03;

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    @Override // android.widget.Adapter
    public final CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }

    @Override // X.C2US, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return false;
    }

    public final void A00(User user) {
        if (user != null) {
            clear();
            C155696yy c155696yy = this.A01;
            c155696yy.A0E = user;
            c155696yy.A0K = false;
            c155696yy.A00 = 0;
            c155696yy.A08 = null;
            c155696yy.A0D = null;
            c155696yy.A0C = null;
            c155696yy.A04 = null;
            c155696yy.A01 = null;
            c155696yy.A0B = null;
            c155696yy.A0J = false;
            c155696yy.A0H = null;
            c155696yy.A0G = null;
            c155696yy.A0F = null;
            c155696yy.A07 = null;
            c155696yy.A06 = null;
            c155696yy.A09 = null;
            c155696yy.A02 = null;
            c155696yy.A0M = false;
            c155696yy.A0I = false;
            c155696yy.A0L = false;
            c155696yy.A03 = null;
            addModel(c155696yy, this.A02, this.A00);
            if (this.A03) {
                notifyDataSetChangedSmart();
            } else {
                updateListView();
            }
        }
    }
}
