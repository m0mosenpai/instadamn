package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputContentInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.avatar.expresso.instagram.ExpressoImpl;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.forker.Process;
import com.facebook.quicklog.reliability.CancelReason;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AudioFilterInfo;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.ClipsTemplatesStickerType;
import com.instagram.api.schemas.ClipsTextAlignment;
import com.instagram.api.schemas.ClipsTextEmphasisMode;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.api.schemas.SoundPlatformProduct;
import com.instagram.api.schemas.StickerTraySectionCTAType;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState;
import com.instagram.stickersearch.AvatarStickerPreRenderInteractor;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import com.instagram.ui.text.ConstrainedEditText;
import com.instagram.ui.text.fittingtextview.FittingTextView;
import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.user.model.Product;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8NW, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8NW implements C8NX, C8NY, InterfaceC1829489p, C8NZ, InterfaceC60152ox, InterfaceC1810781j, InterfaceC186208No, InterfaceC186218Np, C8BD, InterfaceC186228Nq, C85H {
    public int A00;
    public int A01;
    public long A02;
    public Drawable A03;
    public View A04;
    public C55U A05;
    public C22920A8q A06;
    public InterfaceC183728Cx A07;
    public C23102AGo A08;
    public C30S A09;
    public C220999pN A0A;
    public C202278x7 A0B;
    public Integer A0C;
    public Integer A0D;
    public Runnable A0E;
    public Runnable A0F;
    public String A0G;
    public String A0H;
    public HashMap A0I;
    public List A0J;
    public List A0K;
    public Map A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public Integer A0c;
    public boolean A0d;
    public final int A0e;
    public final Context A0f;
    public final SparseArray A0g;
    public final View A0h;
    public final ViewGroup A0i;
    public final TextView A0j;
    public final C22P A0k;
    public final AbstractC59962oe A0l;
    public final C1819485e A0m;
    public final C89Y A0n;
    public final InterfaceC11380iw A0o;
    public final InterfaceC41501vz A0p;
    public final InterfaceC41501vz A0q;
    public final UserSession A0r;
    public final C3I9 A0s;
    public final C1810981l A0t;
    public final C8OP A0u;
    public final C8PH A0v;
    public final C8PK A0w;
    public final C89F A0x;
    public final C183688Ct A0y;
    public final C8O8 A0z;
    public final TargetViewSizeProvider A10;
    public final ClipsAssetHubViewModel A11;
    public final AnonymousClass874 A12;
    public final AnonymousClass840 A13;
    public final ViewOnTouchListenerC1829889t A14;
    public final C8O5 A15;
    public final C183918Ds A16;
    public final AnonymousClass877 A17;
    public final InterfaceC143326dX A18;
    public final C8AD A19;
    public final InterfaceC1810081c A1A;
    public final C8O1 A1B;
    public final C8OD A1C;
    public final C8OF A1D;
    public final C183828Di A1E;
    public final C87D A1F;
    public final ClipsCreationViewModel A1G;
    public final C8D6 A1H;
    public final C89P A1I;
    public final C87P A1J;
    public final C150286pc A1K;
    public final C150286pc A1L;
    public final C150286pc A1M;
    public final C150286pc A1N;
    public final C150286pc A1O;
    public final C150286pc A1P;
    public final C150286pc A1Q;
    public final C150286pc A1R;
    public final C150286pc A1S;
    public final C150286pc A1T;
    public final C150286pc A1U;
    public final C150286pc A1V;
    public final C150286pc A1W;
    public final C150286pc A1X;
    public final C150286pc A1Y;
    public final C150286pc A1Z;
    public final C150286pc A1a;
    public final C150286pc A1b;
    public final C150286pc A1c;
    public final C150286pc A1d;
    public final C87H A1e;
    public final C8CS A1f;
    public final C677733r A1g;
    public final PromptStickerModel A1h;
    public final AvatarStickerPreRenderInteractor A1i;
    public final FittingTextView A1j;
    public final EyedropperColorPickerTool A1k;
    public final InteractiveDrawableContainer A1l;
    public final C89N A1m;
    public final String A1n;
    public final String A1o;
    public final List A1p;
    public final List A1q;
    public final Map A1r;
    public final InterfaceC08830cm A1s;
    public final InterfaceC09390do A1t;
    public final InterfaceC09390do A1u;
    public final boolean A1v;
    public final boolean A1w;
    public final boolean A1x;
    public final C8O6 A1y;
    public final C8D4 A1z;
    public final C183618Cm A20;
    public final C8PF A21;
    public final C150286pc A22;
    public final C150286pc A23;
    public final C150286pc A24;
    public final C150286pc A25;
    public final C150286pc A26;
    public final C150286pc A27;
    public final C150286pc A28;
    public final C150286pc A29;
    public final C150286pc A2A;
    public final C150286pc A2B;
    public final C150286pc A2C;
    public final C150286pc A2D;
    public final C150286pc A2E;
    public final C150286pc A2F;
    public final C150286pc A2G;
    public final C150286pc A2H;
    public final C150286pc A2I;
    public final C150286pc A2J;
    public final C8ON A2K;
    public final C186318Nz A2L;
    public final ConstrainedEditText A2M;
    public final Map A2N;
    public final boolean A2O;
    public final boolean A2P;

    private final void A0J(int i, int i2, int i3) {
        List list;
        InteractiveDrawableContainer interactiveDrawableContainer;
        Runnable runnableC24403Ark;
        if (this.A0J != null && (list = this.A0K) != null) {
            C8D0 c8d0 = null;
            float f = 1.0f;
            float f2 = 0.0f;
            if (i > i3 && i < i2) {
                Drawable drawable = (Drawable) list.get((i - i3) - 1);
                int i4 = drawable.getBounds().left;
                int i5 = drawable.getBounds().top;
                int i6 = drawable.getBounds().right;
                int i7 = drawable.getBounds().bottom;
                interactiveDrawableContainer = this.A1l;
                c8d0 = new C221619qQ(new Rect(i4 + ((int) interactiveDrawableContainer.A0F(drawable)), i5 + ((int) interactiveDrawableContainer.A0G(drawable)), i6 + ((int) interactiveDrawableContainer.A0F(drawable)), i7 + ((int) interactiveDrawableContainer.A0G(drawable))));
                BEd A00 = InteractiveDrawableContainer.A00(drawable, interactiveDrawableContainer);
                if (A00 != null) {
                    f2 = ((C9LJ) A00).A03;
                } else {
                    f2 = 0.0f;
                }
                Float A0P = interactiveDrawableContainer.A0P(drawable);
                if (A0P != null) {
                    f = A0P.floatValue();
                }
                runnableC24403Ark = new RunnableC24655Avp(drawable, this);
            } else {
                if (i == 0 && this.A00 > 0) {
                    interactiveDrawableContainer = this.A1l;
                    runnableC24403Ark = new RunnableC24403Ark(this);
                }
                if (i < i3 && i < i2) {
                    List list2 = this.A0J;
                    list2.getClass();
                    C148276lx c148276lx = (C148276lx) list2.get(i - i3);
                    C23108AGw c23108AGw = new C23108AGw();
                    c23108AGw.A0F = true;
                    c23108AGw.A0N = true;
                    if (c8d0 == null) {
                        c8d0 = new C183748Cz(1.0f, 1.0f + (TypedValue.applyDimension(1, 5.0f, this.A0f.getResources().getDisplayMetrics()) / r3.heightPixels));
                    }
                    c23108AGw.A06 = c8d0;
                    c23108AGw.A04 = f;
                    c23108AGw.A03 = f2;
                    c23108AGw.A05 = 4;
                    String str = ((C148286ly) c148276lx.A0O.get(0)).A0M;
                    if (str == null) {
                        str = this.A0f.getString(2131953534);
                        C14360o3.A07(str);
                    }
                    c23108AGw.A0D = str;
                    this.A1l.post(new RunnableC24866AzR(c148276lx, this, c23108AGw, i, i3));
                    return;
                }
            }
            interactiveDrawableContainer.post(runnableC24403Ark);
            if (i < i3) {
            }
        }
    }

    public final int A0x(Drawable drawable, C148276lx c148276lx, C8FC c8fc, String str) {
        ArrayList A01;
        String str2;
        String str3;
        String str4;
        C14360o3.A0B(c148276lx, 0);
        if (c148276lx.A04()) {
            A01 = c148276lx.A02();
        } else {
            A01 = c148276lx.A01();
        }
        C5GJ c5gj = C5GJ.ASSET_PICKER;
        if (c148276lx.A0V) {
            str2 = c148276lx.A0Z;
        } else {
            str2 = null;
        }
        if (c148276lx.A04()) {
            str3 = c148276lx.A0Z;
        } else {
            str3 = null;
        }
        if (c148276lx.A00() == EnumC150226pU.A04) {
            str4 = c148276lx.A00().toString();
        } else {
            str4 = null;
        }
        return A0w(drawable, c5gj, null, c8fc, null, str2, str3, str4, str, A01);
    }

    public final int A0y(Drawable drawable, C8FC c8fc, String str, List list) {
        C14360o3.A0B(list, 0);
        C14360o3.A0B(drawable, 2);
        C14360o3.A0B(c8fc, 3);
        return A0w(drawable, C5GJ.ASSET_PICKER, null, c8fc, null, null, str, null, null, list);
    }

    public final void A1F(final Drawable drawable, int i) {
        ArrayList arrayList;
        EnumC223379tU[] enumC223379tUArr;
        EnumC223379tU enumC223379tU;
        C14360o3.A0B(drawable, 1);
        if (drawable instanceof C5RM) {
            drawable = ((C5RM) drawable).A0A;
        }
        if (drawable instanceof C194808jg) {
            C194808jg c194808jg = (C194808jg) drawable;
            Drawable A04 = c194808jg.A04();
            C14360o3.A07(A04);
            if (A04 instanceof C221099pX) {
                C221099pX c221099pX = (C221099pX) A04;
                if (c221099pX.A02) {
                    this.A1A.E4u(new C188128Vd(c221099pX.A00, c221099pX.A01()));
                    return;
                }
            }
            if (c194808jg.A0E(C220949pI.class)) {
                ((C220949pI) c194808jg.A06(C220949pI.class).get(0)).A03.A00();
            }
            if (c194808jg.A04() instanceof C220959pJ) {
                Drawable A042 = c194808jg.A04();
                C14360o3.A0C(A042, "null cannot be cast to non-null type com.instagram.reels.notifyme.view.NotifyMeStickerV2Drawable");
                ((C220959pJ) A042).A0G.A00();
            }
            AbstractC23024ADg.A01(drawable);
            if ((c194808jg.A0E(C202598xd.class) || c194808jg.A0E(C202658xj.class)) && this.A0J != null) {
                boolean z = this.A0R;
                int size = c194808jg.A08.size();
                if (z) {
                    int i2 = c194808jg.A00;
                    int i3 = size - this.A00;
                    if (i2 >= i3 && i2 < size) {
                        int i4 = i2 - i3;
                        if (this.A0K != null) {
                            List allDrawables = this.A1l.getAllDrawables();
                            if (!(allDrawables instanceof Collection) || !allDrawables.isEmpty()) {
                                for (Object obj : allDrawables) {
                                    List list = this.A0K;
                                    C14360o3.A0A(list);
                                    if (C14360o3.A0K(obj, list.get(i4))) {
                                    }
                                }
                            }
                        }
                        c194808jg.A0B(0);
                        int i5 = c194808jg.A00;
                        Object obj2 = this.A0g.get(i);
                        obj2.getClass();
                        ((C5NG) obj2).A01(i5);
                        A0J(i5, size, i3);
                        return;
                    }
                    c194808jg.A0D();
                    int i52 = c194808jg.A00;
                    Object obj22 = this.A0g.get(i);
                    obj22.getClass();
                    ((C5NG) obj22).A01(i52);
                    A0J(i52, size, i3);
                    return;
                }
                int i6 = this.A00 + size;
                int i7 = this.A01;
                int i8 = 0;
                if (i7 < i6 - 1) {
                    i8 = i7 + 1;
                }
                this.A01 = i8;
                A0J(i8, i6, size);
                return;
            }
            if (!c194808jg.A0D()) {
                return;
            }
            if (c194808jg.A04() instanceof C202588xc) {
                Drawable A043 = c194808jg.A04();
                C14360o3.A0C(A043, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.StickerItemDrawable");
                if (((C202588xc) A043).A0M == EnumC150226pU.A0C) {
                    Drawable A044 = c194808jg.A04();
                    C14360o3.A0C(A044, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.StickerItemDrawable");
                    int intValue = ((C202588xc) A044).A07.intValue();
                    if (intValue != 0) {
                        if (intValue != 1) {
                            if (intValue != 2) {
                                if (intValue == 3) {
                                    enumC223379tUArr = new EnumC223379tU[1];
                                    enumC223379tU = EnumC223379tU.MOTION_BLUR;
                                } else {
                                    throw new RuntimeException();
                                }
                            } else {
                                enumC223379tUArr = new EnumC223379tU[1];
                                enumC223379tU = EnumC223379tU.BLACK_AND_WHITE;
                            }
                        } else {
                            enumC223379tUArr = new EnumC223379tU[1];
                            enumC223379tU = EnumC223379tU.MIRROR;
                        }
                        enumC223379tUArr[0] = enumC223379tU;
                        arrayList = AbstractC16960so.A1M(enumC223379tUArr);
                    } else {
                        arrayList = new ArrayList();
                    }
                    C22C A01 = AnonymousClass229.A01(this.A0r);
                    EnumC50631MWs A12 = A12();
                    Drawable A045 = c194808jg.A04();
                    C14360o3.A0C(A045, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.StickerItemDrawable");
                    A01.A1K(A12, VHl.A04, ((C202588xc) A045).A0L.A0S, arrayList);
                    Drawable A046 = c194808jg.A04();
                    C14360o3.A0C(A046, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.StickerItemDrawable");
                    String str = ((C202588xc) A046).A0L.A0S;
                    C14360o3.A07(str);
                    this.A0I.put(str, arrayList);
                }
            }
            if (A0v(this)) {
                InterfaceC08830cm interfaceC08830cm = this.A1s;
                interfaceC08830cm.getClass();
                C191478dz c191478dz = (C191478dz) interfaceC08830cm.get();
                c191478dz.A0s.A0Q.A01(EnumC191648eM.A0J);
                C191478dz.A09(c191478dz);
                C14360o3.A0B(EnumC1810181d.A09, 0);
            }
            if (!(c194808jg.A04() instanceof C202328xC)) {
                return;
            }
            final UserSession userSession = this.A0r;
            final Context context = this.A0f;
            final String string = context.getString(2131963494);
            c194808jg.A0C(new C9PD(context, drawable, userSession, string) { // from class: X.9k2
                public final /* synthetic */ Drawable A00;

                {
                    this.A00 = drawable;
                    C194808jg c194808jg2 = (C194808jg) drawable;
                }

                @Override // X.C9PD, X.ACE
                public final boolean A01() {
                    Drawable A047 = ((C194808jg) this.A00).A04();
                    C14360o3.A0C(A047, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.MentionTextDrawable");
                    return C14360o3.A0K(((C202328xC) A047).A01, AbstractC111324zv.A00(432));
                }
            });
        }
    }

    public final void A1G(Drawable drawable, C148276lx c148276lx, C23108AGw c23108AGw) {
        C14360o3.A0B(c148276lx, 0);
        C14360o3.A0B(c23108AGw, 2);
        A1H(drawable, c148276lx, c23108AGw, null);
    }

    public final void A1J(Drawable drawable, C8FC c8fc, List list) {
        C14360o3.A0B(list, 0);
        C14360o3.A0B(drawable, 1);
        C14360o3.A0B(c8fc, 2);
        A0y(drawable, c8fc, null, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x009a, code lost:
    
        if (r10.A1A.CRB(X.EnumC1810181d.A0F) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x028a, code lost:
    
        if (X.AbstractC166997dE.A0c(X.C06090Tz.A05, r10.A0r, 36320923514577914L).booleanValue() != false) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1M(java.lang.Integer r11) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8NW.A1M(java.lang.Integer):void");
    }

    @Override // X.C85H
    public final /* bridge */ /* synthetic */ boolean A7D(Object obj, Object obj2) {
        C14360o3.A0B(obj, 0);
        if ((EnumC1810181d.A0j == obj || EnumC1810181d.A08 == obj) && this.A0D == C05F.A0Y) {
            return false;
        }
        return true;
    }

    @Override // X.C8NY
    public final void AAW(Drawable drawable, C8FC c8fc) {
        C194808jg A07;
        C6RB c6rb;
        if (A0s(drawable)) {
            if (drawable instanceof C6RB) {
                c6rb = (C6RB) drawable;
            } else {
                c6rb = null;
            }
            if (this.A13.A02.A01() == EnumC198268pb.A04) {
                this.A1J.A01(c6rb);
            }
        }
        A00(drawable, this, c8fc);
        if (this.A0W && (A07 = A07(this, C202308xA.class)) != null) {
            C150286pc c150286pc = this.A1P;
            ((C190988cu) c150286pc.get()).A03(drawable, A07);
            C190988cu c190988cu = (C190988cu) c150286pc.get();
            ((C190398bx) this.A1d.get()).A1Z.get();
            C190988cu.A02(drawable, c190988cu, new C207189Ex(6, c190988cu, drawable));
        }
        this.A0W = false;
    }

    @Override // X.C8NY
    public final void ARG(Drawable drawable, Object obj) {
        C14360o3.A0B(obj, 0);
        this.A1A.E4u(obj);
        InterfaceC08830cm interfaceC08830cm = this.A1s;
        interfaceC08830cm.getClass();
        interfaceC08830cm.get();
    }

    @Override // X.C8NY
    public final void CJs(final C05R c05r) {
        C14360o3.A0B(c05r, 0);
        ((C190398bx) this.A1d.get()).A0V();
        InputContentInfo inputContentInfo = ((C14550oT) c05r.A00).A00;
        if ("image/gif".equals(inputContentInfo.getDescription().getMimeType(0))) {
            String obj = inputContentInfo.getContentUri().toString();
            C14360o3.A07(obj);
            RunnableC24400Arh runnableC24400Arh = new RunnableC24400Arh(c05r);
            String A0R = AnonymousClass001.A0R("keyboard_content_gif__", obj);
            C7UR c7ur = C7UR.A0A;
            C7US.A00(this.A0f).A05(new C23933AjS(this, runnableC24400Arh, A0R, obj), obj);
            return;
        }
        final android.net.Uri contentUri = inputContentInfo.getContentUri();
        C14360o3.A07(contentUri);
        C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.9j8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(84, 3, false, false);
            }

            @Override // java.lang.Runnable
            public final void run() {
                C8NW c8nw = this;
                Context context = c8nw.A0f;
                android.net.Uri uri = contentUri;
                Bitmap A02 = C1NC.A02(context, uri);
                ((C14550oT) c05r.A00).A00.releasePermission();
                C11T.A02(new RunnableC24776Axy(A02, uri, c8nw));
            }
        });
    }

    @Override // X.InterfaceC186068Na
    public final void Chi(Medium medium, long j, long j2, boolean z) {
        C14360o3.A0B(medium, 0);
        ((C9LN) this.A1K.get()).A0I(new KN8(medium, j, j2, z), null);
    }

    @Override // X.InterfaceC186108Ne
    public final void Coa(View view, StickerTraySectionCTAType stickerTraySectionCTAType) {
        C14360o3.A0B(stickerTraySectionCTAType, 1);
        if (stickerTraySectionCTAType == StickerTraySectionCTAType.A05) {
            C9LN c9ln = (C9LN) this.A1K.get();
            UserSession userSession = c9ln.A18;
            if (C18U.A06(C06090Tz.A05, userSession, 36318973599423288L)) {
                InterfaceC19630xq interfaceC19630xq = C21B.A00(userSession).A00;
                String A00 = AbstractC43591JPw.A00(1126);
                if (!interfaceC19630xq.getBoolean(A00, false)) {
                    view.postDelayed(new RunnableC24619AvF(view, c9ln), 500L);
                    InterfaceC19610xo ARD = C21B.A00(userSession).A00.ARD();
                    ARD.E77(A00, true);
                    ARD.apply();
                }
            }
        }
    }

    @Override // X.InterfaceC186088Nc
    public final void Cu9(View view, C148286ly c148286ly, String str) {
        C14360o3.A0B(c148286ly, 0);
        UserSession userSession = this.A0r;
        InterfaceC11380iw interfaceC11380iw = this.A0o;
        String str2 = c148286ly.A0S;
        C14360o3.A07(str2);
        new LGF(view, interfaceC11380iw, userSession, null, C05F.A01, str2, null, str, null, 0, false, false, false).A01();
    }

    @Override // X.InterfaceC1829489p
    public final void Cud(Drawable drawable) {
        C191048d0 c191048d0;
        C14360o3.A0B(drawable, 0);
        if ((drawable instanceof C8P7) && ((C8P7) drawable).A0B.A0M()) {
            this.A0B = this.A1l.A0M(drawable);
        }
        if ((drawable instanceof C191048d0) && (c191048d0 = (C191048d0) drawable) != null) {
            c191048d0.A0B();
        }
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cuq() {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cur() {
    }

    @Override // X.InterfaceC186118Nf
    public final void Cuu(C214499en c214499en) {
        String str;
        String str2;
        boolean z;
        if (AbstractC23051AEh.A01(this.A1l)) {
            C9GR.A07(this.A0f, 2131968998);
            return;
        }
        UserSession userSession = this.A0r;
        C18920wW A01 = AbstractC12220kQ.A01(this.A0o, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "ig_cg_create_standalone_fundraiser_sticker_begin");
        A00.AAP("source_name", "STICKER_TRAY");
        A00.Cht();
        User A012 = C17060sy.A01.A01(userSession);
        AHE ahe = new AHE(A012.getUsername(), A012.Bhu().getUrl(), A012.isVerified());
        User user = c214499en.A01;
        if (user != null) {
            str = user.getUsername();
            str2 = user.Bhu().getUrl();
            z = user.isVerified();
        } else {
            str = c214499en.A03;
            if (str == null) {
                str = "";
            }
            str2 = c214499en.A04;
            z = false;
        }
        AHE ahe2 = new AHE(str, str2, z);
        String str3 = c214499en.A07;
        String str4 = c214499en.A06;
        C38321qM c38321qM = c214499en.A00;
        c38321qM.getClass();
        ImageUrl A1S = c38321qM.A1S();
        A1S.getClass();
        C1816383s c1816383s = new C1816383s(null, ahe2, ahe, A1S.getUrl(), "STICKER_TRAY", c214499en.A08, str4, "", str3, 0);
        A0Y(this, c1816383s);
        this.A1A.E4u(new A5Q(c1816383s));
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cvp(Drawable drawable, int i) {
    }

    @Override // X.InterfaceC150196pR
    public final void CxL(View view, final InterfaceC148316m1 interfaceC148316m1) {
        String str;
        C14360o3.A0B(interfaceC148316m1, 0);
        final C148276lx C0S = interfaceC148316m1.C0S();
        if (C0S == null) {
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Failed to long press a sticker as StaticSticker of AssetItem is null. Type is %s. Image Url is %s", interfaceC148316m1.CBc(), interfaceC148316m1.CDO());
            C14360o3.A07(formatStrLocaleSafe);
            AbstractC12120kG.A0I(formatStrLocaleSafe, null, AbstractC06930Yk.A0E());
            return;
        }
        int ordinal = C0S.A00().ordinal();
        if (ordinal != 19 && ordinal != 18) {
            return;
        }
        Context context = this.A0f;
        UserSession userSession = this.A0r;
        C1P1 c1p1 = new C1P1() { // from class: X.9gB
            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                int A03 = C0f9.A03(-879332078);
                int A032 = C0f9.A03(1842105685);
                C8NW c8nw = this;
                C9LN c9ln = (C9LN) c8nw.A1K.get();
                InterfaceC148316m1 interfaceC148316m12 = interfaceC148316m1;
                JT7 jt7 = c9ln.A0J;
                if (jt7 != null) {
                    JT6 jt6 = jt7.A0G;
                    ArrayList arrayList = jt6.A05;
                    arrayList.remove(interfaceC148316m12);
                    jt6.clear();
                    JT6.A00(jt6, arrayList);
                    c9ln.A0M(true);
                }
                C75B A00 = C8KG.A00(c8nw.A0r);
                String str2 = C0S.A0Z;
                C05A c05a = A00.A05;
                LinkedHashMap A033 = AbstractC06930Yk.A03((Map) c05a.getValue());
                A033.remove(str2);
                c05a.Egh(A033);
                C0f9.A0A(1745515035, A032);
                C0f9.A0A(-1800557137, A03);
            }
        };
        C14360o3.A0B(context, 0);
        String str2 = C0S.A0Z;
        C50674MYs c50674MYs = new C50674MYs(context, userSession);
        String str3 = userSession.userId;
        C148286ly c148286ly = (C148286ly) AbstractC001800i.A0O(C0S.A0O, 0);
        if (c148286ly != null) {
            str = c148286ly.A0V;
        } else {
            str = null;
        }
        if (C14360o3.A0K(str3, str)) {
            c50674MYs.A0C(context.getString(2131957444), context.getString(2131957443));
        }
        String string = context.getString(2131957640);
        C14360o3.A07(string);
        c50674MYs.A09(string, new LP1(c1p1, userSession, str2));
        String string2 = context.getString(2131954754);
        C14360o3.A07(string2);
        c50674MYs.A0B(string2, new ARH(userSession, str2));
        new C31727DwY(c50674MYs).A07(context);
    }

    @Override // X.InterfaceC150196pR
    public final void CxM(Drawable drawable, View view, InterfaceC148316m1 interfaceC148316m1) {
        C14360o3.A0B(interfaceC148316m1, 0);
        C14360o3.A0B(view, 1);
        int ordinal = interfaceC148316m1.CBc().ordinal();
        if (ordinal != 1) {
            if (ordinal == 0) {
                C148276lx C0S = interfaceC148316m1.C0S();
                C0S.getClass();
                DoZ(drawable, C0S, null);
                return;
            }
            throw new UnsupportedOperationException("Unknown AssetItem type");
        }
        C148336m3 B1F = interfaceC148316m1.B1F();
        B1F.getClass();
        drawable.getClass();
        DDL(drawable, view, B1F);
    }

    @Override // X.C8NZ
    public final void CyY() {
        C48215LVp c48215LVp;
        this.A0M = true;
        this.A0N = false;
        C9LN c9ln = (C9LN) this.A1K.get();
        C48597LeZ c48597LeZ = c9ln.A0D;
        if (c48597LeZ != null && (c48215LVp = c9ln.A0A) != null) {
            c48215LVp.A02(c48597LeZ, true);
        }
        c9ln.A16.A04();
        A0n(false);
    }

    @Override // X.C8NZ
    public final void Cya() {
        this.A0N = true;
        this.A0M = false;
        A0n(true);
        onBackPressed();
    }

    @Override // X.C8NZ
    public final void Cym() {
        this.A0M = true;
        this.A0N = false;
        A0n(false);
    }

    @Override // X.InterfaceC186128Ng
    public final void D7t(AlC alC) {
        Dog(alC, null);
    }

    @Override // X.InterfaceC186128Ng
    public final void D87() {
        A0k(C220919pF.class);
        this.A1A.E4u(new C187958Um(null));
    }

    @Override // X.InterfaceC186098Nd
    public final void D93(Medium medium, Integer num) {
        Integer num2;
        C14360o3.A0B(medium, 0);
        if (medium.A05()) {
            ((C9LN) this.A1K.get()).A0I(new KN7(medium), num);
            return;
        }
        if (!medium.Cff()) {
            return;
        }
        if (!A0p() && !(!A05().isEmpty())) {
            C9LN c9ln = (C9LN) this.A1K.get();
            C48590LeS c48590LeS = c9ln.A0E;
            if (c48590LeS == null) {
                return;
            }
            c48590LeS.A00 = medium;
            Object obj = c9ln.A19.A08.A00;
            c48590LeS.A01 = (C55U) obj;
            if (obj instanceof C81V) {
                num2 = C05F.A0j;
            } else {
                num2 = C05F.A0u;
            }
            C14360o3.A0B(num2, 0);
            c48590LeS.A03 = num2;
            C48215LVp c48215LVp = c9ln.A0A;
            if (c48215LVp != null) {
                c48215LVp.A02(c48590LeS, true);
            }
            c9ln.A16.A04();
            return;
        }
        LKV.A00(this.A0l.requireActivity(), ((NineSixteenLayoutConfigImpl) this.A10).A0G);
    }

    @Override // X.InterfaceC186068Na
    public final void D94(Bitmap bitmap, String str) {
        float f;
        C14360o3.A0B(bitmap, 0);
        if (str != null) {
            C9GR.A07(this.A0f, 2131957436);
        }
        ((C9LN) this.A1K.get()).A0M(true);
        StringBuilder sb = new StringBuilder();
        sb.append("cutout_photo_");
        Object obj = str;
        if (str == null) {
            obj = UUID.randomUUID();
        }
        sb.append(obj);
        String obj2 = sb.toString();
        C148276lx c148276lx = C148276lx.A0a;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        if (width / height > 1.9f) {
            f = (width * 0.15789475f) / height;
        } else {
            f = 0.3f;
        }
        C148276lx A03 = AbstractC148296lz.A03(bitmap, EnumC150226pU.A0L, obj2, f);
        DoZ(C194808jg.A01(this.A0f, this.A0r, A03), A03, null);
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void D97() {
    }

    @Override // X.InterfaceC186068Na
    public final void D98(C9ZM c9zm) {
        C14360o3.A0B(c9zm, 0);
        String str = c9zm.A06;
        if (str == null) {
            this.A1A.E4u(new Object());
            LH3.A02(this.A0l.requireContext());
            return;
        }
        String A0R = AnonymousClass001.A0R(AbstractC43591JPw.A00(329), str);
        LKV.A01(this.A0l.requireActivity(), ((NineSixteenLayoutConfigImpl) this.A10).A0H);
        Bitmap bitmap = c9zm.A05;
        float f = c9zm.A01;
        float f2 = c9zm.A00;
        C148286ly c148286ly = new C148286ly();
        c148286ly.A0S = A0R;
        c148286ly.A0U = "cut_out_video_sticker_webp";
        if (bitmap != null) {
            c148286ly.A0o.add(bitmap);
        }
        c148286ly.A01 = f;
        c148286ly.A00 = f2;
        c148286ly.A02 = 1.0f;
        c148286ly.A09 = 30;
        C148276lx c148276lx = C148276lx.A0a;
        List singletonList = Collections.singletonList(c148286ly);
        C14360o3.A07(singletonList);
        C148276lx c148276lx2 = new C148276lx(EnumC150226pU.A0M, A0R, singletonList);
        boolean z = c9zm.A08;
        if (z) {
            c148276lx2.A0G = Long.valueOf(c9zm.A02 - c9zm.A03);
        }
        Context context = this.A0f;
        UserSession userSession = this.A0r;
        C194808jg A00 = C194808jg.A00(context, null, null, userSession, c148276lx2, C8KG.A00(userSession));
        Drawable A04 = A00.A04();
        C14360o3.A0C(A04, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.CutoutVideoDrawable");
        C183688Ct.A0H(this.A0y, false, false);
        final C8PH c8ph = this.A0v;
        long j = c9zm.A02 - c9zm.A03;
        c8ph.A00();
        final long max = Math.max((long) ((j * 5.0d) - 5000.0d), 2000L);
        final long j2 = (max / 102) * 2;
        c8ph.A00 = new CountDownTimer(max, j2) { // from class: X.9T5
            @Override // android.os.CountDownTimer
            public final void onFinish() {
            }

            @Override // android.os.CountDownTimer
            public final void onTick(long j3) {
                C05A c05a = C8PH.this.A04;
                c05a.Egh(Integer.valueOf(AbstractC166987dD.A0H(c05a.getValue()) + 2));
            }
        };
        c8ph.A03.Egh(true);
        CountDownTimer countDownTimer = c8ph.A00;
        if (countDownTimer != null) {
            countDownTimer.start();
        }
        C8OP c8op = this.A0u;
        if (c8op != null) {
            Bitmap bitmap2 = c9zm.A04;
            List list = c9zm.A07;
            if (list == null) {
                list = C16930sl.A00;
            }
            OLe oLe = new OLe(bitmap2, list, z);
            MIL mil = new MIL(6, A04, this, c148276lx2, c148286ly, A00);
            c8op.A03 = AbstractC23641Du.A02(AnonymousClass191.A00, new C50533MSm(mil, oLe, c8op, null, 6, true), AbstractC141776au.A00(c8op));
        }
        DoZ(A00, c148276lx2, null);
    }

    @Override // X.InterfaceC1829489p
    public final void DCJ(Drawable drawable, int i) {
    }

    @Override // X.InterfaceC1829489p
    public final void DCL(Drawable drawable) {
        View view;
        C14360o3.A0B(drawable, 0);
        if (this.A1A.CRB(EnumC1810181d.A09) && drawable == this.A1H.A00() && AbstractC185298Jv.A05(this.A0r) && (view = this.A04) != null) {
            this.A0i.removeView(view);
        }
    }

    @Override // X.C7OC
    public final void DDL(Drawable drawable, View view, C148336m3 c148336m3) {
        C14360o3.A0B(c148336m3, 0);
        C14360o3.A0B(drawable, 2);
        this.A1A.E4u(new Object());
        int A00 = A00(drawable, this, new C8FC((C8D0) null, (C8FD) null, (C89G) null, C05F.A00, (Integer) null, (Integer) null, (Object) "StickerOverlayController", (String) null, (List) null, -1.0f, 30.0f, -1.0f, -1.0f, -1.0f, 0, true, false, true, true, false, false, true, true, true, true, true, true, false, false));
        SparseArray sparseArray = this.A0g;
        C5NG c5ng = new C5NG();
        StringBuilder sb = new StringBuilder();
        String str = c148336m3.A02;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            sb.append("\\u");
            sb.append(Integer.toHexString(str.charAt(i)));
        }
        ArrayList arrayList = new ArrayList();
        String obj = sb.toString();
        C14360o3.A07(obj);
        arrayList.add(obj);
        c5ng.A06 = arrayList;
        c5ng.A01 = C5NH.A05;
        sparseArray.put(A00, c5ng);
        this.A1y.A05(c148336m3);
    }

    @Override // X.InterfaceC186138Nh
    public final void DIz(Medium medium, boolean z) {
        Object c8w8;
        IgSimpleImageView igSimpleImageView;
        C14360o3.A0B(medium, 0);
        InterfaceC1810081c interfaceC1810081c = this.A1A;
        Object obj = ((C1809981b) interfaceC1810081c).A01.A00.second;
        C14360o3.A07(obj);
        if (obj instanceof C188348Vz) {
            C23709Aei c23709Aei = (C23709Aei) this.A1L.get();
            if (c23709Aei.A0D) {
                c23709Aei.A04 = medium;
                igSimpleImageView = c23709Aei.A09;
            } else {
                c23709Aei.A03 = medium;
                igSimpleImageView = c23709Aei.A08;
            }
            if (igSimpleImageView != null) {
                igSimpleImageView.setImageURI(medium.A02());
                ViewTreeObserver viewTreeObserver = igSimpleImageView.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC23268ATd(igSimpleImageView, c23709Aei));
                }
            }
            c8w8 = new Object();
        } else if (obj instanceof C8W2) {
            if (obj instanceof C8W7) {
                c8w8 = new C8W8(medium, ((C8W7) obj).A00, false);
            } else if (!(obj instanceof C8W9)) {
                return;
            } else {
                c8w8 = new C8W8(medium, ((C8W9) obj).A00, true);
            }
        } else {
            if (z && medium.Cff()) {
                if (!A0p() && !(!A05().isEmpty())) {
                    C9LN c9ln = (C9LN) this.A1K.get();
                    C48589LeR c48589LeR = c9ln.A0K;
                    if (c48589LeR == null) {
                        return;
                    }
                    c48589LeR.A00 = medium;
                    c48589LeR.A01 = (C55U) c9ln.A19.A08.A00;
                    c48589LeR.A03 = !(r1 instanceof C81V);
                    C48215LVp c48215LVp = c9ln.A0A;
                    if (c48215LVp != null) {
                        c48215LVp.A02(c48589LeR, true);
                    }
                    c9ln.A16.A04();
                    return;
                }
                LKV.A00(this.A0l.requireActivity(), ((NineSixteenLayoutConfigImpl) this.A10).A0G);
                return;
            }
            UserSession userSession = this.A0r;
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36325446115341386L);
            C148276lx c148276lx = C148276lx.A0a;
            C148276lx A00 = AbstractC148296lz.A00();
            if (A06) {
                Context context = this.A0f;
                InteractiveDrawableContainer interactiveDrawableContainer = this.A1l;
                A1J(new C202728xq(context, null, medium, null, C8OK.A0A, null, AMF.A01(context, Integer.valueOf(interactiveDrawableContainer.getWidth())), AMF.A00(context, Integer.valueOf(interactiveDrawableContainer.getHeight())), true, false, false, false), new C8FC((C8D0) null, (C8FD) null, (C89G) null, C05F.A00, (Integer) null, (Integer) null, (Object) "StickerOverlayController", (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, true, false, true, true, false, false, true, true, true, true, true, true, false, false), A00.A01());
                return;
            }
            Context context2 = this.A0f;
            InteractiveDrawableContainer interactiveDrawableContainer2 = this.A1l;
            C194808jg A03 = AMF.A03(context2, medium, userSession, Integer.valueOf(interactiveDrawableContainer2.getWidth()), Integer.valueOf(interactiveDrawableContainer2.getHeight()), false);
            A1J(A03, new C8FC((C8D0) null, (C8FD) null, (C89G) null, C05F.A00, (Integer) null, (Integer) null, (Object) "StickerOverlayController", (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, true, false, true, true, false, false, true, true, true, true, true, true, false, false), A00.A01());
            A03.A9I(new C23668Ae3(A03, this));
            return;
        }
        interfaceC1810081c.E4u(c8w8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if ((r7 instanceof X.C191048d0) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r6.A2O == false) goto L11;
     */
    @Override // X.InterfaceC1829489p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DQa(android.graphics.drawable.Drawable r7, int r8, float r9, float r10) {
        /*
            r6 = this;
            r2 = 1
            X.C14360o3.A0B(r7, r2)
            boolean r0 = r7 instanceof X.C194808jg
            r1 = 0
            if (r0 == 0) goto L12
            r0 = r7
            X.8jg r0 = (X.C194808jg) r0
            if (r0 == 0) goto L12
            android.graphics.drawable.Drawable r1 = r0.A04()
        L12:
            boolean r0 = r1 instanceof X.InterfaceC133135zf
            if (r0 == 0) goto L1b
            boolean r0 = r6.A2O
            r5 = 1
            if (r0 != 0) goto L1c
        L1b:
            r5 = 0
        L1c:
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r3 = r6.A1l
            java.util.List r0 = r3.getAllDrawables()
            java.util.Iterator r4 = r0.iterator()
        L26:
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 == 0) goto L35
            java.lang.Object r1 = r4.next()
            boolean r0 = r1 instanceof X.C8P8
            if (r0 == 0) goto L26
        L35:
            boolean r0 = r1 instanceof X.C8P8
            if (r0 == 0) goto L72
            X.8P8 r1 = (X.C8P8) r1
            if (r1 == 0) goto L72
            com.instagram.reels.prompt.model.PromptStickerModel r1 = r1.BUK()
            boolean r0 = r1.A0M()
            if (r0 == 0) goto L72
            boolean r0 = r1.A0L()
            if (r0 == 0) goto L72
            boolean r0 = r7 instanceof X.C191048d0
            if (r0 == 0) goto L72
        L51:
            if (r5 == 0) goto L71
            X.8jg r7 = (X.C194808jg) r7
            java.lang.Integer r0 = X.C05F.A06
            r6.A1M(r0)
            r7.A08()
            android.util.SparseArray r0 = r6.A0g
            java.lang.Object r1 = r0.get(r8)
            r1.getClass()
            X.5NG r1 = (X.C5NG) r1
            int r0 = r7.A00
            r1.A01(r0)
            X.8O5 r0 = r6.A15
            r0.A00 = r7
        L71:
            return
        L72:
            X.81c r4 = r6.A1A
            boolean r0 = r4.Cae()
            if (r0 == 0) goto L51
            java.util.List r0 = r3.getAllDrawables()
            int r0 = r0.size()
            if (r0 <= r2) goto L51
            com.instagram.common.session.UserSession r3 = r6.A0r
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320923514577914(0x8109b0000023fa, double:3.0328365110144585E-306)
            java.lang.Boolean r0 = X.AbstractC166997dE.A0c(r2, r3, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L51
            X.8Wh r0 = new X.8Wh
            r0.<init>(r8, r10, r5)
            r4.E4u(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8NW.DQa(android.graphics.drawable.Drawable, int, float, float):void");
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DQk() {
    }

    @Override // X.InterfaceC186098Nd
    public final void DSY(Medium medium) {
    }

    @Override // X.InterfaceC186068Na
    public final void DY4(Bitmap bitmap, String str) {
        float f;
        C14360o3.A0B(bitmap, 0);
        C14360o3.A0B(str, 1);
        C148276lx c148276lx = C148276lx.A0a;
        String A0R = AnonymousClass001.A0R("cutout_photo_upload_id_", str);
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        if (width / height > 1.9f) {
            f = (width * 0.15789475f) / height;
        } else {
            f = 0.3f;
        }
        C148276lx A03 = AbstractC148296lz.A03(bitmap, EnumC150226pU.A0L, A0R, f);
        DoZ(C194808jg.A01(this.A0f, this.A0r, A03), A03, null);
    }

    @Override // X.InterfaceC1829489p
    public final void Dep(Drawable drawable, int i, boolean z) {
        C14360o3.A0B(drawable, 1);
        A0P(drawable, this, i, z, false);
    }

    @Override // X.InterfaceC186228Nq
    public final void Df3(Drawable drawable) {
        EFB(drawable, false);
    }

    @Override // X.InterfaceC1829489p
    public final void Din(Drawable drawable, float f, float f2, float f3, float f4) {
        C14360o3.A0B(drawable, 0);
        C183688Ct c183688Ct = this.A0y;
        C8Y6 c8y6 = (C8Y6) c183688Ct.A1x.get();
        if (c8y6 != null) {
            if (c8y6.A07.A08.A00 instanceof C81V) {
                C185948Mo c185948Mo = c8y6.A0B;
                if (c185948Mo.A09 == EnumC189218Zt.A05) {
                    c8y6.A01 = true;
                }
                c8y6.A0N.A00().Eoi();
                c8y6.A0O.A00().Eoi();
                c185948Mo.A0K();
            }
            InterfaceC1818984z interfaceC1818984z = c8y6.A0I;
            if (interfaceC1818984z != null) {
                interfaceC1818984z.CMm();
            }
        }
        c183688Ct.A1N.E4u(new Object());
        AbstractC23024ADg.A01(drawable);
        InterfaceC1810081c interfaceC1810081c = this.A1A;
        EnumC1810181d enumC1810181d = EnumC1810181d.A0K;
        if (interfaceC1810081c.CRB(enumC1810181d)) {
            InterfaceC08830cm interfaceC08830cm = this.A1s;
            interfaceC08830cm.getClass();
            ((View) ((C191478dz) interfaceC08830cm.get()).A1C.getValue()).setVisibility(8);
        }
        A1M(C05F.A05);
        if (this.A1H.A00() == drawable && !interfaceC1810081c.CRB(enumC1810181d) && AbstractC185298Jv.A05(this.A0r)) {
            A0M(drawable, this);
        }
    }

    @Override // X.InterfaceC186078Nb
    public final void DoZ(Drawable drawable, C148276lx c148276lx, Long l) {
        String str;
        C194808jg c194808jg;
        C148276lx c148276lx2 = c148276lx;
        Drawable drawable2 = null;
        if ((drawable instanceof C194808jg) && (c194808jg = (C194808jg) drawable) != null) {
            drawable2 = (Drawable) AbstractC001800i.A0A(c194808jg.A05());
        }
        if ((drawable2 instanceof C8OT) && !AbstractC002300n.A0h(c148276lx.A0Z, AbstractC43591JPw.A00(329), false)) {
            FragmentActivity requireActivity = this.A0l.requireActivity();
            UserSession userSession = this.A0r;
            ClipsDraftRepository A00 = C75L.A00(requireActivity, userSession);
            C74P c74p = (C74P) drawable2;
            String str2 = c74p.A0D;
            if (str2 != null || (str2 = c74p.A0F) != null) {
                if (A1X()) {
                    String A0R = AnonymousClass001.A0R(c74p.A0k, "_webp");
                    File file = new File(str2);
                    C14360o3.A0B(A0R, 0);
                    C128175qm A09 = A00.A09();
                    if (A09 != null && (str = A09.A0T) != null) {
                        File file2 = new File(new File(A00.A07.A01(), str), A0R);
                        if (!file2.exists()) {
                            try {
                                MT6.A04(file, file2, false);
                            } catch (IOException unused) {
                            }
                        }
                        file = file2;
                    }
                    StringWriter stringWriter = new StringWriter();
                    C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                    AbstractC201078up.A00(A0A, c148276lx);
                    A0A.close();
                    c148276lx2 = AbstractC201078up.parseFromJson(C16V.A00(stringWriter.toString()));
                    C148286ly c148286ly = (C148286ly) AbstractC001800i.A0J(c148276lx2.A0O);
                    if (c148286ly != null) {
                        c148286ly.A0H = new SimpleImageUrl(android.net.Uri.fromFile(file).toString());
                    }
                }
                drawable = C194808jg.A00(this.A0f, null, null, userSession, c148276lx2, null);
            } else {
                return;
            }
        }
        Doa(drawable, c148276lx2, l, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        if (r10 != true) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0367  */
    @Override // X.InterfaceC186078Nb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Doa(android.graphics.drawable.Drawable r20, X.C148276lx r21, java.lang.Long r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 1131
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8NW.Doa(android.graphics.drawable.Drawable, X.6lx, java.lang.Long, boolean):void");
    }

    @Override // X.C8NX
    public final void Dof() {
        this.A0B = null;
        ((C190398bx) this.A1d.get()).A0a();
        A1M(C05F.A01);
    }

    @Override // X.InterfaceC186108Ne
    public final void Don(StickerTraySectionCTAType stickerTraySectionCTAType) {
        C14360o3.A0B(stickerTraySectionCTAType, 0);
        if (stickerTraySectionCTAType == StickerTraySectionCTAType.A06) {
            ((C9LN) this.A1K.get()).A0J(C05F.A0C);
            return;
        }
        if (stickerTraySectionCTAType == StickerTraySectionCTAType.A07 && A0r()) {
            ((C9LN) this.A1K.get()).A0H(C8BN.STORY_MUSIC_STICKER, A12(), false);
            return;
        }
        if (stickerTraySectionCTAType == StickerTraySectionCTAType.A08 && A0r()) {
            ((C9LN) this.A1K.get()).A0H(C8BN.STORY_MUSIC_STICKER, A12(), true);
            return;
        }
        if (stickerTraySectionCTAType == StickerTraySectionCTAType.A04) {
            C9LN c9ln = (C9LN) this.A1K.get();
            JT7 jt7 = c9ln.A0J;
            if (jt7 != null) {
                C48215LVp c48215LVp = c9ln.A0A;
                if (c48215LVp != null) {
                    c48215LVp.A02(jt7, true);
                }
                c9ln.A16.A04();
            }
            C448124l c448124l = AnonymousClass229.A01(this.A0r).A09;
            C25531Mh A08 = C25531Mh.A08(c448124l.A01);
            EnumC114925Hg A0J = c448124l.A0J();
            if (!((AbstractC02600Aj) A08).A00.isSampled() || A0J == null) {
                return;
            }
            A08.A0s("IG_CAMERA_ENTITY_TAP");
            A08.A0q("CUTOUT_STICKER_SEE_ALL_TAP");
            C448124l.A00(A08, c448124l);
            A08.A0a(A0J);
            C22M c22m = c448124l.A04;
            A08.A0b(c22m.A09);
            A08.A0T();
            A08.A0U();
            A08.A0m(C22F.A08.getModuleName());
            A08.A0R("sticker_tray_session_id", c22m.A0U);
            A08.A0c(c22m.A0A);
            A08.A0R("composition_str_id", c22m.A0M);
            A08.A0M(c22m.A0A, "composition_media_type");
            A08.A0t(C1QM.A00.A02.A00);
            A08.Cht();
            return;
        }
        throw new UnsupportedOperationException("Unhandled CTA type.");
    }

    @Override // X.C8NY
    public final void EFB(Drawable drawable, boolean z) {
        List list;
        Drawable drawable2;
        C14360o3.A0B(drawable, 0);
        C150286pc c150286pc = this.A1P;
        if (((C190988cu) c150286pc.get()).A03.containsKey(drawable)) {
            C190988cu c190988cu = (C190988cu) c150286pc.get();
            C206189Bb c206189Bb = (C206189Bb) ((C190988cu) c150286pc.get()).A03.get(drawable);
            if (c206189Bb != null) {
                drawable2 = (Drawable) c206189Bb.A03;
            } else {
                drawable2 = null;
            }
            c190988cu.A04(drawable, drawable2);
            this.A0W = true;
        }
        boolean z2 = drawable instanceof C5RM;
        if (z2) {
            Drawable drawable3 = ((C5RM) drawable).A0A;
            if ((drawable3 instanceof C210399Se) && ((C210399Se) drawable3).A0C == EnumC222999se.A06) {
                this.A1G.A0P();
            }
        }
        if (z && z2 && (list = this.A1q) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC93104Fm interfaceC93104Fm = (InterfaceC93104Fm) it.next();
                if (C14360o3.A0K(interfaceC93104Fm.getId(), ((C5RM) drawable).A04)) {
                    this.A0G = interfaceC93104Fm.getId();
                    break;
                }
            }
        }
        this.A1l.A0Q(drawable);
    }

    public static final int A02(C8NW c8nw) {
        List BsT;
        C89P c89p = c8nw.A1I;
        if (c89p.A0H()) {
            InterfaceC110214xq interfaceC110214xq = c89p.A04;
            long j = 0;
            if (interfaceC110214xq != null && (BsT = interfaceC110214xq.BsT()) != null) {
                Iterator it = BsT.iterator();
                while (it.hasNext()) {
                    j += ((InterfaceC110074xc) it.next()).getDurationInMs();
                }
            }
            return (int) j;
        }
        return ClipsCreationViewModel.A00(c8nw.A1G).A00;
    }

    public static final Drawable A03(C8NW c8nw, Class cls) {
        ArrayList A0T = c8nw.A1l.A0T(cls);
        C14360o3.A0B(A0T, 0);
        return (Drawable) AbstractC001800i.A0J(A0T);
    }

    public static final C9BO A04(C8NW c8nw) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        InteractiveDrawableContainer interactiveDrawableContainer = c8nw.A1l;
        Iterator it = interactiveDrawableContainer.A0T(C6RB.class).iterator();
        int i = 0;
        while (it.hasNext()) {
            C6RB c6rb = (C6RB) it.next();
            if (c6rb != c8nw.A14() || !((C190398bx) c8nw.A1d.get()).A1j.hasFocus()) {
                Spannable spannable = c6rb.A0F;
                C14360o3.A07(spannable);
                C202858y3[] c202858y3Arr = (C202858y3[]) C4GL.A06(spannable, C202858y3.class);
                int length = c202858y3Arr.length;
                ArrayList arrayList = new ArrayList(length);
                for (C202858y3 c202858y3 : c202858y3Arr) {
                    arrayList.add(c202858y3.A00);
                }
                linkedHashSet.addAll(arrayList);
                i += length;
            }
        }
        Iterator it2 = interactiveDrawableContainer.A0R(C194798jf.A00).iterator();
        while (it2.hasNext()) {
            Object obj = (Drawable) it2.next();
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.MentionableSticker");
            InterfaceC25178BCb interfaceC25178BCb = (InterfaceC25178BCb) obj;
            i += interfaceC25178BCb.BSK();
            linkedHashSet.addAll(interfaceC25178BCb.BSS());
        }
        Iterator it3 = interactiveDrawableContainer.A0T(C194808jg.class).iterator();
        while (it3.hasNext()) {
            Object A04 = ((C194808jg) it3.next()).A04();
            C14360o3.A07(A04);
            if (A04 instanceof InterfaceC25178BCb) {
                InterfaceC25178BCb interfaceC25178BCb2 = (InterfaceC25178BCb) A04;
                i += interfaceC25178BCb2.BSK();
                linkedHashSet.addAll(interfaceC25178BCb2.BSS());
            }
        }
        return new C9BO(AbstractC001800i.A0a(linkedHashSet), i + c8nw.A1r.size(), 3);
    }

    public static final C211749Zz A06(C8NW c8nw, C5RM c5rm, C202278x7 c202278x7) {
        C194808jg c194808jg;
        String str;
        ClipsTemplatesStickerType clipsTemplatesStickerType;
        Drawable drawable = c5rm.A0A;
        if ((drawable instanceof C194808jg) && (c194808jg = (C194808jg) drawable) != null) {
            Drawable A04 = c194808jg.A04();
            C14360o3.A07(A04);
            if (A04 instanceof C202588xc) {
                C202588xc c202588xc = (C202588xc) A04;
                if (c202588xc.A0M == EnumC150226pU.A0L) {
                    str = c202588xc.A0L.A0S;
                    clipsTemplatesStickerType = ClipsTemplatesStickerType.A05;
                    InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) c8nw.A10).A0K;
                    int width = interfaceC1812882f.getWidth();
                    int height = interfaceC1812882f.getHeight();
                    float f = width;
                    float f2 = height;
                    float intrinsicHeight = A04.getIntrinsicHeight() / f2;
                    float f3 = c5rm.A00;
                    float f4 = c202278x7.A05;
                    float f5 = c202278x7.A06;
                    float f6 = c5rm.A01;
                    int i = c202278x7.A0B;
                    C14360o3.A0B(str, 7);
                    C211749Zz c211749Zz = new C211749Zz(clipsTemplatesStickerType, str, f3, intrinsicHeight, c202278x7.A03 / f, c202278x7.A04 / f2, f4, f5, f6, A04.getIntrinsicWidth() / f, i);
                    return new C211749Zz(c211749Zz.A09, c211749Zz.A0A, c211749Zz.A00, c211749Zz.A01, c211749Zz.A02, c211749Zz.A03, c211749Zz.A04, c211749Zz.A05, c211749Zz.A06, c211749Zz.A07, c211749Zz.A08);
                }
            }
            if (A04 instanceof C8OT) {
                str = ((C74P) A04).A0k;
                clipsTemplatesStickerType = ClipsTemplatesStickerType.A06;
            } else if (A04 instanceof C74P) {
                str = ((C74P) A04).A0k;
                clipsTemplatesStickerType = ClipsTemplatesStickerType.A07;
            }
            InterfaceC1812882f interfaceC1812882f2 = ((NineSixteenLayoutConfigImpl) c8nw.A10).A0K;
            int width2 = interfaceC1812882f2.getWidth();
            int height2 = interfaceC1812882f2.getHeight();
            float f7 = width2;
            float f22 = height2;
            float intrinsicHeight2 = A04.getIntrinsicHeight() / f22;
            float f32 = c5rm.A00;
            float f42 = c202278x7.A05;
            float f52 = c202278x7.A06;
            float f62 = c5rm.A01;
            int i2 = c202278x7.A0B;
            C14360o3.A0B(str, 7);
            C211749Zz c211749Zz2 = new C211749Zz(clipsTemplatesStickerType, str, f32, intrinsicHeight2, c202278x7.A03 / f7, c202278x7.A04 / f22, f42, f52, f62, A04.getIntrinsicWidth() / f7, i2);
            return new C211749Zz(c211749Zz2.A09, c211749Zz2.A0A, c211749Zz2.A00, c211749Zz2.A01, c211749Zz2.A02, c211749Zz2.A03, c211749Zz2.A04, c211749Zz2.A05, c211749Zz2.A06, c211749Zz2.A07, c211749Zz2.A08);
        }
        return null;
    }

    public static final C194808jg A07(C8NW c8nw, Class cls) {
        Object obj;
        Iterator it = c8nw.A1l.A0T(C194808jg.class).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C194808jg) obj).A0E(cls)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C194808jg) obj;
    }

    private final C202588xc A08(C202588xc c202588xc) {
        UserSession userSession = this.A0r;
        Context context = this.A0f;
        C148286ly c148286ly = c202588xc.A0L;
        String str = c202588xc.A0O;
        return new C202588xc(context, c202588xc.A0I, userSession, c148286ly, c202588xc.A0M, c202588xc.A0N, str);
    }

    public static final InterfaceC25221BDv A09(C55U c55u, C8NW c8nw) {
        AbstractC59962oe abstractC59962oe = c8nw.A0l;
        if (abstractC59962oe.getContext() != null && !abstractC59962oe.mDetached && !abstractC59962oe.mRemoving) {
            return AbstractC53897NsT.A00(abstractC59962oe.requireActivity(), abstractC59962oe.getViewLifecycleOwner(), c8nw.A0r, c55u, c8nw.A13);
        }
        return null;
    }

    public static final C198308pf A0A(C8NW c8nw) {
        C1816783z c1816783z = c8nw.A13.A02;
        if (c1816783z.A01.A07()) {
            return c1816783z.A00();
        }
        return null;
    }

    public static final C5RM A0C(Drawable drawable, C8NW c8nw, C8FC c8fc) {
        if ("sticky_text_drawable_tag".equals(c8fc.A0C) && (drawable instanceof C5RM)) {
            return (C5RM) drawable;
        }
        int i = C5RM.A0D;
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        return new C5RM(c8nw.A0f, drawable, obj);
    }

    public static final C220999pN A0D(C8NW c8nw) {
        return (C220999pN) AbstractC001800i.A0J(c8nw.A1l.A0T(C220999pN.class));
    }

    public static final ArrayList A0E(C8NW c8nw) {
        HashSet hashSet = new HashSet();
        InteractiveDrawableContainer interactiveDrawableContainer = c8nw.A1l;
        Iterator it = interactiveDrawableContainer.A0T(C6RB.class).iterator();
        while (it.hasNext()) {
            Spannable spannable = ((C6RB) it.next()).A0F;
            C14360o3.A07(spannable);
            for (C202858y3 c202858y3 : (C202858y3[]) C4GL.A06(spannable, C202858y3.class)) {
                hashSet.add(c202858y3.A00.getId());
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = interactiveDrawableContainer.A0T(C194808jg.class).iterator();
        while (it2.hasNext()) {
            Object obj = ((C194808jg) it2.next()).A03;
            if (obj instanceof C217889kL) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.model.MentionStickerClientModel");
                User user = ((C217889kL) obj).A03;
                if (user != null) {
                    arrayList.add(user.getId());
                }
            }
        }
        hashSet.addAll(arrayList);
        return new ArrayList(hashSet);
    }

    public static final java.util.Set A0F(C8NW c8nw) {
        if (C18U.A06(C06090Tz.A05, c8nw.A0r, 36319909903343436L)) {
            return ((C183878Dn) c8nw.A1u.getValue()).A00;
        }
        C183828Di c183828Di = c8nw.A1E;
        if (c183828Di != null) {
            return AbstractC001800i.A0k(c183828Di.A00);
        }
        return null;
    }

    private final void A0G() {
        C24U c24u = AnonymousClass229.A01(this.A0r).A03;
        String str = this.A0H;
        C24Q c24q = c24u.A0E;
        long j = c24u.A02;
        if (str == null) {
            str = "music_browser_open_cancelled";
        }
        c24u.A02 = c24q.A06(CancelReason.SYSTEM_CANCELLED, str, 17641988, j);
        this.A0H = "";
    }

    private final void A0H() {
        ArrayList arrayList = new ArrayList();
        InteractiveDrawableContainer interactiveDrawableContainer = this.A1l;
        Iterator it = interactiveDrawableContainer.A0T(C220809p4.class).iterator();
        while (it.hasNext()) {
            arrayList.add(((C220809p4) it.next()).A03);
        }
        Map map = this.A2N;
        map.putAll(interactiveDrawableContainer.A0W(C220809p4.class));
        C8P7 c8p7 = (C8P7) A03(this, C8P7.class);
        if (c8p7 != null) {
            PromptStickerModel promptStickerModel = c8p7.A0B;
            if (promptStickerModel.A0G()) {
                map.putAll(interactiveDrawableContainer.A0W(C8P7.class));
                arrayList.add(promptStickerModel);
            }
        }
        A0Z(this, C220809p4.class);
        A0Z(this, C8P7.class);
        InterfaceC1810081c interfaceC1810081c = this.A1A;
        AFz aFz = null;
        if (!arrayList.isEmpty()) {
            aFz = new AFz(arrayList);
        }
        interfaceC1810081c.E4u(new C188338Vy(aFz, false));
    }

    private final void A0I() {
        C220789p2 c220789p2;
        Iterator it = this.A1l.A0T(C220789p2.class).iterator();
        while (true) {
            if (it.hasNext()) {
                c220789p2 = (C220789p2) it.next();
                if (!c220789p2.A0o) {
                    break;
                }
            } else {
                c220789p2 = null;
                break;
            }
        }
        A0Z(this, C220789p2.class);
        this.A1A.E4u(new C8UW(c220789p2));
    }

    private final void A0K(Drawable drawable) {
        Drawable drawable2;
        C23102AGo c23102AGo = this.A08;
        if (c23102AGo != null) {
            InteractiveDrawableContainer interactiveDrawableContainer = this.A1l;
            interactiveDrawableContainer.A0g(this.A03);
            interactiveDrawableContainer.A0Q(this.A03);
            C9ZD c9zd = (C9ZD) c23102AGo.A02.get(drawable);
            if (c9zd != null) {
                drawable2 = c9zd.A03;
            } else {
                drawable2 = null;
            }
            c23102AGo.A01(drawable, drawable2);
            this.A03 = null;
        }
    }

    private final void A0L(Drawable drawable) {
        Object c188218Vm;
        if (drawable instanceof C194808jg) {
            if (!C18U.A06(C06090Tz.A06, this.A0r, 36323895631949486L)) {
                this.A1A.E4u(new Object());
                this.A0H = "Existing music sticker is a RotatableDrawable, which cannot be edited";
                A0G();
                return;
            }
        }
        boolean z = false;
        if (this.A08 != null) {
            if (this.A03 != null) {
                A0K(drawable);
            } else {
                z = true;
            }
        }
        boolean A0C = AbstractC101614hW.A0C(drawable);
        InterfaceC1810081c interfaceC1810081c = this.A1A;
        boolean A0v = A0v(this);
        if (A0C) {
            c188218Vm = new C188228Vn(z);
        } else {
            c188218Vm = new C188218Vm(z, A0v);
        }
        interfaceC1810081c.E4u(c188218Vm);
    }

    public static final void A0M(Drawable drawable, C8NW c8nw) {
        float f;
        float f2;
        int i;
        View view = c8nw.A04;
        if (view != null) {
            c8nw.A0i.removeView(view);
        }
        if ((c8nw.A1H.A01() instanceof AbstractC219589n6) && !AbstractC185298Jv.A05(c8nw.A0r)) {
            return;
        }
        if (drawable == null) {
            c8nw.A04 = null;
            return;
        }
        Context context = c8nw.A0f;
        boolean A02 = AbstractC13620mo.A02(context);
        InteractiveDrawableContainer interactiveDrawableContainer = c8nw.A1l;
        C14360o3.A0B(context, 0);
        IgImageView igImageView = new IgImageView(context);
        igImageView.setBackgroundDrawable(context.getDrawable(R.drawable.clips_stacked_timeline_dotted_border));
        C14360o3.A07(drawable.copyBounds());
        BEd A00 = InteractiveDrawableContainer.A00(drawable, interactiveDrawableContainer);
        if (A00 != null) {
            f = ((C9LJ) A00).A03;
        } else {
            f = 0.0f;
        }
        Float A0P = interactiveDrawableContainer.A0P(drawable);
        if (A0P != null) {
            f2 = A0P.floatValue();
        } else {
            f2 = 0.0f;
        }
        float width = (r3.width() * f2) + 50.0f;
        float height = (r3.height() * f2) + 50.0f;
        Rect A0K = interactiveDrawableContainer.A0K(drawable);
        float exactCenterX = A0K.exactCenterX();
        float exactCenterY = A0K.exactCenterY();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C1H4.A01(width), C1H4.A01(height));
        int A01 = C1H4.A01(exactCenterX - (width / 2.0f));
        int A012 = C1H4.A01(exactCenterY - (height / 2.0f));
        int i2 = 0;
        if (A02) {
            layoutParams.setMargins(0, A012, igImageView.getResources().getDisplayMetrics().widthPixels - C1H4.A01(A01 + width), 0);
        } else {
            layoutParams.setMargins(A01, A012, 0, 0);
        }
        ((ViewGroup.LayoutParams) layoutParams).width = C1H4.A01(width);
        ((ViewGroup.LayoutParams) layoutParams).height = C1H4.A01(height);
        igImageView.setLayoutParams(layoutParams);
        igImageView.setRotation(f);
        if (!drawable.isVisible()) {
            i2 = 8;
        }
        igImageView.setVisibility(i2);
        c8nw.A04 = igImageView;
        if (drawable instanceof C5RM) {
            boolean A09 = ((C5RM) drawable).A09();
            View view2 = c8nw.A04;
            if (A09) {
                if (view2 != null) {
                    i = 0;
                    view2.setVisibility(i);
                }
            } else if (view2 != null) {
                i = 8;
                view2.setVisibility(i);
            }
        }
        c8nw.A0i.addView(c8nw.A04);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0O(Drawable drawable, C8NW c8nw) {
        if (drawable instanceof C5RP) {
            C5RP c5rp = (C5RP) drawable;
            if (c5rp.isLoading()) {
                c5rp.A9I(new C23670Ae5(drawable, c5rp, c8nw));
            } else {
                c8nw.A1l.A0k(drawable);
            }
        }
        c8nw.A19.Doe(drawable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01e1, code lost:
    
        if (r35 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00e5, code lost:
    
        if (r3.A03.A0G != true) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0P(android.graphics.drawable.Drawable r32, X.C8NW r33, int r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8NW.A0P(android.graphics.drawable.Drawable, X.8NW, int, boolean, boolean):void");
    }

    public static final void A0Q(C55U c55u, C8NW c8nw) {
        C8P7 c8p7 = (C8P7) A03(c8nw, C8P7.class);
        if (c8p7 != null) {
            if (C14360o3.A0K(c55u, C1811181n.A00)) {
                c8p7.A03 = true;
                c8p7.A0A.A00();
                c8nw.A1l.A0g(c8p7);
            } else {
                c8p7.A03 = false;
                c8nw.A1l.A0j(c8p7);
            }
        }
        C150286pc c150286pc = c8nw.A1N;
        if (c150286pc.A03) {
            C23630AdP c23630AdP = (C23630AdP) c150286pc.get();
            InterfaceC25221BDv A09 = A09(c55u, c8nw);
            if (!C14360o3.A0K(A09, c23630AdP.A06)) {
                c23630AdP.A06 = A09;
                C23630AdP.A02(c23630AdP);
            }
        }
        if (c8nw.A0q()) {
            c8nw.DOI();
        }
        C55U c55u2 = c8nw.A05;
        if (c55u2 != c55u) {
            C1811181n c1811181n = C1811181n.A00;
            if (!C14360o3.A0K(c55u2, c1811181n) && !C14360o3.A0K(c55u, c1811181n)) {
                c8nw.A1l.A0Z();
            }
            c8nw.A0g.clear();
            c8nw.A05 = c55u;
        }
        c8nw.A1l.setCameraDestination(c55u);
    }

    public static final void A0S(C8NW c8nw) {
        for (Drawable drawable : c8nw.A1l.getAllDrawables()) {
            C191478dz c191478dz = (C191478dz) c8nw.A1s.get();
            if (c191478dz != null) {
                c191478dz.A0M(drawable);
            }
            c8nw.EFB(drawable, false);
        }
        Iterator it = c8nw.A0n.A02.iterator();
        while (it.hasNext()) {
            ((C51760Mtj) it.next()).A00 = null;
        }
    }

    public static final void A0T(C8NW c8nw) {
        String str;
        String str2;
        UserSession userSession = c8nw.A0r;
        boolean A05 = AbstractC199308rX.A05(userSession, false);
        InterfaceC11380iw interfaceC11380iw = c8nw.A0o;
        String moduleName = interfaceC11380iw.getModuleName();
        Integer num = C05F.A0C;
        EnumC39584Hdu enumC39584Hdu = EnumC39584Hdu.A09;
        String str3 = c8nw.A1o;
        C14360o3.A0B(moduleName, 1);
        C14360o3.A0B(num, 2);
        C14360o3.A0B(enumC39584Hdu, 3);
        C14360o3.A0B(str3, 4);
        C16930sl c16930sl = C16930sl.A00;
        ShoppingTaggingFeedClientState shoppingTaggingFeedClientState = new ShoppingTaggingFeedClientState(c16930sl, c16930sl, c16930sl, c16930sl, c16930sl, c16930sl, c16930sl);
        C8AD c8ad = c8nw.A19;
        if (c8ad.CcJ(C8AE.A0g) && c8ad.CcJ(C8AE.A0e)) {
            str = null;
        } else {
            str = ((C23127AMf) c8nw.A1Z.get()).A07.A04;
        }
        List A0W = AbstractC001800i.A0W(AbstractC06950Ym.A1F(AbstractC16960so.A1Q(shoppingTaggingFeedClientState.A04, AbstractC16960so.A1O(str))));
        C14360o3.A0B(A0W, 0);
        shoppingTaggingFeedClientState.A04 = A0W;
        if (c8ad.CcJ(C8AE.A0G)) {
            str2 = null;
        } else {
            str2 = ((C23127AMf) c8nw.A1Z.get()).A07.A03;
        }
        shoppingTaggingFeedClientState.A00 = AbstractC16960so.A1O(str2);
        if (A05) {
            List A0W2 = AbstractC001800i.A0W(AbstractC06950Ym.A1F(AbstractC16960so.A1Q(shoppingTaggingFeedClientState.A06, A0E(c8nw))));
            C14360o3.A0B(A0W2, 0);
            shoppingTaggingFeedClientState.A06 = A0W2;
        }
        I6K.A00(userSession).A05(null, interfaceC11380iw.getModuleName(), C17060sy.A01.A01(userSession).A1u(), "stories");
        C1XJ c1xj = C1XJ.A00;
        AbstractC59962oe abstractC59962oe = c8nw.A0l;
        c1xj.A0j(abstractC59962oe, abstractC59962oe.requireActivity(), null, userSession, AbstractC41710Idg.A01(null, enumC39584Hdu, shoppingTaggingFeedClientState, null, num, null, null, null, moduleName, null, null, null, str3, null, A05), null, false, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0135, code lost:
    
        if (r0 != null) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0V(X.C8NW r20, X.C87J r21) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8NW.A0V(X.8NW, X.87J):void");
    }

    public static final void A0W(C8NW c8nw, C202548xY c202548xY) {
        A0Z(c8nw, C202548xY.class);
        InterfaceC1810081c interfaceC1810081c = c8nw.A1A;
        AlA alA = c202548xY.A05;
        C14360o3.A0C(alA, "null cannot be cast to non-null type com.instagram.reels.itakecare.model.ITakeCareStickerModel");
        interfaceC1810081c.E4u(new C188028Ut(alA));
    }

    public static final void A0X(C8NW c8nw, C41629IbK c41629IbK) {
        A0Z(c8nw, C220879pB.class);
        c8nw.A1A.E4u(new C187978Uo(c41629IbK));
    }

    public static final void A0Y(C8NW c8nw, C1816383s c1816383s) {
        String str;
        Integer num;
        String str2;
        List list;
        final UserSession userSession = c8nw.A0r;
        final Context context = c8nw.A0f;
        TargetViewSizeProvider targetViewSizeProvider = c8nw.A10;
        C14360o3.A0B(context, 1);
        C14360o3.A0B(c1816383s, 2);
        List A1Q = AbstractC16960so.A1Q("standalone_fundraiser_sticker_id", "multiple_avatar_standalone_sticker_id");
        if (C18U.A06(C06090Tz.A05, userSession, 36316607072703010L)) {
            Collections.rotate(A1Q, -1);
        }
        String str3 = null;
        final C194808jg A00 = AbstractC23051AEh.A00(context, userSession, targetViewSizeProvider, c1816383s, A1Q);
        if (c1816383s.A01 != null && C18U.A06(C06090Tz.A06, userSession, 36318423843608713L)) {
            final String string = context.getString(2131968483);
            A00.A0C(new C9PD(context, userSession, A00, string) { // from class: X.9jy
                @Override // X.C9PD, X.ACE
                public final boolean A01() {
                    return true;
                }
            });
            NewFundraiserInfo newFundraiserInfo = c1816383s.A01;
            FragmentActivity requireActivity = c8nw.A0l.requireActivity();
            if (newFundraiserInfo != null) {
                str = newFundraiserInfo.A01;
            } else {
                str = null;
            }
            str.getClass();
            if (newFundraiserInfo != null) {
                str3 = newFundraiserInfo.A07;
                num = Integer.valueOf(newFundraiserInfo.A00);
                str2 = newFundraiserInfo.A05;
                list = newFundraiserInfo.A08;
            } else {
                num = null;
                str2 = null;
                list = null;
            }
            AbstractC55224Oeq.A08(requireActivity, userSession, num, str, str3, str2, c8nw.A1o, list);
        }
        C148276lx c148276lx = C148276lx.A0a;
        c8nw.A1G(A00, AbstractC148296lz.A01(), c8nw.A15());
    }

    public static final void A0Z(C8NW c8nw, Class cls) {
        InteractiveDrawableContainer interactiveDrawableContainer = c8nw.A1l;
        Iterator it = interactiveDrawableContainer.A0T(cls).iterator();
        while (it.hasNext()) {
            AbstractC130945vi abstractC130945vi = (AbstractC130945vi) it.next();
            if (abstractC130945vi.A0A()) {
                c8nw.A0B = interactiveDrawableContainer.A0M(abstractC130945vi);
                InterfaceC08830cm interfaceC08830cm = c8nw.A1s;
                interfaceC08830cm.getClass();
                ((C191478dz) interfaceC08830cm.get()).A0M(abstractC130945vi);
                interactiveDrawableContainer.A0Q(abstractC130945vi);
            }
        }
    }

    public static final void A0a(C8NW c8nw, Integer num) {
        for (Drawable drawable : c8nw.A1p) {
            if (drawable instanceof C5RM) {
                ((C5RM) drawable).A03 = num;
            }
        }
    }

    public static final void A0b(C8NW c8nw, List list) {
        int A02 = A02(c8nw);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C51760Mtj c51760Mtj = (C51760Mtj) it.next();
            Drawable drawable = (Drawable) c51760Mtj.A00;
            BE5 be5 = (BE5) c51760Mtj.A02;
            if (drawable == null) {
                if (be5.Bzo() < A02) {
                    float BqP = (be5.BqP() * be5.CHe()) / 0.4f;
                    C148276lx c148276lx = (C148276lx) c51760Mtj.A01;
                    C194808jg A00 = C194808jg.A00(c8nw.A0f, null, null, c8nw.A0r, c148276lx, null);
                    C23108AGw c23108AGw = new C23108AGw();
                    c23108AGw.A0F = false;
                    c23108AGw.A06 = new C221639qS(17, 0.0f, 0.0f);
                    float BYd = be5.BYd() - 0.5f;
                    InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) c8nw.A10).A0K;
                    c23108AGw.A01(BYd * interfaceC1812882f.getWidth(), (be5.BYf() - 0.5f) * interfaceC1812882f.getHeight());
                    c23108AGw.A03 = be5.Bpb();
                    c23108AGw.A04 = BqP;
                    c23108AGw.A0B = Integer.valueOf((int) be5.Bzo());
                    c23108AGw.A09 = Integer.valueOf(Math.min((int) be5.B27(), A02));
                    int i = 1;
                    c23108AGw.A0H = true;
                    if (c8nw.A1S()) {
                        i = -2;
                    }
                    c23108AGw.A05 = i;
                    c8nw.A0x(A00, c148276lx, new C8FC(c23108AGw), null);
                    if (!c8nw.A1I.A0M()) {
                        C89Y c89y = c8nw.A0n;
                        c51760Mtj.A00 = c89y.A00;
                        c89y.A00 = null;
                    }
                }
            } else {
                float f = A02;
                if (be5.Bzo() >= f) {
                    C191478dz c191478dz = (C191478dz) c8nw.A1s.get();
                    if (c191478dz != null) {
                        c191478dz.A0M(drawable);
                    }
                    c8nw.EFB(drawable, false);
                    c51760Mtj.A00 = null;
                } else {
                    ((C5RM) drawable).Efo((int) be5.Bzo(), (int) Math.min(be5.B27(), f));
                }
            }
        }
    }

    public static final void A0c(C8NW c8nw, List list) {
        C6RB c6rb;
        Layout.Alignment alignment;
        C6S5 c6s5;
        C6RB c6rb2;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list);
            C01T.A1D(arrayList, B0U.A00);
            Iterator it = arrayList.iterator();
            C14360o3.A07(it);
            while (it.hasNext()) {
                Object next = it.next();
                C14360o3.A07(next);
                InterfaceC93104Fm interfaceC93104Fm = (InterfaceC93104Fm) next;
                Context context = c8nw.A0f;
                UserSession userSession = c8nw.A0r;
                C14360o3.A0B(interfaceC93104Fm, 0);
                C14360o3.A0B(context, 1);
                Editable newEditable = Editable.Factory.getInstance().newEditable(interfaceC93104Fm.getText());
                C190888ck A01 = AbstractC190898cl.A01(interfaceC93104Fm.C6K().A00, null, false);
                C14360o3.A0A(newEditable);
                AbstractC202958yD.A00(newEditable, A01);
                AbstractC190968cs abstractC190968cs = A01.A04;
                AbstractC202838y1.A02(context, newEditable, A01);
                int A00 = A01.A06.A00(context);
                boolean z = true;
                if (interfaceC93104Fm.isAnimated() == 1 && AbstractC190898cl.A09().contains(A01.A09)) {
                    AbstractC202988yG A012 = AbstractC23028ADk.A01(context, userSession, A01, A00);
                    A012.EUp(-1, (int) (interfaceC93104Fm.B27() - interfaceC93104Fm.Bzo()));
                    c6rb = A012;
                } else {
                    c6rb = new C6RB(context, A00);
                }
                ClipsTextAlignment Aar = interfaceC93104Fm.Aar();
                C14360o3.A0B(Aar, 0);
                int[] iArr = AbstractC22790A3i.A00;
                int ordinal = Aar.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 3) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    }
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
                c6rb.A0K(alignment);
                c6rb.A0L(newEditable);
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                float B7f = interfaceC93104Fm.B7f();
                RectF rectF = AbstractC13880nE.A01;
                c6rb.A0A(TypedValue.applyDimension(1, B7f, displayMetrics));
                c6rb.A0I(AbstractC15960qq.A00(context).A02(EnumC15950qp.A0z));
                c6rb.A09();
                Integer num = C05F.A01;
                c6rb.A0M = num;
                AbstractC202948yC.A00(null, A01, c6rb);
                AbstractC190978ct.A03(newEditable);
                ClipsTextEmphasisMode C6D = interfaceC93104Fm.C6D();
                C14360o3.A0B(C6D, 0);
                int ordinal2 = C6D.ordinal();
                if (ordinal2 != 5) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 6) {
                                c6s5 = C6S5.A05;
                            } else {
                                c6s5 = C6S5.A07;
                            }
                        } else {
                            c6s5 = C6S5.A08;
                        }
                    } else {
                        c6s5 = C6S5.A04;
                    }
                } else {
                    c6s5 = C6S5.A06;
                }
                AbstractC190978ct.A02(context, c6s5, abstractC190968cs, c6rb);
                if (AbstractC190978ct.A06(newEditable) || !AbstractC190978ct.A05(newEditable) || abstractC190968cs == null || !(abstractC190968cs instanceof C194978jy)) {
                    z = false;
                }
                AbstractC202898y7.A01(newEditable, A01, z);
                TextPaint textPaint = c6rb.A0b;
                C14360o3.A07(textPaint);
                AbstractC202928yA.A01(context, textPaint, newEditable, A01);
                int i = 0;
                for (InterfaceC93074Fh interfaceC93074Fh : interfaceC93104Fm.ApQ()) {
                    int count = i + interfaceC93074Fh.getCount();
                    int A0B = AbstractC13950nL.A0B(interfaceC93074Fh.getHexRgbaColor(), -16777216);
                    AbstractC190858ch.A03(context, newEditable, i, count, A0B, AbstractC13950nL.A04(A0B));
                    i = count;
                }
                c6rb.A0C(AHV.A00(context, newEditable, A01, c6rb, textPaint.getTextSize()), AHV.A01(context, newEditable, A01, c6rb, textPaint.getTextSize()));
                int i2 = C5RM.A0D;
                String obj = UUID.randomUUID().toString();
                C14360o3.A07(obj);
                C5RM c5rm = new C5RM(context, c6rb, obj);
                c5rm.A04 = interfaceC93104Fm.getId();
                if (interfaceC93104Fm.B27() >= interfaceC93104Fm.Bzo() && interfaceC93104Fm.B27() > 0.0f) {
                    c5rm.Efo((int) interfaceC93104Fm.Bzo(), (int) interfaceC93104Fm.B27());
                }
                boolean z2 = true;
                float f = AbstractC190898cl.A01(interfaceC93104Fm.C6K().A00, null, false).A06.A02;
                float BqP = interfaceC93104Fm.BqP();
                float Bpb = interfaceC93104Fm.Bpb();
                if (interfaceC93104Fm.isAnimated() != 1) {
                    z2 = false;
                }
                C8FC c8fc = new C8FC((C8D0) new C183748Cz(interfaceC93104Fm.BYd(), interfaceC93104Fm.BYf()), (C8FD) null, (C89G) null, num, (Integer) null, (Integer) null, (Object) "sticky_text_drawable_tag", (String) null, (List) null, -1.0f, f, BqP, -1.0f, Bpb, 0, true, false, true, true, false, false, z2, true, true, true, true, true, false, false);
                Drawable drawable = c5rm.A0A;
                if (A0s(drawable) && C18U.A06(C06090Tz.A05, userSession, 36317848318383748L)) {
                    C87P c87p = c8nw.A1J;
                    if (drawable instanceof C6RB) {
                        c6rb2 = (C6RB) drawable;
                    } else {
                        c6rb2 = null;
                    }
                    c87p.A01(c6rb2);
                }
                c8nw.AAW(c5rm, c8fc);
                ((C190398bx) c8nw.A1d.get()).A0c(c5rm);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0d(C8NW c8nw, List list) {
        ClipsCreationViewModel clipsCreationViewModel;
        C55U c55u = c8nw.A05;
        if (c55u != C208509Kk.A00 && c55u != C1811181n.A00) {
            Drawable A10 = c8nw.A10();
            List list2 = null;
            if (A10 != 0) {
                MusicOverlayStickerModel A00 = AbstractC23024ADg.A00(A10);
                if (A00 != null) {
                    String str = A00.A0S;
                    Object obj = null;
                    if (str != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (str.equals(((AudioOverlayTrack) next).A0A)) {
                                obj = next;
                                break;
                            }
                        }
                        AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) obj;
                        if (audioOverlayTrack != null) {
                            BEc A09 = AbstractC101614hW.A09(A10);
                            if (A09 != null) {
                                int i = ClipsCreationViewModel.A00(c8nw.A1G).A00;
                                int i2 = audioOverlayTrack.A03 - audioOverlayTrack.A04;
                                Integer valueOf = Integer.valueOf(i);
                                C23000ABz c23000ABz = new C23000ABz(A00);
                                c23000ABz.A0O = valueOf;
                                MusicOverlayStickerModel A002 = c23000ABz.A00();
                                Integer valueOf2 = Integer.valueOf(i2);
                                C23000ABz c23000ABz2 = new C23000ABz(A002);
                                c23000ABz2.A0K = valueOf2;
                                MusicOverlayStickerModel A003 = c23000ABz2.A00();
                                EnumC185288Jt enumC185288Jt = audioOverlayTrack.A05;
                                if (enumC185288Jt != null) {
                                    list2 = Collections.singletonList(new AudioFilterInfo(enumC185288Jt.A04));
                                    C14360o3.A07(list2);
                                }
                                C23000ABz c23000ABz3 = new C23000ABz(A003);
                                c23000ABz3.A0o = list2;
                                A09.DUc(c23000ABz3.A00());
                                if (A10 instanceof C5RO) {
                                    C5RO c5ro = (C5RO) A10;
                                    int i3 = audioOverlayTrack.A04;
                                    int i4 = audioOverlayTrack.A01;
                                    if (i4 != 0) {
                                        i = i4;
                                    }
                                    c5ro.Efo(i3, i);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    c8nw.A1l.A0Q(A10);
                    clipsCreationViewModel = c8nw.A1G;
                } else {
                    return;
                }
            } else {
                if (!list.isEmpty()) {
                    return;
                }
                clipsCreationViewModel = c8nw.A1G;
                if (clipsCreationViewModel.A0n()) {
                    return;
                }
            }
            clipsCreationViewModel.A0Z.Egh(null);
        }
    }

    public static final void A0e(C8NW c8nw, boolean z) {
        EnumC1810181d enumC1810181d;
        EnumC1810181d enumC1810181d2;
        EnumC1810181d enumC1810181d3;
        EnumC1810181d enumC1810181d4;
        EnumC1810181d enumC1810181d5;
        EnumC1810181d enumC1810181d6;
        EnumC1810181d enumC1810181d7;
        EnumC1810181d enumC1810181d8;
        EnumC1810181d enumC1810181d9;
        EnumC1810181d enumC1810181d10;
        EnumC1810181d enumC1810181d11;
        EnumC1810181d enumC1810181d12;
        EnumC1810181d enumC1810181d13;
        EnumC1810181d enumC1810181d14;
        EnumC1810181d enumC1810181d15;
        EnumC1810181d enumC1810181d16;
        EnumC1810181d enumC1810181d17;
        EnumC1810181d enumC1810181d18;
        InterfaceC1810081c interfaceC1810081c = c8nw.A1A;
        EnumC1810181d enumC1810181d19 = EnumC1810181d.A13;
        if (z) {
            enumC1810181d = EnumC1810181d.A0K;
        } else {
            enumC1810181d = EnumC1810181d.A0j;
        }
        interfaceC1810081c.A83(enumC1810181d19, enumC1810181d, C8UR.class);
        EnumC1810181d enumC1810181d20 = EnumC1810181d.A0d;
        if (z) {
            enumC1810181d2 = EnumC1810181d.A0K;
        } else {
            enumC1810181d2 = EnumC1810181d.A0j;
        }
        interfaceC1810081c.A83(enumC1810181d20, enumC1810181d2, C8UR.class);
        EnumC1810181d enumC1810181d21 = EnumC1810181d.A0u;
        if (z) {
            enumC1810181d3 = EnumC1810181d.A0K;
        } else {
            enumC1810181d3 = EnumC1810181d.A0j;
        }
        interfaceC1810081c.A83(enumC1810181d21, enumC1810181d3, C8UR.class);
        if (z) {
            enumC1810181d4 = EnumC1810181d.A0K;
        } else {
            enumC1810181d4 = EnumC1810181d.A0j;
        }
        interfaceC1810081c.A83(enumC1810181d21, enumC1810181d4, C188058Uw.class);
        if (z) {
            enumC1810181d5 = EnumC1810181d.A0K;
        } else {
            enumC1810181d5 = EnumC1810181d.A0j;
        }
        interfaceC1810081c.A83(enumC1810181d21, enumC1810181d5, C188068Ux.class);
        EnumC1810181d enumC1810181d22 = EnumC1810181d.A15;
        if (z) {
            enumC1810181d6 = EnumC1810181d.A0K;
        } else {
            enumC1810181d6 = EnumC1810181d.A0j;
        }
        interfaceC1810081c.A83(enumC1810181d22, enumC1810181d6, C8UR.class);
        if (z) {
            enumC1810181d7 = EnumC1810181d.A0K;
        } else {
            enumC1810181d7 = EnumC1810181d.A0j;
        }
        interfaceC1810081c.A83(enumC1810181d22, enumC1810181d7, C188058Uw.class);
        if (z) {
            enumC1810181d8 = EnumC1810181d.A0K;
        } else {
            enumC1810181d8 = EnumC1810181d.A0j;
        }
        interfaceC1810081c.A83(enumC1810181d22, enumC1810181d8, C188068Ux.class);
        EnumC1810181d enumC1810181d23 = EnumC1810181d.A1G;
        if (z) {
            enumC1810181d9 = EnumC1810181d.A0K;
        } else {
            enumC1810181d9 = EnumC1810181d.A0j;
        }
        interfaceC1810081c.A83(enumC1810181d23, enumC1810181d9, C8UR.class);
        if (z) {
            enumC1810181d10 = EnumC1810181d.A0K;
        } else {
            enumC1810181d10 = EnumC1810181d.A0j;
        }
        interfaceC1810081c.A83(enumC1810181d23, enumC1810181d10, C188058Uw.class);
        if (z) {
            enumC1810181d11 = EnumC1810181d.A0K;
        } else {
            enumC1810181d11 = EnumC1810181d.A0j;
        }
        interfaceC1810081c.A83(enumC1810181d23, enumC1810181d11, C188068Ux.class);
        EnumC1810181d enumC1810181d24 = EnumC1810181d.A0A;
        if (z) {
            enumC1810181d12 = EnumC1810181d.A0K;
        } else {
            enumC1810181d12 = EnumC1810181d.A0j;
        }
        interfaceC1810081c.A83(enumC1810181d24, enumC1810181d12, C8UR.class);
        if (z) {
            enumC1810181d13 = EnumC1810181d.A0K;
        } else {
            enumC1810181d13 = EnumC1810181d.A0j;
        }
        interfaceC1810081c.A83(enumC1810181d24, enumC1810181d13, C188058Uw.class);
        if (z) {
            enumC1810181d14 = EnumC1810181d.A0K;
        } else {
            enumC1810181d14 = EnumC1810181d.A0j;
        }
        interfaceC1810081c.A83(enumC1810181d24, enumC1810181d14, C187588Tb.class);
        EnumC1810181d enumC1810181d25 = EnumC1810181d.A14;
        if (z) {
            enumC1810181d15 = EnumC1810181d.A0K;
        } else {
            enumC1810181d15 = EnumC1810181d.A0j;
        }
        interfaceC1810081c.A83(enumC1810181d25, enumC1810181d15, C8UR.class);
        if (z) {
            enumC1810181d16 = EnumC1810181d.A0K;
        } else {
            enumC1810181d16 = EnumC1810181d.A0j;
        }
        interfaceC1810081c.A83(enumC1810181d25, enumC1810181d16, C188058Uw.class);
        if (z) {
            enumC1810181d17 = EnumC1810181d.A0K;
        } else {
            enumC1810181d17 = EnumC1810181d.A0j;
        }
        interfaceC1810081c.A83(enumC1810181d25, enumC1810181d17, C187588Tb.class);
        EnumC1810181d enumC1810181d26 = EnumC1810181d.A0o;
        if (z) {
            enumC1810181d18 = EnumC1810181d.A0K;
        } else {
            enumC1810181d18 = EnumC1810181d.A0j;
        }
        interfaceC1810081c.A83(enumC1810181d26, enumC1810181d18, C8UR.class);
    }

    private final void A0f(C202488xS c202488xS) {
        Boolean bool;
        boolean z = this.A0t.A08.A00 instanceof C81U;
        if (z) {
            C23031Ai A00 = AbstractC23021Ah.A00(this.A0r);
            A00.A5j.Egi(A00, true, C23031Ai.A8c[457]);
        }
        C24012Akq c24012Akq = null;
        if (c202488xS == null || (c24012Akq = c202488xS.A03) == null || (bool = c24012Akq.A00.A07) == null || bool.booleanValue()) {
            A0Z(this, C202488xS.class);
            this.A1A.E4u(new C188108Vb(c24012Akq, z));
        }
    }

    private final void A0g(PromptStickerModel promptStickerModel) {
        A0Z(this, C221009pO.class);
        this.A1A.E4u(new C188278Vs(promptStickerModel));
    }

    private final void A0h(C8P7 c8p7) {
        InterfaceC1810081c interfaceC1810081c;
        Object obj;
        C44063Jdo c44063Jdo;
        if (c8p7.A0B.A0L()) {
            interfaceC1810081c = this.A1A;
            obj = new Object();
        } else {
            C9LN c9ln = (C9LN) this.A1K.get();
            C44063Jdo c44063Jdo2 = c9ln.A0B;
            if (c44063Jdo2 != null) {
                C0fA.A00(c44063Jdo2, -910552982);
            }
            L10 A01 = C9LN.A01(c9ln);
            if (A01 != null && (c44063Jdo = c9ln.A0B) != null) {
                c44063Jdo.A02(A01, false);
            }
            interfaceC1810081c = this.A1A;
            obj = new Object();
        }
        interfaceC1810081c.E4u(obj);
    }

    private final void A0i(AbstractC220929pG abstractC220929pG) {
        List arrayList;
        A0k(AbstractC220929pG.class);
        InterfaceC1810081c interfaceC1810081c = this.A1A;
        AlD alD = abstractC220929pG.A0D;
        if (alD != null) {
            arrayList = alD.A06();
        } else {
            arrayList = new ArrayList();
        }
        boolean z = this.A0t.A08.A00 instanceof C81U;
        boolean contains = arrayList.contains(QuestionResponseType.A05);
        arrayList.contains(QuestionResponseType.A06);
        interfaceC1810081c.E4u(new C187838Ua(alD, z, contains, !arrayList.isEmpty()));
    }

    private final void A0j(User user) {
        String AnC;
        if (this.A0d && !AbstractC23051AEh.A01(this.A1l) && user.A03.AnC() != null && AbstractC54909OQg.A01(user)) {
            UserSession userSession = this.A0r;
            InterfaceC81733ki AYu = C17060sy.A01.A01(userSession).A03.AYu();
            if (AYu != null) {
                Iterator it = AYu.B9F().iterator();
                while (it.hasNext()) {
                    if (C2I7.A00(((InterfaceC43571JMf) it.next()).AnD(), user.getUsername())) {
                        return;
                    }
                }
            }
            if (!C18U.A06(C06090Tz.A05, userSession, 36317959987468000L) || (AnC = user.A03.AnC()) == null) {
                return;
            }
            String id = user.getId();
            AbstractC55215Oed.A06(this.A0o, userSession, "STICKER_TRAY", id);
            Context context = this.A0f;
            AOW aow = new AOW(this, user, id, AnC);
            AOH aoh = new AOH(this, id);
            C193328hC c193328hC = new C193328hC(context);
            c193328hC.A0j(context.getDrawable(R.drawable.ig_illustrations_illo_donations_refresh));
            c193328hC.A0A(2131956953);
            c193328hC.A0r(AbstractC07900bA.A01(context.getResources(), new String[]{user.getUsername()}, 2131956950));
            c193328hC.A0K(aow, 2131956952);
            c193328hC.A0I(aoh, 2131956951);
            C0fJ.A00(c193328hC.A02());
            this.A0d = false;
        }
    }

    private final void A0k(Class cls) {
        InteractiveDrawableContainer interactiveDrawableContainer = this.A1l;
        Iterator it = interactiveDrawableContainer.A0T(cls).iterator();
        while (it.hasNext()) {
            AbstractC130945vi abstractC130945vi = (AbstractC130945vi) it.next();
            if (abstractC130945vi.A0A()) {
                this.A0B = interactiveDrawableContainer.A0M(abstractC130945vi);
                UserSession userSession = this.A0r;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36323238501952604L)) {
                    if (V9Y.class.isAssignableFrom(cls) || C202468xQ.class.isAssignableFrom(cls)) {
                        if (!C18U.A06(c06090Tz, userSession, 36323238502083678L)) {
                        }
                    }
                }
                InterfaceC08830cm interfaceC08830cm = this.A1s;
                interfaceC08830cm.getClass();
                ((C191478dz) interfaceC08830cm.get()).A0M(abstractC130945vi);
                interactiveDrawableContainer.A0Q(abstractC130945vi);
            }
        }
    }

    private final void A0l(HashMap hashMap, HashMap hashMap2) {
        if (this.A0X) {
            this.A0X = false;
            UserSession userSession = this.A0r;
            hashMap.put(MSV.A00(1706), String.valueOf(C18U.A06(C06090Tz.A05, userSession, 36317332922438738L)));
            if (hashMap2.get("initial_price") == null) {
                hashMap2.put("initial_price", "0");
            }
            FragmentActivity requireActivity = this.A0l.requireActivity();
            IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
            igBloksScreenConfig.A05 = new AbstractC69784VvL() { // from class: X.9fd
                @Override // X.AbstractC69784VvL
                public final void A00() {
                    C8NW.this.A0X = true;
                }
            };
            C66277U6x A02 = C66277U6x.A02(MSV.A00(1037), hashMap, hashMap2);
            C14360o3.A0A(A02);
            new C6XJ(requireActivity, W6d.A00(igBloksScreenConfig, A02), userSession, ModalActivity.class, "bloks").A0C(requireActivity);
        }
    }

    private final void A0m(boolean z) {
        UserSession userSession = this.A0r;
        C006802i.A0p.markerStart(31789744);
        Bundle bundle = new Bundle();
        bundle.putString(MSV.A00(345), "STORY");
        bundle.putBoolean(MSV.A00(783), true);
        bundle.putBoolean(MSV.A00(782), z);
        try {
            C1816783z c1816783z = this.A13.A02;
            if (c1816783z.A01() == EnumC198268pb.A04) {
                C183978Ee A03 = c1816783z.A01.A03();
                A03.getClass();
                double[] A04 = AbstractC209859Pw.A04(new C60782q2(A03.A06()));
                if (A04 != null) {
                    Location location = new Location("media_exif");
                    location.setLatitude(A04[0]);
                    location.setLongitude(A04[1]);
                    bundle.putParcelable(MSV.A00(781), location);
                }
            }
        } catch (IOException e) {
            C0K8.A0F("StickerOverlayController", "Failed to read exif location", e);
        }
        AbstractC59962oe abstractC59962oe = this.A0l;
        Object A00 = AbstractC13320mI.A00(abstractC59962oe.getContext(), Activity.class);
        A00.getClass();
        new C6XJ((Activity) A00, bundle, userSession, ModalActivity.class, AbstractC111324zv.A00(468)).A0D(abstractC59962oe, 2);
    }

    private final void A0n(boolean z) {
        if (z) {
            ((C9LN) this.A1K.get()).A0L(null);
            return;
        }
        C186318Nz c186318Nz = this.A2L;
        final B8U b8u = new B8U(this, 47);
        C25621Ms c25621Ms = new C25621Ms(c186318Nz.A00.A00, -2);
        c25621Ms.A06();
        c25621Ms.A0B("creatives/avatar_sticker_info/");
        c25621Ms.A0R(C214319eV.class, ADD.class);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new C1P1() { // from class: X.9gD
            @Override // X.C1P1
            public final void onFail(AbstractC115105If abstractC115105If) {
                int A0N2 = AbstractC167017dG.A0N(abstractC115105If, -579704926);
                super.onFail(abstractC115105If);
                InterfaceC16660sJ.this.invoke(null);
                C0f9.A0A(-1306173542, A0N2);
            }

            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                int A03 = C0f9.A03(-679600576);
                C214319eV c214319eV = (C214319eV) obj;
                int A0N2 = AbstractC167017dG.A0N(c214319eV, -920990460);
                super.onSuccess(c214319eV);
                InterfaceC16660sJ interfaceC16660sJ = InterfaceC16660sJ.this;
                C9ZA c9za = c214319eV.A00;
                if (c9za == null) {
                    C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
                    throw C00O.createAndThrow();
                }
                interfaceC16660sJ.invoke(c9za);
                C0f9.A0A(-578944553, A0N2);
                C0f9.A0A(901332954, A03);
            }
        };
        C1GJ.A03(A0N);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if (r0.A0E == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r0.A0M == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r1 != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A0o() {
        /*
            r4 = this;
            X.Abo r1 = new X.Abo
            r1.<init>(r4)
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r4.A1l
            java.util.ArrayList r0 = r0.A0R(r1)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L60
            com.instagram.common.session.UserSession r3 = r4.A0r
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36319909902819140(0x8108c400081f44, double:3.032195498856723E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L62
            X.840 r0 = r4.A13
            X.83z r2 = r0.A02
            X.8pb r1 = r2.A01()
            X.8pb r0 = X.EnumC198268pb.A04
            r3 = 0
            if (r1 != r0) goto L30
            r3 = 1
        L30:
            X.83h r0 = r2.A01
            X.8Ee r0 = r0.A03()
            if (r0 == 0) goto L3d
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A0E
            r2 = 1
            if (r0 != 0) goto L3e
        L3d:
            r2 = 0
        L3e:
            X.85e r0 = r4.A0m
            X.85h r0 = r0.A00()
            X.8ty r0 = r0.AXl()
            if (r0 == 0) goto L4f
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A0M
            r1 = 1
            if (r0 != 0) goto L50
        L4f:
            r1 = 0
        L50:
            if (r2 != 0) goto L55
            r0 = 0
            if (r1 == 0) goto L56
        L55:
            r0 = 1
        L56:
            if (r3 == 0) goto L62
            if (r0 != 0) goto L62
            boolean r0 = r4.A1T()
            if (r0 != 0) goto L62
        L60:
            r0 = 1
            return r0
        L62:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8NW.A0o():boolean");
    }

    private final boolean A0p() {
        for (Drawable drawable : this.A1l.getAllDrawables()) {
            if (drawable instanceof C5RM) {
                Drawable drawable2 = ((C5RM) drawable).A0A;
                if ((drawable2 instanceof C210399Se) && ((C210399Se) drawable2).A0C == EnumC222999se.A06) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean A0q() {
        Integer num = this.A0D;
        if (num != null) {
            InterfaceC143326dX interfaceC143326dX = this.A18;
            if (!interfaceC143326dX.CKf() || interfaceC143326dX.AYo() == this) {
                switch (num.intValue()) {
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    case Process.SIGTERM /* 15 */:
                        return true;
                    case 14:
                    default:
                        return false;
                }
            }
        }
        return false;
    }

    private final boolean A0r() {
        int i;
        C8AD c8ad = this.A19;
        if (!c8ad.CcJ(C8AE.A0b)) {
            Context context = this.A0f;
            C14360o3.A0B(context, 0);
            C9GR.A07(context, 2131968009);
        } else {
            UserSession userSession = this.A0r;
            SoundPlatformProduct soundPlatformProduct = SoundPlatformProduct.A0H;
            if (IRU.A01(soundPlatformProduct, userSession)) {
                if (this.A09 == null) {
                    this.A09 = new C30S();
                }
                String A00 = IRU.A00(soundPlatformProduct, userSession);
                this.A0H = A00;
                C30S c30s = this.A09;
                if (c30s != null) {
                    c30s.A00(this.A0f, A00, true);
                    return false;
                }
            } else {
                if (CZ3()) {
                    return true;
                }
                if (!c8ad.CcJ(C8AE.A08)) {
                    i = 2131967972;
                } else if (!c8ad.CcJ(C8AE.A0Z)) {
                    i = 2131967971;
                } else {
                    i = 0;
                    if (!c8ad.CcJ(C8AE.A0l)) {
                        i = 2131974033;
                    }
                    this.A0H = this.A0f.getString(i, Locale.ENGLISH);
                    return false;
                }
                C9GR.A07(this.A0f, i);
                this.A0H = this.A0f.getString(i, Locale.ENGLISH);
                return false;
            }
        }
        return false;
    }

    public static final boolean A0s(Drawable drawable) {
        if (!(drawable instanceof AbstractC202988yG) && !AbstractC209069Mo.A03(drawable)) {
            return false;
        }
        return true;
    }

    public static final boolean A0t(C8AG c8ag, C8NW c8nw, boolean z) {
        for (C8AG c8ag2 : AbstractC16960so.A1Q(C8AE.A0A, C8AE.A0T, C8AE.A0R, C8AE.A0S, C8AE.A0W, C8AE.A0C, C8AE.A0n, C8AE.A0h, C8AE.A0K, C8AE.A0b)) {
            if (c8ag2 != c8ag && !c8nw.A19.CcJ(c8ag2)) {
                if (z) {
                    Context context = c8nw.A0f;
                    C14360o3.A0B(context, 0);
                    C9GR.A07(context, 2131968997);
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean A0v(C8NW c8nw) {
        if (!(c8nw.A0t.A08.A00 instanceof C81V)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int A0w(Drawable drawable, C5GJ c5gj, MusicOverlayStickerModel musicOverlayStickerModel, C8FC c8fc, Product product, String str, String str2, String str3, String str4, List list) {
        Rect bounds;
        VHl A01;
        String str5;
        String str6;
        EnumC114925Hg enumC114925Hg;
        C44063Jdo c44063Jdo;
        boolean z;
        C6RL c6rl;
        MusicOverlayStickerModel musicOverlayStickerModel2 = musicOverlayStickerModel;
        C14360o3.A0B(drawable, 1);
        C14360o3.A0B(c8fc, 2);
        C14360o3.A0B(c5gj, 3);
        boolean z2 = drawable instanceof C216269hj;
        if (z2 && ((C216269hj) drawable).A08() == EnumC40111tc.A0a.A00) {
            c8fc.A08 = this.A0x;
        }
        int A012 = A01(drawable, this, c8fc, str, str2, str3, list);
        if (drawable instanceof AbstractC220929pG) {
            AbstractC220929pG abstractC220929pG = (AbstractC220929pG) drawable;
            boolean z3 = abstractC220929pG instanceof C221179pf;
            if (z3) {
                z = ((C221179pf) abstractC220929pG).A00;
            } else {
                z = ((C221189pg) abstractC220929pG).A00;
            }
            if (z) {
                if (z3) {
                    c6rl = ((C221179pf) abstractC220929pG).A02;
                } else {
                    c6rl = ((C221189pg) abstractC220929pG).A03;
                }
                c6rl.A01();
            }
        }
        if (drawable instanceof C220829p6) {
            ((C220829p6) drawable).A08.A01();
        }
        if (z2) {
            C216269hj c216269hj = (C216269hj) drawable;
            if (c216269hj.A08() == EnumC40111tc.A0a.A00) {
                Drawable drawable2 = c216269hj.A01;
                C14360o3.A0C(drawable2, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.VideoStickerDrawable");
                int i = c216269hj.getBounds().left;
                int i2 = c216269hj.getBounds().top;
                int i3 = c216269hj.A04.A01;
                drawable2.setBounds(i, i2 + i3, c216269hj.A02 + c216269hj.getBounds().left, c216269hj.A00 + c216269hj.getBounds().top + i3);
                C89F c89f = this.A0x;
                c89f.A08 = drawable;
                Context context = this.A0f;
                Drawable drawable3 = c216269hj.A01;
                drawable3.getClass();
                c89f.A0A(context, (C210399Se) drawable3, 1.0f, 0.0f, 15000);
                c89f.Cy8(C05F.A01, false);
            }
        }
        if (drawable instanceof C8P8) {
            C8P8 c8p8 = (C8P8) drawable;
            PromptStickerModel BUK = c8p8.BUK();
            if (!BUK.A0A && (!BUK.A0B ? BUK.A0L() : !BUK.A0L())) {
                c8p8.Ekz();
            }
        }
        if ((drawable instanceof C8P7) && A1V()) {
            C150286pc c150286pc = this.A1K;
            if (c150286pc.A03 && (c44063Jdo = ((C9LN) c150286pc.get()).A0B) != null) {
                C0fA.A00(c44063Jdo, -883493503);
            }
        }
        if (drawable instanceof V9Y) {
            V9Y v9y = (V9Y) drawable;
            v9y.A05 = true;
            v9y.A01 = System.currentTimeMillis();
            v9y.invalidateSelf();
        }
        boolean z4 = drawable instanceof C194808jg;
        if (z4) {
            C194808jg c194808jg = (C194808jg) drawable;
            c194808jg.A07();
            if (c194808jg.A0E(C220949pI.class) && this.A1A.Cap()) {
                ((C220949pI) c194808jg.A06(C220949pI.class).get(0)).A03.A01();
            }
            if (c194808jg.A04() instanceof C220959pJ) {
                Drawable A04 = c194808jg.A04();
                C14360o3.A0C(A04, "null cannot be cast to non-null type com.instagram.reels.notifyme.view.NotifyMeStickerV2Drawable");
                ((C220959pJ) A04).A0G.A01();
            }
            ArrayList A06 = c194808jg.A06(C202588xc.class);
            if (!A06.isEmpty()) {
                Iterator it = A06.iterator();
                while (it.hasNext()) {
                    C202588xc c202588xc = (C202588xc) it.next();
                    c202588xc.A04();
                    if (c202588xc.A0M == EnumC150226pU.A0C) {
                        if (C18U.A06(C06090Tz.A05, this.A0r, 36323139717704738L)) {
                            A0R(c194808jg, c202588xc);
                            c194808jg.A09();
                        }
                    }
                }
            }
        }
        if (drawable instanceof C220879pB) {
            ((C220879pB) drawable).A09.A01();
        }
        if ((drawable instanceof C220839p7) && this.A1A.Cae()) {
            C220839p7 c220839p7 = (C220839p7) drawable;
            if (c220839p7.A0D) {
                c220839p7.A0B.A01();
            }
        }
        if (drawable instanceof C217759k8) {
            C217759k8 c217759k8 = (C217759k8) drawable;
            this.A0x.A09(this.A0f, c217759k8.A02, (C210399Se) drawable, 0.0f, 0.0f, c8fc.A04, c217759k8.A00, c217759k8.A01, c8fc.A03, c217759k8.A08, true);
        } else if (drawable instanceof C210399Se) {
            C210399Se c210399Se = (C210399Se) drawable;
            float f = c8fc.A04;
            C14360o3.A0B(c210399Se, 0);
            float f2 = c210399Se.getBounds().left;
            float f3 = c210399Se.getBounds().top;
            C206169Az c206169Az = c210399Se.A03;
            boolean z5 = c210399Se.A06;
            C14360o3.A0B(c206169Az, 4);
            Medium medium = c210399Se.A0B;
            C89F c89f2 = this.A0x;
            float f4 = c89f2.A04;
            C14360o3.A0B(medium, 0);
            C22915A8l c22915A8l = new C22915A8l(medium, f4, 15000, true);
            Context context2 = this.A0f;
            C14360o3.A0B(context2, 0);
            c89f2.A09 = c210399Se;
            AnonymousClass874 anonymousClass874 = c89f2.A0R;
            if (!anonymousClass874.A04) {
                anonymousClass874.A04 = true;
                AnonymousClass874.A00(anonymousClass874, false);
            }
            c89f2.Cy8(anonymousClass874.A01(), false);
            c210399Se.A00 = c22915A8l.A00;
            c210399Se.A05 = c89f2;
            SimpleVideoLayout simpleVideoLayout = c89f2.A0T;
            ViewGroup.LayoutParams layoutParams = simpleVideoLayout.getLayoutParams();
            if (layoutParams != null) {
                Rect bounds2 = c210399Se.getBounds();
                C14360o3.A07(bounds2);
                int width = bounds2.width();
                int height = bounds2.height();
                layoutParams.width = width;
                layoutParams.height = height;
                simpleVideoLayout.setLayoutParams(layoutParams);
                c89f2.A02 = f2;
                c89f2.A03 = f3;
                c89f2.A00 = 0.0f;
                c89f2.A01 = 0.0f;
                RoundedCornerFrameLayout roundedCornerFrameLayout = c89f2.A0U;
                roundedCornerFrameLayout.setX(f2);
                roundedCornerFrameLayout.setY(f3);
                Drawable drawable4 = c89f2.A08;
                if (drawable4 != null && (bounds = drawable4.getBounds()) != null) {
                    roundedCornerFrameLayout.setPivotX(bounds.exactCenterX() - c89f2.A02);
                    roundedCornerFrameLayout.setPivotY(bounds.exactCenterY() - c89f2.A03);
                }
                roundedCornerFrameLayout.setTranslationX(f2 + 0.0f);
                roundedCornerFrameLayout.setTranslationY(f3 + 0.0f);
                roundedCornerFrameLayout.setRotation(0.0f);
                float f5 = f;
                if (z5) {
                    f5 = -f;
                }
                roundedCornerFrameLayout.setScaleX(f5);
                roundedCornerFrameLayout.setScaleY(f);
                roundedCornerFrameLayout.A01(c206169Az.A02, c206169Az.A03, c206169Az.A00, c206169Az.A01);
                roundedCornerFrameLayout.setVisibility(0);
                simpleVideoLayout.setVisibility(0);
                c89f2.A0G.setVisibility(8);
                c89f2.A0I.setVisibility(8);
                c89f2.A0H.setVisibility(8);
                c89f2.A0P.A03(context2, c22915A8l, simpleVideoLayout);
            }
        }
        if (drawable instanceof C220939pH) {
            C50699MZu A00 = AbstractC50666MYj.A00(this.A0r);
            C18920wW c18920wW = A00.A04;
            InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, MSV.A00(52));
            A002.A8R(EnumC53368NjJ.BIO_IG_STORY, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A002.AAP("seller_igid", A00.A05.userId);
            A002.AAP("event", "seller_view_bio_sticker_created");
            A002.Cht();
        }
        SparseArray sparseArray = this.A0g;
        C5NG c5ng = (C5NG) sparseArray.get(A012);
        Product product2 = null;
        if (c5ng == null) {
            A01 = null;
            str5 = null;
        } else {
            A01 = AHR.A01(c5ng.A04, c5ng.A05);
            str5 = c5ng.A05;
        }
        int i4 = 1;
        if (C14360o3.A0K(str5, EnumC150226pU.A04.toString())) {
            i4 = 8;
        }
        InterfaceC1810081c interfaceC1810081c = this.A1A;
        if (interfaceC1810081c.Cae()) {
            C5NG c5ng2 = (C5NG) sparseArray.get(A012);
            if (c5ng2 != null) {
                str6 = c5ng2.A00();
            } else {
                str6 = null;
            }
            C22C A013 = AnonymousClass229.A01(this.A0r);
            EnumC50631MWs A12 = A12();
            if (product == null) {
                Drawable drawable5 = drawable;
                if (z4) {
                    drawable5 = ((C194808jg) drawable5).A04();
                }
                if (drawable5 instanceof AbstractC202348xE) {
                    product2 = ((AbstractC202348xE) drawable5).A01();
                } else if (drawable5 instanceof C202388xI) {
                    product2 = ((C202388xI) drawable5).A07;
                }
            } else {
                product2 = product;
            }
            if (musicOverlayStickerModel == null) {
                musicOverlayStickerModel2 = AbstractC23024ADg.A00(drawable);
            }
            C5JK c5jk = this.A13.A02.A01.A0h;
            if (c5jk != null && c5jk.ordinal() == 1) {
                enumC114925Hg = EnumC114925Hg.FEED;
            } else {
                enumC114925Hg = null;
            }
            A013.A0s(c5gj, enumC114925Hg, A12, A01, musicOverlayStickerModel2, product2, str6, str4, i4);
        }
        interfaceC1810081c.E4u(new Object());
        return A012;
    }

    public final Drawable A10() {
        ArrayList A0R = this.A1l.A0R(C194768jc.A00);
        C14360o3.A0B(A0R, 0);
        return (Drawable) AbstractC001800i.A0J(A0R);
    }

    public final Spannable A11() {
        if (this.A05 == C208509Kk.A00) {
            C150286pc c150286pc = this.A1c;
            if (c150286pc.A03) {
                return ((UQN) C70827Whk.A00((C70827Whk) c150286pc.get()).A08.getValue()).A01;
            }
            return null;
        }
        return null;
    }

    public final EnumC50631MWs A12() {
        return AbstractC50677MYv.A08(this.A0t.A0A(), !this.A1A.Cae());
    }

    public final C194808jg A13() {
        Object obj;
        Iterator it = this.A1l.A0T(C194808jg.class).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C194808jg) obj).A0E(C202598xd.class)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C194808jg) obj;
    }

    public final C6RB A14() {
        C150286pc c150286pc = this.A1d;
        if (c150286pc.A03) {
            return ((C190398bx) c150286pc.get()).A0L;
        }
        return null;
    }

    public final C23108AGw A15() {
        C23108AGw c23108AGw = new C23108AGw();
        c23108AGw.A0F = true;
        c23108AGw.A0H = true;
        c23108AGw.A00 = 1.5f;
        c23108AGw.A01 = 0.25f;
        c23108AGw.A06 = this.A07.AzT();
        c23108AGw.A0P = true;
        c23108AGw.A0C = "StickerOverlayController";
        return c23108AGw;
    }

    /* JADX WARN: Code restructure failed: missing block: B:536:0x0ca7, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) == false) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0ca9, code lost:
    
        r0.A1X = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x0cd3, code lost:
    
        if (r3.length() != 0) goto L429;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList A16() {
        /*
            Method dump skipped, instructions count: 6094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8NW.A16():java.util.ArrayList");
    }

    public final ArrayList A17() {
        String str;
        EnumC75383a5 enumC75383a5;
        List A06;
        C22P c22p = this.A0k;
        InteractiveDrawableContainer interactiveDrawableContainer = this.A1l;
        java.util.Set A0F = A0F(this);
        C138436Oz c138436Oz = C138436Oz.A00;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : interactiveDrawableContainer.A0V(Drawable.class).entrySet()) {
            Drawable drawable = (Drawable) entry.getKey();
            C202278x7 c202278x7 = (C202278x7) entry.getValue();
            C84823qW c84823qW = new C84823qW();
            C138436Oz c138436Oz2 = C138436Oz.A00;
            C138436Oz.A01(drawable, c84823qW, interactiveDrawableContainer, c202278x7, false, false);
            Object A0B = c138436Oz2.A0B(drawable);
            String str2 = "rollcall_v2_timestamp_sticker";
            String str3 = "date_sticker";
            String str4 = "memories";
            String str5 = "";
            boolean z = false;
            if (A0B instanceof C202588xc) {
                C202588xc c202588xc = (C202588xc) A0B;
                switch (c202588xc.A0M.ordinal()) {
                    case 4:
                    case 5:
                    case 9:
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    case 22:
                    case 108:
                        break;
                    case 18:
                        str3 = "cutout_photo";
                        z = true;
                        break;
                    default:
                        C148286ly c148286ly = c202588xc.A0L;
                        if (c148286ly.A0J == null && c148286ly.A0K == null && !C138436Oz.A01.contains(c148286ly.A0S)) {
                            str3 = "";
                            break;
                        }
                        break;
                }
                C148286ly c148286ly2 = c202588xc.A0L;
                str2 = c148286ly2.A0S;
                if (!z) {
                    str3 = c148286ly2.A0U;
                }
                str = null;
                c84823qW.A1j = str2;
                c84823qW.A1i = str3;
                c84823qW.A1m = str;
                c84823qW.A1Z = str5;
                arrayList.add(c84823qW);
            } else {
                if (A0B instanceof C74P) {
                    C74P c74p = (C74P) A0B;
                    EnumC150226pU enumC150226pU = c74p.A0d;
                    if (enumC150226pU != EnumC150226pU.A0G && enumC150226pU != EnumC150226pU.A0A) {
                        if (enumC150226pU == EnumC150226pU.A0M) {
                            str4 = "cutout_video";
                            str3 = str4;
                            str2 = "";
                            str = null;
                            str5 = null;
                        } else {
                            str2 = c74p.A0k;
                            if (A0F == null || !A0F.contains(Integer.valueOf(c202278x7.A08))) {
                                str3 = "gif";
                                str = null;
                                str5 = null;
                            } else {
                                str = c202278x7.A0C;
                                str3 = "gif";
                                str5 = null;
                            }
                        }
                    }
                } else {
                    if (A0B instanceof InterfaceC202708xo) {
                        str2 = ((InterfaceC202708xo) A0B).getId();
                        if (!(A0B instanceof C9ST) || !((C9ST) A0B).A03) {
                            str3 = "time";
                        }
                    } else if (A0B instanceof C202288x8) {
                        if (c22p == C22P.A3Q) {
                            str2 = EnumC150226pU.A0z.toString();
                            str3 = str2;
                        } else {
                            str2 = ((C202288x8) A0B).A08;
                        }
                    } else if (A0B instanceof C202298x9) {
                        str3 = str4;
                        str2 = "";
                    } else if (A0B instanceof C202718xp) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("emoji_");
                        sb.append((Object) ((C6RB) A0B).A0F);
                        str2 = sb.toString();
                        str3 = "emoji";
                    } else if (A0B instanceof C202728xq) {
                        str2 = ((C202728xq) A0B).A0G;
                        if (C14360o3.A0K(str2, "rollcall_v2_photo_sticker")) {
                            str3 = "rollcall_v2_media_sticker";
                        } else {
                            str3 = "local_image_sticker";
                        }
                        if (A0F != null && A0F.contains(Integer.valueOf(c202278x7.A08))) {
                            str = c202278x7.A0C;
                            str5 = null;
                        }
                    } else if (A0B instanceof BE6) {
                        C22923A8t BmU = ((BE6) A0B).BmU();
                        if (BmU != null) {
                            str2 = BmU.A00;
                        } else {
                            str2 = null;
                        }
                        str3 = "mention";
                    } else {
                        if (A0B instanceof C202668xk) {
                            str3 = "";
                            if (c22p == C22P.A0O) {
                                str3 = "memories";
                            }
                        } else if (A0B instanceof C210399Se) {
                            str2 = ((C210399Se) A0B).A0D;
                            if (!C14360o3.A0K(str2, "gallery_story_video_sticker")) {
                                str3 = "";
                                if (C14360o3.A0K(str2, "rollcall_v2_video_sticker")) {
                                    str3 = "rollcall_v2_media_sticker";
                                }
                            } else {
                                str3 = EnumC150226pU.A0c.toString();
                            }
                        } else if (A0B instanceof C5RU) {
                            C5RU c5ru = (C5RU) A0B;
                            str2 = c5ru.A05().BlQ().A00();
                            str3 = EnumC150226pU.A0s.toString();
                            C66646URk A05 = c5ru.A05();
                            if (A05.A08) {
                                enumC75383a5 = EnumC75383a5.A0H;
                            } else {
                                enumC75383a5 = EnumC75383a5.A0h;
                            }
                            c84823qW.A12 = enumC75383a5;
                            c84823qW.A0j = A05;
                            if (drawable instanceof C5RM) {
                                C5RM c5rm = (C5RM) drawable;
                                c84823qW.A1L = Float.valueOf(c5rm.A01);
                                c84823qW.A1K = Float.valueOf(c5rm.A00);
                            }
                        } else {
                            if (A0B instanceof C9SK) {
                                str2 = EnumC150226pU.A1O.toString();
                                ReelsVisualRepliesModel reelsVisualRepliesModel = ((C9SK) A0B).A01;
                                c84823qW.A12 = EnumC75383a5.A18;
                                c84823qW.A0K = reelsVisualRepliesModel.A00;
                            } else if (A0B instanceof AbstractC220929pG) {
                                AlD alD = ((AbstractC220929pG) A0B).A0D;
                                if (alD == null || (A06 = alD.A06()) == null || !(!A06.isEmpty())) {
                                    str2 = "";
                                } else {
                                    str2 = "expressive_question";
                                }
                                str3 = "question";
                            } else if (A0B instanceof BCC) {
                                str3 = "question_reshare";
                                if (A0B instanceof C216269hj) {
                                    str2 = "question_response_reshare_media";
                                } else if (A0B instanceof C221199ph) {
                                    str2 = "question_response_reshare_text";
                                } else if (A0B instanceof BEb) {
                                    str2 = "question_response_reshare_music";
                                }
                            } else if (!(A0B instanceof C202528xW)) {
                                if (A0B instanceof C6RB) {
                                    str2 = AnonymousClass001.A0R("text_sticker_", c202278x7.A0C);
                                    c84823qW.A12 = EnumC75383a5.A0L;
                                    c84823qW.A1A = (C6RB) A0B;
                                    if (drawable instanceof C5RM) {
                                        C5RM c5rm2 = (C5RM) drawable;
                                        c84823qW.A1L = Float.valueOf(c5rm2.A01);
                                        c84823qW.A1K = Float.valueOf(c5rm2.A00);
                                    }
                                    str3 = "text_sticker";
                                }
                            }
                            str3 = str2;
                        }
                        str2 = str3;
                    }
                    str = null;
                    str5 = null;
                }
                c84823qW.A1j = str2;
                c84823qW.A1i = str3;
                c84823qW.A1m = str;
                c84823qW.A1Z = str5;
                arrayList.add(c84823qW);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0128  */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.55m] */
    /* JADX WARN: Type inference failed for: r14v1, types: [X.55o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, X.55m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList A18() {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8NW.A18():java.util.ArrayList");
    }

    public final LinkedHashMap A1A() {
        boolean z;
        Object obj = this.A0t.A08.A00;
        final InteractiveDrawableContainer interactiveDrawableContainer = this.A1l;
        UserSession userSession = this.A0r;
        if (C8Q2.A01(interactiveDrawableContainer) && (((obj instanceof C81V) && C18U.A06(C06090Tz.A05, userSession, 36324307948941405L)) || C18U.A06(C06090Tz.A05, userSession, 36324307948810331L))) {
            z = true;
        } else {
            z = false;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        List allDrawables = interactiveDrawableContainer.getAllDrawables();
        final boolean z2 = false;
        if (!(allDrawables instanceof Collection) || !allDrawables.isEmpty()) {
            Iterator it = allDrawables.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (AbstractC209069Mo.A01((Drawable) it.next()) != null) {
                    z2 = true;
                    break;
                }
            }
        }
        final boolean z3 = true;
        if (!z) {
            z3 = false;
        }
        final Matrix matrix = new Matrix();
        interactiveDrawableContainer.A0r(new C2n2() { // from class: X.8Q3
            @Override // X.C2n2
            public final /* bridge */ /* synthetic */ Object apply(Object obj2) {
                Drawable drawable;
                Number number = (Number) obj2;
                InteractiveDrawableContainer interactiveDrawableContainer2 = interactiveDrawableContainer;
                if (number != null) {
                    int intValue = number.intValue();
                    BEd A02 = InteractiveDrawableContainer.A02(interactiveDrawableContainer2, intValue);
                    if (A02 != null) {
                        drawable = ((C9LJ) A02).A0B;
                    } else {
                        drawable = null;
                    }
                    C8Q2.A00(matrix, drawable, interactiveDrawableContainer2.A0L(intValue), linkedHashMap, intValue, interactiveDrawableContainer2.getWidth(), interactiveDrawableContainer2.getHeight(), z2, z3);
                    return null;
                }
                throw new IllegalStateException("Required value was null.");
            }
        });
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1B() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8NW.A1B():void");
    }

    public final void A1C() {
        EnumC39584Hdu enumC39584Hdu;
        String str;
        String str2;
        UserSession userSession = this.A0r;
        C42346Ip8 A00 = I6K.A00(userSession);
        boolean A1u = C17060sy.A01.A01(userSession).A1u();
        InterfaceC11380iw interfaceC11380iw = this.A0o;
        A00.A05(null, interfaceC11380iw.getModuleName(), A1u, "stories");
        C1XJ c1xj = C1XJ.A00;
        AbstractC59962oe abstractC59962oe = this.A0l;
        FragmentActivity requireActivity = abstractC59962oe.requireActivity();
        String moduleName = interfaceC11380iw.getModuleName();
        Integer num = C05F.A0C;
        if (AbstractC199308rX.A05(userSession, false)) {
            enumC39584Hdu = EnumC39584Hdu.A09;
        } else {
            enumC39584Hdu = EnumC39584Hdu.A0C;
        }
        String str3 = this.A1o;
        C14360o3.A0B(moduleName, 1);
        C14360o3.A0B(num, 2);
        C14360o3.A0B(str3, 4);
        C16930sl c16930sl = C16930sl.A00;
        ShoppingTaggingFeedClientState shoppingTaggingFeedClientState = new ShoppingTaggingFeedClientState(c16930sl, c16930sl, c16930sl, c16930sl, c16930sl, c16930sl, c16930sl);
        C8AD c8ad = this.A19;
        if (c8ad.CcJ(C8AE.A0g) && c8ad.CcJ(C8AE.A0e)) {
            str = null;
        } else {
            str = ((C23127AMf) this.A1Z.get()).A07.A04;
        }
        List A0W = AbstractC001800i.A0W(AbstractC06950Ym.A1F(AbstractC16960so.A1Q(shoppingTaggingFeedClientState.A04, AbstractC16960so.A1O(str))));
        C14360o3.A0B(A0W, 0);
        shoppingTaggingFeedClientState.A04 = A0W;
        if (c8ad.CcJ(C8AE.A0G)) {
            str2 = null;
        } else {
            str2 = ((C23127AMf) this.A1Z.get()).A07.A03;
        }
        shoppingTaggingFeedClientState.A00 = AbstractC16960so.A1O(str2);
        c1xj.A0j(abstractC59962oe, requireActivity, null, userSession, AbstractC41710Idg.A01(null, enumC39584Hdu, shoppingTaggingFeedClientState, null, num, null, null, null, moduleName, null, null, null, str3, null, AbstractC199308rX.A05(userSession, false)), null, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r1 == X.C05F.A0C) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1D() {
        /*
            r5 = this;
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r5.A1l
            java.lang.Class<X.6RB> r0 = X.C6RB.class
            java.util.ArrayList r0 = r1.A0T(r0)
            java.util.Iterator r4 = r0.iterator()
            r3 = 0
        Ld:
            r2 = 0
        Le:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r4.next()
            X.6RB r0 = (X.C6RB) r0
            java.lang.Integer r1 = X.AbstractC139126Rt.A00(r0)
            if (r3 != 0) goto L25
            java.lang.Integer r0 = X.C05F.A0C
            r3 = 0
            if (r1 != r0) goto L26
        L25:
            r3 = 1
        L26:
            if (r2 != 0) goto L2c
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto Ld
        L2c:
            r2 = 1
            goto Le
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8NW.A1D():void");
    }

    public final void A1E(Drawable drawable) {
        if (drawable != null) {
            InteractiveDrawableContainer interactiveDrawableContainer = this.A1l;
            this.A0B = interactiveDrawableContainer.A0M(drawable);
            interactiveDrawableContainer.A0Q(drawable);
        }
        this.A1A.E4u(new Object());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        if (r6 == com.instagram.api.schemas.MusicProduct.A0F) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r31v0, types: [java.lang.Object, android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1I(android.graphics.drawable.Drawable r31, X.Al0 r32, boolean r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8NW.A1I(android.graphics.drawable.Drawable, X.Al0, boolean, boolean):void");
    }

    public final void A1K(C5NL c5nl) {
        C150286pc c150286pc = this.A1N;
        if (!c150286pc.A03) {
            c150286pc.get();
        }
        Drawable A0z = A0z();
        if (A0z != null) {
            InteractiveDrawableContainer interactiveDrawableContainer = this.A1l;
            this.A0B = interactiveDrawableContainer.A0M(A0z);
            interactiveDrawableContainer.A0Q(A0z);
            Dog(c5nl, null);
        }
    }

    public final void A1L(Integer num) {
        User A01 = C17060sy.A01.A01(this.A0r);
        EnumC209229Ne enumC209229Ne = EnumC209229Ne.A07;
        if (num == C05F.A01) {
            enumC209229Ne = EnumC209229Ne.A0A;
        }
        if (num == C05F.A0C) {
            enumC209229Ne = EnumC209229Ne.A0H;
        }
        int[] A02 = AbstractC209259Nh.A02(enumC209229Ne);
        int i = A02[0];
        A0X(this, new C41629IbK(A01, num, null, null, null, AbstractC209259Nh.A00(enumC209229Ne), A02[1], 0, i, -6710887, -16777216, false));
    }

    public final void A1O(String str) {
        PromptStickerModel promptStickerModel;
        C220999pN c220999pN = this.A0A;
        if (c220999pN != null && str != null && (promptStickerModel = c220999pN.A04) != null) {
            this.A1Q.get();
            String substring = str.substring(0, str.length() - " me".length());
            C14360o3.A07(substring);
            if (!AbstractC001900j.A0T(substring)) {
                promptStickerModel.A0B(str);
            }
            Dog(promptStickerModel, AbstractC111324zv.A00(116));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d5, code lost:
    
        if (r0 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        if (r0 != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1P(boolean r9) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8NW.A1P(boolean):void");
    }

    public final void A1Q(boolean z) {
        FittingTextView fittingTextView = this.A1j;
        if (fittingTextView != null) {
            fittingTextView.setEnabled(z);
            C55942hf c55942hf = C150956qv.A02;
            AbstractC125325le A01 = AbstractC125325le.A01(fittingTextView, 0);
            float f = 0.5f;
            if (z) {
                f = 1.0f;
            }
            A01.A0I(f);
            A01.A0H();
        }
    }

    public final boolean A1R() {
        if ((this.A1q != null || this.A1v) && !A19().isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean A1T() {
        ArrayList A0T = this.A1l.A0T(C8P7.class);
        if (!(A0T instanceof Collection) || !A0T.isEmpty()) {
            Iterator it = A0T.iterator();
            while (it.hasNext()) {
                if (((C8P7) it.next()).A0B.A0C) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A1V() {
        ArrayList A0T = this.A1l.A0T(C8P7.class);
        if ((A0T instanceof Collection) && A0T.isEmpty()) {
            return false;
        }
        Iterator it = A0T.iterator();
        while (it.hasNext()) {
            PromptStickerModel promptStickerModel = ((C8P7) it.next()).A0B;
            if (promptStickerModel.A0M() && !promptStickerModel.A0L()) {
                return true;
            }
        }
        return false;
    }

    public final boolean A1W() {
        C194788je c194788je = (C194788je) A03(this, C194788je.class);
        if (c194788je != null && TextUtils.isEmpty(c194788je.A01.A02)) {
            return true;
        }
        C183828Di c183828Di = this.A1E;
        if (c183828Di != null) {
            return c183828Di.A07();
        }
        return false;
    }

    public final boolean A1X() {
        C1810981l c1810981l = this.A13.A02.A01.A0Y;
        c1810981l.getClass();
        return c1810981l.A08.A00 instanceof C81V;
    }

    @Override // X.C8NX
    public final boolean AG1() {
        return this.A19.CcJ(C8AE.A0O);
    }

    @Override // X.InterfaceC150206pS
    public final long Ayc() {
        return this.A02;
    }

    @Override // X.C8NY
    public final int BA1() {
        Iterator it = this.A1l.A0T(C6RB.class).iterator();
        int i = 0;
        while (it.hasNext()) {
            C6RB c6rb = (C6RB) it.next();
            if (c6rb != A14()) {
                Spannable spannable = c6rb.A0F;
                C14360o3.A07(spannable);
                i += ((V78[]) C4GL.A06(spannable, V78.class)).length;
            }
        }
        return i;
    }

    @Override // X.InterfaceC150206pS
    public final AbstractC59962oe Baj() {
        return this.A0l;
    }

    @Override // X.InterfaceC150206pS
    public final boolean CXU() {
        return this.A19.CcJ(C8AE.A0l);
    }

    @Override // X.InterfaceC150206pS
    public final boolean CZ3() {
        C8AD c8ad = this.A19;
        if (c8ad.CcJ(C8AE.A08) && c8ad.CcJ(C8AE.A0Z)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC150206pS
    public final boolean Cb5(boolean z) {
        C8AD c8ad = this.A19;
        if (!c8ad.CcJ(C8AE.A0Y)) {
            return false;
        }
        if (!c8ad.CcJ(C8AE.A0G)) {
            C150286pc c150286pc = this.A1Z;
            if (!c150286pc.A03) {
                return false;
            }
            C23127AMf c23127AMf = (C23127AMf) c150286pc.get();
            if (!C17060sy.A01.A01(c23127AMf.A04).A1O() || !c23127AMf.A07.A06()) {
                return false;
            }
        }
        if (!z && !AbstractC199308rX.A06(this.A0r, false)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC150206pS
    public final boolean CdE() {
        if (AbstractC199308rX.A02(this.A0r) && this.A19.CcJ(C8AE.A0U)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC186078Nb
    public final boolean Cdj() {
        return this.A2P;
    }

    @Override // X.C8NY
    public final boolean CeK() {
        if (this.A0D != C05F.A0N) {
            return false;
        }
        return true;
    }

    @Override // X.C8NY
    public final void CoP(Drawable drawable) {
        if (this.A0G != null && (drawable instanceof C6RB)) {
            ((C6RB) drawable).A0M = C05F.A01;
        }
    }

    @Override // X.C8NY
    public final void Cp6(Drawable drawable) {
        BEd A00 = InteractiveDrawableContainer.A00(drawable, this.A1l);
        if (A00 != null) {
            A00.Cp4(true);
        }
    }

    @Override // X.InterfaceC186088Nc
    public final void CwD(C148286ly c148286ly, String str) {
        UserSession userSession = this.A0r;
        Context context = this.A0f;
        EnumC150226pU enumC150226pU = EnumC150226pU.A04;
        C202588xc c202588xc = new C202588xc(context, null, userSession, c148286ly, enumC150226pU, null, AbstractC111324zv.A00(1907));
        c202588xc.A04();
        C148276lx c148276lx = C148276lx.A0a;
        String str2 = c148286ly.A0S;
        C14360o3.A07(str2);
        List singletonList = Collections.singletonList(c148286ly);
        C14360o3.A07(singletonList);
        C148276lx c148276lx2 = new C148276lx(enumC150226pU, str2, singletonList);
        C23108AGw A15 = A15();
        A15.A04 = 0.35f;
        A1H(c202588xc, c148276lx2, A15, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.8Ux, java.lang.Object] */
    @Override // X.C8NX
    public final void D28(boolean z) {
        ?? obj = new Object();
        obj.A00 = z;
        this.A1A.E4u(obj);
    }

    @Override // X.InterfaceC186068Na
    public final void D5Y() {
        Drawable background;
        C9LN c9ln = (C9LN) this.A1K.get();
        View view = c9ln.A01;
        if (view != null && (background = view.getBackground()) != null) {
            background.setColorFilter(c9ln.A10, PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // X.C8NX
    public final void DBH() {
        this.A1A.E4u(C8UR.A00);
    }

    @Override // X.InterfaceC1829489p
    public final void DCK(float f, float f2) {
        InteractiveDrawableContainer interactiveDrawableContainer = this.A1l;
        if (interactiveDrawableContainer.getInteractiveDrawables().size() >= 2) {
            UserSession userSession = this.A0r;
            if (AbstractC166997dE.A0c(C06090Tz.A05, userSession, 36320923514577914L).booleanValue()) {
                C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                InterfaceC19630xq interfaceC19630xq = A00.A01;
                int i = interfaceC19630xq.getInt("layering_tool_tooltip_seen_count", 0);
                boolean z = false;
                if (System.currentTimeMillis() - interfaceC19630xq.getLong("layering_tool_tooltip_last_seen_ms", 0L) < TimeUnit.DAYS.toMillis(3L)) {
                    z = true;
                }
                if (!((Boolean) A00.A20.CES(A00, C23031Ai.A8c[458])).booleanValue() && i < 3 && !z) {
                    FragmentActivity requireActivity = this.A0l.requireActivity();
                    Context context = this.A0f;
                    String string = context.getString(2131974415);
                    C14360o3.A07(string);
                    C5SU c5su = new C5SU(requireActivity, new C149686oL(string));
                    c5su.A05(new C207559Gj(interactiveDrawableContainer, (int) f, (int) f2, true));
                    c5su.A06(EnumC58132lV.A03);
                    c5su.A01 = context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                    c5su.A00().A07(null);
                    int i2 = interfaceC19630xq.getInt("layering_tool_tooltip_seen_count", 0) + 1;
                    InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                    ARD.E7D("layering_tool_tooltip_seen_count", i2);
                    ARD.apply();
                    long currentTimeMillis = System.currentTimeMillis();
                    InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                    ARD2.E7G("layering_tool_tooltip_last_seen_ms", currentTimeMillis);
                    ARD2.apply();
                }
            }
        }
    }

    @Override // X.InterfaceC186068Na
    public final void DEz() {
        C48590LeS c48590LeS = ((C9LN) this.A1K.get()).A0E;
        if (c48590LeS != null) {
            c48590LeS.A04 = true;
        }
    }

    @Override // X.C8NY
    public final void DFK(int i) {
        InterfaceC25192BCp interfaceC25192BCp;
        Integer num = this.A0c;
        if (num != null) {
            A1M(num);
            if (this.A0c == C05F.A0N) {
                AnonymousClass229.A01(this.A0r).A1J(A12(), i, 3);
                C150286pc c150286pc = this.A1d;
                ((C190398bx) c150286pc.get()).A0b(i);
                ((C190398bx) c150286pc.get()).A0Y();
                if (this.A1w && (interfaceC25192BCp = this.A0y.A19.A1A) != null) {
                    interfaceC25192BCp.DFJ();
                }
            }
        }
    }

    @Override // X.C8NY
    public final void DFL() {
        this.A0c = this.A0D;
        onBackPressed();
        A1M(C05F.A0Y);
    }

    @Override // X.C8NY
    public final void DH9(boolean z) {
        UserSession userSession = this.A0r;
        AbstractC183338Bg.A00(userSession).A0A("StickerOverlayController#onFinishEditingText");
        A1M(C05F.A01);
        ConstrainedEditText constrainedEditText = this.A2M;
        AbstractC13880nE.A0O(constrainedEditText);
        A1D();
        if (A0v(this)) {
            InterfaceC08830cm interfaceC08830cm = this.A1s;
            interfaceC08830cm.getClass();
            ((C191478dz) interfaceC08830cm.get()).A0y.A03();
        }
        if (z) {
            ((APn) this.A1R.get()).A03();
        }
        ArrayList arrayList = new ArrayList(AbstractC53940NtD.A00(constrainedEditText.getText().toString()));
        if (!arrayList.isEmpty()) {
            ArrayList A00 = AbstractC54909OQg.A00(userSession, arrayList);
            if (!A00.isEmpty()) {
                A0j((User) A00.get(0));
            }
        }
    }

    @Override // X.C8NZ
    public final void DHT(C9QC c9qc, C148276lx c148276lx) {
        C148276lx c148276lx2 = new C148276lx(EnumC150226pU.A0Y, c148276lx.A0Z, c148276lx.A0O);
        C194808jg A00 = C194808jg.A00(this.A0f, null, c9qc, this.A0r, c148276lx2, null);
        C23108AGw A15 = A15();
        A15.A04 = 0.35f;
        A1H(A00, c148276lx2, A15, null);
        C8PK c8pk = this.A0w;
        C18920wW c18920wW = c8pk.A00;
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_fitness_stickers");
        if (A002.isSampled()) {
            A002.AAP("story_session_uuid", c8pk.A01);
            A002.AAP("event_name", "ADD_FITNESS_STICKER");
            A002.A9K("days_since_selected_sticker_generated", Long.valueOf(TimeUnit.SECONDS.toDays((System.currentTimeMillis() / 1000) - c9qc.A01)));
            A002.AAP("selected_sticker_type", c9qc.A02);
            A002.AAP("selected_sticker_image", c9qc.A03);
            A002.Cht();
        }
    }

    @Override // X.InterfaceC186118Nf
    public final void DIl(User user, String str) {
        AlB A01 = AbstractC209909Qc.A01(this.A0f, user, "STICKER_TRAY");
        A0Z(this, C202438xN.class);
        this.A1A.E4u(new C187968Un(A01));
    }

    @Override // X.C8NX
    public final void DOI() {
        this.A1A.E4u(new Object());
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        int ordinal = this.A1A.AuG().ordinal();
        if (ordinal == 20 || ordinal == 21 || ordinal == 25) {
            return;
        }
        switch (ordinal) {
            case 17:
            case Process.SIGSTOP /* 19 */:
            case 31:
            case 32:
                return;
            default:
                switch (ordinal) {
                    case 27:
                    case 28:
                    case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                    case 30:
                    case 33:
                    case 59:
                        return;
                    default:
                        ((C190398bx) this.A1d.get()).DOK(i, z);
                        return;
                }
        }
    }

    @Override // X.C8NY
    public final void DPC() {
        C194808jg A07 = A07(this, C202308xA.class);
        if (A07 != null) {
            A07.A0D();
            C150286pc c150286pc = this.A1d;
            C194808jg c194808jg = ((C190398bx) c150286pc.get()).A0H;
            c194808jg.getClass();
            c194808jg.A0D();
            IgImageView igImageView = ((C190398bx) c150286pc.get()).A1K;
            if (igImageView != null) {
                igImageView.invalidate();
            }
        }
    }

    @Override // X.InterfaceC186068Na
    public final void DWm() {
        Context context;
        View view;
        Drawable background;
        C9LN c9ln = (C9LN) this.A1K.get();
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = c9ln.A09;
        if (touchInterceptorFrameLayout != null && (context = touchInterceptorFrameLayout.getContext()) != null && (view = c9ln.A01) != null && (background = view.getBackground()) != null) {
            background.setColorFilter(context.getColor(AbstractC53242c7.A0H(context, R.attr.elevatedBackgroundColorDark)), PorterDuff.Mode.SRC_IN);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Aku, java.lang.Object] */
    @Override // X.InterfaceC186148Ni
    public final void DZR(Medium medium) {
        A0Z(this, C220829p6.class);
        ?? obj = new Object();
        obj.A00 = medium;
        obj.A01 = null;
        this.A1A.E4u(new C188298Vu(obj));
    }

    @Override // X.InterfaceC1829489p
    public final void Dmk(Drawable drawable, int i, float f, float f2) {
        InterfaceC1810081c interfaceC1810081c;
        Object c8w7;
        CameraTool cameraTool;
        String str;
        PromptStickerModel promptStickerModel;
        PromptStickerModel promptStickerModel2;
        GenAIToolInfoDictIntf B9Z;
        PromptStickerModel promptStickerModel3;
        C24015Akt c24015Akt;
        PromptStickerModel promptStickerModel4;
        C220979pL c220979pL;
        NewFundraiserInfo newFundraiserInfo;
        java.util.Set A0F;
        Wm2 wm2;
        Wm4 wm4;
        String str2;
        int i2;
        int i3;
        int i4;
        int round;
        float pivotY;
        Drawable drawable2 = drawable;
        C14360o3.A0B(drawable2, 1);
        boolean z = drawable2 instanceof C5RM;
        Drawable drawable3 = drawable2;
        if (z) {
            drawable3 = ((C5RM) drawable3).A0A;
        }
        if ((drawable3 instanceof C6RB) && !(drawable3 instanceof C202718xp)) {
            C8UK c8uk = new C8UK(drawable2, (C6RB) drawable3);
            if ((this.A0t.A08.A00 instanceof C81U) && (c8uk.A00 instanceof C5RO) && this.A1A.CRB(EnumC1810181d.A0j) && F18.A00() && !AbstractC185298Jv.A01(this.A0r)) {
                C190398bx c190398bx = (C190398bx) this.A1d.get();
                C8QJ c8qj = new C8QJ(c190398bx.A0q, c190398bx.A1J, Integer.valueOf(R.drawable.tts_context_menu_background), true);
                ArrayList arrayList = new ArrayList();
                Resources resources = c190398bx.A0r;
                arrayList.add(new C199928sw(resources.getDrawable(R.drawable.instagram_edit_pano_outline_24), new C23953Ajn(drawable2, c190398bx, c8uk), resources.getString(2131955977)));
                arrayList.add(new C199928sw(resources.getDrawable(R.drawable.instagram_text_to_speech_pano_outline_24), new C56409P2w(c190398bx, c8uk), resources.getString(2131955992)));
                c8qj.A02(arrayList);
                InteractiveDrawableContainer interactiveDrawableContainer = c190398bx.A1n;
                C09530e4 activeDrawableLocation = interactiveDrawableContainer.getActiveDrawableLocation();
                Integer activeDrawableHeight = interactiveDrawableContainer.getActiveDrawableHeight();
                if (activeDrawableLocation != null && activeDrawableHeight != null) {
                    round = Math.round(((Number) activeDrawableLocation.A00).floatValue());
                    pivotY = ((Number) activeDrawableLocation.A01).floatValue() + (activeDrawableHeight.intValue() / 3);
                } else {
                    round = Math.round(interactiveDrawableContainer.getPivotX());
                    pivotY = interactiveDrawableContainer.getPivotY();
                }
                c8qj.showAsDropDown(interactiveDrawableContainer, round, Math.round(pivotY));
                return;
            }
            this.A1A.E4u(c8uk);
            InterfaceC08830cm interfaceC08830cm = this.A1s;
            interfaceC08830cm.getClass();
            interfaceC08830cm.get();
            return;
        }
        if (drawable3 instanceof C220919pF) {
            C220919pF c220919pF = (C220919pF) drawable3;
            if (!c220919pF.A02) {
                return;
            }
            A0k(C220919pF.class);
            this.A1A.E4u(new C187958Um(c220919pF.A00));
            return;
        }
        if (drawable3 instanceof C202438xN) {
            AlB alB = ((C202438xN) drawable3).A09;
            if (alB.A00.A02 == null) {
                return;
            }
            A0Z(this, C202438xN.class);
            interfaceC1810081c = this.A1A;
            c8w7 = new C187968Un(alB);
        } else {
            if (drawable3 instanceof C220879pB) {
                C41629IbK c41629IbK = ((C220879pB) drawable3).A00;
                if (c41629IbK == null) {
                    C14360o3.A0F("smbSupportStickerModel");
                    throw C00O.createAndThrow();
                }
                if (c41629IbK.A00.A0A != null) {
                    return;
                }
                A0X(this, c41629IbK);
                return;
            }
            if (drawable3 instanceof C220839p7) {
                C220839p7 c220839p7 = (C220839p7) drawable3;
                boolean z2 = c220839p7.A0D;
                if (z2) {
                    c220839p7.A0B.A00();
                    boolean z3 = !c220839p7.A04;
                    c220839p7.A04 = z3;
                    if (z3) {
                        i2 = c220839p7.A08;
                    } else {
                        i2 = c220839p7.A06;
                    }
                    c220839p7.A02 = i2;
                    if (z3) {
                        i3 = c220839p7.A00;
                    } else {
                        i3 = c220839p7.A07;
                    }
                    c220839p7.A03 = i3;
                    if (z3) {
                        i4 = c220839p7.A0A;
                    } else {
                        i4 = c220839p7.A09;
                    }
                    c220839p7.A01 = i4;
                    C220839p7.A00(c220839p7);
                    Rect bounds = c220839p7.getBounds();
                    C14360o3.A07(bounds);
                    int i5 = (int) ((c220839p7.getBounds().left + c220839p7.getBounds().right) / 2.0f);
                    int i6 = c220839p7.A03 / 2;
                    int i7 = bounds.top;
                    c220839p7.setBounds(i5 - i6, i7, i5 + i6, c220839p7.A02 + i7);
                    c220839p7.invalidateSelf();
                }
                BEd A00 = InteractiveDrawableContainer.A00(c220839p7, this.A1l);
                if (A00 != null) {
                    A00.Cp4(true);
                }
                Object obj = this.A0g.get(i);
                obj.getClass();
                C5NG c5ng = (C5NG) obj;
                if (z2 && !c220839p7.A04) {
                    str2 = "share_professional_thumbnails";
                } else {
                    str2 = "share_professional_no_thumbnails";
                }
                List singletonList = Collections.singletonList(str2);
                C14360o3.A07(singletonList);
                c5ng.A06 = singletonList;
                return;
            }
            if (drawable3 instanceof C220789p2) {
                A0I();
                return;
            }
            if (drawable3 instanceof C202468xQ) {
                C202468xQ c202468xQ = (C202468xQ) drawable3;
                if (c202468xQ != null && !c202468xQ.A0B) {
                    wm4 = c202468xQ.A09;
                } else {
                    wm4 = null;
                }
                A0k(C202468xQ.class);
                interfaceC1810081c = this.A1A;
                c8w7 = new C188098Va(wm4);
            } else if (drawable3 instanceof C202488xS) {
                C202488xS c202488xS = (C202488xS) drawable3;
                C24012Akq c24012Akq = c202488xS.A03;
                if (c24012Akq.A09()) {
                    A0Z(this, C202488xS.class);
                    interfaceC1810081c = this.A1A;
                    c8w7 = new C188118Vc(c24012Akq);
                } else {
                    A0f(c202488xS);
                    return;
                }
            } else {
                if (drawable3 instanceof AbstractC220929pG) {
                    A0i((AbstractC220929pG) drawable3);
                    return;
                }
                if (drawable3 instanceof C221009pO) {
                    PromptStickerModel promptStickerModel5 = ((C221009pO) drawable3).A06;
                    if (promptStickerModel5.A0L()) {
                        return;
                    }
                    if (promptStickerModel5.A0H()) {
                        A0g(promptStickerModel5);
                        return;
                    } else {
                        A0k(C221009pO.class);
                        interfaceC1810081c = this.A1A;
                        c8w7 = new C8UX(promptStickerModel5);
                    }
                } else if (drawable3 instanceof C202478xR) {
                    A0k(C202478xR.class);
                    interfaceC1810081c = this.A1A;
                    c8w7 = new Object();
                } else {
                    if (drawable3 instanceof C202548xY) {
                        A0W(this, (C202548xY) drawable3);
                        return;
                    }
                    if (drawable3 instanceof V9Y) {
                        A0k(V9Y.class);
                        interfaceC1810081c = this.A1A;
                        c8w7 = new C8UV(((V9Y) drawable3).A0H);
                    } else if (drawable3 instanceof V9X) {
                        V9X v9x = (V9X) drawable3;
                        A0k(V9X.class);
                        interfaceC1810081c = this.A1A;
                        if (v9x != null) {
                            wm2 = v9x.A0B;
                        } else {
                            wm2 = null;
                        }
                        c8w7 = new C8UZ(wm2);
                    } else {
                        if (drawable3 instanceof BEc) {
                            A0L(drawable3);
                            return;
                        }
                        if (drawable3 instanceof C5RU) {
                            if (!z) {
                                drawable2 = drawable3;
                            }
                            A1E(drawable2);
                            return;
                        }
                        if (drawable3 instanceof C220779p1) {
                            C51853Mvx c51853Mvx = ((C220779p1) drawable3).A0A;
                            c51853Mvx.getClass();
                            A0Z(this, C220779p1.class);
                            interfaceC1810081c = this.A1A;
                            c8w7 = new C188008Ur(c51853Mvx);
                        } else {
                            if (drawable3 instanceof C194808jg) {
                                C194808jg c194808jg = (C194808jg) drawable3;
                                Drawable A04 = c194808jg.A04();
                                C14360o3.A07(A04);
                                if ((A04 instanceof C202588xc) && ((C202588xc) A04).A0M == EnumC150226pU.A0C && (A0F = A0F(this)) != null && A0F.contains(Integer.valueOf(i))) {
                                    C9GR.A0F(this.A0f, "item_cant_be_changed", 2131964680);
                                    return;
                                }
                                String A002 = AbstractC111324zv.A00(484);
                                C14360o3.A0C(drawable3, A002);
                                Object obj2 = c194808jg.A03;
                                if ((obj2 instanceof C1816383s) && ((C1816383s) obj2).A01 != null) {
                                    UserSession userSession = this.A0r;
                                    if (C18U.A06(C06090Tz.A06, userSession, 36318423843608713L)) {
                                        C14360o3.A0C(drawable3, A002);
                                        Object obj3 = c194808jg.A03;
                                        if (!(obj3 instanceof C1816383s)) {
                                            newFundraiserInfo = null;
                                        } else {
                                            newFundraiserInfo = ((C1816383s) obj3).A01;
                                        }
                                        newFundraiserInfo.getClass();
                                        FragmentActivity requireActivity = this.A0l.requireActivity();
                                        String str3 = newFundraiserInfo.A01;
                                        str3.getClass();
                                        String str4 = newFundraiserInfo.A07;
                                        Integer valueOf = Integer.valueOf(newFundraiserInfo.A00);
                                        String str5 = newFundraiserInfo.A05;
                                        List list = newFundraiserInfo.A08;
                                        String str6 = this.A1o;
                                        String A003 = MSV.A00(362);
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("charity_id", str3);
                                        hashMap.put("source_name", A003);
                                        if (str4 != null) {
                                            hashMap.put(MSV.A00(1307), str4);
                                        }
                                        if (valueOf != null) {
                                            hashMap.put(MSV.A00(1302), valueOf.toString());
                                        }
                                        if (str5 != null) {
                                            hashMap.put(MSV.A00(1301), str5);
                                        }
                                        if (list != null) {
                                            hashMap.put(MSV.A00(1306), list.toString());
                                        }
                                        hashMap.put(MSV.A00(1361), "True");
                                        if (str6 != null) {
                                            hashMap.put(AbstractC58317Pt9.A00(6), str6);
                                        }
                                        C66277U6x A01 = C66277U6x.A01(MSV.A00(1065), hashMap);
                                        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
                                        igBloksScreenConfig.A0l = false;
                                        igBloksScreenConfig.A0k = false;
                                        igBloksScreenConfig.A0i = true;
                                        C6XJ c6xj = new C6XJ(requireActivity, W6d.A00(igBloksScreenConfig, A01), userSession, ModalActivity.class, "bloks");
                                        c6xj.A07();
                                        c6xj.A0C(requireActivity);
                                        return;
                                    }
                                }
                                Drawable A042 = c194808jg.A04();
                                C14360o3.A07(A042);
                                if (A042 instanceof C202588xc) {
                                    String str7 = ((C202588xc) A042).A0O;
                                    C14360o3.A07(str7);
                                    if (AbstractC001900j.A0a(str7, "earth_day", false)) {
                                        UserSession userSession2 = this.A0r;
                                        if (C18U.A06(C06090Tz.A05, userSession2, 36318840455436845L)) {
                                            AbstractC55224Oeq.A06(this.A0l.requireActivity(), userSession2, C05F.A00, "STORY_COMPOSITION");
                                            return;
                                        }
                                    }
                                }
                                Object obj4 = c194808jg.A03;
                                if (obj4 instanceof C217859kI) {
                                    C14360o3.A0C(obj4, "null cannot be cast to non-null type com.instagram.reels.groupmention.model.GroupMentionStickerModel");
                                    if (((C217859kI) obj4).A04.length() == 0) {
                                        Drawable A043 = c194808jg.A04();
                                        C14360o3.A0C(A043, "null cannot be cast to non-null type com.instagram.reels.groupmention.view.GroupMentionStickerDrawable");
                                        C217859kI c217859kI = ((C220949pI) A043).A04;
                                        c217859kI.getClass();
                                        InterfaceC08830cm interfaceC08830cm2 = this.A1s;
                                        interfaceC08830cm2.getClass();
                                        ((C191478dz) interfaceC08830cm2.get()).A0M(c194808jg);
                                        this.A1l.A0Q(c194808jg);
                                        interfaceC1810081c = this.A1A;
                                        c8w7 = new C8VE(c217859kI);
                                    }
                                }
                                Drawable A044 = c194808jg.A04();
                                StoryPromptType storyPromptType = null;
                                if ((A044 instanceof C220979pL) && (c220979pL = (C220979pL) A044) != null) {
                                    promptStickerModel4 = c220979pL.A04;
                                    if (promptStickerModel4 != null) {
                                        storyPromptType = promptStickerModel4.A03();
                                    }
                                } else {
                                    promptStickerModel4 = null;
                                }
                                if (storyPromptType == StoryPromptType.A09 && !promptStickerModel4.A0L()) {
                                    this.A0y.A0k(EnumC150226pU.A0v);
                                    return;
                                } else {
                                    A1F(drawable3, i);
                                    return;
                                }
                            }
                            if (drawable3 instanceof C220899pD) {
                                C220899pD c220899pD = (C220899pD) drawable3;
                                A0k(C220899pD.class);
                                interfaceC1810081c = this.A1A;
                                if (c220899pD != null) {
                                    c24015Akt = c220899pD.A01;
                                } else {
                                    c24015Akt = null;
                                }
                                c8w7 = new C188138Ve(c24015Akt);
                            } else {
                                if (drawable3 instanceof C220809p4) {
                                    A0H();
                                    return;
                                }
                                if (drawable3 instanceof C8P7) {
                                    C8P7 c8p7 = (C8P7) drawable3;
                                    if (c8p7.A0B.A0M()) {
                                        A0h(c8p7);
                                        return;
                                    }
                                }
                                if (drawable3 instanceof C220939pH) {
                                    C220939pH c220939pH = (C220939pH) drawable3;
                                    Al3 al3 = c220939pH.A00;
                                    HashMap hashMap2 = new HashMap();
                                    hashMap2.put("entrypoint", "bio_ig_story");
                                    hashMap2.put("currency_code", al3.A01);
                                    hashMap2.put("variants", al3.A04);
                                    HashMap hashMap3 = new HashMap();
                                    hashMap3.put("initial_price", al3.A02);
                                    hashMap3.put(MSV.A00(1304), al3.A03);
                                    hashMap3.put("callback", new C66237U5h(new C57754Pjh(new C25142BAm(1, this, al3, c220939pH), 3)));
                                    A0l(hashMap2, hashMap3);
                                    return;
                                }
                                if (drawable3 instanceof C194778jd) {
                                    C24017Akv c24017Akv = ((C194778jd) drawable3).A02;
                                    C14360o3.A0C(c24017Akv, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.model.SecretStickerClientModel");
                                    A0k(C194778jd.class);
                                    interfaceC1810081c = this.A1A;
                                    c8w7 = new C188308Vv(c24017Akv);
                                } else if (drawable3 instanceof C220999pN) {
                                    C220999pN A0D = A0D(this);
                                    if (A0D != null && (promptStickerModel3 = A0D.A04) != null && promptStickerModel3.A0L()) {
                                        return;
                                    }
                                    C220999pN A0D2 = A0D(this);
                                    if (A0D2 != null && (promptStickerModel2 = A0D2.A04) != null && (B9Z = promptStickerModel2.A00.B9Z()) != null) {
                                        cameraTool = B9Z.C9G();
                                    } else {
                                        cameraTool = null;
                                    }
                                    if (cameraTool == CameraTool.A1i) {
                                        return;
                                    }
                                    if (A0D(this) != null) {
                                        this.A0A = A0D(this);
                                        A0k(C220999pN.class);
                                    }
                                    C150286pc c150286pc = this.A1Q;
                                    C56181Owo c56181Owo = (C56181Owo) c150286pc.get();
                                    ComposeView composeView = c56181Owo.A00;
                                    if (composeView != null) {
                                        composeView.setVisibility(0);
                                    }
                                    c56181Owo.A02 = false;
                                    c56181Owo.A05.A01();
                                    C56181Owo c56181Owo2 = (C56181Owo) c150286pc.get();
                                    C220999pN c220999pN = this.A0A;
                                    if (c220999pN == null || (promptStickerModel = c220999pN.A04) == null || (str = promptStickerModel.A00.getText()) == null) {
                                        str = "";
                                    }
                                    C25801BbI c25801BbI = c56181Owo2.A08;
                                    String substring = str.substring(0, str.length() - " me".length());
                                    C14360o3.A07(substring);
                                    C5C3 A004 = CH8.A00(new C5C3(substring, C5C2.A01));
                                    C14360o3.A0B(A004, 0);
                                    InterfaceC74953Yl interfaceC74953Yl = c25801BbI.A03;
                                    interfaceC74953Yl.Egh(A004);
                                    Object value = interfaceC74953Yl.getValue();
                                    C14360o3.A0B(value, 0);
                                    c25801BbI.A02.Egh(value);
                                    interfaceC1810081c = this.A1A;
                                    c8w7 = new Object();
                                } else if (drawable3 instanceof C194788je) {
                                    MusicPickStickerModel musicPickStickerModel = ((C194788je) drawable3).A01;
                                    A0k(C194788je.class);
                                    interfaceC1810081c = this.A1A;
                                    c8w7 = new C8WA(null, musicPickStickerModel);
                                } else if (drawable3 instanceof C220889pC) {
                                    C24014Aks c24014Aks = ((C220889pC) drawable3).A03;
                                    C24014Aks c24014Aks2 = null;
                                    if (c24014Aks != null) {
                                        c24014Aks2 = c24014Aks;
                                    }
                                    A0Z(this, C220889pC.class);
                                    A0Z(this, AbstractC220929pG.class);
                                    interfaceC1810081c = this.A1A;
                                    c8w7 = new C8WB(c24014Aks2);
                                } else {
                                    if (drawable3 instanceof C202728xq) {
                                        if (!C18U.A06(C06090Tz.A05, this.A0r, 36325446115341386L)) {
                                            return;
                                        }
                                    } else if (drawable3 instanceof C191048d0) {
                                        C191048d0 c191048d0 = (C191048d0) drawable3;
                                        if (c191048d0.A02 == null || c191048d0.A0I != C05F.A00) {
                                            Integer num = c191048d0.A0I;
                                            interfaceC1810081c = this.A1A;
                                            c8w7 = new C8W7(i, num);
                                        }
                                    } else {
                                        if (!(drawable3 instanceof C202658xj) || this.A0J == null) {
                                            return;
                                        }
                                        int i8 = this.A00 + 1;
                                        int i9 = this.A01;
                                        int i10 = 0;
                                        if (i9 < i8 - 1) {
                                            i10 = i9 + 1;
                                        }
                                        this.A01 = i10;
                                        A0J(i10, i8, 1);
                                        return;
                                    }
                                    interfaceC1810081c = this.A1A;
                                    c8w7 = new C8W1(i);
                                }
                            }
                        }
                    }
                }
            }
        }
        interfaceC1810081c.E4u(c8w7);
    }

    @Override // X.InterfaceC1829489p
    public final void Dmm(Drawable drawable, float f, float f2, float f3, float f4, int i) {
        InteractiveDrawableContainer interactiveDrawableContainer = this.A1l;
        ArrayList A0T = interactiveDrawableContainer.A0T(C202638xh.class);
        if ((!A0T.isEmpty()) && ((Drawable) A0T.get(0)).getBounds().contains((int) f, (int) f2)) {
            UserSession userSession = this.A0r;
            if (!C18U.A06(C06090Tz.A05, userSession, 36319828297981636L) && C20Y.A00(userSession).A01.A00 == C125535lz.A00) {
                if (!A0T.isEmpty()) {
                    ((C202638xh) A0T.get(0)).A04.A00();
                }
                int i2 = this.A00 + 1;
                int i3 = this.A01;
                int i4 = 0;
                if (i3 < i2 - 1) {
                    i4 = i3 + 1;
                }
                this.A01 = i4;
                A0J(i4, i2, 1);
                return;
            }
        }
        C1810981l c1810981l = this.A0t;
        if ((c1810981l.A08.A00 instanceof C81V) || c1810981l.A0W(C81W.A0o)) {
            return;
        }
        C1815483h c1815483h = this.A13.A02.A01;
        UserSession userSession2 = this.A0r;
        C1815783k c1815783k = c1815483h.A04;
        InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) this.A10).A0K;
        if (AbstractC202808xy.A07(this.A0f, userSession2, c1815783k, interactiveDrawableContainer, f, f2, interfaceC1812882f.getWidth(), interfaceC1812882f.getHeight())) {
            return;
        }
        this.A1A.E4u(new Object());
    }

    @Override // X.C8NY
    public final void Do0() {
        A1M(C05F.A0N);
    }

    @Override // X.InterfaceC186078Nb
    public final void DoY(View view, C148276lx c148276lx) {
        CxL(view, new C148306m0(c148276lx));
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0381, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r9, 36323238501952604L) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:
    
        if ((((X.C194808jg) r6).A04() instanceof X.C220979pL) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0375  */
    @Override // X.C8NX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dog(X.C5NL r44, java.lang.String r45) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8NW.Dog(X.5NL, java.lang.String):void");
    }

    @Override // X.InterfaceC186208No
    public final void Doi() {
        Integer num = C05F.A01;
        A1M(num);
        this.A0c = num;
    }

    @Override // X.C8NY
    public final void DsZ(String str) {
        C8MQ c8mq;
        C8Y6 c8y6 = (C8Y6) this.A0y.A1x.get();
        if (c8y6 != null) {
            C8LZ c8lz = c8y6.A09;
            C1816783z c1816783z = c8lz.A0I.A02;
            C1810981l c1810981l = c1816783z.A01.A0Y;
            c1810981l.getClass();
            if (c1810981l.A08.A00 == C208509Kk.A00 && c1816783z.A01() == EnumC198268pb.A04 && (c8mq = c8lz.A0c) != null) {
                A5C a5c = new A5C(c8lz);
                AbstractC23641Du.A05(AnonymousClass191.A00, new JXO(a5c, c8mq, str, null, 21), AnonymousClass194.A02(new C12M().AOT(497892810, 3)));
                C11T.A02(new RunnableC24314AqJ(c8lz));
            }
        }
    }

    @Override // X.C8NY
    public final void Dsf() {
        this.A1A.E4u(new Object());
        boolean z = false;
        if (A07(this, C202308xA.class) != null) {
            z = true;
        }
        A0m(z);
    }

    @Override // X.InterfaceC1829489p
    public final void DuD() {
        Integer num;
        Integer num2 = this.A0D;
        if (num2 == C05F.A05) {
            C8Y6 c8y6 = (C8Y6) this.A0y.A1x.get();
            if (c8y6 != null) {
                if (c8y6.A01) {
                    c8y6.A0N.A00().Eo3();
                    if (c8y6.A0J.Cap()) {
                        C150286pc c150286pc = c8y6.A0A.A1h;
                        if (c150286pc.A03 && ((C8NW) c150286pc.get()).A1R()) {
                            c8y6.A0O.A00().Eo3();
                        }
                    }
                    C9KJ c9kj = c8y6.A0B.A0B;
                    if (c9kj != null) {
                        c9kj.CoQ();
                    }
                    c8y6.A01 = false;
                }
                InterfaceC1818984z interfaceC1818984z = c8y6.A0I;
                if (interfaceC1818984z != null) {
                    interfaceC1818984z.Elu();
                }
            }
            InterfaceC1810081c interfaceC1810081c = this.A1A;
            if (interfaceC1810081c.CRB(EnumC1810181d.A0K)) {
                InterfaceC08830cm interfaceC08830cm = this.A1s;
                interfaceC08830cm.getClass();
                ((C191478dz) interfaceC08830cm.get()).A0I();
            }
            if (interfaceC1810081c.AuG() == EnumC1810181d.A02 && ((C9LN) this.A1K.get()).A0O()) {
                num = C05F.A04;
            } else if (interfaceC1810081c.Cap() && this.A1l.getInteractiveDrawables().size() <= 0) {
                num = C05F.A0C;
            } else {
                num = C05F.A01;
            }
            A1M(num);
        } else if (num2 == C05F.A06) {
            C8O5 c8o5 = this.A15;
            if (c8o5.A00 != null) {
                ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t = c8o5.A02;
                viewOnTouchListenerC1829889t.A05();
                viewOnTouchListenerC1829889t.A06(c8o5);
            }
        }
        InterfaceC1810081c interfaceC1810081c2 = this.A1A;
        if (interfaceC1810081c2.CRB(EnumC1810181d.A1J)) {
            interfaceC1810081c2.E4u(new Object());
        }
        if (interfaceC1810081c2.CRB(EnumC1810181d.A0K)) {
            ((C191478dz) this.A1s.get()).DCs(true);
        }
    }

    @Override // X.InterfaceC186168Nk
    public final void Dwv(UpcomingEvent upcomingEvent) {
        Dog(new C24013Akr(upcomingEvent), null);
    }

    @Override // X.InterfaceC186218Np
    public final void E2U(int i) {
        Drawable drawable;
        BEd A0N = this.A1l.A0N(i);
        if (A0N != null) {
            drawable = ((C9LJ) A0N).A0B;
        } else {
            drawable = null;
        }
        if (drawable instanceof C194808jg) {
            C194808jg c194808jg = (C194808jg) drawable;
            A1M(C05F.A06);
            c194808jg.A08();
            Object obj = this.A0g.get(i);
            obj.getClass();
            ((C5NG) obj).A01(c194808jg.A00);
            C8O5 c8o5 = this.A15;
            c8o5.A00 = c194808jg;
            ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t = c8o5.A02;
            viewOnTouchListenerC1829889t.A05();
            viewOnTouchListenerC1829889t.A06(c8o5);
        }
    }

    @Override // X.C8NY
    public final void F8v(boolean z) {
        C87H c87h = this.A1e;
        if (z) {
            c87h.A01();
        } else {
            c87h.A03();
        }
    }

    @Override // X.C8NY
    public final void FAV(boolean z) {
        if (this.A0D == C05F.A03) {
            C23629AdO c23629AdO = (C23629AdO) this.A1a.get();
            c23629AdO.A00 = ((C190398bx) this.A1d.get()).A00;
            C23629AdO.A02(c23629AdO);
        }
        if (z) {
            if (!this.A0W) {
                C190988cu c190988cu = (C190988cu) this.A1P.get();
                if (!c190988cu.A03.containsKey(A14())) {
                    return;
                }
            }
            C194808jg A07 = A07(this, C202308xA.class);
            if (A07 != null) {
                C150286pc c150286pc = this.A1d;
                C6S5 A0U = ((C190398bx) c150286pc.get()).A0U();
                C14360o3.A07(A0U);
                AbstractC23123AKh.A03(A07, A0U);
                AbstractC23123AKh.A02(A07, ((C190398bx) c150286pc.get()).A00);
            }
            C150286pc c150286pc2 = this.A1d;
            C194808jg c194808jg = ((C190398bx) c150286pc2.get()).A0H;
            if (c194808jg != null) {
                C6S5 A0U2 = ((C190398bx) c150286pc2.get()).A0U();
                C14360o3.A07(A0U2);
                AbstractC23123AKh.A03(c194808jg, A0U2);
                AbstractC23123AKh.A02(c194808jg, ((C190398bx) c150286pc2.get()).A00);
            }
            IgImageView igImageView = ((C190398bx) c150286pc2.get()).A1K;
            if (igImageView != null) {
                igImageView.invalidate();
            }
        }
    }

    @Override // X.C8NY
    public final void FAp(C6RB c6rb) {
        Object obj;
        InteractiveDrawableContainer interactiveDrawableContainer = this.A1l;
        interactiveDrawableContainer.A0k(c6rb);
        if (A0s(c6rb) && this.A13.A02.A01() == EnumC198268pb.A04) {
            this.A1J.A02(interactiveDrawableContainer.A0R(new C23532Abm(this)));
        }
        C150286pc c150286pc = this.A1P;
        C206189Bb c206189Bb = (C206189Bb) ((C190988cu) c150286pc.get()).A03.get(c6rb);
        if (c206189Bb != null) {
            obj = c206189Bb.A03;
        } else {
            obj = null;
        }
        if ((obj instanceof C194808jg) && obj != null) {
            C190988cu c190988cu = (C190988cu) c150286pc.get();
            ((C190398bx) this.A1d.get()).A1Z.get();
            C190988cu.A02(c6rb, c190988cu, new C207189Ex(6, c190988cu, c6rb));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if (X.C9LN.A0C(r4) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008d, code lost:
    
        if (r0.A03() == true) goto L32;
     */
    @Override // X.C8BD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onBackPressed() {
        /*
            r5 = this;
            X.6pc r1 = r5.A1T
            boolean r0 = r1.A03
            r2 = 1
            if (r0 == 0) goto L16
            java.lang.Object r0 = r1.get()
            X.AkJ r0 = (X.C23984AkJ) r0
            X.8bH r0 = r0.A0A
            boolean r0 = r0.A0M()
            if (r0 == 0) goto L16
        L15:
            return r2
        L16:
            X.6pc r1 = r5.A1K
            boolean r0 = r1.A03
            if (r0 == 0) goto L90
            java.lang.Object r4 = r1.get()
            X.9LN r4 = (X.C9LN) r4
            X.Je3 r0 = r4.A0L
            if (r0 == 0) goto L44
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r0.A04
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L44
            int r0 = r0.length()
            if (r0 <= 0) goto L44
            X.Je3 r0 = r4.A0L
            if (r0 == 0) goto L15
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r0.A04
            java.lang.String r0 = ""
            r1.setText(r0)
            return r2
        L44:
            X.81c r1 = r4.A1E
            X.81d r0 = X.EnumC1810181d.A02
            boolean r0 = r1.CRB(r0)
            if (r0 != 0) goto L56
            X.81d r0 = X.EnumC1810181d.A03
            boolean r0 = r1.CRB(r0)
            if (r0 == 0) goto L77
        L56:
            X.Je3 r3 = r4.A0L
            if (r3 == 0) goto L85
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r3.A04
            boolean r0 = r1.hasFocus()
            if (r0 == 0) goto L85
            android.text.Editable r0 = r1.getText()
            if (r0 == 0) goto L85
            int r0 = r0.length()
            if (r0 == 0) goto L85
            r3.A01()
        L71:
            boolean r0 = X.C9LN.A0C(r4)
            if (r0 == 0) goto L7a
        L77:
            X.C9LN.A0B(r4, r2)
        L7a:
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = r4.A09
            if (r0 == 0) goto L90
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L90
            return r2
        L85:
            X.LVp r0 = r4.A0A
            if (r0 == 0) goto L77
            boolean r0 = r0.A03()
            if (r0 != r2) goto L77
            goto L71
        L90:
            com.instagram.ui.text.ConstrainedEditText r1 = r5.A2M
            boolean r0 = r1.hasFocus()
            if (r0 == 0) goto L9c
            r1.clearFocus()
            return r2
        L9c:
            X.6pc r1 = r5.A1a
            boolean r0 = r1.A03
            if (r0 == 0) goto Lab
            java.lang.Object r0 = r1.get()
            X.AdO r0 = (X.C23629AdO) r0
            r0.onBackPressed()
        Lab:
            X.6pc r1 = r5.A1N
            boolean r0 = r1.A03
            if (r0 == 0) goto Lbe
            java.lang.Object r0 = r1.get()
            X.AdP r0 = (X.C23630AdP) r0
            boolean r0 = r0.onBackPressed()
            if (r0 == 0) goto Lbe
            return r2
        Lbe:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8NW.onBackPressed():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0109, code lost:
    
        if ((r7 instanceof X.BE6) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012c, code lost:
    
        if (r3 != (-1)) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(android.graphics.drawable.Drawable r12, X.C8NW r13, X.C8FC r14) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8NW.A00(android.graphics.drawable.Drawable, X.8NW, X.8FC):int");
    }

    public static final int A01(Drawable drawable, C8NW c8nw, C8FC c8fc, String str, String str2, String str3, List list) {
        if (c8nw.A1X()) {
            if (C18U.A06(C06090Tz.A06, c8nw.A0r, 36320012982296484L)) {
                c8fc.A0P = true;
            }
        }
        int A00 = A00(drawable, c8nw, c8fc);
        C5NG c5ng = new C5NG();
        c5ng.A06 = list;
        c5ng.A03 = str;
        c5ng.A04 = str2;
        c5ng.A05 = str3;
        if (drawable instanceof C194808jg) {
            c5ng.A01(((C194808jg) drawable).A00);
        }
        if (AbstractC209069Mo.A04(drawable)) {
            c5ng.A01 = C5NH.A04;
            C74T A002 = AbstractC209069Mo.A00(drawable);
            if (A002 != null) {
                File A01 = AbstractC917048o.A01();
                C74P c74p = (C74P) A002;
                String absolutePath = new File(A01.getAbsolutePath(), Integer.toHexString(c74p.A0l.hashCode())).getAbsolutePath();
                C14360o3.A0B(absolutePath, 0);
                c74p.A0D = null;
                C74P.A04(c74p, absolutePath);
            }
            C87H c87h = c8nw.A1e;
            if (c87h.A0A.A02() == EnumC189218Zt.A04) {
                c87h.A03();
            }
        } else {
            c5ng.A01 = C5NH.A06;
        }
        c8nw.A0g.put(A00, c5ng);
        A0O(drawable, c8nw);
        return A00;
    }

    private final ImmutableList A05() {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (Drawable drawable : this.A1l.getAllDrawables()) {
            if (drawable instanceof C194808jg) {
                drawable = ((C194808jg) drawable).A04();
            } else if (drawable instanceof C5RM) {
                drawable = ((C5RM) drawable).A08();
            }
            if (drawable instanceof C8OT) {
                builder.add((Object) drawable);
            }
        }
        ImmutableList build = builder.build();
        C14360o3.A07(build);
        return build;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    private final InterfaceC25184BCh A0B(EnumC1810181d enumC1810181d) {
        C150286pc c150286pc;
        switch (enumC1810181d.ordinal()) {
            case 16:
                c150286pc = this.A1R;
                return (InterfaceC25184BCh) c150286pc.get();
            case 17:
                c150286pc = this.A22;
                return (InterfaceC25184BCh) c150286pc.get();
            case Process.SIGSTOP /* 19 */:
                c150286pc = this.A23;
                return (InterfaceC25184BCh) c150286pc.get();
            case 25:
                c150286pc = this.A2A;
                return (InterfaceC25184BCh) c150286pc.get();
            case 26:
                c150286pc = this.A29;
                return (InterfaceC25184BCh) c150286pc.get();
            case 27:
                c150286pc = this.A2C;
                return (InterfaceC25184BCh) c150286pc.get();
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                c150286pc = this.A25;
                return (InterfaceC25184BCh) c150286pc.get();
            case 30:
                c150286pc = this.A2D;
                return (InterfaceC25184BCh) c150286pc.get();
            case 31:
            case 32:
                c150286pc = this.A1N;
                return (InterfaceC25184BCh) c150286pc.get();
            case 33:
                c150286pc = this.A2G;
                return (InterfaceC25184BCh) c150286pc.get();
            case 59:
                c150286pc = this.A2J;
                return (InterfaceC25184BCh) c150286pc.get();
            case 60:
            case 61:
            case 62:
                c150286pc = this.A2B;
                return (InterfaceC25184BCh) c150286pc.get();
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                c150286pc = this.A2I;
                return (InterfaceC25184BCh) c150286pc.get();
            case 64:
                c150286pc = this.A26;
                return (InterfaceC25184BCh) c150286pc.get();
            case 65:
                c150286pc = this.A2H;
                return (InterfaceC25184BCh) c150286pc.get();
            case 66:
                c150286pc = this.A2E;
                return (InterfaceC25184BCh) c150286pc.get();
            case 68:
                c150286pc = this.A24;
                return (InterfaceC25184BCh) c150286pc.get();
            case 73:
                c150286pc = this.A1Q;
                return (InterfaceC25184BCh) c150286pc.get();
            case 74:
                c150286pc = this.A28;
                return (InterfaceC25184BCh) c150286pc.get();
            case 75:
                c150286pc = this.A1W;
                return (InterfaceC25184BCh) c150286pc.get();
            case 78:
                c150286pc = this.A1S;
                return (InterfaceC25184BCh) c150286pc.get();
            case 80:
                c150286pc = this.A1M;
                return (InterfaceC25184BCh) c150286pc.get();
            case 84:
                c150286pc = this.A27;
                return (InterfaceC25184BCh) c150286pc.get();
            default:
                return null;
        }
    }

    public static final void A0N(Drawable drawable, C8NW c8nw) {
        C6RB c6rb;
        if (A0s(drawable)) {
            if (drawable instanceof C6RB) {
                c6rb = (C6RB) drawable;
            } else {
                c6rb = null;
            }
            if (c8nw.A13.A02.A01() == EnumC198268pb.A04) {
                c8nw.A1J.A01(c6rb);
            }
        }
        if (drawable instanceof C194808jg) {
            C194808jg c194808jg = (C194808jg) drawable;
            c194808jg.A07();
            ArrayList A06 = c194808jg.A06(C202588xc.class);
            if (!A06.isEmpty()) {
                Iterator it = A06.iterator();
                while (it.hasNext()) {
                    C202588xc c202588xc = (C202588xc) it.next();
                    c202588xc.A04();
                    if (c202588xc.A0M == EnumC150226pU.A0C) {
                        if (C18U.A06(C06090Tz.A05, c8nw.A0r, 36323139717704738L)) {
                            c8nw.A0R(c194808jg, c202588xc);
                            c194808jg.A09();
                        }
                    }
                }
            }
        }
        if (drawable instanceof C74P) {
            C74P c74p = (C74P) drawable;
            c74p.A0J = true;
            C74P.A03(c74p);
        }
        if ((drawable instanceof BEc) && !(c8nw.A0t.A08.A00 instanceof C81U)) {
            AnonymousClass877 anonymousClass877 = c8nw.A17;
            C14360o3.A0B(drawable, 0);
            AnonymousClass877.A00(drawable, anonymousClass877);
        }
    }

    private final void A0R(C194808jg c194808jg, C202588xc c202588xc) {
        C202588xc A08 = A08(c202588xc);
        A08.A07 = C05F.A01;
        List list = c194808jg.A08;
        list.add(A08);
        A08.setCallback(c194808jg);
        C202588xc A082 = A08(c202588xc);
        A082.A07 = C05F.A0C;
        list.add(A082);
        A082.setCallback(c194808jg);
        if (C18U.A06(C06090Tz.A05, this.A0r, 36323139717835812L)) {
            C202588xc A083 = A08(c202588xc);
            A083.A07 = C05F.A0N;
            list.add(A083);
            A083.setCallback(c194808jg);
        }
    }

    public static final void A0U(C8NW c8nw) {
        C6RB A14 = c8nw.A14();
        if (A14 != null) {
            c8nw.A0h.postDelayed(new RunnableC24654Avo(c8nw, A14), 400L);
        } else {
            c8nw.A0W = true;
            c8nw.A0h.post(new RunnableC24402Arj(c8nw));
        }
    }

    public static final boolean A0u(C8NW c8nw) {
        if (c8nw.CdE() && AbstractC199308rX.A03(c8nw.A0r)) {
            C1816783z c1816783z = c8nw.A13.A02;
            if (c1816783z.A01() == EnumC198268pb.A04 && c1816783z.A01.A0V && c1816783z.A05().size() == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final Drawable A0z() {
        if (A0v(this)) {
            ArrayList A0R = this.A1l.A0R(new C23531Abl());
            C14360o3.A0B(A0R, 0);
            Drawable drawable = (Drawable) AbstractC001800i.A0J(A0R);
            if (!(drawable instanceof C5RM)) {
                return null;
            }
            return drawable;
        }
        return A03(this, C5RU.class);
    }

    public final LinkedHashMap A19() {
        Drawable drawable;
        LinkedHashMap A1A = A1A();
        boolean z = false;
        if (!A1A.isEmpty()) {
            Iterator it = A1A.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (entry != null) {
                    drawable = (Drawable) entry.getKey();
                } else {
                    drawable = null;
                }
                if (AbstractC209069Mo.A01(drawable) != null) {
                    z = true;
                    break;
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry2 : A1A().entrySet()) {
            Drawable drawable2 = (Drawable) entry2.getKey();
            Object value = entry2.getValue();
            if (z || AbstractC209069Mo.A04(drawable2)) {
                linkedHashMap.put(drawable2, value);
            }
        }
        return linkedHashMap;
    }

    public final void A1N(Integer num, boolean z) {
        if (A0r()) {
            Drawable A10 = A10();
            if (A10 != null) {
                A0L(A10);
                return;
            }
            UserSession userSession = this.A0r;
            AnonymousClass229.A01(userSession).A03.A07(AbstractC226359ys.A00(num));
            if (z) {
                this.A1A.E4u(new Object());
            } else {
                ((C9LN) this.A1K.get()).A0H(C8BN.STORY_MUSIC_STICKER, A12(), false);
            }
            if (!(C20Y.A00(userSession).A01.A00 instanceof C125535lz)) {
                return;
            }
            Application application = this.A0l.requireActivity().getApplication();
            C14360o3.A07(application);
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36324393848221840L) && !C18U.A06(c06090Tz, userSession, 36324393848352913L)) {
                return;
            }
            ExpressoImpl A00 = AbstractC47130KsP.A00(application, userSession);
            A00.A02(IBQ.A01);
            if (!C18U.A06(c06090Tz, userSession, 36315876928261792L)) {
                return;
            }
            A00.A02(IBQ.A00);
            return;
        }
        AnonymousClass229.A01(this.A0r).A03.A07(AbstractC226359ys.A00(num));
        A0G();
    }

    public final boolean A1S() {
        Drawable drawable;
        LinkedHashMap A1A = A1A();
        if (A1A.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : A1A.entrySet()) {
            if (entry != null) {
                drawable = (Drawable) entry.getKey();
            } else {
                drawable = null;
            }
            C74T A00 = AbstractC209069Mo.A00(drawable);
            if (A00 != null && ((C74P) A00).A0s) {
                return true;
            }
        }
        return false;
    }

    public final boolean A1U() {
        ImmutableList A05 = A05();
        if (!(A05 instanceof Collection) || !A05.isEmpty()) {
            Iterator<E> it = A05.iterator();
            while (it.hasNext()) {
                C74P c74p = (C74P) it.next();
                String str = c74p.A0E;
                if (str == null || str.length() == 0) {
                    String str2 = c74p.A0l;
                    if (str2 == null || str2.length() == 0) {
                        if (c74p.A0Y != null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // X.C8NY
    public final int Aof() {
        return A02(this);
    }

    @Override // X.C8NY
    public final List BA2() {
        return (List) A04(this).A01;
    }

    @Override // X.C8NZ
    public final boolean Bvk() {
        if (A1V()) {
            if (C18U.A06(C06090Tz.A05, this.A0r, 36319909903474510L)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC150206pS
    public final boolean CYO() {
        if (A04(this).A00 >= 20) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC186088Nc
    public final void CwB() {
        onBackPressed();
    }

    @Override // X.C8NZ
    public final void Cyl(Drawable drawable, InterfaceC148316m1 interfaceC148316m1) {
        C148276lx C0S = interfaceC148316m1.C0S();
        C0S.getClass();
        DoZ(drawable, C0S, null);
    }

    @Override // X.InterfaceC186098Nd
    public final void D92() {
        onBackPressed();
    }

    @Override // X.InterfaceC186068Na
    public final void D95() {
        onBackPressed();
    }

    @Override // X.C8NZ
    public final void DSk(Drawable drawable, InterfaceC148316m1 interfaceC148316m1) {
        C148276lx C0S = interfaceC148316m1.C0S();
        C0S.getClass();
        DoZ(drawable, C0S, null);
        if (drawable != null) {
            String str = ((C148286ly) C0S.A0O.get(0)).A0i;
            C14360o3.A07(str);
            Map map = this.A1r;
            AbstractCollection abstractCollection = (AbstractCollection) map.get(str);
            if (abstractCollection == null) {
                abstractCollection = new ArrayList();
            }
            abstractCollection.add(drawable);
            map.put(str, abstractCollection);
        }
    }

    @Override // X.InterfaceC186158Nj
    public final void Doj() {
        onBackPressed();
    }

    @Override // X.C8NY
    public final void EH5(Drawable drawable, Drawable drawable2) {
        C1817884n c1817884n;
        List list;
        int indexOf;
        if (A0v(this) && (drawable instanceof C5RM)) {
            if (AbstractC226939zp.A00(drawable2, this.A0r)) {
                int i = C5RM.A0D;
                String obj = UUID.randomUUID().toString();
                C14360o3.A07(obj);
                C5RM c5rm = new C5RM(this.A0f, drawable2, obj);
                drawable2 = c5rm;
                C5RM c5rm2 = (C5RM) drawable;
                c5rm.Efo(c5rm2.A01, c5rm2.A00);
                c5rm.A04 = c5rm2.A04;
            }
            InterfaceC08830cm interfaceC08830cm = this.A1s;
            interfaceC08830cm.getClass();
            C191478dz c191478dz = (C191478dz) interfaceC08830cm.get();
            if (drawable2 instanceof C5RM) {
                if (c191478dz.A0G != null) {
                    C1817884n c1817884n2 = c191478dz.A0s.A0N;
                    List list2 = c1817884n2.A02;
                    int indexOf2 = list2.indexOf(drawable);
                    if (indexOf2 >= 0) {
                        list2.set(indexOf2, drawable2);
                        c1817884n2.A0C.Egh(new ArrayList(list2));
                        C1817884n.A00(c1817884n2, drawable, drawable2);
                    }
                } else {
                    List list3 = c191478dz.A15;
                    int indexOf3 = list3.indexOf(drawable);
                    if (indexOf3 >= 0) {
                        list3.set(indexOf3, drawable2);
                    }
                }
            } else if ((drawable instanceof C5RR) && (drawable2 instanceof C5RR) && (indexOf = (list = (c1817884n = c191478dz.A0s.A0N).A01).indexOf(drawable)) >= 0) {
                list.set(indexOf, drawable2);
                c1817884n.A0B.Egh(list);
                C1817884n.A00(c1817884n, drawable, drawable2);
            }
        }
        InteractiveDrawableContainer interactiveDrawableContainer = this.A1l;
        interactiveDrawableContainer.A0o(drawable, drawable2);
        this.A1J.A02(interactiveDrawableContainer.A0R(new C23532Abm(this)));
    }

    @Override // X.C8NY
    public final boolean Ei9() {
        return A0q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v108, types: [X.2ba, java.lang.Object] */
    public C8NW(Activity activity, View view, final View view2, final View view3, final View view4, final View view5, final AbstractC018607g abstractC018607g, C22P c22p, AbstractC59962oe abstractC59962oe, C1819485e c1819485e, InterfaceC11380iw interfaceC11380iw, final UserSession userSession, C3I9 c3i9, final C57012jc c57012jc, C1810981l c1810981l, C89F c89f, C183688Ct c183688Ct, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass874 anonymousClass874, AnonymousClass840 anonymousClass840, C8D4 c8d4, final C8D9 c8d9, C183618Cm c183618Cm, ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t, final C8C0 c8c0, C183918Ds c183918Ds, AnonymousClass877 anonymousClass877, InterfaceC143326dX interfaceC143326dX, C8AD c8ad, InterfaceC183728Cx interfaceC183728Cx, InterfaceC1810081c interfaceC1810081c, C87P c87p, final AnonymousClass844 anonymousClass844, C677733r c677733r, PromptStickerModel promptStickerModel, final InterfaceC169517hR interfaceC169517hR, InteractiveDrawableContainer interactiveDrawableContainer, List list, InterfaceC08830cm interfaceC08830cm, int i, boolean z, boolean z2, boolean z3) {
        final C3I9 A01;
        C14360o3.A0B(activity, 1);
        C14360o3.A0B(anonymousClass840, 2);
        C14360o3.A0B(c8ad, 3);
        C14360o3.A0B(interfaceC1810081c, 4);
        C14360o3.A0B(abstractC018607g, 6);
        C14360o3.A0B(view, 7);
        C14360o3.A0B(interactiveDrawableContainer, 11);
        C14360o3.A0B(c57012jc, 12);
        C14360o3.A0B(c3i9, 14);
        C14360o3.A0B(targetViewSizeProvider, 15);
        C14360o3.A0B(anonymousClass874, 20);
        C14360o3.A0B(anonymousClass877, 21);
        C14360o3.A0B(anonymousClass844, 22);
        C14360o3.A0B(c677733r, 23);
        C14360o3.A0B(c8d4, 25);
        C14360o3.A0B(interfaceC183728Cx, 26);
        C14360o3.A0B(c1810981l, 27);
        C14360o3.A0B(interfaceC11380iw, 28);
        C14360o3.A0B(c8c0, 29);
        C14360o3.A0B(c87p, 30);
        C14360o3.A0B(c89f, 31);
        C14360o3.A0B(c22p, 32);
        C14360o3.A0B(c8d9, 34);
        C14360o3.A0B(c1819485e, 39);
        C14360o3.A0B(c183618Cm, 44);
        this.A13 = anonymousClass840;
        this.A19 = c8ad;
        this.A1A = interfaceC1810081c;
        this.A0r = userSession;
        this.A0h = view;
        this.A1l = interactiveDrawableContainer;
        this.A0s = c3i9;
        this.A10 = targetViewSizeProvider;
        this.A0y = c183688Ct;
        this.A0l = abstractC59962oe;
        this.A14 = viewOnTouchListenerC1829889t;
        this.A12 = anonymousClass874;
        this.A17 = anonymousClass877;
        this.A1g = c677733r;
        this.A1s = interfaceC08830cm;
        this.A1z = c8d4;
        this.A07 = interfaceC183728Cx;
        this.A0t = c1810981l;
        this.A0o = interfaceC11380iw;
        this.A1J = c87p;
        this.A0x = c89f;
        this.A0k = c22p;
        this.A18 = interfaceC143326dX;
        this.A1q = list;
        this.A1h = promptStickerModel;
        this.A1v = z;
        this.A16 = c183918Ds;
        this.A0m = c1819485e;
        this.A1w = z2;
        this.A1x = z3;
        this.A0e = i;
        this.A20 = c183618Cm;
        this.A0g = new SparseArray();
        this.A1u = AbstractC09440dt.A00(EnumC09460dv.A02, new C9ES(this, 7));
        C0YZ c0yz = new C0YZ(C186238Nr.class);
        C1810281e c1810281e = ((C1809981b) interfaceC1810081c).A01;
        this.A1t = AbstractC186288Nw.A00(new C186248Ns(c1810281e), c183618Cm, c0yz);
        this.A1n = C207549Gh.__redex_internal_original_name;
        this.A1p = new ArrayList();
        this.A1r = new HashMap();
        this.A2N = new HashMap();
        this.A1i = new AvatarStickerPreRenderInteractor(null, userSession, 126);
        this.A2L = new C186318Nz(userSession, new C186308Ny(userSession));
        InterfaceC41501vz interfaceC41501vz = new InterfaceC41501vz() { // from class: X.8O0
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                NewFundraiserInfo newFundraiserInfo;
                int A03 = C0f9.A03(-868489715);
                C8P9 c8p9 = (C8P9) obj;
                int A032 = C0f9.A03(1518045599);
                C14360o3.A0B(c8p9, 0);
                C8NW c8nw = C8NW.this;
                C1816383s c1816383s = c8p9.A00;
                ArrayList A0R = c8nw.A1l.A0R(new C23533Abn(C9SW.class));
                C14360o3.A0B(A0R, 0);
                C194808jg c194808jg = (C194808jg) AbstractC001800i.A0J(A0R);
                if (c194808jg == null) {
                    C8NW.A0Y(c8nw, c1816383s);
                    c8nw.A1A.E4u(new A5Q(c1816383s));
                } else {
                    C14360o3.A0C(c194808jg, AbstractC111324zv.A00(484));
                    Object obj2 = c194808jg.A03;
                    if ((obj2 instanceof C1816383s) && ((C1816383s) obj2).A01 != null && (newFundraiserInfo = c1816383s.A01) != null) {
                        c194808jg.A03 = c1816383s;
                        UserSession userSession2 = c8nw.A0r;
                        Context context = c8nw.A0f;
                        TargetViewSizeProvider targetViewSizeProvider2 = c8nw.A10;
                        C14360o3.A0B(context, 1);
                        c8nw.EH5(c194808jg, AbstractC23051AEh.A00(context, userSession2, targetViewSizeProvider2, c1816383s, AbstractC16960so.A1Q("multiple_avatar_standalone_sticker_id", "standalone_fundraiser_sticker_id")));
                        FragmentActivity requireActivity = c8nw.A0l.requireActivity();
                        String str = newFundraiserInfo.A01;
                        str.getClass();
                        AbstractC55224Oeq.A08(requireActivity, userSession2, Integer.valueOf(newFundraiserInfo.A00), str, newFundraiserInfo.A07, newFundraiserInfo.A05, c8nw.A1o, newFundraiserInfo.A08);
                    }
                }
                C0f9.A0A(259072209, A032);
                C0f9.A0A(-1167630158, A03);
            }
        };
        this.A0p = interfaceC41501vz;
        this.A0d = true;
        this.A0H = "";
        this.A0X = true;
        this.A0I = new HashMap();
        this.A2P = true;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 2342169267077658396L)) {
            this.A0D = C05F.A00;
        }
        interfaceC1810081c.A82(this);
        c1810281e.A01(this, EnumC1810181d.A0j);
        this.A0f = activity;
        String str = ((C22F) AnonymousClass229.A01(userSession)).A04.A0L;
        if (str == null) {
            str = C6WI.A02();
            C14360o3.A07(str);
        }
        this.A1o = str;
        this.A1B = new C8O1(interactiveDrawableContainer);
        this.A0i = (ViewGroup) view.requireViewById(R.id.post_capture_interactive_contents_container);
        this.A0j = (TextView) view.requireViewById(R.id.template_preview_sticker_clip_index_label);
        ConstrainedEditText constrainedEditText = (ConstrainedEditText) view.requireViewById(R.id.text_overlay_edit_text);
        this.A2M = constrainedEditText;
        constrainedEditText.setSupportedContentMimeTypes("image/*");
        FittingTextView fittingTextView = (FittingTextView) view.findViewById(R.id.done_button);
        this.A1j = fittingTextView;
        if (fittingTextView != null) {
            AbstractC56952jT.A04(fittingTextView, C05F.A01);
        }
        InterfaceC183728Cx interfaceC183728Cx2 = this.A07;
        this.A07 = interfaceC183728Cx2;
        this.A1l.A0T = interfaceC183728Cx2.CSl();
        C1811981v c1811981v = c1810981l.A08;
        this.A05 = (C55U) c1811981v.A00;
        C8O5 c8o5 = new C8O5(viewOnTouchListenerC1829889t);
        this.A15 = c8o5;
        c8o5.A01 = this;
        this.A1k = (EyedropperColorPickerTool) view.requireViewById(R.id.eyedropper_color_picker_tool);
        this.A1y = new C8O6(userSession);
        this.A0z = new C8O8() { // from class: X.8O7
            @Override // X.C8O8
            public final void Doh(String str2) {
                C8NW c8nw = C8NW.this;
                C22C A012 = AnonymousClass229.A01(c8nw.A0r);
                String moduleName = c8nw.A0o.getModuleName();
                EnumC50631MWs A12 = c8nw.A12();
                C183918Ds c183918Ds2 = c8nw.A16;
                boolean z4 = true;
                if (c183918Ds2 == null || !c183918Ds2.A03.A0G) {
                    z4 = false;
                }
                A012.A1P(A12, Boolean.valueOf(z4), str2, moduleName);
            }

            @Override // X.C8O8
            public final void Dom(String str2) {
                C8NW c8nw = C8NW.this;
                AnonymousClass229.A01(c8nw.A0r).A1T(c8nw.A12(), str2, c8nw.A0o.getModuleName());
            }
        };
        C8D6 c8d6 = (C8D6) new C52942bb(new C8D5(abstractC59962oe.requireActivity(), userSession), abstractC59962oe).A00(C8D6.class);
        this.A1H = c8d6;
        c8d6.A01.A06(abstractC59962oe, new C151846sU(new InterfaceC58362lv() { // from class: X.8O9
            @Override // X.InterfaceC58362lv
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                C5NL c5nl;
                InterfaceC1810081c interfaceC1810081c2;
                Object obj2;
                Object obj3;
                AbstractC223919ua abstractC223919ua = (AbstractC223919ua) obj;
                C14360o3.A0B(abstractC223919ua, 0);
                C8NW c8nw = C8NW.this;
                if (abstractC223919ua instanceof C219629nA) {
                    boolean z4 = c8nw.A0P;
                    InterfaceC1810081c interfaceC1810081c3 = c8nw.A1A;
                    if (z4) {
                        interfaceC1810081c3.E4u(new Object());
                        c8nw.A0P = false;
                    } else {
                        interfaceC1810081c3.E4u(new Object());
                        View view6 = c8nw.A04;
                        if (view6 != null) {
                            view6.setVisibility(0);
                        }
                        Drawable A00 = c8nw.A1H.A00();
                        if (A00 != null) {
                            c8nw.A1l.A0p(A00, false);
                        }
                    }
                    C8NW.A0e(c8nw, false);
                    return;
                }
                if (abstractC223919ua instanceof C219639nB) {
                    c8nw.A1A.E4u(new Object());
                    View view7 = c8nw.A04;
                    if (view7 != null) {
                        view7.setVisibility(8);
                    }
                    Drawable A002 = c8nw.A1H.A00();
                    if (A002 != null) {
                        c8nw.A1l.A0p(A002, true);
                    }
                } else if (abstractC223919ua instanceof C219649nC) {
                    InterfaceC1810081c interfaceC1810081c4 = c8nw.A1A;
                    if (interfaceC1810081c4.CRB(EnumC1810181d.A0j)) {
                        c8nw.A0P = true;
                    }
                    interfaceC1810081c4.E4u(new Object());
                    View view8 = c8nw.A04;
                    if (view8 != null) {
                        view8.setVisibility(8);
                    }
                } else {
                    if (abstractC223919ua instanceof C219579n5) {
                        interfaceC1810081c2 = c8nw.A1A;
                        if (interfaceC1810081c2.CRB(EnumC1810181d.A0j)) {
                            obj2 = new Object();
                        } else {
                            obj2 = new Object();
                        }
                    } else {
                        if (abstractC223919ua instanceof C219599n7) {
                            InterfaceC1810081c interfaceC1810081c5 = c8nw.A1A;
                            if (interfaceC1810081c5.CRB(EnumC1810181d.A0j)) {
                                c8nw.A1E(c8nw.A0z());
                                return;
                            }
                            if (!interfaceC1810081c5.CRB(EnumC1810181d.A09)) {
                                return;
                            }
                            C8NW.A0e(c8nw, true);
                            Drawable drawable = ((C219599n7) abstractC223919ua).A00;
                            if (drawable != null) {
                                c8nw.A1l.A0p(drawable, true);
                                obj3 = new Object();
                            } else {
                                obj3 = new Object();
                            }
                            interfaceC1810081c5.E4u(obj3);
                            return;
                        }
                        if (abstractC223919ua instanceof C219569n4) {
                            C8NW.A0e(c8nw, true);
                            interfaceC1810081c2 = c8nw.A1A;
                            if (interfaceC1810081c2.CRB(EnumC1810181d.A0j)) {
                                obj2 = new Object();
                            } else {
                                obj2 = new Object();
                            }
                        } else {
                            if (abstractC223919ua instanceof C219619n9) {
                                C219619n9 c219619n9 = (C219619n9) abstractC223919ua;
                                Drawable drawable2 = c219619n9.A01;
                                int i2 = c219619n9.A00;
                                boolean z5 = drawable2 instanceof C5RM;
                                if (z5) {
                                    c5nl = ((C5RM) drawable2).C0T();
                                } else {
                                    c5nl = null;
                                }
                                if (!(c5nl instanceof C5QI)) {
                                    return;
                                }
                                C5QI c5qi = (C5QI) c5nl;
                                C5NM c5nm = c5qi.A02;
                                C14360o3.A0A(c5nm);
                                C5NL A003 = c5nm.A00();
                                if (!(A003 instanceof C5QK)) {
                                    return;
                                }
                                C6RB A02 = AMH.A02(c8nw.A0f, c8nw.A0r, c8nw.A05, (C5QK) A003);
                                C8FC c8fc = new C8FC((C8D0) null, (C8FD) null, (C89G) null, C05F.A00, (Integer) null, (Integer) null, (Object) "StickerOverlayController", (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, true, false, true, true, false, false, !(A02 instanceof AbstractC202988yG), true, true, true, true, true, false, false);
                                InteractiveDrawableContainer interactiveDrawableContainer2 = c8nw.A1l;
                                C202278x7 A0M = interactiveDrawableContainer2.A0M(drawable2);
                                C14360o3.A0C(drawable2, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.sundial.timedstickers.TimedStickerDrawable");
                                C5RM c5rm = (C5RM) drawable2;
                                int i3 = c5rm.A01;
                                int i4 = c5rm.A00;
                                C5RM c5rm2 = new C5RM(c5rm, c5qi, A02);
                                c5rm2.Efo(i2, i4);
                                c5rm.Efo(i3, i2 - 1);
                                if (!z5) {
                                    return;
                                }
                                c5rm2.A0A.setCallback(C8NW.A0C(c5rm2, c8nw, c8fc));
                                int A0J = interactiveDrawableContainer2.A0J(c5rm2, c8fc, C138436Oz.A0A(c5rm2), false, false);
                                if (A0M != null) {
                                    AHh.A01(A0M, InteractiveDrawableContainer.A02(interactiveDrawableContainer2, A0J));
                                }
                                InterfaceC08830cm interfaceC08830cm2 = c8nw.A1s;
                                interfaceC08830cm2.getClass();
                                ClipsCreationViewModel clipsCreationViewModel = ((C191478dz) interfaceC08830cm2.get()).A0s;
                                C09530e4 c09530e4 = new C09530e4(c5rm, c5rm2);
                                ClipsCreationViewModel.A03(EnumC191648eM.A0T, clipsCreationViewModel, true);
                                C1817884n c1817884n = clipsCreationViewModel.A0N;
                                List list2 = c1817884n.A02;
                                list2.add(c09530e4.A01);
                                c1817884n.A0C.Egh(new ArrayList(list2));
                                c1817884n.A08.F8m(c09530e4);
                                return;
                            }
                            if (!(abstractC223919ua instanceof C219609n8)) {
                                return;
                            }
                            Drawable drawable3 = ((C219609n8) abstractC223919ua).A00;
                            if (!(drawable3 instanceof C5RM)) {
                                return;
                            }
                            C5RM c5rm3 = (C5RM) drawable3;
                            if (!(c5rm3.A0A instanceof C6RB)) {
                                return;
                            }
                            C5QI c5qi2 = (C5QI) c5rm3.C0T();
                            C5NM c5nm2 = c5qi2.A02;
                            C14360o3.A0A(c5nm2);
                            C5NL A004 = c5nm2.A00();
                            if (!(A004 instanceof C5QK)) {
                                return;
                            }
                            C6RB A022 = AMH.A02(c8nw.A0f, c8nw.A0r, c8nw.A05, (C5QK) A004);
                            C190398bx c190398bx = (C190398bx) c8nw.A1d.get();
                            c190398bx.A1r.put(A022, Float.valueOf(1.0f));
                            c190398bx.A1q.put(A022, new PointF(0.5f, 0.5f));
                            Integer num = C05F.A00;
                            C8FC c8fc2 = new C8FC((C8D0) null, (C8FD) null, (C89G) null, num, (Integer) null, (Integer) null, (Object) "StickerOverlayController", (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, true, false, true, true, false, false, !(A022 instanceof AbstractC202988yG), true, true, true, true, true, false, false);
                            InteractiveDrawableContainer interactiveDrawableContainer3 = c8nw.A1l;
                            C202278x7 A0M2 = interactiveDrawableContainer3.A0M(drawable3);
                            C5RM c5rm4 = new C5RM(c5rm3, c5qi2, A022);
                            c5rm4.A0A.setCallback(C8NW.A0C(c5rm4, c8nw, c8fc2));
                            InterfaceC08830cm interfaceC08830cm3 = c8nw.A1s;
                            interfaceC08830cm3.getClass();
                            C191478dz c191478dz = (C191478dz) interfaceC08830cm3.get();
                            ClipsCreationViewModel clipsCreationViewModel2 = c191478dz.A0s;
                            ClipsCreationViewModel.A03(EnumC191648eM.A0Q, clipsCreationViewModel2, true);
                            clipsCreationViewModel2.A0N.A01(c5rm4);
                            c191478dz.A0T.removeCallbacksAndMessages(null);
                            if (c8nw.A1A.Cap()) {
                                c8nw.A1p.add(c5rm4);
                                if (c8nw.A1I.A0M()) {
                                    num = C05F.A0C;
                                }
                                c5rm4.A03 = num;
                            }
                            int A0J2 = interactiveDrawableContainer3.A0J(c5rm4, c8fc2, C138436Oz.A0A(c5rm4), false, false);
                            if (A0M2 == null) {
                                return;
                            }
                            AHh.A01(A0M2, InteractiveDrawableContainer.A02(interactiveDrawableContainer3, A0J2));
                            return;
                        }
                    }
                    interfaceC1810081c2.E4u(obj2);
                    return;
                }
                C8NW.A0e(c8nw, true);
            }
        }));
        c8d6.A00.A06(abstractC59962oe, new C151846sU(new InterfaceC58362lv() { // from class: X.8OA
            @Override // X.InterfaceC58362lv
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                Object obj2;
                C219549n2 c219549n2;
                AbstractC223909uZ abstractC223909uZ = (AbstractC223909uZ) obj;
                C14360o3.A0B(abstractC223909uZ, 0);
                C8NW c8nw = C8NW.this;
                C8A8 c8a8 = (C8A8) c8nw.A1H.A00.A02();
                if (c8a8 != null) {
                    obj2 = c8a8.A01;
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof C219549n2) {
                    Drawable drawable = null;
                    if ((abstractC223909uZ instanceof C219549n2) && (c219549n2 = (C219549n2) abstractC223909uZ) != null) {
                        drawable = c219549n2.A00;
                    }
                    C8NW.A0M(drawable, c8nw);
                    return;
                }
                View view6 = c8nw.A04;
                if (view6 == null) {
                    return;
                }
                c8nw.A0i.removeView(view6);
            }
        }));
        FragmentActivity fragmentActivity = (FragmentActivity) activity;
        this.A1I = (C89P) new C52942bb(AbstractC183548Cd.A00(fragmentActivity, userSession), fragmentActivity).A00(C89P.class);
        Application application = fragmentActivity.getApplication();
        C14360o3.A07(application);
        this.A11 = (ClipsAssetHubViewModel) new C52942bb(new C86V(application, userSession), fragmentActivity).A00(ClipsAssetHubViewModel.class);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
        C9DH c9dh = new C9DH(this, viewLifecycleOwner, c07s, null, 26);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        Integer num = C05F.A00;
        AbstractC23641Du.A03(num, anonymousClass191, c9dh, A00);
        C183828Di c183828Di = (C183828Di) new C52942bb(abstractC59962oe).A00(C183828Di.class);
        this.A1E = c183828Di;
        c183828Di.A01.A06(abstractC59962oe, new C151846sU(new InterfaceC58362lv() { // from class: X.8OB
            @Override // X.InterfaceC58362lv
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                BEd A02;
                AbstractC223849uT abstractC223849uT = (AbstractC223849uT) obj;
                C14360o3.A0B(abstractC223849uT, 0);
                if (abstractC223849uT instanceof C219059mF) {
                    InteractiveDrawableContainer interactiveDrawableContainer2 = C8NW.this.A1l;
                    int i2 = ((C219059mF) abstractC223849uT).A00;
                    if (i2 != -1) {
                        BEd A022 = InteractiveDrawableContainer.A02(interactiveDrawableContainer2, i2);
                        if (A022 != null) {
                            ((C9LJ) A022).A0I = "pinned_gallery_sticker_group";
                        }
                        InteractiveDrawableContainer.A0A(interactiveDrawableContainer2, "pinned_gallery_sticker_group");
                        return;
                    }
                    return;
                }
                if (abstractC223849uT instanceof C219069mG) {
                    InteractiveDrawableContainer interactiveDrawableContainer3 = C8NW.this.A1l;
                    int i3 = ((C219069mG) abstractC223849uT).A00;
                    if (i3 == -1 || (A02 = InteractiveDrawableContainer.A02(interactiveDrawableContainer3, i3)) == null) {
                        return;
                    }
                    C9LJ c9lj = (C9LJ) A02;
                    String str2 = c9lj.A0I;
                    c9lj.A0I = null;
                    if (str2 == null) {
                        return;
                    }
                    InteractiveDrawableContainer.A0A(interactiveDrawableContainer3, str2);
                    return;
                }
                if (abstractC223849uT instanceof C219079mH) {
                    C8NW c8nw = C8NW.this;
                    C219079mH c219079mH = (C219079mH) abstractC223849uT;
                    c8nw.A19.DpR(new ArrayList(c8nw.A1l.A0X(c219079mH.A00).values()), c219079mH.A01);
                } else {
                    if (abstractC223849uT instanceof C219089mI) {
                        C8NW c8nw2 = C8NW.this;
                        C219089mI c219089mI = (C219089mI) abstractC223849uT;
                        int i4 = c219089mI.A00;
                        Drawable drawable = c219089mI.A01;
                        c8nw2.A0g.put(i4, c219089mI.A02);
                        C8NW.A0N(drawable, c8nw2);
                        C8NW.A0O(drawable, c8nw2);
                        return;
                    }
                    if (!(abstractC223849uT instanceof C219099mJ)) {
                        return;
                    }
                    C219099mJ c219099mJ = (C219099mJ) abstractC223849uT;
                    C8NW.A0P(c219099mJ.A01, C8NW.this, c219099mJ.A00, c219099mJ.A02, true);
                }
            }
        }));
        this.A1C = (C8OD) new C52942bb(new C8OC(userSession, C18U.A06(c06090Tz, userSession, 36319909903605584L), AbstractC13890nF.A01(activity)), abstractC59962oe).A00(C8OD.class);
        C8OF c8of = (C8OF) new C52942bb((InterfaceC52932ba) new Object(), abstractC59962oe).A00(C8OF.class);
        this.A1D = c8of;
        c8of.A00.A06(abstractC59962oe, new InterfaceC58362lv() { // from class: X.8OG
            @Override // X.InterfaceC58362lv
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                C44063Jdo c44063Jdo;
                C8NW c8nw = C8NW.this;
                if (obj != null) {
                    if (obj instanceof C219049mE) {
                        C0fJ.A00(AbstractC54025Nub.A00(c8nw.A0l.requireActivity(), new OEQ(new OAI(new DialogInterfaceOnClickListenerC23152ANr(c8nw), EnumC193348hE.A06, 2131974754), new OAI(new DialogInterfaceOnClickListenerC23153ANs(c8nw), null, 2131974753), null, null, null, 2131974755, 2131974752)).A02());
                        return;
                    }
                    if (obj instanceof C219039mD) {
                        C183828Di c183828Di2 = c8nw.A1E;
                        if (c183828Di2 != null) {
                            c183828Di2.A04();
                        }
                        C150286pc c150286pc = c8nw.A1K;
                        if (c150286pc == null || !c150286pc.A03 || (c44063Jdo = ((C9LN) c150286pc.get()).A0B) == null) {
                            return;
                        }
                        C0fA.A00(c44063Jdo, -883493503);
                        return;
                    }
                    if (!(obj instanceof C219029mC)) {
                        return;
                    }
                    C23108AGw A15 = c8nw.A15();
                    Context context = c8nw.A0f;
                    String moduleName = c8nw.A0o.getModuleName();
                    UserSession userSession2 = c8nw.A0r;
                    StoryPromptType storyPromptType = StoryPromptType.A0G;
                    List singletonList = Collections.singletonList(C17060sy.A01.A01(userSession2));
                    C14360o3.A07(singletonList);
                    PromptStickerModel promptStickerModel2 = new PromptStickerModel(null, storyPromptType, null, C05F.A00, "", "", null, null, null, singletonList, 0, 0, false, false, false);
                    C14360o3.A0B(context, 0);
                    C14360o3.A0B(moduleName, 1);
                    C8P7 c8p7 = new C8P7(context, userSession2, promptStickerModel2, moduleName, 112, false, false);
                    AEM.A01(A15, null);
                    C8NW.A00(c8p7, c8nw, new C8FC(A15));
                    C202278x7 c202278x7 = c8nw.A0B;
                    if (c202278x7 != null) {
                        AHh.A01(c202278x7, InteractiveDrawableContainer.A00(c8p7, c8nw.A1l));
                    }
                    c8nw.A19.Doe(c8p7);
                    C183688Ct.A0H(c8nw.A0y, false, false);
                }
            }
        });
        AbstractC23641Du.A03(num, anonymousClass191, new C206639Cu(this, null, 40), AbstractC57302k5.A00(abstractC59962oe.getLifecycle()));
        this.A1e = ((C87G) new C52942bb(fragmentActivity).A00(C87G.class)).A00("post_capture");
        InterfaceC018407e interfaceC018407e = (InterfaceC018407e) activity;
        C14360o3.A0B(interfaceC018407e, 0);
        this.A1m = (C89N) new C52942bb(new C89M(userSession), interfaceC018407e).A00(C89N.class);
        C8ON c8on = ((AnonymousClass483.A04(list) ^ true) || z) ? (C8ON) new C52942bb(interfaceC018407e).A00(C8ON.class) : null;
        this.A2K = c8on;
        Application application2 = fragmentActivity.getApplication();
        C14360o3.A07(application2);
        this.A1f = (C8CS) new C52942bb(new C8CR(application2, userSession), interfaceC018407e).A00(C8CS.class);
        Application application3 = fragmentActivity.getApplication();
        C14360o3.A07(application3);
        this.A0u = (C8OP) new C52942bb(new C8OO(application3, userSession), abstractC59962oe).A00(C8OP.class);
        c1810981l.A0H(new AnonymousClass822() { // from class: X.8OU
            @Override // X.AnonymousClass822
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                C55U c55u = (C55U) obj;
                C14360o3.A0B(c55u, 0);
                C8NW.A0Q(c55u, C8NW.this);
            }
        });
        this.A1P = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8OV
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = C8NW.this;
                return new C190988cu(c8nw.A0f, c8nw.A10, c8nw.A1l);
            }
        }, new InterfaceC143366db[0]);
        final boolean z4 = anonymousClass840.A02.A01.A04 != null;
        final boolean z5 = C17060sy.A01.A01(userSession).A0M() == C05F.A0C;
        this.A1R = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8OW
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                String str2;
                C8NW c8nw = this;
                AbstractC59962oe abstractC59962oe2 = c8nw.A0l;
                FragmentActivity requireActivity = abstractC59962oe2.requireActivity();
                View view6 = c8nw.A0h;
                C3I9 c3i92 = c8nw.A0s;
                UserSession userSession2 = c8nw.A0r;
                AbstractC018607g abstractC018607g2 = abstractC018607g;
                C55U c55u = c8nw.A05;
                Context requireContext = abstractC59962oe2.requireContext();
                if (c55u instanceof C128535rM) {
                    str2 = "user_tagging_page";
                } else {
                    str2 = "story_user_tag_page";
                }
                InterfaceC169517hR A012 = AbstractC183898Dp.A01(requireContext, abstractC018607g2, userSession2, str2, false, false);
                InterfaceC1810081c interfaceC1810081c2 = c8nw.A1A;
                AnonymousClass840 anonymousClass8402 = c8nw.A13;
                C190388bw c190388bw = (C190388bw) userSession2.A01(C190388bw.class, new B8P(userSession2, 40));
                return new APn(view6, requireActivity, abstractC59962oe2, userSession2, c3i92, c8nw.A0z, c8nw.A10, anonymousClass8402, interfaceC1810081c2, c8nw, c190388bw, A012, z4, z5);
            }
        }, new InterfaceC143366db[0]);
        this.A24 = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8OX
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = C8NW.this;
                UserSession userSession2 = c8nw.A0r;
                AnonymousClass840 anonymousClass8402 = c8nw.A13;
                String moduleName = c8nw.A0o.getModuleName();
                InterfaceC1810081c interfaceC1810081c2 = c8nw.A1A;
                View view6 = c8nw.A0h;
                C3I9 c3i92 = c8nw.A0s;
                C190388bw c190388bw = (C190388bw) userSession2.A01(C190388bw.class, new B8P(userSession2, 40));
                return new C23710Aej(view6, c8nw.A0l, userSession2, c3i92, c8nw.A0z, anonymousClass8402, interfaceC1810081c2, c8nw, c190388bw, moduleName);
            }
        }, new InterfaceC143366db[0]);
        this.A22 = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8OY
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = C8NW.this;
                return new ViewOnFocusChangeListenerC70880Wil(c8nw.A0h, c8nw.A0l.requireActivity(), c8nw.A0r, c8nw.A0s, c8nw.A0z, c8nw.A1A, c8nw);
            }
        }, new InterfaceC143366db[0]);
        this.A23 = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8OZ
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = C8NW.this;
                return new ViewOnFocusChangeListenerC23258ASt(c8nw.A0h, c8nw.A0s, c8nw.A0z, c8nw.A1A, c8nw);
            }
        }, new InterfaceC143366db[0]);
        this.A1b = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8Oa
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = C8NW.this;
                return new ViewOnFocusChangeListenerC23261ASw(c8nw.A0h, c8nw.A0r, c8nw.A0s, c8nw.A1A, c8nw);
            }
        }, new InterfaceC143366db[0]);
        this.A1Y = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8Ob
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                String str2;
                C8NW c8nw = this;
                View view6 = c8nw.A0h;
                UserSession userSession2 = c8nw.A0r;
                AbstractC59962oe abstractC59962oe2 = c8nw.A0l;
                C3I9 c3i92 = c8nw.A0s;
                InterfaceC1810081c interfaceC1810081c2 = c8nw.A1A;
                AbstractC018607g abstractC018607g2 = abstractC018607g;
                C55U c55u = c8nw.A05;
                Context requireContext = abstractC59962oe2.requireContext();
                if (c55u instanceof C128535rM) {
                    str2 = "user_tagging_page";
                } else {
                    str2 = "story_user_tag_page";
                }
                return new APo(view6, AbstractC018607g.A00(abstractC59962oe2), abstractC59962oe2, userSession2, c3i92, interfaceC1810081c2, c8nw, AbstractC183898Dp.A01(requireContext, abstractC018607g2, userSession2, str2, false, true), ((NineSixteenLayoutConfigImpl) c8nw.A10).A0K.getWidth());
            }
        }, new InterfaceC143366db[0]);
        this.A2A = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8Oc
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = C8NW.this;
                return new ViewOnFocusChangeListenerC23254ASp(c8nw.A0f, c8nw.A0h, c8nw.A0r, c8nw.A0s, c8nw.A0z, c8nw);
            }
        }, new InterfaceC143366db[0]);
        this.A29 = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8Od
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = C8NW.this;
                return new C70860WiQ(c8nw.A0h, c8nw.A0r, c8nw.A0s, c8nw.A1A, c8nw);
            }
        }, new InterfaceC143366db[0]);
        this.A26 = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8Oe
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = C8NW.this;
                FragmentActivity requireActivity = c8nw.A0l.requireActivity();
                UserSession userSession2 = c8nw.A0r;
                InterfaceC1810081c interfaceC1810081c2 = c8nw.A1A;
                View view6 = c8nw.A0h;
                C23749AfM c23749AfM = new C23749AfM(view6);
                return new C70861WiR(view6, requireActivity, userSession2, c8nw.A0s, c8nw.A0z, c23749AfM, interfaceC1810081c2, c8nw, "join_chat_sticker_bundle_id");
            }
        }, new InterfaceC143366db[0]);
        this.A2H = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8Of
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = C8NW.this;
                FragmentActivity requireActivity = c8nw.A0l.requireActivity();
                UserSession userSession2 = c8nw.A0r;
                InterfaceC1810081c interfaceC1810081c2 = c8nw.A1A;
                View view6 = c8nw.A0h;
                C23750AfN c23750AfN = new C23750AfN(view6);
                return new C70861WiR(view6, requireActivity, userSession2, c8nw.A0s, c8nw.A0z, c23750AfN, interfaceC1810081c2, c8nw, "subscriber_chat_sticker_bundle_id");
            }
        }, new InterfaceC143366db[0]);
        this.A2D = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8Og
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = C8NW.this;
                return new ViewOnFocusChangeListenerC70237WNa(c8nw.A0h, c8nw.A0r, c8nw.A0s, c8nw.A0z, c8nw.A10, c8nw);
            }
        }, new InterfaceC143366db[0]);
        this.A1N = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8Oh
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = this;
                View view6 = c8nw.A0h;
                AbstractC59962oe abstractC59962oe2 = c8nw.A0l;
                InterfaceC25221BDv A09 = C8NW.A09((C55U) c8nw.A0t.A08.A00, c8nw);
                UserSession userSession2 = c8nw.A0r;
                InterfaceC1810081c interfaceC1810081c2 = c8nw.A1A;
                TargetViewSizeProvider targetViewSizeProvider2 = c8nw.A10;
                C3I9 c3i92 = c8nw.A0s;
                C8O8 c8o8 = c8nw.A0z;
                C8C0 c8c02 = c8c0;
                return new C23630AdP(view6, abstractC59962oe2.requireActivity(), abstractC59962oe2, userSession2, c3i92, c8o8, targetViewSizeProvider2, c8d9, c8c02, A09, interfaceC1810081c2, c8nw);
            }
        }, new InterfaceC143366db[0]);
        this.A2G = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8Oi
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = C8NW.this;
                return new WP8(c8nw.A0h, c8nw.A0r, c8nw.A0s, c8nw.A0z, c8nw.A10, c8nw);
            }
        }, new InterfaceC143366db[0]);
        this.A2C = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8Oj
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = C8NW.this;
                return new ViewOnFocusChangeListenerC23260ASv(c8nw.A0h, c8nw.A0r, c8nw.A0s, c8nw.A0z, c8nw.A1A, c8nw);
            }
        }, new InterfaceC143366db[0]);
        this.A25 = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8Ok
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = C8NW.this;
                return new ViewOnFocusChangeListenerC23255ASq(c8nw.A0h, c8nw.A0s, c8nw.A1A, c8nw);
            }
        }, new InterfaceC143366db[0]);
        this.A1Z = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8Ol
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = this;
                Context context = c8nw.A0f;
                UserSession userSession2 = c8nw.A0r;
                AbstractC018607g abstractC018607g2 = abstractC018607g;
                AbstractC59962oe abstractC59962oe2 = c8nw.A0l;
                String str2 = c8nw.A1o;
                return new C23127AMf(context, abstractC018607g2, abstractC59962oe2, c8nw.A0o, userSession2, C8NW.A0A(c8nw), c8nw, str2);
            }
        }, new InterfaceC143366db[0]);
        this.A2J = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8Om
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = C8NW.this;
                return new OyU(c8nw.A0l.requireActivity(), c8nw.A0h, c8nw.A0r, c8nw.A0s, c8nw.A1A, c8nw);
            }
        }, new InterfaceC143366db[0]);
        this.A2I = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8On
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = C8NW.this;
                return new C48623Lez(c8nw.A0f, c8nw.A0h, c8nw.A0r, c8nw);
            }
        }, new InterfaceC143366db[0]);
        this.A1K = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8Oo
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0081, code lost:
            
                if (r2 == X.C22P.A2R) goto L13;
             */
            @Override // X.InterfaceC08830cm
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ java.lang.Object get() {
                /*
                    Method dump skipped, instructions count: 323
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C186468Oo.get():java.lang.Object");
            }
        }, new InterfaceC143366db[0]);
        this.A1T = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8Op
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = C8NW.this;
                AnonymousClass840 anonymousClass8402 = c8nw.A13;
                InterfaceC1810081c interfaceC1810081c2 = c8nw.A1A;
                AnonymousClass877 anonymousClass8772 = c8nw.A17;
                AbstractC59962oe abstractC59962oe2 = c8nw.A0l;
                UserSession userSession2 = c8nw.A0r;
                return new C23984AkJ(c8nw.A0h, abstractC59962oe2, userSession2, c8nw.A10, anonymousClass8402, anonymousClass8772, interfaceC1810081c2, c8nw, anonymousClass844, c8nw.A0o.getModuleName());
            }
        }, new InterfaceC143366db[0]);
        final boolean z6 = z5;
        final boolean z7 = z4;
        this.A1a = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8Oq
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = this;
                InterfaceC1810081c interfaceC1810081c2 = c8nw.A1A;
                View view6 = c8nw.A0h;
                UserSession userSession2 = c8nw.A0r;
                ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t2 = c8nw.A14;
                EyedropperColorPickerTool eyedropperColorPickerTool = c8nw.A1k;
                AbstractC59962oe abstractC59962oe2 = c8nw.A0l;
                C8C0 c8c02 = c8c0;
                return new C23629AdO(view6, abstractC59962oe2, userSession2, c8nw.A10, c8d9, viewOnTouchListenerC1829889t2, c8c02, C8NW.A0A(c8nw), interfaceC1810081c2, c8nw, eyedropperColorPickerTool);
            }
        }, new InterfaceC143366db[0]);
        this.A1X = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8Or
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = this;
                View view6 = c8nw.A0h;
                UserSession userSession2 = c8nw.A0r;
                TargetViewSizeProvider targetViewSizeProvider2 = c8nw.A10;
                return new AAI(view6, c8nw.A0o, userSession2, targetViewSizeProvider2, new MEB(17, c57012jc, view2, c8nw, view3, view5));
            }
        }, new InterfaceC143366db[0]);
        this.A2B = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8Os
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = C8NW.this;
                UserSession userSession2 = c8nw.A0r;
                FragmentActivity requireActivity = c8nw.A0l.requireActivity();
                String moduleName = c8nw.A0o.getModuleName();
                return new C23853Ah5(requireActivity, c8nw.A0h, userSession2, c8nw.A0s, c8nw.A0z, c8nw.A1A, c8nw, moduleName);
            }
        }, new InterfaceC143366db[0]);
        this.A1S = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8Ot
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = C8NW.this;
                return new C23854Ah6(c8nw.A0h, c8nw.A0i, c8nw.A0l, c8nw.A0r, c8nw.A0z, c8nw.A17, c8nw, c8nw.A0o.getModuleName());
            }
        }, new InterfaceC143366db[0]);
        if (Build.VERSION.SDK_INT >= 30) {
            A01 = C3I7.A00(view);
        } else {
            A01 = C3I7.A01(this, false, false);
        }
        C14360o3.A0A(A01);
        this.A1c = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8Ou
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = this;
                Context context = c8nw.A0f;
                AbstractC59962oe abstractC59962oe2 = c8nw.A0l;
                return new C70827Whk(context, c8nw.A0h, abstractC59962oe2, abstractC59962oe2, abstractC018607g, c8nw.A0o, c8nw.A0r, A01, c8nw.A10, c8nw.A1A);
            }
        }, new InterfaceC143366db[0]);
        this.A1O = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8Ov
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = C8NW.this;
                UserSession userSession2 = c8nw.A0r;
                return new C24150AnZ(c8nw.A0h, c8nw.A0l, userSession2, c8nw, c8nw.A1l);
            }
        }, new InterfaceC143366db[0]);
        this.A2E = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8Ow
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = C8NW.this;
                View view6 = c8nw.A0h;
                return new C23852Ah4(c8nw.A0l.requireActivity(), c8nw.A0f, view6, c8nw.A0o, c8nw.A0r, c8nw.A0z, c8nw);
            }
        }, new InterfaceC143366db[0]);
        this.A1L = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8Ox
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = C8NW.this;
                View view6 = c8nw.A0h;
                InterfaceC1810081c interfaceC1810081c2 = c8nw.A1A;
                return new C23709Aei(view6, c8nw.A0r, c8nw.A0s, interfaceC1810081c2, c8nw, c8nw.A0o.getModuleName());
            }
        }, new InterfaceC143366db[0]);
        this.A28 = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8Oy
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = C8NW.this;
                return new ViewOnFocusChangeListenerC23256ASr(c8nw.A0h, c8nw.A0s, c8nw.A1A, c8nw);
            }
        }, new InterfaceC143366db[0]);
        this.A1W = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8Oz
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = C8NW.this;
                View view6 = c8nw.A0h;
                UserSession userSession2 = c8nw.A0r;
                String moduleName = c8nw.A0o.getModuleName();
                return new ViewOnFocusChangeListenerC23259ASu(view6, userSession2, c8nw.A0s, c8nw.A1A, c8nw, moduleName);
            }
        }, new InterfaceC143366db[0]);
        this.A1M = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8P0
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = C8NW.this;
                FragmentActivity requireActivity = c8nw.A0l.requireActivity();
                UserSession userSession2 = c8nw.A0r;
                return new C48624Lf0(requireActivity, c8nw.A0h, userSession2, c8nw.A1A, c8nw, c8nw.A1l);
            }
        }, new InterfaceC143366db[0]);
        this.A1Q = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8P1
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = C8NW.this;
                return new C56181Owo(c8nw.A0h, c8nw.A0r, c8nw.A0s, new B8Q(c8nw, 26), new B8U(c8nw, 46));
            }
        }, new InterfaceC143366db[0]);
        this.A27 = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8P2
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = C8NW.this;
                return new ViewOnFocusChangeListenerC23257ASs(c8nw.A0h, c8nw.A0s, c8nw, ((C1809981b) c8nw.A1A).A01);
            }
        }, new InterfaceC143366db[0]);
        this.A1V = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8P3
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                return new C23728Af1(C8NW.this.A1l);
            }
        }, new InterfaceC143366db[0]);
        this.A1l.A0v(this);
        this.A1d = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8P4
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = this;
                Context context = c8nw.A0f;
                AnonymousClass840 anonymousClass8402 = c8nw.A13;
                InterfaceC1810081c interfaceC1810081c2 = c8nw.A1A;
                AbstractC59962oe abstractC59962oe2 = c8nw.A0l;
                UserSession userSession2 = c8nw.A0r;
                View view6 = c8nw.A0h;
                C3I9 c3i92 = c8nw.A0s;
                InterfaceC169517hR interfaceC169517hR2 = interfaceC169517hR;
                InteractiveDrawableContainer interactiveDrawableContainer2 = c8nw.A1l;
                C8C0 c8c02 = c8c0;
                TargetViewSizeProvider targetViewSizeProvider2 = c8nw.A10;
                C190388bw c190388bw = (C190388bw) userSession2.A01(C190388bw.class, new B8P(userSession2, 40));
                C8O8 c8o8 = c8nw.A0z;
                C8D9 c8d92 = c8d9;
                List list2 = c8nw.A1q;
                return new C190398bx(context, view6, c8nw.A0k, abstractC59962oe2, userSession2, c3i92, c8o8, targetViewSizeProvider2, anonymousClass8402, c8d92, c8c02, c8nw.A18, interfaceC1810081c2, c8nw, c190388bw, interfaceC169517hR2, interactiveDrawableContainer2, Integer.valueOf(c8nw.A0e), "StickerOverlayController", list2, C18U.A06(C06090Tz.A06, userSession2, 36323964351426279L), c8nw.A1w, c8nw.A1x);
            }
        }, new InterfaceC143366db[0]);
        this.A2F = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8P5
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C8NW c8nw = C8NW.this;
                return new A9R(c8nw.A0f, c8nw.A0h, c8nw.A0r, c8nw.A1A);
            }
        }, new InterfaceC143366db[0]);
        this.A1U = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.8P6
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                return new A76(C8NW.this.A0h);
            }
        }, new InterfaceC143366db[0]);
        if (c8on != null) {
            c8on.A00.A06(abstractC59962oe, new AUB(this));
        }
        A0Q((C55U) c1811981v.A00, this);
        AbstractC25651Mw.A00(userSession).A01(interfaceC41501vz, C8P9.class);
        InterfaceC41501vz interfaceC41501vz2 = new InterfaceC41501vz() { // from class: X.8PA
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                Product A07;
                Product product;
                Float f;
                PointF pointF;
                int A03 = C0f9.A03(-976483584);
                C8PB c8pb = (C8PB) obj;
                int A032 = C0f9.A03(418927208);
                C14360o3.A0B(c8pb, 0);
                C3NY c3ny = c8pb.A00;
                if ((c3ny instanceof C3NX) && C14360o3.A0K(c8pb.A01, "stories")) {
                    C14360o3.A0C(c3ny, MSV.A00(1451));
                    List list2 = (List) ((C3NX) c3ny).A00;
                    if (list2 != null && !list2.isEmpty()) {
                        C8NW c8nw = C8NW.this;
                        if (c8nw.A1A.Cae()) {
                            C23127AMf c23127AMf = (C23127AMf) c8nw.A1Z.get();
                            List list3 = ((C53615NnM) list2.get(0)).A02;
                            InteractiveDrawableContainer interactiveDrawableContainer2 = c8nw.A1l;
                            c8nw.A13.A02.A00();
                            C14360o3.A0B(list3, 0);
                            MediaSuggestedProductTag mediaSuggestedProductTag = (MediaSuggestedProductTag) AbstractC001800i.A0J(AbstractC55225Oes.A08(list3));
                            if (mediaSuggestedProductTag != null && (A07 = mediaSuggestedProductTag.A07()) != null) {
                                AM0 am0 = new AM0(A07);
                                if (C23127AMf.A00(am0, interactiveDrawableContainer2) == null && (product = am0.A00) != null) {
                                    String str2 = product.A0J;
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    SpannableString spannableString = new SpannableString(str2);
                                    EnumC53230NgS enumC53230NgS = EnumC53230NgS.A05;
                                    C23127AMf.A03(spannableString, c23127AMf, am0, enumC53230NgS, null, null, -1, false, true);
                                    c23127AMf.A00.A00(c23127AMf.A02.requireActivity(), interactiveDrawableContainer2, interactiveDrawableContainer2, C05F.A1F);
                                    UserSession userSession2 = c23127AMf.A04;
                                    InterfaceC11380iw interfaceC11380iw2 = c23127AMf.A03;
                                    String str3 = c23127AMf.A08;
                                    String str4 = A07.A0H;
                                    MediaSuggestedProductTag mediaSuggestedProductTag2 = (MediaSuggestedProductTag) AbstractC001800i.A0J(AbstractC55225Oes.A08(list3));
                                    if (mediaSuggestedProductTag2 != null) {
                                        f = mediaSuggestedProductTag2.A08();
                                    } else {
                                        f = null;
                                    }
                                    MediaSuggestedProductTag mediaSuggestedProductTag3 = (MediaSuggestedProductTag) AbstractC001800i.A0J(AbstractC55225Oes.A08(list3));
                                    if (mediaSuggestedProductTag3 != null) {
                                        pointF = mediaSuggestedProductTag3.A00;
                                    } else {
                                        pointF = null;
                                    }
                                    AbstractC55216Oef.A05(pointF, null, interfaceC11380iw2, userSession2, enumC53230NgS, f, 0, str3, "add", str4, str4, null, "stories", "seller", 0, false);
                                }
                            }
                        }
                    }
                }
                C0f9.A0A(-748272801, A032);
                C0f9.A0A(-2135443099, A03);
            }
        };
        this.A0q = interfaceC41501vz2;
        AbstractC25651Mw.A00(userSession).A01(interfaceC41501vz2, C8PB.class);
        this.A2O = C18U.A06(c06090Tz, userSession, 36315791028653622L);
        C87D c87d = (C87D) new C52942bb(new C87C(userSession, fragmentActivity), interfaceC018407e).A00(C87D.class);
        this.A1F = c87d;
        this.A1G = (ClipsCreationViewModel) new C52942bb(new AnonymousClass846(userSession, fragmentActivity), interfaceC018407e).A00(ClipsCreationViewModel.class);
        C75M.A01(c87d.A01.A05, C8PC.A00).A06(abstractC59962oe, new InterfaceC58362lv() { // from class: X.8PD
            @Override // X.InterfaceC58362lv
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                List list2 = (List) obj;
                C14360o3.A0B(list2, 0);
                C8NW.A0d(C8NW.this, list2);
            }
        });
        this.A0n = (C89Y) new C52942bb(new C89X(userSession), interfaceC018407e).A00(C89Y.class);
        this.A21 = (C8PF) new C52942bb(new C8PE(), interfaceC018407e).A00(C8PF.class);
        this.A0v = (C8PH) new C52942bb(new AbstractC61132qb(userSession) { // from class: X.8PG
            public final UserSession A00;

            @Override // X.AbstractC61132qb
            public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
                return new C8PH(this.A00);
            }

            {
                this.A00 = userSession;
            }
        }, interfaceC018407e).A00(C8PH.class);
        C87H c87h = this.A1e;
        C2GS c2gs = c87h.A0G;
        AbstractC59962oe abstractC59962oe2 = this.A0l;
        c2gs.A06(abstractC59962oe2, new InterfaceC58362lv() { // from class: X.8PI
            @Override // X.InterfaceC58362lv
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                C87J c87j = (C87J) obj;
                C14360o3.A0B(c87j, 0);
                C8NW.A0V(C8NW.this, c87j);
            }
        });
        c87h.A0A.A06(abstractC59962oe2, new InterfaceC58362lv() { // from class: X.8PJ
            @Override // X.InterfaceC58362lv
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                C194808jg c194808jg;
                C74P c74p;
                C74P c74p2;
                C5RM c5rm;
                C14360o3.A0B(obj, 0);
                InteractiveDrawableContainer interactiveDrawableContainer2 = C8NW.this.A1l;
                if (!interactiveDrawableContainer2.getAllDrawables().isEmpty()) {
                    for (Drawable drawable : interactiveDrawableContainer2.getAllDrawables()) {
                        Drawable drawable2 = null;
                        if ((drawable instanceof C5RM) && (c5rm = (C5RM) drawable) != null) {
                            drawable2 = c5rm.A0A;
                        }
                        if ((drawable2 instanceof C194808jg) && (c194808jg = (C194808jg) drawable2) != null) {
                            for (Drawable drawable3 : c194808jg.A05()) {
                                if (obj == EnumC189218Zt.A04) {
                                    if ((drawable3 instanceof C74P) && (c74p = (C74P) drawable3) != null) {
                                        c74p.A05();
                                    }
                                } else if (obj == EnumC189218Zt.A05 && (drawable3 instanceof C74P) && (c74p2 = (C74P) drawable3) != null) {
                                    c74p2.A07();
                                }
                            }
                        }
                    }
                }
            }
        });
        this.A0w = new C8PK(userSession, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x05c9, code lost:
    
        if (r2.A0L() == true) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x07fa, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r31.A0r, 36319909903998804L) != false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0a45, code lost:
    
        if (r7.A0O() != false) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0cf5, code lost:
    
        if (r7 == false) goto L377;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x001b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:311:0x09c1. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0f84  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0f8f  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0b4f  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0bf1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0dd0  */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.lang.Object, X.AlA] */
    /* JADX WARN: Type inference failed for: r3v61, types: [X.5NL, java.lang.Object, X.AlD] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, X.Aez] */
    /* JADX WARN: Type inference failed for: r6v215, types: [java.lang.Object, X.AhC, X.BEZ] */
    /* JADX WARN: Type inference failed for: r6v220, types: [java.lang.Object, X.AhD, X.BEZ] */
    /* JADX WARN: Type inference failed for: r6v83, types: [X.9kG, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1H(android.graphics.drawable.Drawable r32, X.C148276lx r33, X.C23108AGw r34, java.lang.String r35) {
        /*
            Method dump skipped, instructions count: 4304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8NW.A1H(android.graphics.drawable.Drawable, X.6lx, X.AGw, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:1148:0x1631, code lost:
    
        if (r5 == X.EnumC1810181d.A02) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1162:0x16c1, code lost:
    
        if (r8.A03 == null) goto L903;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1213:0x176c, code lost:
    
        if (r7 == null) goto L944;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02ac, code lost:
    
        if ((r38 instanceof X.C8WJ) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x05e1, code lost:
    
        if (r5 != 1) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x06f8, code lost:
    
        if ((r38 instanceof X.C188228Vn) != false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:948:0x1179, code lost:
    
        if ((r38 instanceof X.C188398We) != false) goto L697;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x00ab. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:857:0x1006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0db1  */
    /* JADX WARN: Type inference failed for: r7v93, types: [X.5NL, java.lang.Object, X.Akp] */
    /* JADX WARN: Type inference failed for: r8v58, types: [X.5NL, java.lang.Object, X.Akp] */
    @Override // X.InterfaceC1810781j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void DoV(java.lang.Object r36, java.lang.Object r37, java.lang.Object r38) {
        /*
            Method dump skipped, instructions count: 7456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8NW.DoV(java.lang.Object, java.lang.Object, java.lang.Object):void");
    }
}
