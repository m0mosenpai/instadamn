package com.instagram.bugreporter;

import X.AbstractC001800i;
import X.AbstractC001900j;
import X.AbstractC002300n;
import X.AbstractC115975Mo;
import X.AbstractC12880la;
import X.AbstractC13530mf;
import X.AbstractC13570mj;
import X.AbstractC13880nE;
import X.AbstractC153636vY;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC23641Du;
import X.AbstractC24771Iv;
import X.AbstractC25226BEj;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.AbstractC25235BEs;
import X.AbstractC31171DnF;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC37301Gc2;
import X.AbstractC43592JPx;
import X.AbstractC43593JPy;
import X.AbstractC53242c7;
import X.AbstractC53852Nrg;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.AnonymousClass001;
import X.AnonymousClass191;
import X.AnonymousClass773;
import X.C006802i;
import X.C00O;
import X.C05F;
import X.C06090Tz;
import X.C0f9;
import X.C0fJ;
import X.C0fQ;
import X.C14360o3;
import X.C16930sl;
import X.C18U;
import X.C19K;
import X.C1C0;
import X.C1H6;
import X.C1OU;
import X.C1QS;
import X.C20I;
import X.C3LO;
import X.C3R9;
import X.C50761MbS;
import X.C54748OGw;
import X.C54762OHr;
import X.C55346Oi6;
import X.C55516Ol9;
import X.C56352iT;
import X.C57155PYz;
import X.C6WQ;
import X.EnumC151036r4;
import X.InterfaceC09390do;
import X.InterfaceC56362iU;
import X.InterfaceC58266PsA;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import X.MC7;
import X.MC8;
import X.MSW;
import X.MSX;
import X.MSY;
import X.NAS;
import X.OHF;
import X.OO8;
import X.OWB;
import X.OWg;
import X.U7H;
import X.ViewOnClickListenerC48066LPr;
import X.ViewOnClickListenerC55467OkM;
import X.ViewOnClickListenerC63508Sob;
import X.ViewOnTouchListenerC55488Okh;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.bugreporter.model.BugReport;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.meta.flytrap.attachment.model.BugReportAttachment;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaType;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;

