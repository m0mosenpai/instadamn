package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.LocationListFragmentMode;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;

/* loaded from: classes11.dex */
public final class WDY {
    public final AbstractC10360h2 A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final String A06;
    public final Fragment A07;
    public int A02 = -1;
    public int A01 = -1;
    public int A00 = -1;

    public static void A00(MediaMapFragment mediaMapFragment) {
        MediaMapFragment.A0A(mediaMapFragment, true);
        mediaMapFragment.A0B.A04();
        mediaMapFragment.A0B.A05(null, mediaMapFragment.A0E, true);
    }

    public static boolean A01(WDY wdy) {
        int i;
        AbstractC10360h2 abstractC10360h2 = wdy.A03;
        int A0L = abstractC10360h2.A0L();
        if (A0L == 0) {
            i = -2;
        } else {
            i = ((C14240no) abstractC10360h2.A0S(A0L - 1)).A00;
        }
        if (i == wdy.A00) {
            abstractC10360h2.A0b();
            return true;
        }
        return false;
    }

    public final AbstractC67879V0k A02() {
        Fragment A0O = this.A03.A0O(R.id.fragment_container);
        if (A0O == null) {
            return null;
        }
        return (AbstractC67879V0k) A0O;
    }

    public final void A03() {
        Bundle bundle = new Bundle();
        AbstractC31173DnH.A1C(bundle, this.A05);
        bundle.putString("arg_session_id", this.A06);
        bundle.putParcelable("arg_query", MediaMapQuery.A08);
        bundle.putParcelable("arg_list_mode", LocationListFragmentMode.A03);
        AbstractC67879V0k abstractC67879V0k = new AbstractC67879V0k();
        abstractC67879V0k.setArguments(bundle);
        A04();
        C14240no c14240no = new C14240no(this.A03);
        c14240no.A0A(abstractC67879V0k, R.id.fragment_container);
        c14240no.A0I("HOME");
        this.A02 = c14240no.A0J(false);
    }

    public final void A04() {
        int i = this.A02;
        if (i != -1) {
            this.A03.A0d(i, 0, false);
        }
    }

    public final void A05(Bundle bundle, MediaMapQuery mediaMapQuery, boolean z) {
        Bundle bundle2 = new Bundle();
        AbstractC31173DnH.A1C(bundle2, this.A05);
        bundle2.putParcelable("arg_query", mediaMapQuery);
        bundle2.putParcelable("arg_list_mode", LocationListFragmentMode.A03);
        bundle2.putString("arg_session_id", this.A06);
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        AbstractC67879V0k abstractC67879V0k = new AbstractC67879V0k();
        abstractC67879V0k.setArguments(bundle2);
        A04();
        C14240no c14240no = new C14240no(this.A03);
        if (z) {
            c14240no.A07(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out);
        }
        c14240no.A0A(abstractC67879V0k, R.id.fragment_container);
        c14240no.A0I("LIST");
        this.A01 = c14240no.A0J(false);
    }

    public WDY(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        this.A05 = userSession;
        this.A07 = fragment;
        this.A03 = fragment.getChildFragmentManager();
        this.A06 = str;
        this.A04 = interfaceC11380iw;
    }
}
