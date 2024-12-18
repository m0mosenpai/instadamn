package X;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserFragment;
import com.instagram.creation.channels.model.AddChannelsRowChannelInfo;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class B5y extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B5y(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v84, types: [X.7lj, java.lang.Object, X.7lk] */
    /* JADX WARN: Type inference failed for: r0v87, types: [X.7lj, java.lang.Object, X.7lk] */
    /* JADX WARN: Type inference failed for: r1v32, types: [X.7lj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v34, types: [X.7l3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [X.7l3, java.lang.Object, X.7lk] */
    /* JADX WARN: Type inference failed for: r2v13, types: [X.7l3, java.lang.Object, X.7lk] */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.7l5, java.lang.Object, X.7lk] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InterfaceC19610xo A0g;
        Editable text;
        List list;
        InterfaceC09390do interfaceC09390do;
        AbstractC172157lk[] abstractC172157lkArr;
        AbstractC172157lk abstractC172157lk;
        switch (this.A00) {
            case 0:
            case Seq.NULL_REFNUM /* 41 */:
            case 45:
                return this.A01;
            case 1:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return ((InterfaceC16820sZ) this.A01).invoke();
            case 2:
            case 43:
            case 47:
                return AbstractC167027dH.A0B(this.A01);
            case 3:
                CircularProgressImageView circularProgressImageView = (CircularProgressImageView) this.A01;
                LM4 lm4 = new LM4(circularProgressImageView);
                lm4.A00 = circularProgressImageView;
                lm4.A02.addListener(circularProgressImageView);
                return lm4;
            case 4:
                return new AbstractC193598he[((InterfaceC19390xP[]) this.A01).length];
            case 5:
                UserSession A0r = AbstractC166987dD.A0r(((C52135N5j) this.A01).A0Y);
                C14360o3.A0B(A0r, 0);
                return new C8JR(A0r);
            case 6:
            case 8:
            case 10:
            case 17:
            case 18:
            case 25:
            case 35:
            default:
                return ((Fragment) this.A01).requireActivity().getViewModelStore();
            case 7:
            case 9:
            case 26:
            case 36:
                return ((Fragment) this.A01).requireActivity().getDefaultViewModelProviderFactory();
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return Integer.valueOf(ClipsCreationViewModel.A00((ClipsCreationViewModel) this.A01).A00);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                ClipsSharingDraftViewModel clipsSharingDraftViewModel = (ClipsSharingDraftViewModel) this.A01;
                clipsSharingDraftViewModel.A00.A0D(clipsSharingDraftViewModel.A07.A02);
                return C0eB.A00;
            case 14:
                ((ClipsSharingDraftViewModel) this.A01).A03.A0A(new C8A8(AbstractC166997dE.A0a()));
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                N6Y n6y = (N6Y) this.A01;
                return new C185258Jq(AbstractC166987dD.A0r(n6y.A09), n6y.requireActivity());
            case 16:
                N6Y n6y2 = (N6Y) this.A01;
                return new C87C(AbstractC166987dD.A0r(n6y2.A09), n6y2.requireActivity());
            case Process.SIGSTOP /* 19 */:
                Path A0T = AbstractC166987dD.A0T();
                C69631VsY c69631VsY = (C69631VsY) this.A01;
                DynamicLayout dynamicLayout = c69631VsY.A01;
                float lineLeft = dynamicLayout.getLineLeft(0);
                float lineBaseline = dynamicLayout.getLineBaseline(0);
                TextPaint textPaint = c69631VsY.A03;
                SpannableStringBuilder spannableStringBuilder = c69631VsY.A02;
                textPaint.getTextPath(spannableStringBuilder.toString(), 0, spannableStringBuilder.length(), lineLeft, lineBaseline, A0T);
                ArrayList A07 = AbstractC13670mt.A07(AbstractC166987dD.A19(spannableStringBuilder));
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = A07.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (AbstractC166987dD.A0H(next) >= 0) {
                        A1E.add(next);
                    }
                }
                Iterator it2 = A1E.iterator();
                while (it2.hasNext()) {
                    int A0B = AbstractC167007dF.A0B(it2);
                    float measureText = textPaint.measureText(spannableStringBuilder, 0, A0B);
                    Rect A0U = AbstractC166987dD.A0U();
                    String obj = spannableStringBuilder.toString();
                    int i = A0B + 2;
                    int length = spannableStringBuilder.length();
                    if (i > length) {
                        i = length;
                    }
                    textPaint.getTextBounds(obj, A0B, i, A0U);
                    RectF rectF = new RectF(A0U);
                    rectF.offset(measureText + lineLeft, lineBaseline);
                    A0T.addRect(rectF, Path.Direction.CW);
                }
                return A0T;
            case 20:
                return Boolean.valueOf(((C80P) this.A01).A05.get());
            case 21:
                return new C25005B4e((AQ3) this.A01);
            case 22:
                return new Handler(((C44564Jnl) this.A01).A01.getMainLooper());
            case 23:
                RecyclerView recyclerView = ((GiphyClipsBrowserFragment) this.A01).giphyClipsRecyclerView;
                if (recyclerView != null) {
                    recyclerView.A0h();
                }
                return C0eB.A00;
            case 24:
                return new C13400mQ(AbstractC167007dF.A0J(), new JX1(this.A01, 6), 500L);
            case 27:
                InterfaceC19630xq A0x = AbstractC166987dD.A0x((UserSession) this.A01);
                int i2 = A0x.getInt("visual_replies_nux_overlay_impressions", 0);
                boolean z = true;
                if (i2 < 3 && !A0x.getBoolean("has_tapped_on_visual_reply_thumbnail", false)) {
                    AbstractC167007dF.A18(A0x, "visual_replies_nux_overlay_impressions", i2 + 1);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
            case 30:
                AbstractC219819nT abstractC219819nT = (AbstractC219819nT) this.A01;
                if (abstractC219819nT instanceof C219809nS) {
                    interfaceC09390do = ((C219809nS) abstractC219819nT).A0F;
                } else {
                    interfaceC09390do = ((C219799nR) abstractC219819nT).A03;
                }
                return ((AbstractC172157lk[]) interfaceC09390do.getValue())[0];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C219809nS c219809nS = (C219809nS) this.A01;
                C1816283r c1816283r = c219809nS.A0A;
                int ordinal = c1816283r.A02.ordinal();
                if (ordinal != 1) {
                    if (ordinal == 0) {
                        if (C14360o3.A0K(c219809nS.A0D, "story_remix_reply")) {
                            EnumC171747l4 enumC171747l4 = EnumC171747l4.A04;
                            ?? obj2 = new Object();
                            obj2.A00 = enumC171747l4;
                            ?? obj3 = new Object();
                            obj3.A00 = 1.0f;
                            EnumC171727l2 enumC171727l2 = c219809nS.A0B;
                            C14360o3.A0B(enumC171727l2, 1);
                            ?? obj4 = new Object();
                            obj4.A00 = enumC171727l2;
                            return new AbstractC172157lk[]{obj2, obj3, obj4};
                        }
                        ?? obj5 = new Object();
                        obj5.A00 = 1.0f;
                        EnumC171727l2 enumC171727l22 = c219809nS.A0B;
                        C14360o3.A0B(enumC171727l22, 1);
                        ?? obj6 = new Object();
                        obj6.A00 = enumC171727l22;
                        return new AbstractC172157lk[]{obj5, obj6};
                    }
                    throw B4Z.A00();
                }
                int ordinal2 = c1816283r.A00.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2 && ordinal2 != 3 && ordinal2 != 4) {
                            throw B4Z.A00();
                        }
                        return new AbstractC172157lk[0];
                    }
                    ?? obj7 = new Object();
                    obj7.A00 = 0.5f;
                    abstractC172157lk = obj7;
                    abstractC172157lkArr = new AbstractC172157lk[1];
                } else {
                    EnumC171727l2 enumC171727l23 = EnumC171727l2.A04;
                    C14360o3.A0B(enumC171727l23, 1);
                    ?? obj8 = new Object();
                    obj8.A00 = enumC171727l23;
                    abstractC172157lk = obj8;
                    abstractC172157lkArr = new AbstractC172157lk[1];
                }
                abstractC172157lkArr[0] = abstractC172157lk;
                return abstractC172157lkArr;
            case 31:
                ((C14510oO) this.A01).A00 = true;
                return C0eB.A00;
            case 32:
                return AbstractC147806l5.A00(((C44547Jmr) this.A01).A01);
            case 33:
                C44547Jmr c44547Jmr = (C44547Jmr) this.A01;
                if (c44547Jmr.A09) {
                    MYZ A01 = MX1.A01(c44547Jmr.A01);
                    C1QT c1qt = A01.A0A;
                    long j = A01.A07;
                    AHF ahf = new AHF(c1qt);
                    ahf.A01 = j;
                    ahf.A04("TAG_CHANNELS_TAPPED");
                }
                C05A c05a = c44547Jmr.A06;
                if (C26189BiF.A00(c05a.getValue(), 0)) {
                    AddChannelsRowChannelInfo addChannelsRowChannelInfo = c44547Jmr.A00;
                    if (addChannelsRowChannelInfo != null) {
                        c05a.Egh(new C26189BiF(C44547Jmr.A00(c44547Jmr), addChannelsRowChannelInfo, 1));
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    c44547Jmr.A05.Egh(C45754KNh.A00);
                    C142846ck c142846ck = (C142846ck) c44547Jmr.A04.getValue();
                    C25531Mh A0E = C25531Mh.A0E(c142846ck.A03);
                    if (((AbstractC02600Aj) A0E).A00.isSampled()) {
                        A0E.A0g(Long.valueOf(c142846ck.A02));
                        A0E.A0k("tag_channels_sheet_rendered");
                        A0E.A0j("tap");
                        A0E.A0o("tag_channels_item");
                        A0E.A0p(MSV.A00(1426));
                        A0E.A0n("broadcast");
                        A0E.A0r(null);
                        A0E.A0h(null);
                        A0E.A0u(c142846ck.A01);
                        A0E.Cht();
                    }
                }
                A0g = AbstractC166987dD.A0w(c44547Jmr.A03);
                A0g.E77(AbstractC43591JPw.A00(989), true);
                A0g.apply();
                return C0eB.A00;
            case 34:
                C44547Jmr c44547Jmr2 = (C44547Jmr) this.A01;
                c44547Jmr2.A00 = null;
                c44547Jmr2.A06.Egh(new K2C(C44547Jmr.A00(c44547Jmr2)));
                return C0eB.A00;
            case 37:
                return new A7E(new C193408hL(), new AiF(AbstractC23021Ah.A00((UserSession) this.A01)));
            case 38:
                C187318Ry c187318Ry = (C187318Ry) this.A01;
                ComposerAutoCompleteTextView composerAutoCompleteTextView = c187318Ry.A09;
                C26086BgF c26086BgF = null;
                if (composerAutoCompleteTextView != null) {
                    String A0g2 = AbstractC167007dF.A0g(composerAutoCompleteTextView);
                    Editable text2 = composerAutoCompleteTextView.getText();
                    List A00 = AbstractC23041ADx.A00(text2);
                    if (A00.isEmpty()) {
                        A00 = AJr.A00(text2);
                    }
                    if (AbstractC166987dD.A1b(A00)) {
                        list = AbstractC23041ADx.A01(A00);
                    } else {
                        list = null;
                    }
                    if (!AbstractC001900j.A0T(A0g2)) {
                        c26086BgF = new C26086BgF(null, A0g2, list);
                    }
                }
                c187318Ry.A0T.Dve(c26086BgF);
                return C0eB.A00;
            case 39:
                ComposerAutoCompleteTextView composerAutoCompleteTextView2 = ((C187318Ry) this.A01).A09;
                if (composerAutoCompleteTextView2 != null && (text = composerAutoCompleteTextView2.getText()) != null) {
                    C0s6 A002 = AbstractC13190m5.A00(text.getSpans(0, text.length(), A7L.class));
                    while (A002.hasNext()) {
                        A7L a7l = (A7L) A002.next();
                        Integer A03 = a7l.A00.A03();
                        if (A03 != null && A03.intValue() == 5) {
                            text.replace(text.getSpanStart(a7l), text.getSpanEnd(a7l), "");
                        }
                    }
                }
                return C0eB.A00;
            case 40:
                A0g = AbstractC167017dG.A0g(AbstractC166987dD.A0x(((C187318Ry) this.A01).A0O), "gallery_thumbnail_tray_preview_tooltip");
                A0g.apply();
                return C0eB.A00;
            case 44:
                C52362NFa c52362NFa = (C52362NFa) this.A01;
                return new NDS(c52362NFa.A02, c52362NFa.A09, c52362NFa.A0A, c52362NFa.A0B, c52362NFa.A0C);
            case 48:
                return new C52274NBp(AbstractC166987dD.A0r(((N7Z) this.A01).A00));
            case 49:
                AbstractC166987dD.A1Y(((C50627MWo) ((C44135Jf0) this.A01).A00).A00);
                return null;
        }
    }
}
