package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.Fan, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34963Fan {
    public final Context A00;
    public final Fragment A01;
    public final FragmentActivity A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final C34451FGp A05;
    public final C34452FGq A06;
    public final Reel A07;

    public static final String A00(C34963Fan c34963Fan) {
        Resources A0M = AbstractC166997dE.A0M(c34963Fan.A00);
        Reel reel = c34963Fan.A07;
        C1NB c1nb = reel.A0W;
        if (c1nb instanceof C6ZI) {
            C14360o3.A0A(c1nb);
            String AsH = c1nb.AsH();
            if (AsH != null && AsH.length() != 0) {
                C1NB c1nb2 = reel.A0W;
                C14360o3.A0A(c1nb2);
                return AbstractC166997dE.A0r(A0M, c1nb2.AsH(), 2131967864);
            }
            return null;
        }
        return null;
    }

    public C34963Fan(Context context, Fragment fragment, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C34451FGp c34451FGp, C34452FGq c34452FGq, Reel reel) {
        this.A02 = fragmentActivity;
        this.A00 = context;
        this.A03 = interfaceC11380iw;
        this.A01 = fragment;
        this.A07 = reel;
        this.A04 = userSession;
        this.A05 = c34451FGp;
        this.A06 = c34452FGq;
    }
}