/* loaded from: classes9.dex */
public final class BugReportComposerFragment extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public long A00;
    public EditText A01;
    public GridLayout A02;
    public UserFlowLogger A03;
    public BugReportComposerViewModel A04;
    public BugReportSevereSwitchView A05;
    public C54748OGw A06;
    public InterfaceC58266PsA A07;
    public BugReport A08;
    public boolean A09;
    public boolean A0A;
    public C54762OHr A0B;
    public U7H A0C;
    public final InterfaceC09390do A0E = AbstractC60492pY.A01(this);
    public final String A0D = "bugreporter_composer";

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(com.instagram.bugreporter.BugReportComposerFragment r12, X.InterfaceC23621Ds r13, int r14) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.bugreporter.BugReportComposerFragment.A03(com.instagram.bugreporter.BugReportComposerFragment, X.1Ds, int):java.lang.Object");
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        UserSession userSession;
        C14360o3.A0B(interfaceC56362iU, 0);
        if (getSession() instanceof UserSession) {
            AbstractC18680vv session = getSession();
            AbstractC31171DnF.A1Q(session);
            userSession = (UserSession) session;
        } else {
            userSession = null;
        }
        interfaceC56362iU.ESp(userSession, R.layout.bugreporter_actionbar_header, 0, 0);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A0K = getString(2131973280);
        AbstractC31176DnK.A1B(new ViewOnClickListenerC55467OkM(this, 57), A0B, interfaceC56362iU);
        interfaceC56362iU.EkT(new ViewOnClickListenerC55467OkM(this, 58), true);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    @Deprecated(message = "Deprecated in Java")
    public final void onActivityResult(int i, int i2, Intent intent) {
        Uri uri;
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            if (intent != null) {
                uri = intent.getData();
            } else {
                uri = null;
            }
            Context requireContext = requireContext();
            C6WQ c6wq = new C6WQ(requireContext, true);
            MSX.A0w(requireContext, c6wq, 2131954359);
            C0fJ.A00(c6wq);
            InterfaceC58266PsA interfaceC58266PsA = this.A07;
            if (interfaceC58266PsA == null) {
                C14360o3.A0F("userFlowLoggerV2");
                throw C00O.createAndThrow();
            }
            interfaceC58266PsA.AW9("save_external_media_start");
            C19K A01 = AbstractC24771Iv.A01(254, 3);
            MC7 mc7 = new MC7(uri, requireContext, this, null, 15);
            AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
            Integer num = C05F.A00;
            AbstractC23641Du.A03(num, anonymousClass191, new MC8(AbstractC23641Du.A01(num, anonymousClass191, mc7, A01), this, c6wq, null, 14), AbstractC25235BEs.A0S(this));
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        BugReport bugReport = this.A08;
        if (bugReport == null) {
            C14360o3.A0F("bugReport");
            throw C00O.createAndThrow();
        }
        bundle.putParcelable("BugReportComposerFragment.ARGUMENT_BUGREPORT", bugReport);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC18680vv session = getSession();
        if (session instanceof UserSession) {
            UserSession userSession = (UserSession) session;
            boolean A00 = C1C0.A00(userSession);
            BugReportSevereSwitchView bugReportSevereSwitchView = this.A05;
            this.A01 = (EditText) view.requireViewById(R.id.description_field);
            if (A00 && bugReportSevereSwitchView != null && C18U.A06(C06090Tz.A05, session, 36317384461522036L)) {
                C14360o3.A0B(userSession, 0);
                AbstractC167007dF.A0x(bugReportSevereSwitchView.A02);
                IgTextView igTextView = bugReportSevereSwitchView.A04;
                if (igTextView != null) {
                    igTextView.setText(2131973630);
                }
                IgTextView igTextView2 = bugReportSevereSwitchView.A03;
                if (igTextView2 != null) {
                    igTextView2.setText(2131973629);
                }
                IgdsSwitch igdsSwitch = bugReportSevereSwitchView.A05;
                if (igdsSwitch != null) {
                    igdsSwitch.setChecked(false);
                }
                boolean A1a = AbstractC25229BEm.A1a(OWB.A00(AbstractC12880la.A01(AbstractC166997dE.A0L(bugReportSevereSwitchView)), AbstractC43593JPy.A06()), C05F.A00);
                IgdsSwitch igdsSwitch2 = bugReportSevereSwitchView.A05;
                if (igdsSwitch2 != null) {
                    igdsSwitch2.setEnabled(!A1a);
                }
                OHF ohf = new OHF(userSession);
                IgdsSwitch igdsSwitch3 = bugReportSevereSwitchView.A05;
                if (igdsSwitch3 != null) {
                    igdsSwitch3.setOnCheckedChangeListener(new C55516Ol9(1, userSession, ohf, bugReportSevereSwitchView));
                }
                IgSimpleImageView igSimpleImageView = bugReportSevereSwitchView.A01;
                if (igSimpleImageView != null) {
                    igSimpleImageView.setOnTouchListener(new ViewOnTouchListenerC55488Okh(0, ohf, userSession, bugReportSevereSwitchView));
                }
                bugReportSevereSwitchView.setVisibility(0);
            }
        }
    }

    public static final BugReport A00(BugReportComposerFragment bugReportComposerFragment, BugReport bugReport, List list, List list2) {
        OWg oWg;
        IgdsSwitch igdsSwitch;
        if (list == null) {
            list = C16930sl.A00;
        }
        if (list2 == null) {
            list2 = C16930sl.A00;
        }
        BugReportSevereSwitchView bugReportSevereSwitchView = bugReportComposerFragment.A05;
        if (bugReportSevereSwitchView != null && (igdsSwitch = bugReportSevereSwitchView.A05) != null && igdsSwitch.isChecked()) {
            oWg = new OWg();
            oWg.A02(bugReport);
            oWg.A0J = AbstractC166987dD.A1F(list);
            oWg.A0M = list2;
            oWg.A08 = "701258024912781";
        } else {
            String str = bugReport.A0A;
            if (str != null && AbstractC001900j.A0a(str, "#assigntome", true)) {
                oWg = new OWg();
                oWg.A02(bugReport);
                oWg.A08 = "488095777480313";
                oWg.A0J = AbstractC166987dD.A1F(list);
            } else {
                oWg = new OWg();
                oWg.A02(bugReport);
                oWg.A0J = AbstractC166987dD.A1F(list);
                oWg.A0M = list2;
            }
        }
        return oWg.A01();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.instagram.bugreporter.BugReportComposerFragment r9, com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource r10, X.InterfaceC23621Ds r11, int r12) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.bugreporter.BugReportComposerFragment.A02(com.instagram.bugreporter.BugReportComposerFragment, com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource, X.1Ds, int):java.lang.Object");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0D;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0E);
    }

    public static final BugReportAttachment A01(Context context, Uri uri, BugReportComposerFragment bugReportComposerFragment, BugReportAttachmentMediaSource bugReportAttachmentMediaSource, int i) {
        InputStream openInputStream;
        File A0w;
        BugReportAttachmentMediaType bugReportAttachmentMediaType;
        String str = null;
        if ("file".equals(uri.getScheme())) {
            String path = uri.getPath();
            if (path != null) {
                str = AbstractC13570mj.A00(path);
            }
            openInputStream = new BufferedInputStream(new FileInputStream(path));
        } else {
            ContentResolver contentResolver = context.getContentResolver();
            C14360o3.A07(contentResolver);
            str = contentResolver.getType(uri);
            openInputStream = contentResolver.openInputStream(uri);
            if (openInputStream == null) {
                throw AbstractC166997dE.A0g();
            }
        }
        try {
            if (str != null) {
                C54762OHr c54762OHr = bugReportComposerFragment.A0B;
                if (c54762OHr == null) {
                    C14360o3.A0F("bugReportFilesUtil");
                    throw C00O.createAndThrow();
                }
                if (AbstractC002300n.A0h(str, "image/", false)) {
                    A0w = MSW.A0w(c54762OHr.A00.A00(), AnonymousClass001.A0c("screenshot_", ".png", i));
                    AbstractC13530mf.A0B(A0w, openInputStream);
                    bugReportAttachmentMediaType = BugReportAttachmentMediaType.A04;
                } else if (AbstractC002300n.A0h(str, "video/", false)) {
                    A0w = MSW.A0w(c54762OHr.A00.A00(), AnonymousClass001.A0c("video_", ".mp4", i));
                    AbstractC13530mf.A0B(A0w, openInputStream);
                    bugReportAttachmentMediaType = BugReportAttachmentMediaType.A05;
                } else {
                    throw new IOException("Unsupported media type.");
                }
                C3R9[] c3r9Arr = BugReportAttachment.A05;
                BugReportAttachment bugReportAttachment = new BugReportAttachment(bugReportAttachmentMediaSource, bugReportAttachmentMediaType, MSX.A0i(A0w), bugReportAttachmentMediaSource.name(), true);
                openInputStream.close();
                return bugReportAttachment;
            }
            throw new Exception("Could not determine MIME type of external file.");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C20I.A00(openInputStream, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.6cX, java.lang.Object] */
    private final void A04(View.OnClickListener onClickListener, View view, int i, int i2, int i3) {
        View A0S = AbstractC166997dE.A0S(view, i);
        A0S.setVisibility(0);
        if (A0S instanceof IgdsMediaButton) {
            IgdsMediaButton igdsMediaButton = (IgdsMediaButton) A0S;
            ?? obj = new Object();
            obj.A00 = i2;
            igdsMediaButton.setStartAddOn(obj, requireContext().getString(i3));
            igdsMediaButton.setLabel(requireContext().getString(i3));
            if (C1H6.A03()) {
                igdsMediaButton.setButtonStyle(EnumC151036r4.A0C);
            }
        }
        A0S.setBackground(null);
        C0fQ.A00(new ViewOnClickListenerC48066LPr(13, onClickListener, this), A0S);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        String str;
        String A01 = AbstractC153636vY.A01(requireArguments(), "IgSessionManager.SESSION_TOKEN_KEY");
        BugReport bugReport = this.A08;
        if (bugReport == null) {
            str = "bugReport";
        } else {
            BugReportComposerViewModel bugReportComposerViewModel = this.A04;
            if (bugReportComposerViewModel == null) {
                str = "viewModel";
            } else {
                InterfaceC58266PsA interfaceC58266PsA = this.A07;
                if (interfaceC58266PsA == null) {
                    str = "userFlowLoggerV2";
                } else {
                    AbstractC31177DnL.A16(AbstractC53852Nrg.A00(bugReport, bugReportComposerViewModel, interfaceC58266PsA, A01), requireActivity(), getSession());
                    return true;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        BugReport bugReport;
        String str;
        U7H u7h;
        int A02 = C0f9.A02(-1726677440);
        AbstractC18680vv session = getSession();
        super.onCreate(bundle);
        this.A04 = (BugReportComposerViewModel) AbstractC153636vY.A00(requireArguments(), BugReportComposerViewModel.class, "BugReportComposerFragment.ARGUMENT_VIEWMODEL");
        this.A03 = C1QS.A00(session);
        if (bundle == null || (bugReport = (BugReport) AbstractC153636vY.A00(bundle, BugReport.class, "BugReportComposerFragment.ARGUMENT_BUGREPORT")) == null) {
            bugReport = (BugReport) AbstractC153636vY.A00(requireArguments(), BugReport.class, "BugReportComposerFragment.ARGUMENT_BUGREPORT");
        }
        this.A08 = bugReport;
        InterfaceC58266PsA A00 = OO8.A00(requireArguments(), session);
        this.A07 = A00;
        if (A00 == null) {
            str = "userFlowLoggerV2";
        } else {
            A00.AW9("composer_fragment");
            if (session instanceof UserSession) {
                UserSession userSession = (UserSession) session;
                if (C1OU.A04(userSession).A0d()) {
                    AbstractC115975Mo.A00(userSession, this.A0D, "reel_tray_empty_on_bug_report_filed");
                }
            }
            OWg oWg = new OWg();
            BugReport bugReport2 = this.A08;
            str = "bugReport";
            if (bugReport2 != null) {
                oWg.A02(bugReport2);
                BugReport bugReport3 = this.A08;
                if (bugReport3 != null) {
                    String str2 = bugReport3.A0A;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    oWg.A0A = str2;
                    String str4 = bugReport3.A07;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    oWg.A07 = str3;
                    BugReport A01 = oWg.A01();
                    this.A08 = A01;
                    List list = A01.A0J;
                    ArrayList A0U = AbstractC001800i.A0U(A01.A0M);
                    BugReportComposerViewModel bugReportComposerViewModel = this.A04;
                    if (bugReportComposerViewModel == null) {
                        str = "viewModel";
                    } else {
                        if (bugReportComposerViewModel.A03 && (((u7h = this.A0C) == null || u7h.A03 != C05F.A01) && list.isEmpty() && A0U.isEmpty())) {
                            NAS nas = new NAS(this, list, A0U);
                            AbstractC31174DnI.A1N(nas);
                            this.A0C = nas;
                        }
                        this.A06 = new C54748OGw(session, this.A0D);
                        BugReport bugReport4 = this.A08;
                        if (bugReport4 != null) {
                            this.A0B = new C54762OHr(bugReport4, session);
                            C0f9.A09(-2092774652, A02);
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1688910477);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.feedback_public_composer, false);
        View requireViewById = A0R.requireViewById(R.id.description_field);
        EditText editText = (EditText) requireViewById;
        this.A01 = editText;
        C14360o3.A07(requireViewById);
        BugReport bugReport = this.A08;
        if (bugReport != null) {
            editText.setText(bugReport.A0A);
            BugReportComposerViewModel bugReportComposerViewModel = this.A04;
            if (bugReportComposerViewModel != null) {
                editText.setHint(bugReportComposerViewModel.A01);
                C55346Oi6.A01(editText, this, 1);
                this.A02 = (GridLayout) A0R.requireViewById(R.id.screenshot_section);
                BugReport bugReport2 = this.A08;
                if (bugReport2 != null) {
                    int size = bugReport2.A0K.size();
                    for (int i = 0; i < size; i++) {
                        C57155PYz.A00(this, AbstractC25235BEs.A0S(this), i, 8);
                    }
                    AbstractC37301Gc2.A0D(A0R, R.id.feedback_composer_buttons_with_record_video_stub).setVisibility(0);
                    A04(new ViewOnClickListenerC63508Sob(this, 63), A0R, R.id.gallery_button, R.drawable.instagram_photo_selector, 2131971485);
                    A04(new ViewOnClickListenerC55467OkM(this, 59), A0R, R.id.camera_button, R.drawable.instagram_camera_pano_outline_24, 2131954368);
                    getSession();
                    AbstractC166997dE.A0S(A0R, R.id.record_video_button).setVisibility(8);
                    GridLayout gridLayout = (GridLayout) A0R.findViewById(R.id.screenshot_section);
                    this.A02 = gridLayout;
                    BugReportComposerViewModel bugReportComposerViewModel2 = this.A04;
                    if (bugReportComposerViewModel2 != null) {
                        if (bugReportComposerViewModel2.A04) {
                            if (gridLayout != null) {
                                gridLayout.setVisibility(8);
                            }
                            String A0v = AbstractC25227BEk.A0v(this, 2131954355);
                            String A0v2 = AbstractC25227BEk.A0v(this, 2131954354);
                            String string = getString(2131954357, A0v, A0v2);
                            C14360o3.A07(string);
                            Uri A0B = AbstractC25227BEk.A0B("https://help.instagram.com/581066165581870");
                            C50761MbS c50761MbS = new C50761MbS(A0B);
                            C50761MbS c50761MbS2 = new C50761MbS(A0B);
                            SpannableStringBuilder A0B2 = MSY.A0B(c50761MbS, string, A0v);
                            AnonymousClass773.A05(A0B2, c50761MbS2, A0v2);
                            int A0F = AbstractC53242c7.A0F(requireContext(), R.attr.igds_color_link);
                            A0B2.setSpan(new ForegroundColorSpan(A0F), A0B2.getSpanStart(c50761MbS), A0B2.getSpanEnd(c50761MbS), 0);
                            A0B2.setSpan(new ForegroundColorSpan(A0F), A0B2.getSpanStart(c50761MbS2), A0B2.getSpanEnd(c50761MbS2), 0);
                            TextView A0N = AbstractC167007dF.A0N(A0R, R.id.legal_info_footer);
                            AbstractC31176DnK.A1G(A0N, A0B2);
                            A0N.setVisibility(0);
                        }
                        this.A05 = (BugReportSevereSwitchView) A0R.requireViewById(R.id.bugreport_severe_switch_view);
                        C0f9.A09(1113393155, A02);
                        return A0R;
                    }
                }
            }
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F("bugReport");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(891033987);
        super.onDestroyView();
        U7H u7h = this.A0C;
        if (u7h != null) {
            u7h.A01.cancel(true);
        }
        this.A01 = null;
        this.A02 = null;
        this.A05 = null;
        C0f9.A09(-137866853, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(446996840);
        super.onPause();
        AbstractC13880nE.A0O(this.A01);
        C0f9.A09(1723454799, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1915624522);
        super.onResume();
        C56352iT.A0t.A03(getActivity()).A0X(this);
        BugReportSevereSwitchView bugReportSevereSwitchView = this.A05;
        if (bugReportSevereSwitchView != null && bugReportSevereSwitchView.getVisibility() == 8) {
            EditText editText = this.A01;
            if (editText != null) {
                editText.requestFocus();
            }
            EditText editText2 = this.A01;
            if (editText2 != null) {
                AbstractC13880nE.A0R(editText2);
            } else {
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A09(773710555, A02);
                throw A0g;
            }
        }
        C0f9.A09(1553916957, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1872127886);
        super.onStart();
        getSession();
        C006802i A0N = AbstractC43592JPx.A0N();
        A0N.markerStart(391254427, 0);
        A0N.markerEnd(391254427, 0, (short) 2);
        C0f9.A09(1221637485, A02);
    }
}
