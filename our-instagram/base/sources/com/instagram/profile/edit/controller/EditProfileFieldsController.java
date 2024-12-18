package com.instagram.profile.edit.controller;

import X.AbstractC001900j;
import X.AbstractC018607g;
import X.AbstractC111324zv;
import X.AbstractC12220kQ;
import X.AbstractC154246wZ;
import X.AbstractC1565371b;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25225BEi;
import X.AbstractC25228BEl;
import X.AbstractC25651Mw;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC31178DnM;
import X.AbstractC36054Fvq;
import X.AbstractC36055Fvr;
import X.AbstractC41774Ieq;
import X.AbstractC56372iV;
import X.AbstractC60592pi;
import X.AbstractC76433bn;
import X.C00O;
import X.C05F;
import X.C06090Tz;
import X.C07X;
import X.C0fQ;
import X.C106904rr;
import X.C14360o3;
import X.C151366re;
import X.C16930sl;
import X.C18U;
import X.C19270xB;
import X.C1XM;
import X.C25531Mh;
import X.C25671My;
import X.C31728DwZ;
import X.C34649FOh;
import X.C35144Fel;
import X.C36099FwZ;
import X.C36109Fwj;
import X.C36115Fwp;
import X.C36577GBb;
import X.C36A;
import X.C57012jc;
import X.C57663PiE;
import X.C57748Pjb;
import X.C57750Pjd;
import X.C73I;
import X.C73K;
import X.C81763ko;
import X.C9EO;
import X.EnumC53237Nga;
import X.FEU;
import X.G8I;
import X.G8K;
import X.G9B;
import X.G9O;
import X.GMA;
import X.GSw;
import X.HandlerC31739Dws;
import X.InterfaceC02590Ai;
import X.InterfaceC09390do;
import X.InterfaceC37218GaT;
import X.InterfaceC41501vz;
import X.InterfaceC56392iX;
import X.InterfaceC81183jn;
import X.InterfaceC81733ki;
import X.OIW;
import X.ViewOnClickListenerC31724DwT;
import X.ViewOnClickListenerC35574FnR;
import X.ViewOnClickListenerC35668Fp3;
import X.ViewOnClickListenerC35684FpJ;
import X.ViewOnClickListenerC55456OkA;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.aistudio.profile.model.AiStudioProfileBannerModel;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.profile.edit.controller.editcontrollerbarcelona.EditProfileBarcelonaController;
import com.instagram.profile.edit.controller.editcontrollerexpression.EditProfileExpressionController;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class EditProfileFieldsController extends AbstractC60592pi {
    public ScrollView A00;
    public C07X A01;
    public C34649FOh A02;
    public OIW A03;
    public InterfaceC37218GaT A04;
    public EditProfileExpressionController A05;
    public User A06;
    public EditProfileBarcelonaController A07;
    public boolean A08;
    public boolean A09;
    public final AbstractC018607g A0A;
    public final C19270xB A0B;
    public final UserSession A0C;
    public final InterfaceC41501vz A0D;
    public final InterfaceC41501vz A0E;
    public final InterfaceC41501vz A0F;
    public final InterfaceC41501vz A0G;
    public final InterfaceC41501vz A0H;
    public final boolean A0I;
    public FragmentActivity activity;
    public IgdsListCell bannerTextCell;
    public IgFormField bioField;
    public IgdsListCell channelsTextCell;
    public IgdsListCell highlightsMigrationTextCell;
    public InterfaceC56392iX interestRowViewStubHolder;
    public IgdsListCell linksTextCell;
    public InterfaceC56392iX profileInterestRowStub;
    public IgFormField pronounsField;
    public C57012jc relatedAccountsStub;
    public View view;

    public EditProfileFieldsController(AbstractC018607g abstractC018607g, UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A0C = userSession;
        this.A0A = abstractC018607g;
        this.A0I = z;
        this.A0B = AbstractC31171DnF.A0D("edit_profile_fields_controller");
        C31728DwZ A00 = C31728DwZ.A00(this, 16);
        this.A0H = A00;
        C31728DwZ A002 = C31728DwZ.A00(this, 14);
        this.A0F = A002;
        C31728DwZ A003 = C31728DwZ.A00(this, 13);
        this.A0E = A003;
        C31728DwZ A004 = C31728DwZ.A00(this, 12);
        this.A0D = A004;
        C31728DwZ A005 = C31728DwZ.A00(this, 15);
        this.A0G = A005;
        C25671My A006 = AbstractC25651Mw.A00(userSession);
        A006.A01(A003, C36099FwZ.class);
        A006.A01(A00, AbstractC36055Fvr.class);
        A006.A01(A004, C36115Fwp.class);
        A006.A01(A002, AbstractC36054Fvq.class);
        A006.A01(A005, C36109Fwj.class);
    }

    public final void A0C(View view, ScrollView scrollView, FragmentActivity fragmentActivity, C07X c07x, OIW oiw, InterfaceC37218GaT interfaceC37218GaT, User user, boolean z, boolean z2) {
        int A06 = AbstractC167007dF.A06(1, view, scrollView);
        C14360o3.A0B(user, 8);
        this.A01 = c07x;
        this.A04 = interfaceC37218GaT;
        this.activity = fragmentActivity;
        this.view = view;
        this.A00 = scrollView;
        this.A03 = oiw;
        this.A09 = z;
        this.A08 = z2;
        UserSession userSession = this.A0C;
        C19270xB c19270xB = this.A0B;
        GSw gSw = new GSw(this, 28);
        Context baseContext = fragmentActivity.getBaseContext();
        C14360o3.A07(baseContext);
        C57748Pjb c57748Pjb = new C57748Pjb(this, 21);
        boolean z3 = this.A0I;
        this.A07 = new EditProfileBarcelonaController(baseContext, c19270xB, userSession, user, gSw, c57748Pjb, z3);
        GSw gSw2 = new GSw(this, 29);
        Context baseContext2 = fragmentActivity.getBaseContext();
        C14360o3.A07(baseContext2);
        EditProfileExpressionController editProfileExpressionController = new EditProfileExpressionController(baseContext2, userSession, new G8K(A06, fragmentActivity, new GSw(this, 30)), gSw2, new C57748Pjb(this, 22), z, z3);
        this.A05 = editProfileExpressionController;
        if (editProfileExpressionController.usernameField == null) {
            editProfileExpressionController.usernameField = AbstractC31172DnG.A0k(view, R.id.username);
            FEU.A00 = new HandlerC31739Dws(new C36577GBb(editProfileExpressionController));
            IgFormField igFormField = editProfileExpressionController.usernameField;
            if (igFormField != null) {
                igFormField.setVisibility(AbstractC31175DnJ.A01(editProfileExpressionController.A04 ? 1 : 0));
            }
        }
        if (editProfileExpressionController.nameField == null) {
            IgFormField A0k = AbstractC31172DnG.A0k(view, R.id.full_name);
            editProfileExpressionController.nameField = A0k;
            if (!editProfileExpressionController.A03 && A0k != null) {
                A0k.setRuleChecker(new G8I(AbstractC166997dE.A0p(editProfileExpressionController.A00, 2131972450)));
            }
        }
        IgFormField igFormField2 = (IgFormField) AbstractC166997dE.A0R(view, R.id.pronouns);
        C14360o3.A0B(igFormField2, 0);
        this.pronounsField = igFormField2;
        igFormField2.setVisibility(AbstractC31175DnJ.A01(z3 ? 1 : 0));
        IgFormField igFormField3 = (IgFormField) AbstractC166997dE.A0R(view, R.id.bio);
        C14360o3.A0B(igFormField3, 0);
        this.bioField = igFormField3;
        A07().setVisibility(0);
        if (!z2) {
            A07().setRuleChecker(new G8I(AbstractC166997dE.A0p(A06(), 2131972450)));
        }
        A07().getMEditText().addTextChangedListener(C106904rr.A00(userSession));
        IgdsListCell igdsListCell = (IgdsListCell) AbstractC166997dE.A0R(view, R.id.links_text_cell);
        C14360o3.A0B(igdsListCell, 0);
        this.linksTextCell = igdsListCell;
        this.relatedAccountsStub = AbstractC31177DnL.A0U(view, R.id.related_accounts_stub);
        IgdsListCell igdsListCell2 = (IgdsListCell) AbstractC166997dE.A0R(view, R.id.channels_text_cell);
        C14360o3.A0B(igdsListCell2, 0);
        this.channelsTextCell = igdsListCell2;
        IgdsListCell igdsListCell3 = (IgdsListCell) AbstractC166997dE.A0R(view, R.id.banner_text_cell);
        C14360o3.A0B(igdsListCell3, 0);
        this.bannerTextCell = igdsListCell3;
        IgdsListCell igdsListCell4 = (IgdsListCell) AbstractC166997dE.A0R(view, R.id.highlight_management_row_stub);
        C14360o3.A0B(igdsListCell4, 0);
        this.highlightsMigrationTextCell = igdsListCell4;
        this.interestRowViewStubHolder = AbstractC56372iV.A01(view.requireViewById(R.id.interest_row_stub), false, false);
        boolean A062 = C18U.A06(C06090Tz.A05, userSession, 36316327899566318L);
        InterfaceC56392iX interfaceC56392iX = this.interestRowViewStubHolder;
        if (!A062) {
            if (interfaceC56392iX != null) {
                interfaceC56392iX.setVisibility(8);
                return;
            }
        } else if (interfaceC56392iX != null) {
            interfaceC56392iX.setVisibility(0);
            InterfaceC56392iX interfaceC56392iX2 = this.interestRowViewStubHolder;
            if (interfaceC56392iX2 != null) {
                this.profileInterestRowStub = AbstractC56372iV.A01(interfaceC56392iX2.getView().requireViewById(R.id.profile_interest_row_stub), false, false);
                return;
            }
        }
        C14360o3.A0F("interestRowViewStubHolder");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onSaveInstanceState(Bundle bundle) {
        IgFormField igFormField;
        IgFormField igFormField2;
        C14360o3.A0B(bundle, 0);
        EditProfileExpressionController editProfileExpressionController = this.A05;
        if (editProfileExpressionController != null && (igFormField2 = editProfileExpressionController.nameField) != null) {
            bundle.putString("bundle_name_field", AbstractC31174DnI.A0x(igFormField2));
        }
        EditProfileExpressionController editProfileExpressionController2 = this.A05;
        if (editProfileExpressionController2 != null && (igFormField = editProfileExpressionController2.usernameField) != null) {
            bundle.putString("bundle_username_field", AbstractC31174DnI.A0x(igFormField));
        }
        if (this.bioField != null) {
            bundle.putString("bundle_bio_field", AbstractC31174DnI.A0x(A07()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r4.BdF().isEmpty() != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00() {
        /*
            r5 = this;
            com.instagram.common.session.UserSession r3 = r5.A0C
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316778871198350(0x8105eb0001128e, double:3.030215421852083E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L60
            X.17P r0 = X.AbstractC31174DnI.A0m(r3)
            X.3jn r4 = r0.BdE()
            r2 = 0
            if (r4 == 0) goto L25
            java.util.List r0 = r4.BdF()
            boolean r0 = r0.isEmpty()
            r3 = 1
            if (r0 == 0) goto L26
        L25:
            r3 = 0
        L26:
            com.instagram.igds.components.textcell.IgdsListCell r0 = r5.channelsTextCell
            if (r0 == 0) goto L6d
            r0.setVisibility(r2)
            com.instagram.igds.components.textcell.IgdsListCell r1 = r5.channelsTextCell
            if (r1 == 0) goto L6d
            r0 = 2131970099(0x7f134833, float:1.957714E38)
            if (r3 == 0) goto L39
            r0 = 2131970100(0x7f134834, float:1.9577142E38)
        L39:
            r1.A06(r0)
            if (r3 == 0) goto L61
            if (r4 == 0) goto L68
            java.util.List r0 = r4.BdF()
            int r0 = r0.size()
            com.instagram.igds.components.textcell.IgdsListCell r1 = r5.channelsTextCell
            if (r1 == 0) goto L6d
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L50:
            r1.A0K(r0, r2)
            com.instagram.igds.components.textcell.IgdsListCell r2 = r5.channelsTextCell
            if (r2 == 0) goto L6d
            r1 = 7
            X.Fp4 r0 = new X.Fp4
            r0.<init>(r1, r5, r3)
            X.C0fQ.A00(r0, r2)
        L60:
            return
        L61:
            com.instagram.igds.components.textcell.IgdsListCell r1 = r5.channelsTextCell
            if (r1 == 0) goto L6d
            java.lang.String r0 = ""
            goto L50
        L68:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        L6d:
            java.lang.String r0 = "channelsTextCell"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.edit.controller.EditProfileFieldsController.A00():void");
    }

    private final void A01() {
        String str;
        int i;
        IgdsListCell igdsListCell;
        String str2;
        int i2;
        int i3;
        List list;
        List B9F;
        List BdF;
        IgdsListCell igdsListCell2 = this.bannerTextCell;
        if (igdsListCell2 != null) {
            igdsListCell2.setVisibility(0);
            User user = this.A06;
            if (user != null) {
                UserSession userSession = this.A0C;
                InterfaceC37218GaT interfaceC37218GaT = this.A04;
                if (interfaceC37218GaT == null) {
                    str = "dataProvider";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                AiStudioProfileBannerModel Aak = interfaceC37218GaT.Aak();
                C14360o3.A0B(userSession, 0);
                boolean A03 = C73I.A03(userSession, user);
                int i4 = 1;
                InterfaceC81183jn BdE = user.A03.BdE();
                if (BdE != null && (BdF = BdE.BdF()) != null) {
                    i2 = BdF.size();
                } else {
                    i2 = 0;
                }
                int i5 = (A03 ? 1 : 0) + i2;
                InterfaceC81733ki AYu = user.A03.AYu();
                if (AYu != null && (B9F = AYu.B9F()) != null) {
                    i3 = B9F.size();
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                InterfaceC09390do A00 = C1XM.A00(new C9EO(userSession, 0));
                List CD7 = user.A03.CD7();
                if (CD7 == null) {
                    CD7 = C16930sl.A00;
                }
                ArrayList A1E = AbstractC166987dD.A1E();
                for (Object obj : CD7) {
                    C14360o3.A0B((UpcomingEvent) obj, 0);
                    if (!(!AbstractC41774Ieq.A0B(r0)) || AbstractC167007dF.A1Z(A00)) {
                        A1E.add(obj);
                    }
                }
                int A02 = AbstractC31172DnG.A02(A1E, i6) + (AbstractC167007dF.A1W(user.A0E()) ? 1 : 0) + (C73K.A02(userSession, user) ? 1 : 0) + (C73K.A01(userSession, user) ? 1 : 0);
                if (!user.A1R() || C18U.A06(C06090Tz.A05, userSession, 36317191188845420L) || (!C36A.A0A(userSession) && !C36A.A0H(userSession, user))) {
                    i4 = 0;
                }
                int i7 = A02 + i4 + (C73I.A02(userSession, user) ? 1 : 0);
                if (Aak == null || (list = Aak.A00) == null) {
                    list = C16930sl.A00;
                }
                i = AbstractC31172DnG.A02(list, i7) + (C73I.A04(userSession, user) ? 1 : 0);
            } else {
                i = 0;
            }
            IgdsListCell igdsListCell3 = this.bannerTextCell;
            if (igdsListCell3 != null) {
                ViewOnClickListenerC35668Fp3.A00(igdsListCell3, this, i, 5);
                IgdsListCell igdsListCell4 = this.bannerTextCell;
                if (i > 0) {
                    if (igdsListCell4 != null) {
                        igdsListCell4.A06(2131970152);
                        igdsListCell = this.bannerTextCell;
                        if (igdsListCell != null) {
                            str2 = String.valueOf(i);
                            igdsListCell.A0K(str2, false);
                            return;
                        }
                    }
                } else if (igdsListCell4 != null) {
                    igdsListCell4.A06(2131970148);
                    igdsListCell = this.bannerTextCell;
                    if (igdsListCell != null) {
                        str2 = "";
                        igdsListCell.A0K(str2, false);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
        str = "bannerTextCell";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final void A02() {
        User user;
        UserSession userSession = this.A0C;
        if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36328925039050608L) && (user = this.A06) != null && user.A1n()) {
            IgdsListCell igdsListCell = this.highlightsMigrationTextCell;
            if (igdsListCell != null) {
                igdsListCell.setVisibility(0);
                IgdsListCell igdsListCell2 = this.highlightsMigrationTextCell;
                if (igdsListCell2 != null) {
                    igdsListCell2.A06(2131970166);
                    IgdsListCell igdsListCell3 = this.highlightsMigrationTextCell;
                    if (igdsListCell3 != null) {
                        igdsListCell3.A0K("", false);
                        IgdsListCell igdsListCell4 = this.highlightsMigrationTextCell;
                        if (igdsListCell4 != null) {
                            C0fQ.A00(new ViewOnClickListenerC55456OkA(this, 50), igdsListCell4);
                            return;
                        }
                    }
                }
            }
            C14360o3.A0F("highlightsMigrationTextCell");
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A03() {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.edit.controller.EditProfileFieldsController.A03():void");
    }

    public static final void A05(EditProfileFieldsController editProfileFieldsController) {
        User user;
        Boolean CTN;
        long j;
        TextView A0T;
        String str;
        Long A0j;
        View view = editProfileFieldsController.view;
        if (view != null && (user = editProfileFieldsController.A06) != null && (CTN = user.A03.CTN()) != null && CTN.booleanValue()) {
            UserSession userSession = editProfileFieldsController.A0C;
            C06090Tz A0j2 = AbstractC25225BEi.A0j(userSession, 0);
            if (C18U.A06(A0j2, userSession, 36322761762089456L)) {
                boolean z = editProfileFieldsController.A0I;
                C57012jc c57012jc = editProfileFieldsController.relatedAccountsStub;
                if (!z) {
                    if (c57012jc != null) {
                        c57012jc.A03(0);
                        C57012jc c57012jc2 = editProfileFieldsController.relatedAccountsStub;
                        if (c57012jc2 != null) {
                            View A01 = c57012jc2.A01();
                            C14360o3.A07(A01);
                            String A00 = AbstractC76433bn.A00(user);
                            C19270xB c19270xB = editProfileFieldsController.A0B;
                            C14360o3.A0B(c19270xB, 2);
                            if (A00 != null && (A0j = AbstractC166997dE.A0j(A00)) != null) {
                                j = A0j.longValue();
                            } else {
                                j = 0;
                            }
                            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c19270xB, userSession), "ig_nme_benefits");
                            if (A0f.isSampled()) {
                                A0f.AAP("event_type", "impression");
                                A0f.AAP("benefit_type", "RELATED_ACCOUNTS");
                                A0f.AAP("subject_type", "subscriber");
                                AbstractC31178DnM.A1B(A0f, "button", j);
                                AbstractC31171DnF.A1E(A0f, "ig_profile_edit_page");
                                A0f.Cht();
                            }
                            String A04 = C18U.A04(A0j2, userSession, 36885711715828385L);
                            if (AbstractC001900j.A0T(A04) || A04.equals("None")) {
                                A04 = AbstractC111324zv.A00(3699);
                            }
                            AbstractC31176DnK.A1F(A01, A04, R.id.contact_text);
                            int A03 = user.A03();
                            Boolean CYj = user.A03.CYj();
                            if (CYj != null && CYj.booleanValue() && A03 > 0) {
                                A0T = AbstractC166997dE.A0T(A01, R.id.contact_summary);
                                str = String.valueOf(A03);
                            } else {
                                A0T = AbstractC166997dE.A0T(A01, R.id.contact_summary);
                                str = null;
                            }
                            A0T.setText(str);
                            AbstractC31172DnG.A1J(view, R.id.music_top_divider, 8);
                            ViewOnClickListenerC35684FpJ.A00(A01, user, editProfileFieldsController, view, 40);
                            OIW oiw = editProfileFieldsController.A03;
                            if (oiw != null) {
                                oiw.A00(C57663PiE.A00, new C57750Pjd(4, editProfileFieldsController, A01));
                                return;
                            }
                            return;
                        }
                    }
                } else if (c57012jc != null) {
                    c57012jc.A03(8);
                    return;
                }
                C14360o3.A0F("relatedAccountsStub");
                throw C00O.createAndThrow();
            }
        }
    }

    public final FragmentActivity A06() {
        FragmentActivity fragmentActivity = this.activity;
        if (fragmentActivity != null) {
            return fragmentActivity;
        }
        C14360o3.A0F("activity");
        throw C00O.createAndThrow();
    }

    public final IgFormField A07() {
        IgFormField igFormField = this.bioField;
        if (igFormField != null) {
            return igFormField;
        }
        C14360o3.A0F("bioField");
        throw C00O.createAndThrow();
    }

    public final IgdsListCell A08() {
        IgdsListCell igdsListCell = this.linksTextCell;
        if (igdsListCell != null) {
            return igdsListCell;
        }
        C14360o3.A0F("linksTextCell");
        throw C00O.createAndThrow();
    }

    public final void A09() {
        C34649FOh c34649FOh;
        String str;
        boolean z;
        View view;
        if (this.view != null && (c34649FOh = this.A02) != null) {
            C81763ko c81763ko = c34649FOh.A04;
            if (c81763ko != null) {
                InterfaceC37218GaT interfaceC37218GaT = this.A04;
                str = "dataProvider";
                if (interfaceC37218GaT != null) {
                    interfaceC37218GaT.Bhd().setEnabled(false);
                    SpannableStringBuilder A0H = AbstractC25225BEi.A0H(c81763ko.A00);
                    AbstractC154246wZ.A01(A06(), A0H, this.A0C, null, c81763ko.A01);
                    A07().setText(A0H);
                    InterfaceC37218GaT interfaceC37218GaT2 = this.A04;
                    if (interfaceC37218GaT2 != null) {
                        z = true;
                        interfaceC37218GaT2.Bhd().setEnabled(true);
                        A07().getMEditText().setFocusableInTouchMode(false);
                        ViewOnClickListenerC31724DwT.A00(A07().getMEditText(), 52, this);
                        if (!AbstractC166987dD.A0x(this.A0C).getBoolean("should_show_bio_linking_tooltip", z) && (view = this.view) != null) {
                            view.postDelayed(new GMA(this), 100L);
                            return;
                        }
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            InterfaceC37218GaT interfaceC37218GaT3 = this.A04;
            str = "dataProvider";
            if (interfaceC37218GaT3 != null) {
                interfaceC37218GaT3.Bhd().setEnabled(false);
                IgFormField A07 = A07();
                String str2 = c34649FOh.A0A;
                C14360o3.A07(str2);
                A07.setText(str2);
                InterfaceC37218GaT interfaceC37218GaT4 = this.A04;
                if (interfaceC37218GaT4 != null) {
                    z = true;
                    interfaceC37218GaT4.Bhd().setEnabled(true);
                    if (!AbstractC166987dD.A0x(this.A0C).getBoolean("should_show_bio_linking_tooltip", z)) {
                        return;
                    } else {
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public final void A0A() {
        CharSequence charSequence;
        IgFormField igFormField;
        IgFormField igFormField2;
        C34649FOh c34649FOh = this.A02;
        if (c34649FOh != null) {
            EditProfileExpressionController editProfileExpressionController = this.A05;
            CharSequence charSequence2 = null;
            if (editProfileExpressionController != null && (igFormField2 = editProfileExpressionController.nameField) != null) {
                charSequence = igFormField2.getText();
            } else {
                charSequence = null;
            }
            c34649FOh.A0F = String.valueOf(charSequence);
            EditProfileExpressionController editProfileExpressionController2 = this.A05;
            if (editProfileExpressionController2 != null && (igFormField = editProfileExpressionController2.usernameField) != null) {
                charSequence2 = igFormField.getText();
            }
            c34649FOh.A0O = String.valueOf(charSequence2);
            c34649FOh.A0A = AbstractC31174DnI.A0x(A07());
        }
    }

    public final void A0B(Bundle bundle, C34649FOh c34649FOh, User user) {
        IgFormField igFormField;
        String str;
        IgFormField igFormField2;
        String str2;
        IgFormField igFormField3;
        long j;
        InterfaceC56392iX interfaceC56392iX;
        List list;
        IgFormField igFormField4;
        IgFormField igFormField5;
        IgFormField igFormField6;
        IgFormField igFormField7;
        EditProfileExpressionController editProfileExpressionController;
        IgFormField igFormField8;
        EditProfileExpressionController editProfileExpressionController2;
        IgFormField igFormField9;
        if (c34649FOh != null) {
            this.A02 = c34649FOh;
            if (user != null) {
                this.A06 = user;
                if (bundle != null) {
                    String string = bundle.getString("bundle_name_field");
                    if (string != null && (editProfileExpressionController2 = this.A05) != null && (igFormField9 = editProfileExpressionController2.nameField) != null) {
                        igFormField9.setText(string);
                    }
                    String string2 = bundle.getString("bundle_username_field");
                    if (string2 != null && (editProfileExpressionController = this.A05) != null && (igFormField8 = editProfileExpressionController.usernameField) != null) {
                        igFormField8.setText(string2);
                    }
                    String string3 = bundle.getString("bundle_bio_field");
                    if (string3 != null) {
                        A07().setText(string3);
                    }
                } else {
                    EditProfileExpressionController editProfileExpressionController3 = this.A05;
                    if (editProfileExpressionController3 != null && (igFormField2 = editProfileExpressionController3.nameField) != null) {
                        String str3 = c34649FOh.A0F;
                        C14360o3.A07(str3);
                        igFormField2.setText(str3);
                    }
                    EditProfileExpressionController editProfileExpressionController4 = this.A05;
                    if (editProfileExpressionController4 != null && (igFormField = editProfileExpressionController4.usernameField) != null) {
                        C34649FOh c34649FOh2 = this.A02;
                        if (c34649FOh2 != null && (str = c34649FOh2.A0O) != null) {
                            igFormField.setText(str);
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                }
                InterfaceC37218GaT interfaceC37218GaT = this.A04;
                String str4 = "dataProvider";
                if (interfaceC37218GaT != null) {
                    if (interfaceC37218GaT.CSq()) {
                        EditProfileExpressionController editProfileExpressionController5 = this.A05;
                        if (editProfileExpressionController5 != null && (igFormField7 = editProfileExpressionController5.nameField) != null) {
                            igFormField7.getMEditText().setFocusableInTouchMode(false);
                        }
                        EditProfileExpressionController editProfileExpressionController6 = this.A05;
                        if (editProfileExpressionController6 != null && (igFormField6 = editProfileExpressionController6.nameField) != null) {
                            EditText mEditText = igFormField6.getMEditText();
                            InterfaceC37218GaT interfaceC37218GaT2 = this.A04;
                            if (interfaceC37218GaT2 != null) {
                                C0fQ.A00(interfaceC37218GaT2.B8x(), mEditText);
                            }
                        }
                    }
                    InterfaceC37218GaT interfaceC37218GaT3 = this.A04;
                    if (interfaceC37218GaT3 != null) {
                        if (interfaceC37218GaT3.CSt()) {
                            EditProfileExpressionController editProfileExpressionController7 = this.A05;
                            if (editProfileExpressionController7 != null && (igFormField5 = editProfileExpressionController7.usernameField) != null) {
                                igFormField5.getMEditText().setFocusableInTouchMode(false);
                            }
                            EditProfileExpressionController editProfileExpressionController8 = this.A05;
                            if (editProfileExpressionController8 != null && (igFormField4 = editProfileExpressionController8.usernameField) != null) {
                                EditText mEditText2 = igFormField4.getMEditText();
                                InterfaceC37218GaT interfaceC37218GaT4 = this.A04;
                                if (interfaceC37218GaT4 != null) {
                                    C0fQ.A00(interfaceC37218GaT4.CE9(), mEditText2);
                                }
                            }
                        }
                        A09();
                        C34649FOh c34649FOh3 = this.A02;
                        if (c34649FOh3 == null || (list = c34649FOh3.A0R) == null || (str2 = TextUtils.join("/", list)) == null) {
                            str2 = "";
                        }
                        IgFormField igFormField10 = this.pronounsField;
                        if (igFormField10 != null) {
                            igFormField10.setText(str2);
                            IgFormField igFormField11 = this.pronounsField;
                            if (igFormField11 != null) {
                                igFormField11.getMEditText().setFocusable(false);
                                IgFormField igFormField12 = this.pronounsField;
                                if (igFormField12 != null) {
                                    ViewOnClickListenerC31724DwT.A00(igFormField12.getMEditText(), 54, this);
                                    A03();
                                    A05(this);
                                    A00();
                                    A01();
                                    A02();
                                    View view = this.view;
                                    if (view != null) {
                                        EditProfileBarcelonaController editProfileBarcelonaController = this.A07;
                                        if (editProfileBarcelonaController == null) {
                                            str4 = "editProfileBarcelonaController";
                                        } else if (editProfileBarcelonaController.toggleBarcelonaViewStubber == null) {
                                            editProfileBarcelonaController.toggleBarcelonaViewStubber = AbstractC56372iV.A01(view.requireViewById(R.id.toggle_barcelona_stub), false, false);
                                            if (!editProfileBarcelonaController.A07) {
                                                UserSession userSession = editProfileBarcelonaController.A03;
                                                if (C151366re.A05(userSession)) {
                                                    boolean A00 = AbstractC1565371b.A00(userSession);
                                                    InterfaceC56392iX interfaceC56392iX2 = editProfileBarcelonaController.toggleBarcelonaViewStubber;
                                                    if (interfaceC56392iX2 != null) {
                                                        interfaceC56392iX2.setVisibility(0);
                                                        InterfaceC56392iX interfaceC56392iX3 = editProfileBarcelonaController.toggleBarcelonaViewStubber;
                                                        if (interfaceC56392iX3 != null) {
                                                            IgdsListCell A0Y = AbstractC31173DnH.A0Y(interfaceC56392iX3.getView(), R.id.toggle_barcelona_switch_cell);
                                                            A0Y.A0I(AbstractC31177DnL.A0b(editProfileBarcelonaController.A01, C151366re.A00(userSession), 2131975648));
                                                            A0Y.setTextCellType(EnumC53237Nga.A08);
                                                            A0Y.setChecked(editProfileBarcelonaController.A04.A1f());
                                                            A0Y.setEnabled(true);
                                                            A0Y.setVisibility(0);
                                                            A0Y.setAlpha(AbstractC31175DnJ.A00(A00 ? 1 : 0));
                                                            editProfileBarcelonaController.toggleBarcelonaSwitchCell = A0Y;
                                                            A0Y.A0E(new G9B(editProfileBarcelonaController, A00));
                                                        }
                                                    }
                                                    str4 = "toggleBarcelonaViewStubber";
                                                }
                                            }
                                            InterfaceC56392iX interfaceC56392iX4 = editProfileBarcelonaController.toggleBarcelonaViewStubber;
                                            if (interfaceC56392iX4 != null) {
                                                interfaceC56392iX4.setVisibility(8);
                                            }
                                            str4 = "toggleBarcelonaViewStubber";
                                        }
                                    }
                                    UserSession userSession2 = this.A0C;
                                    if (C18U.A06(C06090Tz.A05, userSession2, 36316327899566318L)) {
                                        List A0R = user.A0R();
                                        if (A0R != null) {
                                            j = A0R.size();
                                        } else {
                                            j = 0;
                                        }
                                        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(AbstractC12220kQ.A01(this.A0B, userSession2), "ig_bio_interests_profile_events"), 195);
                                        View view2 = this.view;
                                        if (view2 != null && view2.getContext() != null && (interfaceC56392iX = this.profileInterestRowStub) != null && !interfaceC56392iX.CWW()) {
                                            C14360o3.A0A(A0A);
                                            A04(A0A, this, "unit_impression", j);
                                            interfaceC56392iX.setVisibility(0);
                                            C35144Fel.A00.A01(A06(), (RecyclerView) interfaceC56392iX.getView(), userSession2, new G9O(A0A, this, j), C05F.A01, user.A0R(), true, false);
                                        }
                                        InterfaceC56392iX interfaceC56392iX5 = this.interestRowViewStubHolder;
                                        if (interfaceC56392iX5 != null) {
                                            C0fQ.A00(new ViewOnClickListenerC35574FnR(A0A, this, j), interfaceC56392iX5.getView());
                                        } else {
                                            str4 = "interestRowViewStubHolder";
                                        }
                                    }
                                    if (AbstractC1565371b.A00(userSession2)) {
                                        EditProfileExpressionController editProfileExpressionController9 = this.A05;
                                        IgFormField igFormField13 = null;
                                        if (editProfileExpressionController9 != null) {
                                            igFormField13 = editProfileExpressionController9.nameField;
                                        }
                                        if (igFormField13 != null) {
                                            igFormField13.setAlpha(0.3f);
                                        }
                                        EditProfileExpressionController editProfileExpressionController10 = this.A05;
                                        if (editProfileExpressionController10 != null && (igFormField3 = editProfileExpressionController10.usernameField) != null) {
                                            igFormField3.setAlpha(0.3f);
                                        }
                                        IgFormField igFormField14 = this.pronounsField;
                                        if (igFormField14 != null) {
                                            igFormField14.setAlpha(0.3f);
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                        str4 = "pronounsField";
                    }
                }
                C14360o3.A0F(str4);
                throw C00O.createAndThrow();
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r0.getText().length() <= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r0.getText().length() <= 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0D() {
        /*
            r3 = this;
            com.instagram.profile.edit.controller.editcontrollerexpression.EditProfileExpressionController r0 = r3.A05
            r2 = 1
            if (r0 == 0) goto L14
            com.instagram.igds.components.form.IgFormField r0 = r0.usernameField
            if (r0 == 0) goto L14
            java.lang.CharSequence r0 = r0.getText()
            int r0 = r0.length()
            r1 = 1
            if (r0 > 0) goto L15
        L14:
            r1 = 0
        L15:
            boolean r0 = r3.A09
            if (r0 != 0) goto L2f
            if (r1 == 0) goto L2e
            com.instagram.profile.edit.controller.editcontrollerexpression.EditProfileExpressionController r0 = r3.A05
            if (r0 == 0) goto L2e
            com.instagram.igds.components.form.IgFormField r0 = r0.nameField
            if (r0 == 0) goto L2e
            java.lang.CharSequence r0 = r0.getText()
            int r0 = r0.length()
            r1 = 1
            if (r0 > 0) goto L2f
        L2e:
            r1 = 0
        L2f:
            boolean r0 = r3.A08
            if (r0 != 0) goto L46
            if (r1 == 0) goto L44
            com.instagram.igds.components.form.IgFormField r0 = r3.A07()
            java.lang.CharSequence r0 = r0.getText()
            int r0 = r0.length()
            if (r0 <= 0) goto L44
            return r2
        L44:
            r2 = 0
            return r2
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.edit.controller.EditProfileFieldsController.A0D():boolean");
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        C25671My A00 = AbstractC25651Mw.A00(this.A0C);
        A00.A02(this.A0E, C36099FwZ.class);
        A00.A02(this.A0H, AbstractC36055Fvr.class);
        A00.A02(this.A0D, C36115Fwp.class);
        A00.A02(this.A0F, AbstractC36054Fvq.class);
        A00.A02(this.A0G, C36109Fwj.class);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        IgFormField igFormField;
        IgFormField igFormField2;
        EditProfileExpressionController editProfileExpressionController = this.A05;
        if (editProfileExpressionController != null && (igFormField2 = editProfileExpressionController.nameField) != null) {
            InterfaceC37218GaT interfaceC37218GaT = this.A04;
            if (interfaceC37218GaT != null) {
                AbstractC31173DnH.A1D(interfaceC37218GaT.Bhd(), igFormField2);
            }
            C14360o3.A0F("dataProvider");
            throw C00O.createAndThrow();
        }
        EditProfileExpressionController editProfileExpressionController2 = this.A05;
        if (editProfileExpressionController2 != null && (igFormField = editProfileExpressionController2.usernameField) != null) {
            InterfaceC37218GaT interfaceC37218GaT2 = this.A04;
            if (interfaceC37218GaT2 != null) {
                AbstractC31173DnH.A1D(interfaceC37218GaT2.Bhd(), igFormField);
            }
            C14360o3.A0F("dataProvider");
            throw C00O.createAndThrow();
        }
        EditText mEditText = A07().getMEditText();
        InterfaceC37218GaT interfaceC37218GaT3 = this.A04;
        if (interfaceC37218GaT3 != null) {
            mEditText.removeTextChangedListener(interfaceC37218GaT3.Bhd());
            return;
        }
        C14360o3.A0F("dataProvider");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        IgFormField igFormField;
        IgFormField igFormField2;
        IgFormField igFormField3;
        IgFormField igFormField4;
        User user = this.A06;
        if (user != null) {
            String username = user.getUsername();
            EditProfileExpressionController editProfileExpressionController = this.A05;
            if (editProfileExpressionController != null && (igFormField4 = editProfileExpressionController.usernameField) != null) {
                igFormField4.setText(username);
            }
            String fullName = user.getFullName();
            if (fullName != null) {
                EditProfileExpressionController editProfileExpressionController2 = this.A05;
                if (editProfileExpressionController2 != null && (igFormField3 = editProfileExpressionController2.nameField) != null) {
                    igFormField3.setText(fullName);
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        A09();
        A03();
        A05(this);
        A00();
        A01();
        A02();
        EditProfileExpressionController editProfileExpressionController3 = this.A05;
        if (editProfileExpressionController3 != null && (igFormField2 = editProfileExpressionController3.nameField) != null) {
            InterfaceC37218GaT interfaceC37218GaT = this.A04;
            if (interfaceC37218GaT != null) {
                igFormField2.A0H(interfaceC37218GaT.Bhd());
            }
            C14360o3.A0F("dataProvider");
            throw C00O.createAndThrow();
        }
        EditProfileExpressionController editProfileExpressionController4 = this.A05;
        if (editProfileExpressionController4 != null && (igFormField = editProfileExpressionController4.usernameField) != null) {
            InterfaceC37218GaT interfaceC37218GaT2 = this.A04;
            if (interfaceC37218GaT2 != null) {
                igFormField.A0H(interfaceC37218GaT2.Bhd());
            }
            C14360o3.A0F("dataProvider");
            throw C00O.createAndThrow();
        }
        EditText mEditText = A07().getMEditText();
        InterfaceC37218GaT interfaceC37218GaT3 = this.A04;
        if (interfaceC37218GaT3 != null) {
            mEditText.addTextChangedListener(interfaceC37218GaT3.Bhd());
            return;
        }
        C14360o3.A0F("dataProvider");
        throw C00O.createAndThrow();
    }

    public static final void A04(C25531Mh c25531Mh, EditProfileFieldsController editProfileFieldsController, String str, long j) {
        String A14 = AbstractC25225BEi.A14();
        if (A14 != null) {
            c25531Mh.A0Q("viewer_id", AbstractC25228BEl.A13(editProfileFieldsController.A0C.userId));
            c25531Mh.A0R("container_module", "edit_profile");
            c25531Mh.A0R("action_type", str);
            c25531Mh.A0R("nav_chain", A14);
            c25531Mh.A0Q("num_selected_bio_interests", Long.valueOf(j));
            c25531Mh.Cht();
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        IgFormField igFormField;
        A0A();
        EditProfileExpressionController editProfileExpressionController = this.A05;
        if (editProfileExpressionController != null && (igFormField = editProfileExpressionController.usernameField) != null) {
            igFormField.setRuleChecker(null);
        }
        AbstractC31173DnH.A1D(C106904rr.A00(this.A0C), A07());
        EditProfileFieldsControllerLifecycleUtil.cleanupReferences(this);
    }
}
