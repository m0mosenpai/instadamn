package X;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.StoryPromptFailureTooltipDictIntf;
import com.instagram.api.schemas.StoryTemplateAssetDictIntf;
import com.instagram.api.schemas.StoryTemplateDictIntf;
import com.instagram.api.schemas.StoryTemplateGiphyStickerDictIntf;
import com.instagram.api.schemas.StoryTemplateGiphyStickerImageDictIntf;
import com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6iC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146136iC {
    public CreativeConfigIntf A00;
    public PromptStickerModel A01;
    public C8FC A02;
    public String A03;
    public HashMap A04;
    public boolean A05;
    public boolean A06;
    public final FragmentActivity A07;
    public final C22P A08;
    public final HandlerC25861Nt A09;
    public final UserSession A0A;
    public final C146166iF A0B;
    public final Runnable A0C;
    public final java.util.Set A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC16820sZ A0G;
    public final C146156iE A0H;
    public final InterfaceC16820sZ A0I;

    /* JADX WARN: Type inference failed for: r0v10, types: [X.6iE] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.6iF] */
    public C146136iC(FragmentActivity fragmentActivity, C22P c22p, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        C14360o3.A0B(userSession, 2);
        this.A07 = fragmentActivity;
        this.A0A = userSession;
        this.A08 = c22p;
        this.A0I = interfaceC16820sZ;
        this.A0G = interfaceC16820sZ2;
        this.A04 = new HashMap();
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            this.A09 = new HandlerC25861Nt(myLooper);
            this.A0C = new Runnable() { // from class: X.6iD
                @Override // java.lang.Runnable
                public final void run() {
                    C146136iC c146136iC = C146136iC.this;
                    if (!c146136iC.A05 && (!c146136iC.A0D.isEmpty())) {
                        C146136iC.A00(c146136iC);
                    }
                }
            };
            this.A0E = C1XM.A00(new C9ES(this, 8));
            this.A0F = AbstractC09440dt.A00(EnumC09460dv.A02, new C9ES(this, 9));
            this.A0D = new LinkedHashSet();
            this.A0H = new C1NJ() { // from class: X.6iE
                @Override // X.C1NJ
                public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
                    C14360o3.A0B(interfaceC59502nt, 0);
                    C146136iC c146136iC = C146136iC.this;
                    java.util.Set set = c146136iC.A0D;
                    if (set.remove(interfaceC59502nt) && !c146136iC.A05 && set.isEmpty()) {
                        FragmentActivity fragmentActivity2 = c146136iC.A07;
                        if (!fragmentActivity2.isFinishing() && !fragmentActivity2.isDestroyed()) {
                            ((Dialog) c146136iC.A0F.getValue()).dismiss();
                            C146136iC.A02(c146136iC);
                        }
                    }
                }

                @Override // X.C1NJ
                public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
                }

                @Override // X.C1NJ
                public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
                    C146136iC.A00(C146136iC.this);
                }
            };
            this.A0B = new C2AH() { // from class: X.6iF
                @Override // X.C2AH
                public final void onFail(Exception exc) {
                    C146136iC.A00(C146136iC.this);
                }

                @Override // X.C2AH
                public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    File file = (File) obj;
                    C14360o3.A0B(file, 0);
                    C146136iC c146136iC = C146136iC.this;
                    c146136iC.A03 = file.getAbsolutePath();
                    C146136iC.A01(c146136iC);
                }
            };
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A00(C146136iC c146136iC) {
        c146136iC.A05 = true;
        c146136iC.A06 = false;
        c146136iC.A03 = null;
        c146136iC.A0D.clear();
        FragmentActivity fragmentActivity = c146136iC.A07;
        if (!fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
            ((Dialog) c146136iC.A0F.getValue()).dismiss();
            if (!c146136iC.A05) {
                c146136iC.A03(null, null);
            }
        }
        InterfaceC16820sZ interfaceC16820sZ = c146136iC.A0I;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final void A01(C146136iC c146136iC) {
        C16930sl c16930sl;
        StoryTemplateGiphyStickerImageDictIntf BGT;
        String url;
        FragmentActivity fragmentActivity = c146136iC.A07;
        if (!fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
            PromptStickerModel promptStickerModel = c146136iC.A01;
            if (promptStickerModel == null) {
                C14360o3.A0F("promptStickerModel");
                throw C00O.createAndThrow();
            }
            int A01 = AbstractC13890nF.A01(fragmentActivity);
            StoryTemplateDictIntf C2N = promptStickerModel.A00.C2N();
            if (C2N != null) {
                ?? arrayList = new ArrayList();
                List C2J = C2N.C2J();
                if (C2J != null) {
                    Iterator it = C2J.iterator();
                    while (it.hasNext()) {
                        StoryTemplateGiphyStickerDictIntf B9t = ((StoryTemplateStaticOverlayDictIntf) it.next()).B9t();
                        if (B9t != null && (BGT = B9t.BGT()) != null && (url = BGT.getUrl()) != null) {
                            arrayList.add(url);
                        }
                    }
                }
                StoryTemplateAssetDictIntf C5d = C2N.C5d();
                c16930sl = arrayList;
                if (C5d != null) {
                    ImageInfo BGx = C5d.BGx();
                    c16930sl = arrayList;
                    if (BGx != null) {
                        ExtendedImageUrl A04 = AbstractC40161tk.A04(BGx, C05F.A01, Math.min(A01, 1080));
                        c16930sl = arrayList;
                        if (A04 != null) {
                            arrayList.add(A04.A0A);
                            c16930sl = arrayList;
                        }
                    }
                }
            } else {
                c16930sl = C16930sl.A00;
            }
            if (c16930sl.isEmpty()) {
                ((Dialog) c146136iC.A0F.getValue()).dismiss();
                A02(c146136iC);
                return;
            }
            Iterator it2 = c16930sl.iterator();
            while (it2.hasNext()) {
                C1OG A0J = C25821No.A00().A0J(new SimpleImageUrl((String) it2.next()), "stories_template_share");
                A0J.A02(c146136iC.A0H);
                A0J.A0I = false;
                A0J.A0M = false;
                InterfaceC59502nt A00 = A0J.A00();
                c146136iC.A0D.add(A00);
                C25821No.A00().A0N(A00);
            }
        }
    }

    public static final void A02(C146136iC c146136iC) {
        String str;
        UserSession userSession = c146136iC.A0A;
        Bundle bundle = new Bundle();
        PromptStickerModel promptStickerModel = c146136iC.A01;
        if (promptStickerModel == null) {
            str = "promptStickerModel";
        } else {
            PromptStickerModel A04 = promptStickerModel.A04();
            A04.A08(C17060sy.A01.A01(userSession));
            bundle.putParcelable(AbstractC43591JPw.A00(9), A04.A02());
            C8FC c8fc = c146136iC.A02;
            if (c8fc == null) {
                str = "drawableConfig";
            } else {
                StringWriter stringWriter = new StringWriter();
                C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                AbstractC203338yq.A00(A0A, c8fc);
                A0A.close();
                bundle.putString(MSV.A00(552), stringWriter.toString());
                CreativeConfigIntf creativeConfigIntf = c146136iC.A00;
                if (creativeConfigIntf != null) {
                    bundle.putParcelable(MSV.A00(551), creativeConfigIntf);
                }
                bundle.putSerializable("camera_entry_point_type", c146136iC.A08);
                String str2 = c146136iC.A03;
                if (str2 != null) {
                    bundle.putString("key_preset_medium_file_path", str2);
                    c146136iC.A03 = null;
                    bundle.putBoolean("prompt_sticker_skip_precap_with_opaque_pinned_gallery", c146136iC.A06);
                    c146136iC.A06 = false;
                }
                bundle.putSerializable("prompt_avatar_sticker_urls", c146136iC.A04);
                FragmentActivity fragmentActivity = c146136iC.A07;
                C6XJ.A02(fragmentActivity, bundle, userSession, TransparentModalActivity.class, "reel_stories_template_share").A0C(fragmentActivity);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final void A03(String str, String str2) {
        C146106i8 c146106i8 = new C146106i8();
        if (str == null) {
            str = this.A07.getResources().getString(2131974541);
            C14360o3.A07(str);
        }
        c146106i8.A0D = str;
        if (str2 == null) {
            str2 = this.A07.getResources().getString(2131974542);
            C14360o3.A07(str2);
        }
        c146106i8.A0I = str2;
        c146106i8.A05();
        c146106i8.A0H = "stories_template_share";
        C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
    }

    public final void A04(CreativeConfigIntf creativeConfigIntf, PromptStickerModel promptStickerModel, C8FC c8fc, Map map) {
        boolean z;
        StoryTemplateAssetDictIntf C5d;
        StoryTemplateDictIntf C2N;
        StoryTemplateAssetDictIntf C5d2;
        StoryTemplateAssetDictIntf C5d3;
        StoryTemplateAssetDictIntf C5d4;
        ImageInfo Af9;
        ExtendedImageUrl A04;
        String str;
        C14360o3.A0B(promptStickerModel, 0);
        this.A06 = false;
        this.A03 = null;
        this.A01 = promptStickerModel;
        if (c8fc == null) {
            C23108AGw c23108AGw = new C23108AGw();
            c23108AGw.A0Q = false;
            c8fc = new C8FC(c23108AGw);
        }
        this.A02 = c8fc;
        this.A00 = creativeConfigIntf;
        if (map != null) {
            this.A04 = (HashMap) map;
        }
        StoryPromptFailureTooltipDictIntf Bif = promptStickerModel.A00.Bif();
        if (Bif != null) {
            String B2a = Bif.B2a();
            if (B2a != null) {
                String B2Z = Bif.B2Z();
                if (B2Z != null) {
                    A05(B2a, B2Z);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        UserSession userSession = this.A0A;
        if (!AbstractC23124AKi.A03(userSession, promptStickerModel)) {
            A05(null, null);
            return;
        }
        if (promptStickerModel.A0C) {
            return;
        }
        StoryTemplateDictIntf C2N2 = promptStickerModel.A00.C2N();
        if (C2N2 != null) {
            List C2J = C2N2.C2J();
            if (C2J != null && (!(C2J instanceof Collection) || !C2J.isEmpty())) {
                Iterator it = C2J.iterator();
                while (it.hasNext()) {
                    if (((StoryTemplateStaticOverlayDictIntf) it.next()).B9t() != null) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            boolean z2 = false;
            if (C2N2.C5d() != null) {
                z2 = true;
            }
            if (z || z2) {
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36319909902491456L)) {
                    this.A05 = false;
                    this.A0D.clear();
                    C0fJ.A00((Dialog) this.A0F.getValue());
                    this.A09.postDelayed(this.A0C, TimeUnit.SECONDS.toMillis(C18U.A01(c06090Tz, userSession, 36601384879263925L)));
                    PromptStickerModel promptStickerModel2 = this.A01;
                    if (promptStickerModel2 != null) {
                        StoryTemplateDictIntf C2N3 = promptStickerModel2.A00.C2N();
                        if (C2N3 != null && (C5d3 = C2N3.C5d()) != null && C5d3.Af9() != null) {
                            PromptStickerModel promptStickerModel3 = this.A01;
                            if (promptStickerModel3 != null) {
                                FragmentActivity fragmentActivity = this.A07;
                                int A01 = AbstractC13890nF.A01(fragmentActivity);
                                StoryTemplateDictIntf C2N4 = promptStickerModel3.A00.C2N();
                                if (C2N4 != null && (C5d4 = C2N4.C5d()) != null && (Af9 = C5d4.Af9()) != null && (A04 = AbstractC40161tk.A04(Af9, C05F.A01, Math.min(A01, 1080))) != null && (str = A04.A0A) != null) {
                                    C121275eQ A03 = AbstractC50633MWu.A03(fragmentActivity, userSession, new OUQ(str, "stories_template_share", false, false, false));
                                    A03.A00 = this.A0B;
                                    C1GJ.A04(A03, 622413651);
                                    return;
                                }
                                A00(this);
                                return;
                            }
                        } else {
                            PromptStickerModel promptStickerModel4 = this.A01;
                            if (promptStickerModel4 != null) {
                                StoryTemplateDictIntf C2N5 = promptStickerModel4.A00.C2N();
                                if (C2N5 != null && (C5d = C2N5.C5d()) != null && C5d.BGx() != null && (C2N = promptStickerModel4.A00.C2N()) != null && (C5d2 = C2N.C5d()) != null && C14360o3.A0K(C5d2.CaM(), true) && C18U.A06(c06090Tz, userSession, 36327615073827555L)) {
                                    C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.9iU
                                        {
                                            super(622413651, 3, false, false);
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                                            C14360o3.A07(createBitmap);
                                            C146136iC c146136iC = C146136iC.this;
                                            File A042 = AbstractC13530mf.A04(c146136iC.A07);
                                            C14360o3.A07(A042);
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(A042.getPath());
                                                try {
                                                    AbstractC50673MYr.A00(Bitmap.CompressFormat.JPEG, createBitmap, fileOutputStream);
                                                    fileOutputStream.close();
                                                    c146136iC.A03 = A042.getAbsolutePath();
                                                    c146136iC.A06 = true;
                                                } finally {
                                                }
                                            } catch (IOException unused) {
                                            } catch (Throwable th) {
                                                createBitmap.recycle();
                                                C146136iC.A01(c146136iC);
                                                throw th;
                                            }
                                            createBitmap.recycle();
                                            C146136iC.A01(c146136iC);
                                        }
                                    });
                                    return;
                                } else if (C18U.A06(c06090Tz, userSession, 36319909902491456L)) {
                                    A01(this);
                                    return;
                                }
                            }
                        }
                    }
                    C14360o3.A0F("promptStickerModel");
                    throw C00O.createAndThrow();
                }
            }
        }
        A02(this);
    }

    public final void A05(String str, String str2) {
        InterfaceC16820sZ interfaceC16820sZ = this.A0I;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
        A03(str, str2);
    }
}
