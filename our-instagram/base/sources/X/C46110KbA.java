package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import com.instagram.clips.model.ClipsSpotlightData;
import com.instagram.clips.model.ClipsSpotlightModel;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import com.instagram.user.model.User;

/* renamed from: X.KbA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46110KbA extends AbstractC43757JWv implements InterfaceC60152ox {
    public L5B A00;
    public boolean A01;
    public C3I9 A02;
    public final Activity A03;
    public final UserSession A04;
    public final JX0 A05;
    public final C43756JWu A06;
    public final ClipsSpotlightData A07;
    public final AbstractC37552Gg8 A08;
    public final C37546Gg2 A09;

    public C46110KbA(Activity activity, ClipsSpotlightData clipsSpotlightData, UserSession userSession, AbstractC37552Gg8 abstractC37552Gg8, C37546Gg2 c37546Gg2, C43756JWu c43756JWu) {
        AbstractC25234BEr.A0j(2, c37546Gg2, userSession, activity, abstractC37552Gg8);
        this.A07 = clipsSpotlightData;
        this.A09 = c37546Gg2;
        this.A04 = userSession;
        this.A03 = activity;
        this.A08 = abstractC37552Gg8;
        this.A06 = c43756JWu;
        this.A05 = C36911no.A00().E6g(userSession);
    }

    @Override // X.AbstractC37623GhI, X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        L5B l5b = new L5B(view, new C43603JQj(this, 27), AbstractC43592JPx.A18(this, 37));
        this.A00 = l5b;
        IgImageView igImageView = l5b.A07;
        igImageView.setVisibility(0);
        Activity activity = this.A03;
        AbstractC31172DnG.A1E(activity.getResources(), igImageView, 2131955768);
        ViewOnClickListenerC48065LPq.A00(igImageView, 5, this);
        IgTextView igTextView = l5b.A05;
        igTextView.setVisibility(8);
        ViewOnClickListenerC48065LPq.A00(igTextView, 6, this);
        l5b.A06.setVisibility(8);
        ViewOnClickListenerC48065LPq.A00(l5b.A04, 7, this);
        C3I8 A01 = C3I7.A01(this, false, false);
        this.A02 = A01;
        A01.A9e(this);
        C3I9 c3i9 = this.A02;
        if (c3i9 == null) {
            C14360o3.A0F("keyboardHeightChangeDetector");
            throw C00O.createAndThrow();
        }
        c3i9.Edy(true);
        c3i9.Dnr(activity);
    }

    public static final C120985dq A00(C46110KbA c46110KbA) {
        int A03;
        C37556GgC c37556GgC = ((AbstractC37623GhI) c46110KbA).A02;
        if (c37556GgC == null || (A03 = c37556GgC.A03()) < 0) {
            return null;
        }
        AbstractC37552Gg8 abstractC37552Gg8 = c46110KbA.A09.A0A;
        if (A03 >= abstractC37552Gg8.A0B()) {
            return null;
        }
        return abstractC37552Gg8.A0F(A03);
    }

    public static final void A02(C46110KbA c46110KbA) {
        IgTextView igTextView;
        Editable editable;
        boolean z = c46110KbA.A01;
        L5B l5b = c46110KbA.A00;
        if (z) {
            if (l5b != null) {
                AbstractC167007dF.A0w(l5b.A05);
            }
            L5B l5b2 = c46110KbA.A00;
            if (l5b2 != null && (igTextView = l5b2.A05) != null) {
                ComposerAutoCompleteTextView composerAutoCompleteTextView = l5b2.A08;
                if (composerAutoCompleteTextView != null) {
                    editable = composerAutoCompleteTextView.getText();
                } else {
                    editable = null;
                }
                igTextView.setEnabled(AbstractC25225BEi.A1Y(String.valueOf(editable)));
                return;
            }
            return;
        }
        if (l5b == null) {
            return;
        }
        AbstractC167007dF.A0x(l5b.A05);
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        Drawable background;
        int i2;
        L5B l5b = this.A00;
        if (l5b != null) {
            this.A01 = AbstractC25230BEn.A1S(i, C30D.A01);
            l5b.A03.setTranslationY(-i);
            boolean z2 = this.A01;
            AbstractC37552Gg8 abstractC37552Gg8 = this.A08;
            if (z2) {
                abstractC37552Gg8.A0Y(true);
                A0C();
                l5b.A07.setVisibility(8);
                l5b.A01.setAlpha(1.0f);
                background = l5b.A00.getBackground();
                i2 = 255;
            } else {
                abstractC37552Gg8.A0Y(false);
                l5b.A07.setVisibility(0);
                l5b.A01.setAlpha(0.0f);
                background = l5b.A00.getBackground();
                if (background != null) {
                    i2 = 204;
                }
                A02(this);
            }
            background.setAlpha(i2);
            A02(this);
        }
    }

    public static final ClipsSpotlightModel A01(C46110KbA c46110KbA) {
        C38321qM c38321qM;
        String id;
        C120985dq A00 = A00(c46110KbA);
        if (A00 != null && (c38321qM = A00.A02) != null && (id = c38321qM.getId()) != null) {
            return (ClipsSpotlightModel) c46110KbA.A07.A00.get(id);
        }
        return null;
    }

    @Override // X.C38Y
    public final void DXa(int i, int i2) {
        View view;
        int i3;
        IgTextView igTextView;
        String str;
        ComposerAutoCompleteTextView composerAutoCompleteTextView;
        ClipsSpotlightModel A01 = A01(this);
        if (A01 != null) {
            User user = A01.A01;
            i3 = 0;
            if (user != null) {
                str = AbstractC166997dE.A0r(this.A03.getResources(), user.B8y(), 2131955771);
            } else {
                str = null;
            }
            L5B l5b = this.A00;
            if (l5b != null && (composerAutoCompleteTextView = l5b.A08) != null) {
                composerAutoCompleteTextView.setHint(str);
            }
            L5B l5b2 = this.A00;
            if (l5b2 != null) {
                view = l5b2.A02;
                view.setVisibility(i3);
            }
        } else {
            L5B l5b3 = this.A00;
            if (l5b3 != null) {
                view = l5b3.A02;
                i3 = 8;
                view.setVisibility(i3);
            }
        }
        A02(this);
        A0C();
        ClipsSpotlightModel A012 = A01(this);
        L5B l5b4 = this.A00;
        if (A012 != null) {
            if (l5b4 != null) {
                AbstractC167007dF.A0x(l5b4.A04);
                return;
            }
            return;
        }
        if (l5b4 != null) {
            AbstractC167007dF.A0w(l5b4.A04);
        }
        L5B l5b5 = this.A00;
        if (l5b5 == null || (igTextView = l5b5.A04) == null) {
            return;
        }
        igTextView.setText(2131955886);
    }

    @Override // X.AbstractC37623GhI, X.InterfaceC60602pj
    public final void onDestroyView() {
        super.onDestroyView();
        A0C();
        this.A00 = null;
        C3I9 c3i9 = this.A02;
        if (c3i9 != null) {
            c3i9.onStop();
            C3I9 c3i92 = this.A02;
            if (c3i92 != null) {
                c3i92.EFx(this);
                return;
            }
        }
        C14360o3.A0F("keyboardHeightChangeDetector");
        throw C00O.createAndThrow();
    }
}
