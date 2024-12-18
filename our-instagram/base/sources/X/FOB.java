package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* loaded from: classes6.dex */
public final class FOB {
    public Hashtag A00;
    public final Activity A01;
    public final Context A02;
    public final Fragment A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final InterfaceC37200GaB A06;
    public final String A07;
    public final VgT A08;

    public FOB(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC37200GaB interfaceC37200GaB, Hashtag hashtag, VgT vgT, String str) {
        AbstractC25234BEr.A0k(3, hashtag, userSession, str, interfaceC37200GaB);
        this.A03 = fragment;
        this.A02 = fragment.getContext();
        this.A01 = fragment.getActivity();
        this.A04 = interfaceC11380iw;
        this.A00 = hashtag;
        this.A05 = userSession;
        this.A07 = str;
        this.A06 = interfaceC37200GaB;
        this.A08 = vgT;
    }
}
