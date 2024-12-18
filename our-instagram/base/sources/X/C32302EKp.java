package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.EKp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32302EKp extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "DirectPaidPartnershipSettingsFragment";
    public int A00;
    public InterfaceC83733oI A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public IgTextView A07;
    public C2DS A08;
    public IgdsListCell A09;
    public final InterfaceC09390do A0B = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A0A = C1XM.A00(new C50165MDs(this, 6));

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131954245);
        interfaceC56362iU.AAF(ViewOnClickListenerC35691FpR.A00(this, 57), 2131961124);
        interfaceC56362iU.EkS(true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_broadcast_channel_paid_partnership_settings";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A09 = AbstractC31173DnH.A0Y(view, R.id.paid_partnership_label_toggle);
        IgTextView A0X = AbstractC31172DnG.A0X(view, R.id.paid_partnership_disclosure);
        this.A07 = A0X;
        if (A0X == null) {
            str = "paidPartnershipDisclosureView";
        } else {
            Context requireContext = requireContext();
            String A0p = AbstractC166997dE.A0p(requireContext, 2131954194);
            SpannableStringBuilder A07 = AbstractC31178DnM.A07(requireContext, A0p, 2131954216);
            AnonymousClass773.A05(A07, new C50764MbV(1, requireContext, this), A0p);
            AbstractC25227BEk.A11(A0X);
            A0X.setText(A07);
            IgdsListCell igdsListCell = this.A09;
            if (igdsListCell != null) {
                igdsListCell.setTextCellType(EnumC53237Nga.A08);
                C2DS c2ds = this.A08;
                if (c2ds != null) {
                    InterfaceC83733oI interfaceC83733oI = this.A01;
                    str = "currentThreadId";
                    if (interfaceC83733oI != null) {
                        DirectThreadKey A0b = AbstractC31174DnI.A0b(interfaceC83733oI);
                        String str2 = this.A03;
                        if (str2 == null) {
                            str = "currentMessageId";
                        } else {
                            C83403nh BSh = c2ds.BSh(A0b, str2);
                            C2DS c2ds2 = this.A08;
                            if (c2ds2 != null) {
                                InterfaceC83733oI interfaceC83733oI2 = this.A01;
                                if (interfaceC83733oI2 != null) {
                                    C81663kb B3U = c2ds2.B3U(AbstractC31174DnI.A0b(interfaceC83733oI2));
                                    if (BSh == null || B3U == null) {
                                        AbstractC25226BEj.A1Q(this);
                                    }
                                    if (B3U != null) {
                                        this.A00 = B3U.AdZ();
                                        this.A04 = B3U.C7q();
                                        if (BSh != null) {
                                            C9B5 c9b5 = BSh.A04;
                                            if (c9b5 != null) {
                                                z = c9b5.A00;
                                            } else {
                                                z = false;
                                            }
                                            this.A06 = z;
                                            this.A05 = z;
                                            IgdsListCell igdsListCell2 = this.A09;
                                            if (igdsListCell2 != null) {
                                                igdsListCell2.setChecked(z);
                                                IgdsListCell igdsListCell3 = this.A09;
                                                if (igdsListCell3 != null) {
                                                    igdsListCell3.A0E(new G9C(0, B3U, this));
                                                    C142846ck A0d = AbstractC31172DnG.A0d(this.A0A);
                                                    int i = this.A00;
                                                    InterfaceC83733oI interfaceC83733oI3 = this.A01;
                                                    if (interfaceC83733oI3 != null) {
                                                        String A0c = AbstractC31171DnF.A0c(interfaceC83733oI3);
                                                        String str3 = this.A04;
                                                        String str4 = this.A02;
                                                        String A0t = AbstractC31173DnH.A0t(this.A0B);
                                                        int C7g = B3U.C7g();
                                                        C81543kP c81543kP = B3U.A01.A0t;
                                                        if (c81543kP != null) {
                                                            String A00 = C160857It.A00(c81543kP, A0t, C7g);
                                                            C25531Mh A0I = AbstractC31172DnG.A0I(A0d);
                                                            if (AbstractC25226BEj.A1Z(A0I)) {
                                                                AbstractC31175DnJ.A1B(A0I, A0d);
                                                                AbstractC31174DnI.A1I(A0I, "paid_partnership_sheet_rendered");
                                                                A0I.A0o("message_options");
                                                                AbstractC31174DnI.A1H(A0I, A0d, AbstractC31179DnN.A0a(A0I, "thread_view", A0c, str3, i));
                                                                A0I.A0v(AbstractC25233BEq.A0p("user_type", A00, AbstractC166987dD.A1L(AbstractC43591JPw.A00(84), str4)));
                                                                A0I.Cht();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        throw AbstractC166987dD.A14("Required value was null.");
                                                    }
                                                }
                                            }
                                        } else {
                                            throw AbstractC166987dD.A14("Required value was null.");
                                        }
                                    } else {
                                        throw AbstractC166987dD.A14("Required value was null.");
                                    }
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F("threadStore");
                throw C00O.createAndThrow();
            }
            C14360o3.A0F("paidPartnershipToggleView");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0B);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.1k9, X.1OW] */
    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        String str;
        if (this.A05 != this.A06) {
            String str2 = this.A03;
            if (str2 == null) {
                str = "currentMessageId";
            } else {
                InterfaceC83733oI interfaceC83733oI = this.A01;
                if (interfaceC83733oI == null) {
                    str = "currentThreadId";
                } else {
                    String A0c = AbstractC31171DnF.A0c(interfaceC83733oI);
                    String str3 = this.A02;
                    boolean z = this.A05;
                    ?? c1ow = new C1OW(null, null, AbstractC167007dF.A1V(A0c) ? 1 : 0);
                    c1ow.A02 = A0c;
                    c1ow.A00 = str2;
                    c1ow.A01 = str3;
                    c1ow.A03 = z;
                    AbstractC31173DnH.A1U(AbstractC166987dD.A0r(this.A0B), c1ow);
                    return false;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(564182348);
        super.onCreate(bundle);
        InterfaceC83733oI A00 = AbstractC35077Fco.A00(requireArguments(), AbstractC43591JPw.A00(592));
        if (A00 != null) {
            this.A01 = A00;
            this.A03 = AbstractC153636vY.A01(requireArguments(), AbstractC43591JPw.A00(591));
            this.A02 = requireArguments().getString(AbstractC43591JPw.A00(590));
            this.A08 = AbstractC28761aE.A00(AbstractC166987dD.A0r(this.A0B));
            C0f9.A09(-1034447419, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(685093403, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1584132024);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_thread_paid_partnership_settings, viewGroup, false);
        C0f9.A09(-333461636, A02);
        return inflate;
    }
}
