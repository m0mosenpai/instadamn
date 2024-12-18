package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.paging.PagingDataAdapter;
import com.facebook.R;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicDataSource;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.GtX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38337GtX extends PagingDataAdapter {
    public final Context A00;
    public final C153756vk A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final InterfaceC678133v A04;
    public final InterfaceC43440JHe A05;
    public final Integer A06;
    public final List A07;
    public final InterfaceC16660sJ A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C38337GtX(android.content.Context r3, X.C153756vk r4, X.InterfaceC11380iw r5, com.instagram.common.session.UserSession r6, X.InterfaceC678133v r7, X.InterfaceC43440JHe r8, java.lang.Integer r9, X.InterfaceC16660sJ r10, boolean r11, boolean r12, boolean r13, boolean r14) {
        /*
            r2 = this;
            r0 = 1
            X.AbstractC167007dF.A1G(r6, r0, r4)
            X.Gte r1 = X.C38344Gte.A00
            X.12T r0 = X.C12P.A00
            X.137 r0 = X.AnonymousClass131.A00
            r2.<init>(r1, r0)
            r2.A03 = r6
            r2.A02 = r5
            r2.A05 = r8
            r2.A04 = r7
            r2.A01 = r4
            r2.A0B = r11
            r2.A0A = r12
            r2.A0C = r13
            r2.A06 = r9
            r2.A00 = r3
            r2.A09 = r14
            r2.A08 = r10
            java.util.ArrayList r0 = X.AbstractC166987dD.A1E()
            r2.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38337GtX.<init>(android.content.Context, X.6vk, X.0iw, com.instagram.common.session.UserSession, X.33v, X.JHe, java.lang.Integer, X.0sJ, boolean, boolean, boolean, boolean):void");
    }

    public final void A07(String str, boolean z) {
        C14360o3.A0B(str, 0);
        int i = 0;
        for (Object obj : A01().A00) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            AbstractC39658Hin abstractC39658Hin = (AbstractC39658Hin) obj;
            if (abstractC39658Hin instanceof HYM) {
                HYM hym = (HYM) abstractC39658Hin;
                if (C14360o3.A0K(hym.A07, str)) {
                    AudioPageMetadata audioPageMetadata = hym.A00;
                    String str2 = audioPageMetadata.A00;
                    String str3 = audioPageMetadata.A07;
                    String str4 = audioPageMetadata.A08;
                    boolean z2 = audioPageMetadata.A0O;
                    String str5 = audioPageMetadata.A09;
                    String str6 = audioPageMetadata.A0B;
                    ImageUrl imageUrl = audioPageMetadata.A02;
                    ImageUrl imageUrl2 = audioPageMetadata.A03;
                    String str7 = audioPageMetadata.A0D;
                    String str8 = audioPageMetadata.A0M;
                    String str9 = audioPageMetadata.A0J;
                    String str10 = audioPageMetadata.A0K;
                    String str11 = audioPageMetadata.A0C;
                    String str12 = audioPageMetadata.A0N;
                    AudioType audioType = audioPageMetadata.A05;
                    boolean z3 = audioPageMetadata.A0Q;
                    String str13 = audioPageMetadata.A0L;
                    MusicDataSource musicDataSource = audioPageMetadata.A06;
                    boolean z4 = audioPageMetadata.A0T;
                    boolean z5 = audioPageMetadata.A0R;
                    hym.A00 = new AudioPageMetadata(audioPageMetadata.A01, imageUrl, imageUrl2, audioPageMetadata.A04, audioType, musicDataSource, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, audioPageMetadata.A0I, audioPageMetadata.A0E, audioPageMetadata.A0F, audioPageMetadata.A0A, audioPageMetadata.A0H, audioPageMetadata.A0G, z2, z3, z, z4, z5, audioPageMetadata.A0S);
                    notifyItemChanged(i);
                }
            }
            i = i2;
        }
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    return new C38413Guo(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.audio_header_cell_container, false));
                }
                throw AbstractC25230BEn.A0n("Unsupported audio list type ", i);
            }
            int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            return new C38414Gup(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.audio_list_header, false));
        }
        View inflate = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.saved_audio_list_item, viewGroup, false);
        if (this.A09) {
            AbstractC31172DnG.A1B(this.A00, inflate, R.color.clips_creation_transparent_color);
        }
        int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(inflate);
        return new C38511GwW(inflate, this.A06);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(com.instagram.music.common.model.MusicDataSource r4, X.C38511GwW r5, X.C38337GtX r6) {
        /*
            X.33v r0 = r6.A04
            java.lang.Integer r4 = r0.CAJ(r4)
            int r3 = r4.intValue()
            r2 = 1
            r1 = 0
            com.instagram.music.common.ui.MusicPreviewButton r0 = r5.A0C
            if (r3 == r1) goto L2b
            X.8G6 r1 = r0.A00
            if (r3 == r2) goto L28
            X.8G5 r0 = X.C8G5.A05
            r1.A01(r0)
            r0 = 0
            r1.A00(r0)
        L1d:
            android.widget.TextView r1 = r5.A03
            java.lang.Integer r0 = X.C05F.A0C
            if (r4 == r0) goto L24
            r2 = 0
        L24:
            r1.setSelected(r2)
            return
        L28:
            X.8G5 r0 = X.C8G5.A03
            goto L2f
        L2b:
            X.8G6 r1 = r0.A00
            X.8G5 r0 = X.C8G5.A04
        L2f:
            r1.A01(r0)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38337GtX.A00(com.instagram.music.common.model.MusicDataSource, X.GwW, X.GtX):void");
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        Drawable drawable;
        String format;
        InterfaceC56392iX interfaceC56392iX;
        int intValue;
        int i2;
        int i3;
        String str;
        C14360o3.A0B(c3oo, 0);
        AbstractC39658Hin abstractC39658Hin = (AbstractC39658Hin) A02(i);
        if (abstractC39658Hin != null) {
            if (abstractC39658Hin instanceof HYK) {
                ((C38414Gup) c3oo).A00.setText(((HYK) abstractC39658Hin).A00);
                return;
            }
            if (abstractC39658Hin instanceof HYL) {
                IgLinearLayout igLinearLayout = ((C38413Guo) c3oo).A00;
                View childAt = igLinearLayout.getChildAt(0);
                if (childAt != null && (childAt instanceof C38311Gsx)) {
                    C38311Gsx c38311Gsx = (C38311Gsx) childAt;
                    HYL hyl = (HYL) abstractC39658Hin;
                    c38311Gsx.A01(hyl.A02);
                    c38311Gsx.A03(hyl.A01, hyl.A00);
                    return;
                }
                Context context = this.A00;
                C38311Gsx c38311Gsx2 = new C38311Gsx(context);
                HYL hyl2 = (HYL) abstractC39658Hin;
                c38311Gsx2.A01(hyl2.A02);
                c38311Gsx2.A03(hyl2.A01, hyl2.A00);
                float dimension = context.getResources().getDimension(R.dimen.abc_text_size_menu_header_material);
                float dimension2 = context.getResources().getDimension(R.dimen.add_payment_bottom_sheet_row_subtitle_size);
                IgTextView igTextView = c38311Gsx2.A03;
                if (igTextView == null) {
                    str = "headerText";
                } else {
                    Context A0L = AbstractC166997dE.A0L(c38311Gsx2);
                    igTextView.setTextSize(AbstractC13880nE.A02(A0L, dimension));
                    IgTextView igTextView2 = c38311Gsx2.A02;
                    if (igTextView2 == null) {
                        str = "actionText";
                    } else {
                        igTextView2.setTextSize(AbstractC13880nE.A02(A0L, dimension2));
                        igLinearLayout.addView(c38311Gsx2);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            if (abstractC39658Hin instanceof HYM) {
                C38511GwW c38511GwW = (C38511GwW) c3oo;
                HYM hym = (HYM) abstractC39658Hin;
                Integer valueOf = Integer.valueOf(i);
                boolean A1R = AbstractC167007dF.A1R(0, c38511GwW, hym);
                List list = this.A07;
                String str2 = hym.A07;
                if (!list.contains(str2)) {
                    UserSession userSession = this.A03;
                    InterfaceC11380iw interfaceC11380iw = this.A02;
                    Long A0j = AbstractC25231BEo.A0j(0, str2);
                    Long valueOf2 = Long.valueOf(AbstractC37302Gc3.A04(valueOf));
                    String str3 = hym.A08;
                    C14360o3.A0B(userSession, 0);
                    C14360o3.A0B(interfaceC11380iw, A1R ? 1 : 0);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_organic_audio_track_impression");
                    if (A0f.isSampled()) {
                        AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
                        AbstractC37301Gc2.A10(A0f, AbstractC25232BEp.A0t(A0j));
                        AbstractC37302Gc3.A0t(A0f);
                        A0f.A9K("media_index", valueOf2);
                        A0f.AAP("section_type", str3);
                        A0f.AAP("trending_tab_category", str3);
                        A0f.Cht();
                    }
                    list.add(str2);
                }
                IgImageView igImageView = c38511GwW.A07;
                Context context2 = this.A00;
                igImageView.setImageDrawable(new BOM(context2, null, AbstractC25235BEs.A04(context2), AbstractC167017dG.A06(context2), context2.getResources().getDimensionPixelSize(R.dimen.action_sheet_divider_margin_top), AbstractC167007dF.A09(context2, R.attr.igds_color_photo_border), AbstractC167017dG.A07(context2), -1, false));
                MusicAttributionConfig musicAttributionConfig = hym.A00.A04;
                MusicAssetModel musicAssetModel = null;
                if (musicAttributionConfig != null && musicAttributionConfig.A02 != null) {
                    Drawable drawable2 = igImageView.getDrawable();
                    C14360o3.A0C(drawable2, "null cannot be cast to non-null type com.instagram.music.common.ui.AlbumArtDrawable");
                    BOM bom = (BOM) drawable2;
                    MusicAttributionConfig musicAttributionConfig2 = hym.A00.A04;
                    if (musicAttributionConfig2 != null) {
                        musicAssetModel = musicAttributionConfig2.A02;
                    }
                    AbstractC38055Goi.A01(this.A03, musicAssetModel, bom);
                } else {
                    AbstractC38055Goi.A00(igImageView, hym.A01, null);
                }
                AbstractC38060Gon.A00(null, c38511GwW.A0D, hym.A09, hym.A0E, false);
                boolean z = this.A09;
                if (z) {
                    AbstractC166987dD.A1O(context2, c38511GwW.A03, R.color.barcelona_story_share_light_mode);
                }
                TextView textView = c38511GwW.A04;
                textView.setText(hym.A0A);
                String str4 = hym.A0B;
                TextView textView2 = c38511GwW.A05;
                if (str4 != null) {
                    textView2.setText(str4);
                    AbstractC31177DnL.A0H(textView).setMargins(0, 0, 0, 0);
                    textView2.setVisibility(0);
                } else {
                    textView2.setVisibility(8);
                }
                boolean z2 = hym.A0D;
                if (z2) {
                    View findViewById = c38511GwW.itemView.findViewById(R.id.container);
                    C14360o3.A0A(findViewById);
                    ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.bottomMargin = AbstractC167017dG.A03(context2);
                        TextView textView3 = c38511GwW.A02;
                        AbstractC166987dD.A1P(context2, textView3, 2131975743);
                        textView3.setVisibility(0);
                        c38511GwW.A00.setVisibility(0);
                        findViewById.setLayoutParams(marginLayoutParams);
                    } else {
                        throw AbstractC166987dD.A15(AbstractC111324zv.A00(17));
                    }
                } else {
                    c38511GwW.A02.setVisibility(8);
                    c38511GwW.A00.setVisibility(8);
                }
                if (this.A0B && !z2) {
                    TextView textView4 = c38511GwW.A06;
                    textView4.setVisibility(0);
                    if (z) {
                        AbstractC166987dD.A1O(context2, textView4, R.color.barcelona_story_share_light_mode);
                    }
                    Integer num = hym.A04;
                    if (num == null) {
                        format = "";
                    } else {
                        format = String.format("%d", Arrays.copyOf(new Object[]{num}, A1R ? 1 : 0));
                        C14360o3.A07(format);
                    }
                    textView4.setText(format);
                    View view = c38511GwW.A01;
                    view.setPaddingRelative(0, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
                    Integer num2 = hym.A05;
                    Integer num3 = hym.A03;
                    if (num2 != null && this.A0C) {
                        if (num3 != null && (intValue = num3.intValue()) != 0) {
                            if (intValue - num2.intValue() > 0) {
                                i2 = R.drawable.instagram_chevron_up_pano_filled_12;
                                i3 = R.attr.igds_color_creation_tools_green;
                            } else {
                                boolean equals = num3.equals(num2);
                                i2 = R.drawable.instagram_chevron_down_pano_filled_12;
                                i3 = R.attr.igds_color_creation_tools_red;
                                if (equals) {
                                    i2 = R.drawable.instagram_chevron_right_pano_filled_12;
                                    i3 = R.attr.igds_color_secondary_icon;
                                }
                            }
                            c38511GwW.A09.setVisibility(8);
                            interfaceC56392iX = c38511GwW.A0B;
                            ((ImageView) interfaceC56392iX.getView()).setImageResource(i2);
                            ((ImageView) interfaceC56392iX.getView()).setColorFilter(AbstractC167007dF.A09(context2, i3));
                        } else {
                            c38511GwW.A0B.setVisibility(8);
                            interfaceC56392iX = c38511GwW.A09;
                        }
                        interfaceC56392iX.setVisibility(0);
                    } else {
                        c38511GwW.A0B.setVisibility(8);
                        c38511GwW.A09.setVisibility(8);
                    }
                } else {
                    c38511GwW.A06.setVisibility(8);
                    c38511GwW.A0B.setVisibility(8);
                    c38511GwW.A09.setVisibility(8);
                    View view2 = c38511GwW.A01;
                    view2.setPaddingRelative(view2.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), view2.getPaddingTop(), view2.getPaddingEnd(), view2.getPaddingBottom());
                }
                Integer num4 = this.A06;
                if (num4 != C05F.A01 && num4 != C05F.A0C) {
                    InterfaceC56392iX interfaceC56392iX2 = c38511GwW.A08;
                    if (interfaceC56392iX2.CWW()) {
                        interfaceC56392iX2.setVisibility(8);
                    }
                } else {
                    ViewOnClickListenerC42034Ik3.A00(c38511GwW.A08.getView(), 42, hym, this);
                }
                if (num4 != C05F.A0N && num4 != C05F.A0Y) {
                    InterfaceC56392iX interfaceC56392iX3 = c38511GwW.A0A;
                    if (interfaceC56392iX3.CWW()) {
                        interfaceC56392iX3.setVisibility(8);
                    }
                } else {
                    InterfaceC56392iX interfaceC56392iX4 = c38511GwW.A0A;
                    ViewOnClickListenerC42029Ijy.A00(interfaceC56392iX4.getView(), c38511GwW, hym, this, 23);
                    interfaceC56392iX4.getView().setSelected(hym.A00.A0P);
                    if (z) {
                        AbstractC31173DnH.A11(interfaceC56392iX4.getView().getContext(), (ImageView) interfaceC56392iX4.getView(), R.color.barcelona_story_share_light_mode);
                    }
                }
                if (hym.A0G && !this.A0A) {
                    drawable = (Drawable) c38511GwW.A0E.getValue();
                } else {
                    drawable = null;
                }
                textView.setCompoundDrawablesRelative(drawable, null, null, null);
                ViewOnClickListenerC42029Ijy.A00(c38511GwW.itemView, hym, valueOf, this, 24);
                MusicDataSource musicDataSource = hym.A02;
                A00(musicDataSource, c38511GwW, this);
                C17050sx A01 = AbstractC09440dt.A01(new C43210J8h(9, this, hym, c38511GwW));
                InterfaceC678133v interfaceC678133v = this.A04;
                if (interfaceC678133v.CAJ(musicDataSource) != C05F.A00) {
                    interfaceC678133v.ESz(musicDataSource, (InterfaceC150336ph) A01.getValue(), null, 0, -1, -1, false, false);
                }
                ViewOnClickListenerC42029Ijy.A00(c38511GwW.A0C, hym, A01, this, 25);
                return;
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Unsupported audio list item ");
            throw AbstractC166987dD.A12(AbstractC166997dE.A0v(AbstractC25225BEi.A1D(abstractC39658Hin.getClass()), A1C));
        }
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2;
        int A03 = C0f9.A03(1545842545);
        Object A02 = A02(i);
        if (A02 instanceof HYK) {
            i2 = 1;
        } else {
            boolean z = A02 instanceof HYL;
            i2 = 0;
            if (z) {
                i2 = 2;
            }
        }
        C0f9.A0A(-1804164750, A03);
        return i2;
    }
}
