package X;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;
import com.instagram.contentnotes.ui.immersiveselfnote.ContentNotesImmersiveSelfNoteContent;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.39F, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C39F implements C39G {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC09390do A04 = C1XM.A00(new C207019Eg(this, 4));
    public final InterfaceC09390do A05 = C1XM.A00(new C207019Eg(this, 5));
    public final InterfaceC09390do A03 = C1XM.A00(new C207019Eg(this, 3));

    @Override // X.C39G
    public final void D7N(NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, InterfaceC16820sZ interfaceC16820sZ) {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        User user = notesPogThoughtBubbleUiState.A06;
        String shortName = user.getShortName();
        if (shortName == null) {
            shortName = user.B8y();
        }
        CP6 cp6 = new CP6(interfaceC16820sZ);
        C3DN A00 = C3DN.A00.A00(fragmentActivity);
        Bundle bundle = new Bundle();
        bundle.putString(AbstractC111324zv.A00(2184), shortName);
        C26715Bqw c26715Bqw = new C26715Bqw();
        c26715Bqw.setArguments(bundle);
        c26715Bqw.A00 = cp6;
        C189478aR A002 = F86.A00(A00);
        if (A002 != null && A002.A03.getViewLifecycleOwner().getLifecycle().A07().A00(C07S.CREATED)) {
            A002.A0G(c26715Bqw, new C189448aO(userSession), false, false);
            if (A00 != null) {
                C3DP c3dp = (C3DP) A00;
                c3dp.A0H = new C29388CxL(cp6);
                c3dp.A0F = new C24119An4(A00);
                return;
            }
            return;
        }
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0V = new C24120An5(A00);
        c189448aO.A0U = new C29381CxE(cp6);
        c189448aO.A00().A02(fragmentActivity, c26715Bqw);
    }

    @Override // X.C39G
    public final void DQi(InterfaceC11380iw interfaceC11380iw, InterfaceC904941j interfaceC904941j, EnumC27425C8s enumC27425C8s, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, boolean z) {
        String str;
        long j;
        String str2;
        C14360o3.A0B(interfaceC11380iw, 0);
        C14360o3.A0B(enumC27425C8s, 1);
        C14360o3.A0B(notesPogThoughtBubbleUiState, 2);
        int ordinal = enumC27425C8s.ordinal();
        Integer num = null;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            UserSession userSession = this.A02;
                            String str3 = notesPogThoughtBubbleUiState.A0H;
                            C14360o3.A0B(str3, 0);
                            Long A0k = AbstractC003100w.A0k(10, str3);
                            if (A0k != null) {
                                j = A0k.longValue();
                            } else {
                                j = -1;
                            }
                            String str4 = notesPogThoughtBubbleUiState.A0F;
                            String str5 = notesPogThoughtBubbleUiState.A0C;
                            String str6 = notesPogThoughtBubbleUiState.A0I;
                            String str7 = notesPogThoughtBubbleUiState.A0D;
                            if (interfaceC904941j != null) {
                                str2 = interfaceC904941j.Am2();
                                num = interfaceC904941j.Am9();
                            } else {
                                str2 = null;
                            }
                            C29201Cu6 c29201Cu6 = new C29201Cu6(str2, num);
                            String string = this.A00.getString(2131957687);
                            if (string == null) {
                                string = "";
                            }
                            AbstractC27605CGb.A00(userSession, c29201Cu6, str4, str5, str7, str6, string, j);
                            return;
                        }
                        throw new RuntimeException();
                    }
                    AbstractC23641Du.A05(AnonymousClass191.A00, new C50528MSh(notesPogThoughtBubbleUiState, interfaceC904941j, this, interfaceC11380iw, null, 1, z), C07Y.A00(this.A00));
                    return;
                }
                UserSession userSession2 = this.A02;
                FragmentActivity fragmentActivity = this.A00;
                String str8 = notesPogThoughtBubbleUiState.A0I;
                String str9 = notesPogThoughtBubbleUiState.A0H;
                User user = notesPogThoughtBubbleUiState.A06;
                ContentNoteMetadata A02 = AbstractC25533BQv.A02(interfaceC904941j, notesPogThoughtBubbleUiState);
                C27823COm c27823COm = (C27823COm) this.A05.getValue();
                String string2 = fragmentActivity.getString(2131957687);
                if (string2 == null) {
                    string2 = "";
                }
                C14360o3.A0B(user, 0);
                JY1.A04(fragmentActivity, interfaceC11380iw, userSession2, new C29268CvP(A02, c27823COm, user, string2), str8, str9, notesPogThoughtBubbleUiState.A0J);
                return;
            }
            UserSession userSession3 = this.A02;
            LKo.A01(this.A00, EnumC25577BSp.NOTE_LONG_PRESS, userSession3, AbstractC25533BQv.A02(interfaceC904941j, notesPogThoughtBubbleUiState), notesPogThoughtBubbleUiState.A0C, notesPogThoughtBubbleUiState.A0J, false);
            return;
        }
        if (interfaceC904941j != null) {
            str = interfaceC904941j.Am2();
            num = interfaceC904941j.Am9();
        } else {
            str = null;
        }
        A01(EnumC25577BSp.NOTE_LONG_PRESS, notesPogThoughtBubbleUiState, this, num, str);
    }

    @Override // X.C39H
    public final void DWK(EnumC85043qs enumC85043qs, C38321qM c38321qM, Integer num, WeakReference weakReference, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(weakReference, 0);
        C14360o3.A0B(c38321qM, 2);
        C14360o3.A0B(enumC85043qs, 3);
        C14360o3.A0B(interfaceC16820sZ, 4);
        C14360o3.A0B(interfaceC16660sJ, 5);
        ((C39H) this.A03.getValue()).DWK(enumC85043qs, c38321qM, num, weakReference, interfaceC16820sZ, interfaceC16660sJ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0031, code lost:
    
        if (X.C18U.A06(r3, r4, 36323096768687063L) != false) goto L6;
     */
    @Override // X.C39G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DX7(android.view.View r32, com.instagram.api.schemas.NoteCustomTheme r33, com.instagram.contentnotes.data.metadata.ContentNoteMetadata r34, X.InterfaceC60442pS r35, java.lang.Integer r36, java.lang.Integer r37, java.lang.Long r38, java.lang.String r39, boolean r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39F.DX7(android.view.View, com.instagram.api.schemas.NoteCustomTheme, com.instagram.contentnotes.data.metadata.ContentNoteMetadata, X.2pS, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, boolean, boolean):void");
    }

    @Override // X.C39G
    public final void DkQ(View view, Fragment fragment, ContentNoteMetadata contentNoteMetadata, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, InterfaceC60442pS interfaceC60442pS, Integer num) {
        C3DO c3do = C3DN.A00;
        FragmentActivity fragmentActivity = this.A00;
        C3DN A00 = c3do.A00(fragmentActivity);
        if (A00 != null) {
            C189478aR A002 = F86.A00(A00);
            if (contentNoteMetadata != null && interfaceC60442pS != null && notesPogThoughtBubbleUiState != null) {
                UserSession userSession = this.A02;
                if (C18U.A06(C06090Tz.A05, userSession, 36323096769473503L)) {
                    Bundle A003 = AbstractC61636Rr0.A00(new C09530e4("note_content", new ContentNotesImmersiveSelfNoteContent(contentNoteMetadata, notesPogThoughtBubbleUiState, interfaceC60442pS.isOrganicEligible(), interfaceC60442pS.isSponsoredEligible())));
                    C26863BtP c26863BtP = new C26863BtP();
                    c26863BtP.setArguments(A003);
                    C189448aO c189448aO = new C189448aO(userSession);
                    c189448aO.A0T = c26863BtP;
                    c189448aO.A0I = new ColorDrawable(0);
                    c189448aO.A0J = new ColorDrawable(fragmentActivity.getColor(AbstractC53242c7.A0H(fragmentActivity, R.attr.igds_color_elevated_background)));
                    c189448aO.A0H = fragmentActivity.getDrawable(R.drawable.igds_bottom_sheet_background);
                    c189448aO.A1R = true;
                    c189448aO.A1C = false;
                    if (A002 != null && A002.A03.getViewLifecycleOwner().getLifecycle().A07().A00(C07S.CREATED)) {
                        A02(this, new ME4(39, c189448aO, this, c26863BtP));
                        return;
                    } else {
                        c189448aO.A00().A02(fragmentActivity, c26863BtP);
                        return;
                    }
                }
            }
            if (A002 != null && A002.A03.getViewLifecycleOwner().getLifecycle().A07().A00(C07S.CREATED)) {
                A002.A0G(fragment, new C189448aO(this.A02), true, false);
            } else {
                new C189448aO(this.A02).A00().A02(fragmentActivity, fragment);
            }
        }
    }

    @Override // X.C39G
    public final void DkR(NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, Integer num, String str) {
        Integer num2 = notesPogThoughtBubbleUiState.A08;
        if (num2 == C05F.A0N && ((C85013qp) this.A04.getValue()).A07(notesPogThoughtBubbleUiState.A0Q)) {
            CTS cts = C26867BtT.A08;
            FragmentActivity fragmentActivity = this.A00;
            cts.A00(fragmentActivity, EnumC25577BSp.RECS_NUX, this.A02, new C29215CuK(fragmentActivity, new ME8(num, this, notesPogThoughtBubbleUiState, str, 14)), notesPogThoughtBubbleUiState.A0F, notesPogThoughtBubbleUiState.A0C, JX7.A00(num2), false, true);
            return;
        }
        A01(AbstractC25533BQv.A00(notesPogThoughtBubbleUiState), notesPogThoughtBubbleUiState, this, num, str);
    }

    @Override // X.C39H
    public final void EXO(InterfaceC16660sJ interfaceC16660sJ) {
    }

    @Override // X.C39G
    public final void ElH(NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, Integer num, String str) {
        C14360o3.A0B(notesPogThoughtBubbleUiState, 0);
        Integer num2 = notesPogThoughtBubbleUiState.A08;
        if (num2 == C05F.A0N && ((C85013qp) this.A04.getValue()).A07(notesPogThoughtBubbleUiState.A0Q)) {
            CTS cts = C26867BtT.A08;
            FragmentActivity fragmentActivity = this.A00;
            cts.A00(fragmentActivity, EnumC25577BSp.RECS_NUX_DWELL, this.A02, new C29215CuK(fragmentActivity, new ME8(num, this, notesPogThoughtBubbleUiState, str, 15)), notesPogThoughtBubbleUiState.A0F, notesPogThoughtBubbleUiState.A0C, JX7.A00(num2), false, true);
        }
    }

    private final void A00(Bundle bundle) {
        int[] iArr;
        UserSession userSession = this.A02;
        FragmentActivity fragmentActivity = this.A00;
        C6XJ c6xj = new C6XJ(fragmentActivity, bundle, userSession, TransparentModalActivity.class, AbstractC111324zv.A00(4178));
        if (C28425CgX.A00() && C18U.A06(C06090Tz.A05, userSession, 36323096768883674L)) {
            iArr = ModalActivity.A08;
        } else {
            iArr = C6XJ.A0Q;
        }
        c6xj.A0J = iArr;
        c6xj.A0C(fragmentActivity);
        AbstractC84973ql.A00(userSession);
        C3DN A00 = C3DN.A00.A00(fragmentActivity);
        if (A00 != null) {
            A00.A0B();
        }
    }

    public static final void A01(EnumC25577BSp enumC25577BSp, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, C39F c39f, Integer num, String str) {
        LJe lJe = LJe.A00;
        UserSession userSession = c39f.A02;
        WeakReference weakReference = new WeakReference(c39f.A00);
        String str2 = notesPogThoughtBubbleUiState.A0F;
        String str3 = notesPogThoughtBubbleUiState.A0E;
        String str4 = notesPogThoughtBubbleUiState.A0C;
        String str5 = notesPogThoughtBubbleUiState.A0D;
        String str6 = notesPogThoughtBubbleUiState.A0I;
        lJe.A02(userSession, new C45000Jvq(enumC25577BSp, notesPogThoughtBubbleUiState.A04, null, Integer.valueOf(notesPogThoughtBubbleUiState.A01), num, str2, str3, str4, str5, str6, str, null, false), weakReference);
    }

    public static final void A02(C39F c39f, InterfaceC16820sZ interfaceC16820sZ) {
        C3DN A00 = C3DN.A00.A00(c39f.A00);
        if (A00 != null) {
            ((C3DP) A00).A0H = new C24124An9(interfaceC16820sZ);
            A00.A0B();
        }
    }

    @Override // X.C39G
    public final void DJr(NoteCustomTheme noteCustomTheme, ContentNoteMetadata contentNoteMetadata, InterfaceC60442pS interfaceC60442pS, Integer num, Long l, String str, List list, boolean z, boolean z2) {
        long j;
        User user = contentNoteMetadata.A01;
        String str2 = contentNoteMetadata.A09;
        if (str2 != null) {
            String username = user.getUsername();
            String B8y = user.B8y();
            String id = user.getId();
            NoteAudience A00 = BFV.A00(num);
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            FragmentActivity fragmentActivity = this.A00;
            A00(AbstractC61636Rr0.A00(new C09530e4("note_content", new ContentNotesImmersiveReplyContent(noteCustomTheme, null, contentNoteMetadata, A00, l, username, B8y, str, str2, id, JY1.A02(fragmentActivity, j), list, z2, interfaceC60442pS.isOrganicEligible(), interfaceC60442pS.isSponsoredEligible(), true, C28425CgX.A01(fragmentActivity), true))));
        }
    }

    @Override // X.C39G
    public final void DXF(Fragment fragment, C51D c51d) {
        C3DO c3do = C3DN.A00;
        FragmentActivity fragmentActivity = this.A00;
        C189478aR A00 = F86.A00(c3do.A00(fragmentActivity));
        if (A00 != null && A00.A03.getViewLifecycleOwner().getLifecycle().A07().A00(C07S.CREATED)) {
            C189448aO c189448aO = new C189448aO(this.A02);
            c189448aO.A0T = c51d;
            A00.A0G(fragment, c189448aO, true, false);
        } else {
            C189448aO c189448aO2 = new C189448aO(this.A02);
            c189448aO2.A0T = c51d;
            c189448aO2.A0d = fragmentActivity.getString(2131956743);
            c189448aO2.A00().A02(fragmentActivity, fragment);
        }
    }

    public C39F(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = interfaceC11380iw;
    }
}
