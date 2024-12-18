package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.faceswarm.IgdsFaceSwarm;
import com.instagram.model.reels.Reel;
import com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.3Am, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69523Am extends AbstractC69533An {
    public InterfaceC73233Pz A01;
    public InterfaceC61272qp A02;
    public C129025sN A03;
    public InterfaceC124075jM A04;
    public C65782yG A05;
    public C63972vI A06;
    public Integer A07;
    public Integer A08;
    public String A09;
    public final UserSession A0A;
    public final C69583As A0B;
    public final InterfaceC64002vL A0C;
    public final boolean A0D;
    public final Context A0E;
    public final InterfaceC11380iw A0G;
    public final C69433Ad A0H;
    public final C69493Aj A0I;
    public int A00 = 0;
    public final InterfaceC69563Aq A0F = new InterfaceC69563Aq() { // from class: X.3Ap
        @Override // X.InterfaceC69563Aq
        public final void D36(View view) {
            if (view.getTag() instanceof C73203Pv) {
                C73203Pv c73203Pv = (C73203Pv) view.getTag();
                C69523Am c69523Am = C69523Am.this;
                UserSession userSession = c69523Am.A0A;
                C3G4 c3g4 = c73203Pv.A02;
                c3g4.getClass();
                if (!C3P8.A01(userSession, c3g4)) {
                    C69583As c69583As = c69523Am.A0B;
                    C72983Oz c72983Oz = c73203Pv.A0G;
                    String str = c72983Oz.A01;
                    str.getClass();
                    C3G4 c3g42 = c73203Pv.A02;
                    c3g42.getClass();
                    C3G2 c3g2 = c3g42.A04;
                    C3G4 c3g43 = c73203Pv.A02;
                    c3g43.getClass();
                    boolean A00 = C3P8.A00(userSession, c3g43);
                    int hashCode = Arrays.hashCode(new Object[]{str});
                    C006802i c006802i = c69583As.A00;
                    c006802i.markerStart(17323904, hashCode);
                    c006802i.markerAnnotate(17323904, hashCode, "reel_viewer_source", c3g2.A00);
                    c006802i.markerAnnotate(17323904, hashCode, "is_top_tray", A00);
                    if (!c73203Pv.A02.A06(userSession)) {
                        String str2 = c72983Oz.A01;
                        str2.getClass();
                        c69583As.A07(str2);
                    }
                    if (c73203Pv.A0C.A0G()) {
                        String str3 = c72983Oz.A01;
                        str3.getClass();
                        c69583As.A06(str3);
                    }
                }
            }
        }

        @Override // X.InterfaceC69563Aq
        public final void D37(View view) {
            if (view.getTag() instanceof C73203Pv) {
                C73203Pv c73203Pv = (C73203Pv) view.getTag();
                C69523Am c69523Am = C69523Am.this;
                UserSession userSession = c69523Am.A0A;
                C3G4 c3g4 = c73203Pv.A02;
                c3g4.getClass();
                if (!C3P8.A01(userSession, c3g4)) {
                    C69583As c69583As = c69523Am.A0B;
                    String str = c73203Pv.A0G.A01;
                    str.getClass();
                    c69583As.A00.markerEnd(17323904, Arrays.hashCode(new Object[]{str}), (short) 4);
                }
            }
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x025c  */
    /* JADX WARN: Type inference failed for: r2v22, types: [X.3OO, X.9UV] */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C3OO onCreateViewHolder(android.view.ViewGroup r11, int r12) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69523Am.onCreateViewHolder(android.view.ViewGroup, int):X.3OO");
    }

    public final boolean A04() {
        if (this.A08 == C05F.A00) {
            UserSession userSession = this.A0A;
            C14360o3.A0B(userSession, 0);
            if (C18U.A06(C06090Tz.A05, userSession, 36320279271907592L)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C2UU
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        InterfaceC69563Aq interfaceC69563Aq = this.A0F;
        List list = recyclerView.A0L;
        if (list == null) {
            list = new ArrayList();
            recyclerView.A0L = list;
        }
        list.add(interfaceC69563Aq);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C3G4 c3g4;
        C38321qM c38321qM;
        View view;
        SegmentedProgressBar segmentedProgressBar;
        NSE nse;
        View view2;
        RecyclerReelAvatarView recyclerReelAvatarView;
        int i2;
        String string;
        C3G2 c3g2;
        C41181vS A09;
        ImageUrl A07;
        int i3 = i;
        int itemViewType = getItemViewType(i3);
        if (itemViewType == 6) {
            C73883Sx c73883Sx = (C73883Sx) c3oo;
            InterfaceC61272qp interfaceC61272qp = this.A02;
            if (interfaceC61272qp != null) {
                c73883Sx.A00(interfaceC61272qp);
            }
        } else if (itemViewType == 9) {
            InterfaceC64002vL interfaceC64002vL = this.A0C;
            String str = this.A09;
            InterfaceC124075jM interfaceC124075jM = this.A04;
            interfaceC124075jM.getClass();
            C3G4 c3g42 = (C3G4) super.A04.get(i3);
            ViewOnClickListenerC55400OjB viewOnClickListenerC55400OjB = new ViewOnClickListenerC55400OjB(c3oo, this, i3);
            UserSession userSession = this.A0A;
            InterfaceC11380iw interfaceC11380iw = this.A0G;
            if (c3g42 != null) {
                c3g2 = c3g42.A04;
            } else {
                c3g2 = null;
            }
            int CFw = interfaceC124075jM.CFw();
            if (CFw != 1 && CFw != 2) {
                C14360o3.A0B(c3oo, 0);
                C14360o3.A0B(interfaceC64002vL, 1);
                InterfaceC58289Psh interfaceC58289Psh = (InterfaceC58289Psh) interfaceC124075jM;
                C9UV c9uv = (C9UV) c3oo;
                Drawable BGS = interfaceC58289Psh.BGS();
                IgImageView igImageView = c9uv.A04;
                if (BGS != null) {
                    igImageView.setImageDrawable(BGS);
                } else {
                    igImageView.setVisibility(8);
                }
                String description = interfaceC58289Psh.getDescription();
                IgTextView igTextView = c9uv.A03;
                if (description != null) {
                    igTextView.setText(description);
                } else {
                    igTextView.setVisibility(8);
                }
                String Aj7 = interfaceC58289Psh.Aj7();
                IgTextView igTextView2 = c9uv.A02;
                if (Aj7 != null) {
                    igTextView2.setText(Aj7);
                } else {
                    igTextView2.setVisibility(8);
                }
                C0fQ.A00(new ViewOnClickListenerC55401OjC(interfaceC58289Psh, interfaceC64002vL, str), igTextView2);
                AbstractC56952jT.A01(igTextView2);
            } else {
                C14360o3.A0B(c3oo, 0);
                C14360o3.A0B(userSession, 4);
                C14360o3.A0B(interfaceC11380iw, 6);
                if (c3g2 != null) {
                    Context context = c3oo.itemView.getContext();
                    C14360o3.A07(context);
                    C9B2 A00 = AbstractC127325pA.A00(context, userSession, c3g2);
                    if (A00 != null) {
                        View view3 = c3oo.itemView;
                        C14360o3.A06(view3);
                        AbstractC13880nE.A0h(view3, A00.A01, A00.A00);
                    }
                }
                InterfaceC58289Psh interfaceC58289Psh2 = (InterfaceC58289Psh) interfaceC124075jM;
                C51332Mlt c51332Mlt = (C51332Mlt) c3oo;
                List B46 = interfaceC58289Psh2.B46();
                if (B46 != null && B46.size() >= 3) {
                    C0fQ.A00(viewOnClickListenerC55400OjB, c51332Mlt.A00);
                    c51332Mlt.A02.setText(interfaceC58289Psh2.getDescription());
                    c51332Mlt.A01.setText(interfaceC58289Psh2.Aj7());
                    Drawable BGS2 = interfaceC58289Psh2.BGS();
                    if (BGS2 != null) {
                        c51332Mlt.A04.setImageDrawable(BGS2);
                    } else {
                        c51332Mlt.A04.setVisibility(8);
                    }
                    C48546Ldj c48546Ldj = C48546Ldj.A00;
                    IgImageView igImageView2 = c51332Mlt.A03;
                    igImageView2.A0I = c48546Ldj;
                    if (c3g42 != null && (A09 = c3g42.A03.A09(userSession)) != null && (A07 = A09.A07(igImageView2.getWidth())) != null) {
                        igImageView2.setUrl(A07, interfaceC11380iw);
                    }
                }
            }
        } else if (itemViewType == 13) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.OiY
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    C69523Am.this.A0C.DVW();
                }
            };
            C14360o3.A0B(c3oo, 0);
            C210899Um c210899Um = (C210899Um) c3oo;
            View view4 = c210899Um.A00;
            C0fQ.A00(onClickListener, view4);
            Context context2 = view4.getContext();
            IgTextView igTextView3 = c210899Um.A01;
            igTextView3.setText(context2.getResources().getText(2131971729));
            igTextView3.setTextColor(context2.getColor(R.color.igds_primary_text));
            igTextView3.setTypeface(AbstractC15960qq.A00(context2).A02(EnumC15950qp.A13));
            int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
            AbstractC13880nE.A0i(igTextView3, dimensionPixelSize, dimensionPixelSize);
        } else if (itemViewType == 12) {
            View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: X.OiZ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    C69523Am.this.A0C.DJt();
                }
            };
            UserSession userSession2 = this.A0A;
            int i4 = this.A00;
            InterfaceC11380iw interfaceC11380iw2 = this.A0G;
            C14360o3.A0B(c3oo, 0);
            C14360o3.A0B(userSession2, 2);
            C14360o3.A0B(interfaceC11380iw2, 4);
            C210889Ul c210889Ul = (C210889Ul) c3oo;
            View view5 = c210889Ul.A00;
            C0fQ.A00(onClickListener2, view5);
            View findViewById = c210889Ul.itemView.findViewById(R.id.group_story_peek_faceswarm);
            C14360o3.A07(findViewById);
            Context context3 = c210889Ul.itemView.getContext();
            C14360o3.A07(context3);
            AbstractC34288FAi.A00(context3, interfaceC11380iw2, userSession2, (IgdsFaceSwarm) findViewById);
            Context context4 = view5.getContext();
            IgTextView igTextView4 = c210889Ul.A01;
            if (i4 == 0) {
                string = context4.getString(2131954743);
            } else {
                string = context4.getString(2131954744, Integer.valueOf(i4));
            }
            igTextView4.setText(string);
        } else {
            int i5 = i3;
            if (A04()) {
                i5 = i - 1;
            }
            Context context5 = this.A0E;
            UserSession userSession3 = this.A0A;
            C3G4 c3g43 = (C3G4) super.A04.get(i5);
            String BlW = ((InterfaceC72953Ov) c3oo).BlW();
            if (BlW == null) {
                c3g4 = null;
            } else {
                c3g4 = (C3G4) super.A02.get(BlW);
            }
            InterfaceC64002vL interfaceC64002vL2 = this.A0C;
            List list = super.A03;
            InterfaceC11380iw interfaceC11380iw3 = this.A0G;
            String str2 = this.A09;
            Integer num = this.A07;
            C69493Aj c69493Aj = this.A0I;
            InterfaceC124075jM interfaceC124075jM2 = this.A04;
            C129025sN c129025sN = this.A03;
            InterfaceC73233Pz interfaceC73233Pz = this.A01;
            if (itemViewType != 0) {
                if (itemViewType != 7) {
                    if (itemViewType != 2) {
                        if (itemViewType != 3 && itemViewType != 4) {
                            if (itemViewType != 5) {
                                if (itemViewType != 10) {
                                    if (itemViewType == 11) {
                                        C51375Mma c51375Mma = (C51375Mma) c3oo;
                                        AbstractC127295p7.A00(userSession3).A0D(c3g43, C3OT.A01(userSession3, c3g43));
                                        c51375Mma.A00 = c3g43;
                                        Context context6 = c51375Mma.itemView.getContext();
                                        C44376JjF c44376JjF = c51375Mma.A09;
                                        c44376JjF.A01();
                                        int color = context6.getColor(AbstractC53242c7.A0H(context6, R.attr.igds_color_highlight_background));
                                        Paint paint = c44376JjF.A0U;
                                        paint.setColor(color);
                                        c44376JjF.invalidateSelf();
                                        c44376JjF.A04 = false;
                                        c44376JjF.invalidateSelf();
                                        IgImageView igImageView3 = c51375Mma.A0A;
                                        igImageView3.A09();
                                        igImageView3.setImageDrawable(c44376JjF);
                                        C127305p8 A002 = AbstractC127295p7.A00(userSession3);
                                        Reel reel = c3g43.A03;
                                        A002.A0B(reel);
                                        c51375Mma.A02 = new OFZ(context5, interfaceC11380iw3, userSession3, interfaceC73233Pz, c3g43, interfaceC124075jM2, c51375Mma, interfaceC64002vL2, num, str2, list, i5);
                                        C72983Oz c72983Oz = c51375Mma.A0C;
                                        C3P6.A00(userSession3, c3g43, c72983Oz);
                                        AbstractC127295p7.A00(userSession3).A08(reel);
                                        C3P1 c3p1 = c51375Mma.A0B;
                                        C14360o3.A0B(userSession3, 0);
                                        C14360o3.A0B(c3p1, 1);
                                        C3P7.A00(userSession3, reel.A09(userSession3), c3g43, c3p1, false);
                                        c51375Mma.A08.setTextSize(1, 12.0f);
                                        AbstractC127295p7.A00(userSession3).A06(reel);
                                        if (c3g43.A03()) {
                                            RecyclerReelAvatarView recyclerReelAvatarView2 = c51375Mma.A0D;
                                            recyclerReelAvatarView = recyclerReelAvatarView2;
                                            C3OV c3ov = recyclerReelAvatarView2.A00;
                                            if (c3ov != null) {
                                                C3PM.A00(c3ov.A00);
                                            }
                                            C50Q.A00(interfaceC11380iw3, userSession3, c3g43, c51375Mma.A00());
                                        } else {
                                            C50N c50n = c51375Mma.A01;
                                            if (c50n != null) {
                                                c50n.A02.setVisibility(8);
                                            }
                                            recyclerReelAvatarView = c51375Mma.A0D;
                                            recyclerReelAvatarView.A00(interfaceC11380iw3, userSession3, c3g43, c3g4, interfaceC64002vL2, i5, false, false, false, false);
                                            if (recyclerReelAvatarView.getHolder().A01() != null) {
                                                recyclerReelAvatarView.getHolder().A01().setBorderWidth(0.0f);
                                            }
                                        }
                                        String str3 = null;
                                        igImageView3.setTag(R.id.key_media_id, null);
                                        AbstractC127295p7.A00(userSession3).A07(reel);
                                        if (reel.A0t()) {
                                            AbstractC127295p7.A00(userSession3).A05(reel);
                                            igImageView3.setImageDrawable(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{Color.parseColor("#FFD400"), Color.parseColor("#FF7000"), Color.parseColor("#FF0067"), Color.parseColor("#E700CB")}));
                                        } else if (C3P8.A02(userSession3, c3g43)) {
                                            AbstractC127295p7.A00(userSession3).A04(reel);
                                            paint.setColor(c51375Mma.A04.getColor(R.color.context_line_color));
                                            c44376JjF.invalidateSelf();
                                        } else if (!c3g43.A06(userSession3)) {
                                            if (reel.A09(userSession3) == null) {
                                                C127305p8 A003 = AbstractC127295p7.A00(userSession3);
                                                if (C127305p8.A02(A003)) {
                                                    String id = reel.getId();
                                                    C14360o3.A07(id);
                                                    Long A01 = C127305p8.A01(A003, id);
                                                    if (A01 != null) {
                                                        long longValue = A01.longValue();
                                                        C1QT c1qt = A003.A00;
                                                        c1qt.flowAnnotate(longValue, TraceFieldType.FailureReason, "null_expected_reel_item");
                                                        c1qt.flowEndFail(longValue, "null_expected_reel_item", null);
                                                    }
                                                }
                                            }
                                            C41181vS A092 = reel.A09(userSession3);
                                            A092.getClass();
                                            AbstractC127295p7.A00(userSession3).A0C(reel, A092);
                                            C38321qM c38321qM2 = A092.A0b;
                                            if (c38321qM2 != null) {
                                                str3 = c38321qM2.getId();
                                            }
                                            igImageView3.setTag(R.id.key_media_id, str3);
                                            String str4 = c72983Oz.A01;
                                            str4.getClass();
                                            AbstractC69573Ar.A00(userSession3).A07(str4);
                                            igImageView3.A0E = new C56167Owa(userSession3, str4);
                                            if (c38321qM2 != null) {
                                                igImageView3.A0A = new C80673iw();
                                                igImageView3.A0K = c38321qM2.BU6();
                                            }
                                            ImageUrl A072 = A092.A07(0);
                                            if (A072 != null) {
                                                igImageView3.A05 = A092.A02();
                                                c44376JjF.A02(A072, interfaceC11380iw3.getModuleName());
                                            }
                                        } else {
                                            C42557Isb c42557Isb = reel.A0E;
                                            if (c42557Isb != null) {
                                                AbstractC127295p7.A00(userSession3).A03(c42557Isb, reel);
                                                String str5 = c72983Oz.A01;
                                                str5.getClass();
                                                AbstractC69573Ar.A00(userSession3).A07(str5);
                                                igImageView3.A0E = new C56168Owb(userSession3, str5);
                                                InterfaceC38251qF interfaceC38251qF = c42557Isb.A00;
                                                if (interfaceC38251qF.getPreview() != null) {
                                                    igImageView3.A0A = new C80673iw();
                                                    igImageView3.A0K = interfaceC38251qF.getPreview();
                                                }
                                                c44376JjF.A02(c42557Isb.A00(), interfaceC11380iw3.getModuleName());
                                                igImageView3.setTag(R.id.key_media_id, c42557Isb.getId());
                                            }
                                        }
                                        AbstractC127295p7.A00(userSession3).A0A(reel);
                                        TextView A04 = c3p1.A04();
                                        if (C3P8.A02(userSession3, c3g43)) {
                                            i2 = R.color.igds_primary_text;
                                        } else {
                                            boolean A042 = c3g43.A04(userSession3);
                                            i2 = R.color.audio_bar_action_color_enabled;
                                            if (A042) {
                                                i2 = R.color.fundraiser_sticker_donate_button_background_color;
                                            }
                                        }
                                        A04.setTextColor(context5.getColor(i2));
                                        AbstractC127295p7.A00(userSession3).A09(reel);
                                        boolean z = reel.A1Y;
                                        View view6 = c51375Mma.A06;
                                        float f = 0.5f;
                                        if (!z) {
                                            f = 1.0f;
                                            view6.setAlpha(1.0f);
                                            view6 = igImageView3;
                                        }
                                        view6.setAlpha(f);
                                        c51375Mma.Blo().setInactiveColour(context5.getColor(R.color.grey_2));
                                        C127305p8 A004 = AbstractC127295p7.A00(userSession3);
                                        if (C127305p8.A02(A004)) {
                                            String id2 = reel.getId();
                                            C14360o3.A07(id2);
                                            Long A012 = C127305p8.A01(A004, id2);
                                            if (A012 != null) {
                                                A004.A00.flowEndSuccess(A012.longValue());
                                            }
                                        }
                                        if (c69493Aj != null) {
                                            boolean A03 = c3g43.A03();
                                            C69493Aj.A00(c51375Mma.A04, c3g43, c69493Aj, recyclerReelAvatarView.getHolder());
                                            if (A03 && !c51375Mma.A03) {
                                                C69493Aj.A03(c69493Aj, c51375Mma.A00());
                                                C69493Aj.A04(c69493Aj, c51375Mma.A00());
                                                c51375Mma.A03 = true;
                                            }
                                            if (C18U.A06(C06090Tz.A05, userSession3, 36321988666533813L) && C3P8.A00(userSession3, c3g43)) {
                                                if (c3g43.A06(userSession3) && reel.A1a) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) c3p1.A01();
                                                    C110964z8 c110964z8 = new C110964z8();
                                                    c110964z8.A0I(constraintLayout);
                                                    c110964z8.A0C(R.id.username, 7, R.id.plus_cobroadcaster_count, 6);
                                                    constraintLayout.A0D = c110964z8;
                                                    LinearLayout linearLayout = c72983Oz.A05;
                                                    linearLayout.setGravity(17);
                                                    AbstractC13880nE.A0W(linearLayout, -2);
                                                    c69493Aj.A00 = C05F.A0C;
                                                    c69493Aj.A09(c51375Mma);
                                                    c69493Aj.A00 = C05F.A0N;
                                                } else {
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) c3p1.A01();
                                                    C110964z8 c110964z82 = new C110964z8();
                                                    c110964z82.A0I(constraintLayout2);
                                                    c110964z82.A09(R.id.username, 7);
                                                    constraintLayout2.A0D = c110964z82;
                                                    c3p1.A03().setGravity(8388611);
                                                    LinearLayout linearLayout2 = c72983Oz.A05;
                                                    linearLayout2.setGravity(8388659);
                                                    AbstractC13880nE.A0W(linearLayout2, -1);
                                                    c69493Aj.A09(c51375Mma);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                AbstractC127285p6.A00(context5, interfaceC11380iw3, userSession3, interfaceC73233Pz, c3g43.A00(userSession3), c3g43, c3g4, null, null, (C73203Pv) c3oo, interfaceC64002vL2, num, str2, list, i5);
                            }
                        }
                    } else {
                        C50M c50m = (C50M) c3oo;
                        C3P5.A00(context5, null, interfaceC11380iw3, userSession3, c3g43, c50m.A01, interfaceC64002vL2, list, i5, false);
                        C50Q.A00(interfaceC11380iw3, userSession3, c3g43, c50m.A00);
                    }
                }
                C73203Pv c73203Pv = (C73203Pv) c3oo;
                C3G4 c3g44 = c3g4;
                int i6 = i5;
                AbstractC127285p6.A00(context5, interfaceC11380iw3, userSession3, interfaceC73233Pz, c3g43.A00(userSession3), c3g43, c3g44, c129025sN, interfaceC124075jM2, c73203Pv, interfaceC64002vL2, num, str2, list, i6);
                if (c129025sN != null) {
                    C54726OFd c54726OFd = new C54726OFd(context5, interfaceC11380iw3, userSession3, interfaceC73233Pz, c3g43, c3g44, c129025sN, interfaceC124075jM2, c73203Pv, interfaceC64002vL2, num, str2, list, i6);
                    C14360o3.A0B(c73203Pv, 0);
                    C14360o3.A0B(interfaceC11380iw3, 3);
                    C75113Zb c75113Zb = c129025sN.A03;
                    UserSession userSession4 = c129025sN.A02;
                    C41181vS A005 = c3g43.A00(userSession4);
                    if (A005 != null) {
                        c38321qM = A005.A0b;
                    } else {
                        c38321qM = null;
                    }
                    boolean A06 = C18U.A06(C06090Tz.A05, userSession4, 36325257136780218L);
                    if (c38321qM == null) {
                        IgImageView igImageView4 = c73203Pv.A0C;
                        igImageView4.setVisibility(4);
                        igImageView4.A09();
                        if (A06 && (nse = c73203Pv.A0H) != null && (view2 = (View) nse.A02.getValue()) != null) {
                            view2.setVisibility(4);
                        }
                    } else {
                        C81343k4 c81343k4 = new C81343k4(c75113Zb, c73203Pv);
                        c129025sN.A06.A00.put(c38321qM, c81343k4);
                        NSE nse2 = c73203Pv.A0H;
                        if (nse2 != null) {
                            view = (View) nse2.A02.getValue();
                        } else {
                            view = null;
                        }
                        if (A06) {
                            if (view != null) {
                                view.setVisibility(0);
                            }
                            if (nse2 != null && (segmentedProgressBar = (SegmentedProgressBar) nse2.A02.getValue()) != null) {
                                segmentedProgressBar.setSegments(c3g43.A03.A0O(userSession4).size());
                            }
                        } else if (view != null) {
                            view.setVisibility(8);
                        }
                        c129025sN.A04.A0L.put(c81343k4, new C4QQ(interfaceC11380iw3, c3g43, c129025sN, c54726OFd, c73203Pv, i5, A06));
                        Rect rect = new Rect();
                        C64032vO c64032vO = c129025sN.A07;
                        View view7 = c81343k4.A00;
                        C38321qM c38321qM3 = c38321qM;
                        BWE bwe = new BWE(5, rect, c129025sN, c38321qM3, c3g43, c81343k4);
                        DUM dum = new DUM(2, rect, c129025sN, c38321qM3, c3g43, c81343k4, !A06);
                        DSA dsa = new DSA(45, c38321qM, c129025sN);
                        Integer valueOf = Integer.valueOf(i5);
                        String str6 = c3g43.A03.A1o;
                        C14360o3.A07(str6);
                        C59062n7 c59062n7 = C59062n7.A07;
                        C59072n8 c59072n8 = new C59072n8(c3g43, valueOf, str6);
                        c59072n8.A00(new C42380Iph(bwe, dum, dsa));
                        c64032vO.A00.A05(view7, c59072n8.A01());
                    }
                }
                if (c69493Aj != null) {
                    boolean A032 = c3g43.A03();
                    C69493Aj.A00(c73203Pv.A07, c3g43, c69493Aj, c73203Pv.A0I.getHolder());
                    if (A032 && !c73203Pv.A06) {
                        C69493Aj.A03(c69493Aj, c73203Pv.A00());
                        C69493Aj.A04(c69493Aj, c73203Pv.A00());
                        c73203Pv.A06 = true;
                    }
                    C14360o3.A0B(userSession3, 0);
                    if (C18U.A06(C06090Tz.A05, userSession3, 36321988666533813L) && C3P8.A00(userSession3, c3g43)) {
                        if (c3g43.A06(userSession3) && c3g43.A03.A1a) {
                            ConstraintLayout constraintLayout3 = (ConstraintLayout) c73203Pv.A0F.A01();
                            C110964z8 c110964z83 = new C110964z8();
                            c110964z83.A0I(constraintLayout3);
                            c110964z83.A0C(R.id.username, 7, R.id.plus_cobroadcaster_count, 6);
                            constraintLayout3.A0D = c110964z83;
                            LinearLayout linearLayout3 = c73203Pv.A0G.A05;
                            linearLayout3.setGravity(17);
                            AbstractC13880nE.A0W(linearLayout3, -2);
                            c69493Aj.A00 = C05F.A0C;
                            c69493Aj.A08(c73203Pv);
                            c69493Aj.A00 = C05F.A0N;
                        } else {
                            C3P1 c3p12 = c73203Pv.A0F;
                            ConstraintLayout constraintLayout4 = (ConstraintLayout) c3p12.A01();
                            C110964z8 c110964z84 = new C110964z8();
                            c110964z84.A0I(constraintLayout4);
                            c110964z84.A09(R.id.username, 7);
                            constraintLayout4.A0D = c110964z84;
                            c3p12.A03().setGravity(8388611);
                            LinearLayout linearLayout4 = c73203Pv.A0G.A05;
                            linearLayout4.setGravity(8388659);
                            AbstractC13880nE.A0W(linearLayout4, -1);
                            c69493Aj.A08(c73203Pv);
                        }
                    }
                }
            }
            C72943Ou c72943Ou = (C72943Ou) c3oo;
            C3OU.A01(context5, interfaceC11380iw3, userSession3, c3g43, c3g4, c72943Ou, interfaceC64002vL2, list, i5, false, false, false, false);
            if (c69493Aj != null) {
                C69493Aj.A00(context5, c3g43, c69493Aj, c72943Ou.A03.getHolder());
            }
        }
        InterfaceC64002vL interfaceC64002vL3 = this.A0C;
        interfaceC64002vL3.Dvg(i3);
        if (itemViewType == 6) {
            C73883Sx c73883Sx2 = (C73883Sx) c3oo;
            if (this.A08 == C05F.A00) {
                if (this.A0D) {
                    C18C.A0E(interfaceC64002vL3 instanceof InterfaceC69463Ag);
                    ((InterfaceC69463Ag) interfaceC64002vL3).EDl(c73883Sx2.A00, i3);
                    return;
                } else {
                    C18C.A0E(interfaceC64002vL3 instanceof InterfaceC63992vK);
                    ((InterfaceC63992vK) interfaceC64002vL3).Ddr(i3);
                    return;
                }
            }
            return;
        }
        if (itemViewType == 12) {
            if (this.A08 != C05F.A00 || !this.A0D) {
                return;
            }
            AbstractC35071Fci.A00(this.A0A, new ArrayList());
            C18C.A0E(interfaceC64002vL3 instanceof InterfaceC69463Ag);
            ((InterfaceC69463Ag) interfaceC64002vL3).EDJ(c3oo.itemView, i3, !r4.isEmpty());
            return;
        }
        if (itemViewType == 13) {
            return;
        }
        UserSession userSession5 = this.A0A;
        boolean z2 = this.A0D;
        boolean z3 = false;
        if (itemViewType == 9) {
            z3 = true;
        }
        if (this.A08 != C05F.A0j && i > 0) {
            C14360o3.A0B(userSession5, 0);
            if (C18U.A06(C06090Tz.A05, userSession5, 36320279271907592L)) {
                i3 = i - 1;
            }
        }
        Reel reel2 = ((C3G4) super.A04.get(i3)).A03;
        if (reel2.A0a()) {
            return;
        }
        if (super.A02.containsKey("add_to_story")) {
            i3--;
        }
        if (z2) {
            C18C.A0E(interfaceC64002vL3 instanceof InterfaceC69463Ag);
            ((InterfaceC69463Ag) interfaceC64002vL3).EDx(c3oo.itemView, reel2, A00(userSession5), i3);
            return;
        }
        C70873Fz A006 = A00(userSession5);
        if (z3) {
            interfaceC64002vL3.De6(reel2, A006, i3);
        } else {
            interfaceC64002vL3.DeA(reel2, A006, this.A08, i3);
        }
    }

    @Override // X.C2UU
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        InterfaceC69563Aq interfaceC69563Aq = this.A0F;
        List list = recyclerView.A0L;
        if (list != null) {
            list.remove(interfaceC69563Aq);
        }
    }

    public C69523Am(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C69433Ad c69433Ad, C69493Aj c69493Aj, InterfaceC64002vL interfaceC64002vL, Integer num, boolean z) {
        this.A0C = interfaceC64002vL;
        this.A0A = userSession;
        this.A08 = num;
        this.A0G = interfaceC11380iw;
        this.A0E = context;
        this.A0I = c69493Aj;
        this.A0D = z;
        this.A0H = c69433Ad;
        this.A0B = AbstractC69573Ar.A00(userSession);
        setHasStableIds(true);
    }

    @Override // X.AbstractC69533An, X.InterfaceC69543Ao
    public final int CNP(Reel reel) {
        int CNP = super.CNP(reel);
        if (CNP != -1 && A04()) {
            return CNP + 1;
        }
        return CNP;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int CFw;
        InterfaceC61272qp interfaceC61272qp;
        int A03 = C0f9.A03(228069757);
        int size = super.A04.size();
        InterfaceC61272qp interfaceC61272qp2 = this.A02;
        if ((interfaceC61272qp2 != null && interfaceC61272qp2.CLh()) || this.A08 == C05F.A0j) {
            size++;
        }
        InterfaceC124075jM interfaceC124075jM = this.A04;
        if (interfaceC124075jM != null && (CFw = interfaceC124075jM.CFw()) != 1 && CFw != 2 && (interfaceC61272qp = this.A02) != null && !interfaceC61272qp.CLh()) {
            size++;
        }
        if (A04()) {
            size++;
        }
        C0f9.A0A(-647440598, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A00;
        int i2;
        InterfaceC61272qp interfaceC61272qp;
        Integer num;
        int A03 = C0f9.A03(-1478907475);
        if (this.A04 != null && (((num = this.A08) == C05F.A01 || num == C05F.A0C) && i == getItemCount() - 1)) {
            A00 = 9;
            i2 = -1219406538;
        } else if (this.A08 == C05F.A0j && i == getItemCount() - 1) {
            A00 = 13;
            i2 = -320674341;
        } else if (i == 0 && A04()) {
            A00 = 12;
            i2 = 819731991;
        } else if (i == getItemCount() - 1 && (interfaceC61272qp = this.A02) != null && interfaceC61272qp.CLh()) {
            A00 = 6;
            i2 = 2012139979;
        } else {
            if (A04()) {
                i--;
            }
            A00 = C3OT.A00(this.A0A, (C3G4) super.A04.get(i));
            i2 = -1890509309;
        }
        C0f9.A0A(i2, A03);
        return A00;
    }
}
