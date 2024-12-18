package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NVl extends N7F {
    public boolean A00;
    public static final String __redex_internal_original_name = "CrosspostingUserMigrationBottomSheetFragment";
    public static final CallerContext A01 = CallerContext.A01(__redex_internal_original_name);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "crossposting_upsell_bottom_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TextView A0e;
        String A00;
        CharSequence string;
        CharSequence charSequence;
        Object string2;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        int i = 2131976315;
        if (this.A00) {
            i = 2131976317;
        }
        String A0v = AbstractC25227BEk.A0v(this, i);
        int i2 = 2131976317;
        if (this.A00) {
            i2 = 2131976315;
        }
        String A0v2 = AbstractC25227BEk.A0v(this, i2);
        TextView A0e2 = AbstractC166987dD.A0e(view, R.id.crossposting_second_wave_upsell_bottom_sheet_title);
        Context requireContext = requireContext();
        if (A0e2 != null) {
            MSX.A0x(requireContext.getResources(), A0e2, new Object[]{A0v2}, 2131973077);
            A0e2.setVisibility(0);
        }
        C131995xZ A002 = C196068lw.A00(getSession()).A00(CallerContext.A01(__redex_internal_original_name));
        if (C196068lw.A02(A002)) {
            boolean A02 = A02(this);
            int i3 = R.id.crossposting_second_wave_upsell_bottom_sheet_subtitle;
            if (A02) {
                i3 = R.id.crossposting_second_wave_upsell_bottom_sheet_subtitle_black;
            }
            TextView A0e3 = AbstractC166987dD.A0e(view, i3);
            boolean A022 = A02(this);
            int i4 = R.id.crossposting_second_wave_upsell_bottom_sheet_audience_disclaimer;
            if (A022) {
                i4 = R.id.crossposting_second_wave_upsell_bottom_sheet_audience_disclaimer_black;
            }
            A0e = AbstractC166987dD.A0e(view, i4);
            Context requireContext2 = requireContext();
            if (A0e3 != null) {
                MSX.A0x(requireContext2.getResources(), A0e3, new Object[]{A0v, A002.A04, A0v2}, 2131973073);
                A0e3.setVisibility(0);
            }
            if (C18U.A06(C06090Tz.A05, getSession(), 36330793349432346L) && A0e != null) {
                charSequence = MSX.A09(requireContext2.getResources(), A0v2, 2131973071);
                A0e.setText(charSequence);
                A0e.setVisibility(0);
            }
        } else {
            String str = A002.A04;
            boolean A023 = A02(this);
            int i5 = R.id.crossposting_second_wave_upsell_bottom_sheet_subtitle;
            if (A023) {
                i5 = R.id.crossposting_second_wave_upsell_bottom_sheet_subtitle_black;
            }
            TextView A0e4 = AbstractC166987dD.A0e(view, i5);
            boolean A024 = A02(this);
            int i6 = R.id.crossposting_second_wave_upsell_bottom_sheet_message;
            if (A024) {
                i6 = R.id.crossposting_second_wave_upsell_bottom_sheet_message_black;
            }
            TextView A0e5 = AbstractC166987dD.A0e(view, i6);
            boolean A025 = A02(this);
            int i7 = R.id.crossposting_second_wave_upsell_bottom_sheet_audience_disclaimer;
            if (A025) {
                i7 = R.id.crossposting_second_wave_upsell_bottom_sheet_audience_disclaimer_black;
            }
            A0e = AbstractC166987dD.A0e(view, i7);
            Context requireContext3 = requireContext();
            if (A0e4 != null) {
                if (str.length() > 0) {
                    string2 = AbstractC07900bA.A00(requireContext3.getResources(), new Object[]{A0v, str, A0v2}, 2131973075);
                } else {
                    A01(EnumC201098ur.SUPPRESS, this, "empty_name");
                    string2 = getString(2131973072, A0v, A0v2);
                }
                C14360o3.A0A(string2);
                AbstractC31171DnF.A15(A0e4, string2);
                A0e4.setVisibility(0);
            }
            if (A0e5 != null) {
                int i8 = 2131976126;
                if (AnonymousClass252.A00(getSession()).A01) {
                    i8 = 2131976127;
                }
                AbstractC25227BEk.A12(A0e5, this, i8);
                A0e5.setVisibility(0);
            }
            if (A0e != null) {
                int ordinal = A0A().ordinal();
                if (ordinal != 27) {
                    if (ordinal != 23) {
                        charSequence = "";
                        A0e.setText(charSequence);
                        A0e.setVisibility(0);
                    } else {
                        C131975xX c131975xX = C131965xW.A05;
                        A00 = N7F.A00(requireContext3, this);
                    }
                } else {
                    A00 = AbstractC200008t4.A00(requireContext3, getSession(), A002);
                }
                if (A00 != null && A00.length() != 0) {
                    string = AbstractC07900bA.A00(requireContext3.getResources(), new Object[]{A0v2, A00}, 2131973074);
                } else {
                    A01(EnumC201098ur.SUPPRESS, this, "empty_audience");
                    string = getString(2131973067);
                }
                C14360o3.A0A(string);
                charSequence = string;
                A0e.setText(charSequence);
                A0e.setVisibility(0);
            }
        }
        View findViewById = view.findViewById(R.id.second_wave_confirm_button);
        View findViewById2 = view.findViewById(R.id.second_wave_cancel_button);
        if (findViewById != null) {
            Ok3.A00(findViewById, 43, this);
        }
        if (findViewById2 != null) {
            Ok3.A00(findViewById2, 44, this);
        }
        A01(EnumC201098ur.VIEW, this, null);
        C35038FcB A012 = FXY.A01(getSession(), this.A01);
        if (A012 != null) {
            A012.A00();
        }
    }

    public static final void A01(EnumC201098ur enumC201098ur, NVl nVl, String str) {
        InterfaceC19630xq interfaceC19630xq;
        String str2;
        int A012;
        UserSession session = nVl.getSession();
        C82G c82g = nVl.A02;
        if (c82g != null) {
            C82H A0A = nVl.A0A();
            C82I A0H = MSW.A0H();
            A0H.A0A(Boolean.valueOf(nVl.A09));
            A0H.A09(AbstractC166997dE.A0b());
            C23031Ai A00 = AbstractC23021Ah.A00(nVl.getSession());
            int ordinal = nVl.A0A().ordinal();
            if (ordinal != 27) {
                if (ordinal != 23) {
                    A012 = 0;
                    AbstractC50523MSb.A18(A0H, A012);
                    A0H.A06("ig_media_id", nVl.A07);
                    AbstractC50523MSb.A19(A0H, "waterfall_id", nVl.A08, str);
                    AbstractC201108us.A00(c82g, enumC201098ur, A0A, A0H, session);
                    return;
                }
                interfaceC19630xq = A00.A01;
                str2 = "feed_xpost_user_migration_upsell_second_wave_display_count";
            } else {
                interfaceC19630xq = A00.A01;
                str2 = "story_xpost_user_migration_upsell_second_wave_display_count";
            }
            A012 = AbstractC31172DnG.A01(interfaceC19630xq, str2);
            AbstractC50523MSb.A18(A0H, A012);
            A0H.A06("ig_media_id", nVl.A07);
            AbstractC50523MSb.A19(A0H, "waterfall_id", nVl.A08, str);
            AbstractC201108us.A00(c82g, enumC201098ur, A0A, A0H, session);
            return;
        }
        C14360o3.A0F("entrypoint");
        throw C00O.createAndThrow();
    }

    public static boolean A02(N7F n7f) {
        return AbstractC54214Nxs.A00(n7f.getSession()).booleanValue();
    }

    @Override // X.N7F, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(383071403);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = requireArguments.getBoolean("args_is_story_enabled", false);
        requireArguments.getBoolean("args_is_post_enabled", false);
        this.A09 = requireArguments.getBoolean("args_is_after_fbc", false);
        C82H valueOf = C82H.valueOf(AbstractC31173DnH.A0k(requireArguments, "args_upsell_variant"));
        C14360o3.A0B(valueOf, 0);
        this.A03 = valueOf;
        UserSession session = getSession();
        NVj nVj = (NVj) session.A01(NVj.class, new C43205J8c(session, 16));
        InterfaceC58075Pp0 interfaceC58075Pp0 = nVj.A05;
        if (interfaceC58075Pp0 == null) {
            interfaceC58075Pp0 = new PG6(nVj);
            nVj.A05 = interfaceC58075Pp0;
        }
        this.A05 = interfaceC58075Pp0;
        AbstractC50523MSb.A0i(requireArguments, this);
        C0f9.A09(997230072, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-182903013);
        C14360o3.A0B(layoutInflater, 0);
        boolean A06 = C18U.A06(C06090Tz.A05, getSession(), 36330793349432346L);
        int i = R.layout.fragment_crossposting_upsell_second_wave_bottom_sheet;
        if (A06) {
            i = R.layout.fragment_crossposting_upsell_second_wave_bottom_sheet_igds;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        C0f9.A09(-1230564493, A02);
        return inflate;
    }
}
