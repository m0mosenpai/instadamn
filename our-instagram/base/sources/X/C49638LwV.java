package X;

import android.content.res.Resources;
import android.view.View;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* renamed from: X.LwV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49638LwV implements MPG {
    public final int A00;
    public final Object A01;

    public C49638LwV(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.MPG
    public final void DU7(int i, int i2) {
        View view;
        ComposerAutoCompleteTextView composerAutoCompleteTextView;
        View view2;
        InterfaceC50491MQt interfaceC50491MQt;
        IgdsBottomButtonLayout igdsBottomButtonLayout;
        String A0t;
        IgdsBottomButtonLayout igdsBottomButtonLayout2;
        switch (this.A00) {
            case 0:
                KCY kcy = (KCY) this.A01;
                if (kcy.A0Q && (interfaceC50491MQt = kcy.A0C) != null) {
                    interfaceC50491MQt.CoY();
                }
                C48632Lf9 c48632Lf9 = kcy.A0E;
                if (kcy.A0U && c48632Lf9 != null) {
                    View view3 = kcy.A05;
                    if (view3 != null) {
                        AbstractC125325le A00 = AbstractC125325le.A00(view3);
                        C14360o3.A07(A00);
                        if (A00.A0W()) {
                            ME5 me5 = new ME5(44, A00, kcy, c48632Lf9);
                            A00.A05 = new C44065Jdq((InterfaceC16820sZ) me5, 11);
                            A00.A07 = new C71048Wn3(me5, 1);
                        } else {
                            KCY.A02(kcy, c48632Lf9);
                        }
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
                if (i > 0) {
                    if (i2 == 0) {
                        if (kcy.A0X) {
                            KCT A002 = KCY.A00(kcy);
                            if (!kcy.A0W || (A002 != null && A002.A02())) {
                                if (kcy.A0U) {
                                    view2 = kcy.A05;
                                } else if (kcy.A0Y) {
                                    view2 = kcy.A06;
                                } else {
                                    view2 = kcy.A0I;
                                }
                                if (view2 != null) {
                                    AbstractC125325le A0E = AbstractC43592JPx.A0o(view2, 0).A0E(KCY.A0s);
                                    A0E.A0T(AbstractC13890nF.A00(AbstractC166997dE.A0L(view2)), 0.0f);
                                    A0E.A04 = 0;
                                    A0E.A0H();
                                }
                            }
                        }
                        if (kcy.A0X) {
                            KCY.A01(null, kcy, 0, true, ((C44526JmW) kcy.A0k.getValue()).A01());
                        }
                    }
                    if (kcy.A0I != null) {
                        String str = kcy.A0L;
                        if (str == null) {
                            str = AbstractC167017dG.A0k(AbstractC166997dE.A0N(kcy), i, R.plurals.direct_media_composer_send_button_description);
                            C14360o3.A07(str);
                        }
                        IgdsBottomButtonLayout igdsBottomButtonLayout3 = kcy.A0I;
                        if (igdsBottomButtonLayout3 != null) {
                            igdsBottomButtonLayout3.setPrimaryActionText(str);
                        }
                    }
                } else if (i == 0) {
                    if (kcy.A0U) {
                        view = kcy.A05;
                    } else if (kcy.A0Y) {
                        view = kcy.A06;
                    } else {
                        view = kcy.A0I;
                    }
                    if (view != null && view.getVisibility() == 0) {
                        AbstractC125325le A0E2 = AbstractC43592JPx.A0n(view).A0E(KCY.A0s);
                        A0E2.A0K(AbstractC13890nF.A00(AbstractC166997dE.A0L(view)));
                        A0E2.A03 = 4;
                        A0E2.A0H();
                    }
                    C48632Lf9 c48632Lf92 = kcy.A0E;
                    if (c48632Lf92 != null && (composerAutoCompleteTextView = c48632Lf92.A00.A09) != null) {
                        AbstractC13880nE.A0O(composerAutoCompleteTextView);
                    }
                }
                InterfaceC50491MQt interfaceC50491MQt2 = kcy.A0C;
                if (interfaceC50491MQt2 == null) {
                    return;
                }
                interfaceC50491MQt2.DkK(i);
                return;
            case 1:
                return;
            default:
                if (i > 0) {
                    if (i2 == 0 && (igdsBottomButtonLayout2 = ((KDA) this.A01).A01) != null) {
                        AbstractC125325le A0E3 = AbstractC43592JPx.A0o(igdsBottomButtonLayout2, 0).A0E(KDA.A08);
                        A0E3.A0T(AbstractC13890nF.A00(AbstractC166997dE.A0L(igdsBottomButtonLayout2)), 0.0f);
                        A0E3.A04 = 0;
                        A0E3.A0H();
                    }
                    KDA kda = (KDA) this.A01;
                    IgdsBottomButtonLayout igdsBottomButtonLayout4 = kda.A01;
                    if (igdsBottomButtonLayout4 != null) {
                        Resources A0N = AbstractC166997dE.A0N(kda);
                        if (i == 1) {
                            A0t = A0N.getString(2131973280);
                        } else {
                            A0t = AbstractC43594JPz.A0t(A0N, i, 2131966076);
                        }
                        igdsBottomButtonLayout4.setPrimaryActionText(A0t);
                        return;
                    }
                    return;
                }
                if (i != 0 || (igdsBottomButtonLayout = ((KDA) this.A01).A01) == null || igdsBottomButtonLayout.getVisibility() != 0) {
                    return;
                }
                AbstractC125325le A0E4 = AbstractC43592JPx.A0n(igdsBottomButtonLayout).A0E(KDA.A08);
                A0E4.A0K(AbstractC13890nF.A00(AbstractC166997dE.A0L(igdsBottomButtonLayout)));
                A0E4.A03 = 4;
                A0E4.A0H();
                return;
        }
    }
}
