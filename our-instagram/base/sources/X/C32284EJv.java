package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.direct.groupinvites.models.InviteLinkShareInfo;
import com.instagram.direct.sharetostory.data.JoinChatStickerData;
import com.instagram.igds.components.textcell.IgdsActionCell;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.EJv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32284EJv extends AbstractC59962oe implements InterfaceC60122ou {
    public static final /* synthetic */ C0YR[] A0L = {new AnonymousClass019(C32284EJv.class, "threadId", "getThreadId()Lcom/instagram/model/direct/threadkey/intf/ThreadId;", 0), new AnonymousClass019(C32284EJv.class, "threadV2Id", "getThreadV2Id()Ljava/lang/String;", 0), new AnonymousClass019(C32284EJv.class, "threadTitle", "getThreadTitle()Ljava/lang/String;", 0), new AnonymousClass019(C32284EJv.class, "threadImage", "getThreadImage()Lcom/instagram/common/typedurl/ImageUrl;", 0), new AnonymousClass019(C32284EJv.class, "isAdmin", "isAdmin()Z", 0), new AnonymousClass019(C32284EJv.class, "isModerator", "isModerator()Z", 0), new AnonymousClass019(C32284EJv.class, "broadcastChatCreatorId", "getBroadcastChatCreatorId()Ljava/lang/String;", 0), new AnonymousClass019(C32284EJv.class, "isSubscriberOnly", "isSubscriberOnly()Z", 0), new AnonymousClass019(C32284EJv.class, "forceDisableToggle", "getForceDisableToggle()Z", 0), new AnonymousClass019(C32284EJv.class, "userType", "getUserType()Ljava/lang/String;", 0), new AnonymousClass019(C32284EJv.class, "logger", "getLogger()Lcom/instagram/direct/fragment/thread/inviteLink/logger/InviteLinkSettingsLogger;", 0)};
    public static final String __redex_internal_original_name = "DirectThreadInviteLinkSettingsFragment";
    public String A00;
    public boolean A01;
    public boolean A02;
    public LinearLayout A03;
    public C25671My A04;
    public IgdsListCell A05;
    public boolean A06;
    public final AtomicBoolean A0F = new AtomicBoolean(false);
    public final KFH A0K = new C32550EVa(this, C37060GUu.A01(this, 4));
    public final C32550EVa A0I = new C32550EVa(this, C37060GUu.A01(this, 7));
    public final C32550EVa A09 = new C32550EVa(this, C37060GUu.A01(this, 6));
    public final C32550EVa A08 = new C32550EVa(this, C37060GUu.A01(this, 5));
    public final KFH A0J = new C32550EVa(this, C37060GUu.A01(this, 0));
    public final KFH A0C = new C32550EVa(this, C37060GUu.A01(this, 1));
    public final C32550EVa A07 = new C32550EVa(this, new C50165MDs(this, 48));
    public final KFH A0D = new C32550EVa(this, C37060GUu.A01(this, 2));
    public final KFH A0B = new C32550EVa(this, new C50165MDs(this, 49));
    public final C32550EVa A0A = new C32550EVa(this, C37060GUu.A01(this, 8));
    public final KFH A0E = new C32550EVa(this, C37060GUu.A01(this, 3));
    public final InterfaceC41501vz A0H = C31650DvG.A00(this, 23);
    public final InterfaceC09390do A0G = AbstractC60492pY.A02(this);

    public static final void A03(C32284EJv c32284EJv) {
        FPC fpc = (FPC) AbstractC31469DsD.A00(c32284EJv.A0E);
        InterfaceC83733oI A00 = A00(c32284EJv);
        C14360o3.A0B(A00, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(fpc.A00, "link_click_share_tab");
        if (A0f.isSampled()) {
            AbstractC31181DnP.A0g(A0f, A00);
            A0f.Cht();
        }
        String str = c32284EJv.A00;
        if (str != null) {
            Bundle A03 = AbstractC31180DnO.A03(str);
            AbstractC31510Dsu.A0Q(c32284EJv.requireActivity(), A03, c32284EJv, AbstractC166987dD.A0r(c32284EJv.A0G), "share_to_system_sheet", AbstractC166987dD.A1G());
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131963328);
        if (this.A01) {
            if (!C18U.A06(C06090Tz.A05, AbstractC166987dD.A0r(this.A0G), 36314545488661176L)) {
                C3LO A0B = AbstractC31171DnF.A0B();
                A0B.A06 = R.drawable.instagram_share_android_pano_outline_24;
                A0B.A05 = 2131973639;
                AbstractC31176DnK.A1B(ViewOnClickListenerC35691FpR.A00(this, 58), A0B, interfaceC56362iU);
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_thread_invite_link_settings";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A0G;
        C25671My A00 = AbstractC25651Mw.A00(AbstractC166987dD.A0r(interfaceC09390do));
        this.A04 = A00;
        if (A00 == null) {
            C14360o3.A0F("igEventBus");
            throw C00O.createAndThrow();
        }
        A00.A01(this.A0H, C36107Fwh.class);
        Context requireContext = requireContext();
        this.A05 = AbstractC31173DnH.A0Y(view, R.id.invite_link_settings_link);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.invite_link_explainer_text);
        String A04 = C18U.A04(C06090Tz.A05, AbstractC166987dD.A0r(interfaceC09390do), 36877495441621130L);
        if (A04.length() > 0) {
            String A0p = AbstractC166997dE.A0p(requireContext, 2131963320);
            String A01 = A01(requireContext, A0p);
            C14360o3.A0A(A0T);
            int color = requireContext().getColor(AbstractC53242c7.A06(requireContext));
            AnonymousClass773.A07(new EPT(requireContext, new C012804r(16, A0p), this, C05F.A01, A0p, A04, color), A0T, A0p, A01);
        } else {
            A0T.setText(A01(requireContext, ""));
        }
        this.A03 = AbstractC31172DnG.A0B(view, R.id.invite_link_settings_container);
        A07(this);
    }

    public static final InterfaceC83733oI A00(C32284EJv c32284EJv) {
        return (InterfaceC83733oI) AbstractC31469DsD.A00(c32284EJv.A0K);
    }

    public static final String A02(C32284EJv c32284EJv) {
        return (String) AbstractC31469DsD.A00(c32284EJv.A0I);
    }

    public static final void A04(C32284EJv c32284EJv) {
        if (c32284EJv.A02) {
            C142846ck A00 = AbstractC147806l5.A00(AbstractC166987dD.A0r(c32284EJv.A0G));
            int A002 = AbstractC31180DnO.A00(c32284EJv);
            A00.A0M(C05F.A0C, AbstractC1345466e.A07(A00(c32284EJv)), A02(c32284EJv), A002, A08(c32284EJv));
        }
        C50674MYs c50674MYs = new C50674MYs(c32284EJv.requireContext(), AbstractC166987dD.A0r(c32284EJv.A0G));
        Context requireContext = c32284EJv.requireContext();
        int i = 2131963326;
        if (C4GR.A04(c32284EJv.requireArguments().getInt("DirectThreadInviteLinkSettingsFragment.ARGUMENT_THREAD_SUBTYPE"))) {
            i = 2131963310;
        }
        c50674MYs.A08(requireContext.getString(i));
        c50674MYs.A01(ViewOnClickListenerC35691FpR.A00(c32284EJv, 66), 2131963325);
        C31727DwY.A02(c32284EJv, c50674MYs);
    }

    public static final void A05(C32284EJv c32284EJv) {
        C34726FRp A07;
        String str;
        FPC fpc = (FPC) AbstractC31469DsD.A00(c32284EJv.A0E);
        InterfaceC83733oI A00 = A00(c32284EJv);
        C14360o3.A0B(A00, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(fpc.A00, "link_click_send_tab");
        if (A0f.isSampled()) {
            AbstractC31181DnP.A0g(A0f, A00);
            A0f.Cht();
        }
        if (c32284EJv.A02) {
            C142846ck A002 = AbstractC147806l5.A00(AbstractC166987dD.A0r(c32284EJv.A0G));
            int A003 = AbstractC31180DnO.A00(c32284EJv);
            A002.A0M(C05F.A01, AbstractC1345466e.A07(A00(c32284EJv)), A02(c32284EJv), A003, A08(c32284EJv));
        }
        String str2 = c32284EJv.A00;
        if (str2 != null) {
            C36387G3n c36387G3n = new C36387G3n(c32284EJv, 1);
            boolean A04 = C4GR.A04(c32284EJv.requireArguments().getInt("DirectThreadInviteLinkSettingsFragment.ARGUMENT_THREAD_SUBTYPE"));
            C28501Zl c28501Zl = C28531Zo.A04.A02;
            InterfaceC09390do interfaceC09390do = c32284EJv.A0G;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            if (A04) {
                A07 = c28501Zl.A07(c32284EJv, A0r, C2EY.A0S);
                String str3 = c32284EJv.A00;
                InterfaceC83733oI A004 = A00(c32284EJv);
                if (AbstractC1345466e.A02(A004) != null) {
                    str = AbstractC31171DnF.A0c(A004);
                } else {
                    str = null;
                }
                String A02 = A02(c32284EJv);
                String str4 = AbstractC166987dD.A0r(interfaceC09390do).userId;
                C32550EVa c32550EVa = c32284EJv.A07;
                boolean A0K = C14360o3.A0K(str4, AbstractC31469DsD.A00(c32550EVa));
                String str5 = (String) AbstractC31469DsD.A00(c32550EVa);
                String str6 = (String) AbstractC31469DsD.A00(c32284EJv.A09);
                A07.A07.putParcelable(AbstractC111324zv.A00(1586), new InviteLinkShareInfo(null, (ImageUrl) AbstractC31469DsD.A00(c32284EJv.A08), str3, str, A02, str5, str6, (String) AbstractC31469DsD.A00(c32284EJv.A0A), c32284EJv.requireArguments().getInt("DirectThreadInviteLinkSettingsFragment.ARGUMENT_THREAD_SUBTYPE"), AbstractC31180DnO.A00(c32284EJv), c32284EJv.requireArguments().getInt("DirectThreadInviteLinkSettingsFragment.MEMBER_COUNT"), A0K, C98Q.A00(AbstractC166987dD.A0r(interfaceC09390do)).A00(A00(c32284EJv), 24)));
            } else {
                A07 = c28501Zl.A07(c32284EJv, A0r, C2EY.A19);
                A07.A07(str2);
            }
            A07.A01 = c36387G3n;
            DirectShareSheetFragment A005 = A07.A00();
            C3DN A0m = AbstractC25230BEn.A0m(c32284EJv);
            if (A0m != null) {
                A0m.A0K(A005);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A07(C32284EJv c32284EJv) {
        String str;
        String str2;
        IgdsActionCell igdsActionCell;
        IgdsActionCell igdsActionCell2;
        IgdsActionCell igdsActionCell3;
        String str3;
        IgdsActionCell igdsActionCell4;
        IgdsListCell igdsListCell = c32284EJv.A05;
        if (igdsListCell == null) {
            str = "igdsTextCell";
        } else {
            igdsListCell.A04();
            String str4 = c32284EJv.A00;
            if (str4 != null && c32284EJv.A01) {
                igdsListCell.A0H(str4);
            }
            if (A08(c32284EJv) && !AbstractC166987dD.A1a(AbstractC31469DsD.A00(c32284EJv.A0B))) {
                igdsListCell.setTextCellType(EnumC53237Nga.A08);
                igdsListCell.setChecked(c32284EJv.A01);
                G9H.A00(igdsListCell, c32284EJv, 10);
            } else {
                igdsListCell.setTextCellType(EnumC53237Nga.A09);
            }
            if (str4 != null && c32284EJv.A01) {
                if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0r(c32284EJv.A0G), 36330509881590667L)) {
                    igdsListCell.A07(R.style.igds_body_1, AbstractC53242c7.A06(igdsListCell.getContext()));
                    C0fQ.A00(new ViewOnClickListenerC35585Fnc(igdsListCell, c32284EJv, str4, 1), igdsListCell.getSubtitleView());
                }
            }
            Context requireContext = c32284EJv.requireContext();
            LinearLayout linearLayout = c32284EJv.A03;
            str = "menuOptionsContainer";
            if (linearLayout != null) {
                linearLayout.removeAllViews();
                if (c32284EJv.A01 && (str2 = c32284EJv.A00) != null && str2.length() > 0) {
                    InterfaceC09390do interfaceC09390do = c32284EJv.A0G;
                    UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                    C06090Tz c06090Tz = C06090Tz.A05;
                    boolean A06 = C18U.A06(c06090Tz, A0r, 36314545488661176L);
                    LinearLayout linearLayout2 = c32284EJv.A03;
                    if (linearLayout2 != null) {
                        CharSequence text = c32284EJv.getText(2131963313);
                        C14360o3.A07(text);
                        C50363MLp c50363MLp = new C50363MLp(8, requireContext, c32284EJv);
                        if (A06) {
                            IgdsListCell A0Z = AbstractC31174DnI.A0Z(requireContext);
                            A0Z.A0I(text);
                            A0Z.A05(R.drawable.instagram_copy_pano_outline_24);
                            A0Z.A0C(ViewOnClickListenerC35691FpR.A00(c50363MLp, 67));
                            igdsActionCell = A0Z;
                        } else {
                            IgdsActionCell igdsActionCell5 = new IgdsActionCell(requireContext, null, 0);
                            igdsActionCell5.A00(ViewOnClickListenerC35691FpR.A00(c50363MLp, 67), EnumC33337EoW.A04, text);
                            igdsActionCell = igdsActionCell5;
                        }
                        AbstractC56952jT.A01(igdsActionCell);
                        linearLayout2.addView(igdsActionCell);
                        LinearLayout linearLayout3 = c32284EJv.A03;
                        if (linearLayout3 != null) {
                            CharSequence text2 = c32284EJv.getText(2131963329);
                            C14360o3.A07(text2);
                            if (A06) {
                                IgdsListCell A0Z2 = AbstractC31174DnI.A0Z(requireContext);
                                A0Z2.A0I(text2);
                                A0Z2.A05(R.drawable.instagram_direct_pano_outline_24);
                                A0Z2.A0C(ViewOnClickListenerC35691FpR.A00(c32284EJv, 62));
                                igdsActionCell2 = A0Z2;
                            } else {
                                IgdsActionCell igdsActionCell6 = new IgdsActionCell(requireContext, null, 0);
                                igdsActionCell6.A00(ViewOnClickListenerC35691FpR.A00(c32284EJv, 63), EnumC33337EoW.A04, text2);
                                igdsActionCell2 = igdsActionCell6;
                            }
                            AbstractC56952jT.A01(igdsActionCell2);
                            linearLayout3.addView(igdsActionCell2);
                            if (C18U.A06(c06090Tz, AbstractC166987dD.A0r(interfaceC09390do), 36314545488333493L) && C98Q.A00(AbstractC166987dD.A0r(interfaceC09390do)).A00(A00(c32284EJv), 24)) {
                                LinearLayout linearLayout4 = c32284EJv.A03;
                                if (linearLayout4 != null) {
                                    CharSequence text3 = c32284EJv.getText(2131963331);
                                    C14360o3.A07(text3);
                                    if (A06) {
                                        IgdsListCell A0Z3 = AbstractC31174DnI.A0Z(requireContext);
                                        A0Z3.A0I(text3);
                                        A0Z3.A05(R.drawable.instagram_new_story_pano_outline_24);
                                        A0Z3.A0C(ViewOnClickListenerC35691FpR.A00(c32284EJv, 64));
                                        igdsActionCell4 = A0Z3;
                                    } else {
                                        IgdsActionCell igdsActionCell7 = new IgdsActionCell(requireContext, null, 0);
                                        igdsActionCell7.A00(ViewOnClickListenerC35691FpR.A00(c32284EJv, 65), EnumC33337EoW.A04, text3);
                                        igdsActionCell4 = igdsActionCell7;
                                    }
                                    AbstractC56952jT.A01(igdsActionCell4);
                                    linearLayout4.addView(igdsActionCell4);
                                }
                            }
                            if (c32284EJv.A02 && AbstractC54241NyM.A00(AbstractC166987dD.A0r(interfaceC09390do)) && C98Q.A00(AbstractC166987dD.A0r(interfaceC09390do)).A00(A00(c32284EJv), 35)) {
                                C142846ck A00 = AbstractC147806l5.A00(AbstractC166987dD.A0r(interfaceC09390do));
                                int A002 = AbstractC31180DnO.A00(c32284EJv);
                                String A07 = AbstractC1345466e.A07(A00(c32284EJv));
                                String A02 = A02(c32284EJv);
                                boolean A08 = A08(c32284EJv);
                                C25531Mh A0I = AbstractC31172DnG.A0I(A00);
                                if (AbstractC25226BEj.A1Z(A0I)) {
                                    AbstractC31175DnJ.A1B(A0I, A00);
                                    AbstractC31174DnI.A1K(A0I, "qr_code_option_rendered");
                                    A0I.A0o(AbstractC111324zv.A00(4719));
                                    if (A08) {
                                        str3 = "creator_invite_link_details";
                                    } else {
                                        str3 = "fan_invite_link_details";
                                    }
                                    A0I.A0h(AbstractC31179DnN.A0a(A0I, str3, A07, A02, A002));
                                    A0I.Cht();
                                }
                                LinearLayout linearLayout5 = c32284EJv.A03;
                                if (linearLayout5 != null) {
                                    View A0C = AbstractC25227BEk.A0C(LayoutInflater.from(requireContext), R.layout.direct_thread_details_home_item);
                                    ImageView A0D = AbstractC31176DnK.A0D(A0C, R.id.item_icon);
                                    TextView A0N = AbstractC167007dF.A0N(A0C, R.id.item_title);
                                    View A0S = AbstractC166997dE.A0S(A0C, R.id.item_subtitle);
                                    View A0S2 = AbstractC166997dE.A0S(A0C, R.id.new_badge);
                                    C23031Ai A003 = AbstractC23021Ah.A00(AbstractC166987dD.A0r(interfaceC09390do));
                                    A0D.setImageResource(R.drawable.instagram_scan_qr_pano_outline_24);
                                    int i = 0;
                                    A0D.setVisibility(0);
                                    A0N.setText(2131963323);
                                    A0S.setVisibility(8);
                                    if (!(!A003.A01.getBoolean("bc_qr_code_sharing_has_seen_new_badge_in_thread_details", false))) {
                                        i = 8;
                                    }
                                    A0S2.setVisibility(i);
                                    FpQ.A01(A0C, 3, c32284EJv, A003);
                                    AbstractC56952jT.A01(A0C);
                                    linearLayout5.addView(A0C);
                                }
                            }
                            if (A06) {
                                LinearLayout linearLayout6 = c32284EJv.A03;
                                if (linearLayout6 != null) {
                                    IgdsListCell A0Z4 = AbstractC31174DnI.A0Z(requireContext);
                                    A0Z4.A06(2131963330);
                                    A0Z4.A05(R.drawable.instagram_share_android_pano_outline_24);
                                    A0Z4.A0C(ViewOnClickListenerC35691FpR.A00(c32284EJv, 59));
                                    AbstractC56952jT.A01(A0Z4);
                                    linearLayout6.addView(A0Z4);
                                }
                            }
                            if (A08(c32284EJv) || AbstractC166987dD.A1a(AbstractC31469DsD.A00(c32284EJv.A0C))) {
                                LinearLayout linearLayout7 = c32284EJv.A03;
                                if (linearLayout7 != null) {
                                    CharSequence text4 = c32284EJv.getText(2131963324);
                                    C14360o3.A07(text4);
                                    if (A06) {
                                        IgdsListCell A0Z5 = AbstractC31174DnI.A0Z(requireContext);
                                        A0Z5.A0I(text4);
                                        A0Z5.A0C(ViewOnClickListenerC35691FpR.A00(c32284EJv, 61));
                                        int color = requireContext.getColor(AbstractC53242c7.A03(requireContext));
                                        AbstractC166987dD.A0e(A0Z5.getTextCellView(), R.id.igds_textcell_title).setTextColor(color);
                                        Drawable drawable = requireContext.getDrawable(R.drawable.instagram_reshare_pano_outline_24);
                                        igdsActionCell3 = A0Z5;
                                        if (drawable != null) {
                                            A0Z5.A0A(drawable, Integer.valueOf(color));
                                            igdsActionCell3 = A0Z5;
                                        }
                                    } else {
                                        IgdsActionCell igdsActionCell8 = new IgdsActionCell(requireContext, null, 0);
                                        igdsActionCell8.A00(ViewOnClickListenerC35691FpR.A00(c32284EJv, 60), EnumC33337EoW.A03, text4);
                                        igdsActionCell3 = igdsActionCell8;
                                    }
                                    AbstractC56952jT.A01(igdsActionCell3);
                                    linearLayout7.addView(igdsActionCell3);
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final boolean A08(C32284EJv c32284EJv) {
        return AbstractC166987dD.A1a(AbstractC31469DsD.A00(c32284EJv.A0J));
    }

    public final UserSession A09() {
        return AbstractC166987dD.A0r(this.A0G);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.A0G);
    }

    private final String A01(Context context, String str) {
        int i;
        int i2;
        Object[] objArr;
        if (requireArguments().getInt("DirectThreadInviteLinkSettingsFragment.ARGUMENT_THREAD_SUBTYPE") == 29) {
            C32550EVa c32550EVa = this.A07;
            if (AbstractC31469DsD.A00(c32550EVa) != null) {
                Object A00 = AbstractC31469DsD.A00(c32550EVa);
                InterfaceC09390do interfaceC09390do = this.A0G;
                if (!AbstractC31171DnF.A1W(AbstractC166987dD.A0r(interfaceC09390do), A00)) {
                    User A02 = AnonymousClass189.A00(AbstractC166987dD.A0r(interfaceC09390do)).A02((String) AbstractC31469DsD.A00(c32550EVa));
                    if (A02 != null) {
                        String username = A02.getUsername();
                        i2 = 2131963311;
                        if (AbstractC166987dD.A1a(AbstractC31469DsD.A00(this.A0D))) {
                            i2 = 2131963333;
                            objArr = new Object[]{username, str};
                            String string = context.getString(i2, objArr);
                            C14360o3.A0A(string);
                            return string;
                        }
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    i2 = 2131963312;
                    if (AbstractC166987dD.A1a(AbstractC31469DsD.A00(this.A0D))) {
                        i2 = 2131963334;
                    }
                }
                objArr = new Object[]{str};
                String string2 = context.getString(i2, objArr);
                C14360o3.A0A(string2);
                return string2;
            }
        }
        if (C4GR.A01(requireArguments().getInt("DirectThreadInviteLinkSettingsFragment.ARGUMENT_THREAD_SUBTYPE"))) {
            i = 2131963332;
        } else {
            boolean A06 = C18U.A06(C06090Tz.A05, AbstractC166987dD.A0r(this.A0G), 36314545488857787L);
            boolean z = this.A06;
            if (A06) {
                i = 2131963318;
                if (z) {
                    i = 2131963319;
                }
            } else {
                i = 2131963316;
                if (z) {
                    i = 2131963317;
                }
            }
        }
        return AbstractC31177DnL.A0b(context, str, i);
    }

    public static final void A06(C32284EJv c32284EJv) {
        String str;
        int i = c32284EJv.requireArguments().getInt("DirectThreadInviteLinkSettingsFragment.ARGUMENT_THREAD_SUBTYPE");
        if (i != 29) {
            if (i == 32 || i == 62) {
                C36299Fzu A00 = AbstractC34060F1n.A00(AbstractC166987dD.A0r(c32284EJv.A0G));
                String A07 = AbstractC1345466e.A07(A00(c32284EJv));
                String A02 = A02(c32284EJv);
                boolean A08 = A08(c32284EJv);
                C25531Mh A002 = C36299Fzu.A00(A00);
                if (AbstractC25226BEj.A1Z(A002)) {
                    HashMap A1G = AbstractC166987dD.A1G();
                    A1G.put("is_chat_creator", AbstractC31172DnG.A0z(A08 ? 1 : 0));
                    C36299Fzu.A04(A002, A00);
                    AbstractC31174DnI.A1I(A002, "story_camera_rendered_public_jcs");
                    A002.A0o(AbstractC111324zv.A00(5321));
                    A002.A0p("thread_details_link");
                    AbstractC31175DnJ.A1C(A002, AbstractC31179DnN.A0Z(A002, "instagram", A07, A02), A1G);
                }
            }
        } else {
            AbstractC147806l5.A00(AbstractC166987dD.A0r(c32284EJv.A0G)).A0T(AbstractC1345466e.A07(A00(c32284EJv)), A02(c32284EJv), "thread_details_link", AbstractC31180DnO.A00(c32284EJv), A08(c32284EJv));
        }
        InterfaceC83733oI A003 = A00(c32284EJv);
        if (AbstractC1345466e.A02(A003) != null) {
            str = AbstractC31171DnF.A0c(A003);
        } else {
            str = null;
        }
        String A022 = A02(c32284EJv);
        String str2 = (String) AbstractC31469DsD.A00(c32284EJv.A09);
        int A004 = AbstractC31180DnO.A00(c32284EJv);
        JoinChatStickerData joinChatStickerData = new JoinChatStickerData((ImageUrl) AbstractC31469DsD.A00(c32284EJv.A08), str, A022, str2, AbstractC31172DnG.A16(Locale.ROOT, "THREAD_DETAILS_LINK"), A004, c32284EJv.requireArguments().getInt("DirectThreadInviteLinkSettingsFragment.MEMBER_COUNT"), c32284EJv.requireArguments().getInt("DirectThreadInviteLinkSettingsFragment.ARGUMENT_THREAD_SUBTYPE"), A08(c32284EJv), false, false);
        AbstractC34835FWs.A01(c32284EJv.requireActivity(), AbstractC166987dD.A0r(c32284EJv.A0G), joinChatStickerData);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-932563742);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = requireArguments.getString("DirectThreadInviteLinkSettingsFragment.ARGUMENT_GROUP_INVITE_LINK");
        this.A01 = requireArguments.getBoolean("DirectThreadInviteLinkSettingsFragment.ARGUMENT_GROUP_INVITE_LINK_MODE");
        this.A06 = requireArguments.getBoolean("DirectThreadInviteLinkSettingsFragment.ARGUMENT_GROUP_INVITE_ADMIN_APPROVAL_MODE");
        this.A02 = AbstractC167007dF.A1W(requireArguments.getString(AbstractC43591JPw.A00(253)));
        C0f9.A09(274074873, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1399993255);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_thread_invite_link_settings, viewGroup, false);
        C0f9.A09(1483845778, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC83713oG interfaceC83713oG;
        boolean z;
        String str;
        int A02 = C0f9.A02(1814612947);
        super.onDestroy();
        Bundle bundle = this.mArguments;
        String str2 = null;
        if (bundle != null) {
            interfaceC83713oG = AbstractC2054897w.A00(bundle, "DirectThreadInviteLinkSettingsFragment.THREAD_ID");
        } else {
            interfaceC83713oG = null;
        }
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str2 = bundle2.getString("DirectThreadInviteLinkSettingsFragment.THREAD_V2_ID");
        }
        Bundle bundle3 = this.mArguments;
        int i = 0;
        if (bundle3 != null) {
            z = bundle3.getBoolean("DirectThreadInviteLinkSettingsFragment.IS_ADMIN");
        } else {
            z = false;
        }
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            i = bundle4.getInt("DirectThreadInviteLinkSettingsFragment.ARGUMENT_AUDIENCE_TYPE");
        }
        if (this.A02 && interfaceC83713oG != null) {
            C142846ck A00 = AbstractC147806l5.A00(AbstractC166987dD.A0r(this.A0G));
            String A07 = AbstractC1345466e.A07((InterfaceC83733oI) interfaceC83713oG);
            C25531Mh A0I = AbstractC31172DnG.A0I(A00);
            if (AbstractC25226BEj.A1Z(A0I)) {
                AbstractC31175DnJ.A1B(A0I, A00);
                AbstractC31174DnI.A1K(A0I, "exit_invite_link_sheet");
                A0I.A0o("back_button");
                if (z) {
                    str = "creator_invite_link_details";
                } else {
                    str = "fan_invite_link_details";
                }
                A0I.A0h(AbstractC31179DnN.A0a(A0I, str, A07, str2, i));
                A0I.Cht();
            }
        }
        C25671My c25671My = this.A04;
        if (c25671My == null) {
            C14360o3.A0F("igEventBus");
            throw C00O.createAndThrow();
        }
        c25671My.A02(this.A0H, C36107Fwh.class);
        C0f9.A09(1235358605, A02);
    }
}
