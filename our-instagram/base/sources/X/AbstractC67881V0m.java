package X;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.direct.sharetostory.data.ChannelChallengeStickerData;
import com.instagram.direct.sharetostory.data.JoinChatStickerData;
import com.instagram.infocenter.intf.InfoCenterFactShareInfoIntf;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.chat.model.ChatStickerStickerType;
import com.instagram.user.model.User;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* renamed from: X.V0m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC67881V0m extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "ReelShareCameraFragment";
    public UserSession A00;
    public C81Y A01;
    public C81I A02;
    public final InterfaceC25214BDm A03 = new C23765Afc(this, 10);

    public final void A01() {
        String str;
        C81Y c81y = this.A01;
        if (c81y != null) {
            if (c81y.A00.A01 == C22P.A1S) {
                str = "back";
            } else {
                str = "button";
            }
            c81y.A05(str, true);
        }
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, X.Akq] */
    public C81J A02(ViewGroup viewGroup) {
        C81J c81j;
        C22P c22p;
        Context context;
        C81J c81j2;
        String str;
        Al9 al9;
        C81M A01;
        int i;
        C81K c81k;
        PendingRecipient pendingRecipient;
        C81M A012;
        C81K c81k2;
        if (this instanceof VCD) {
            VCD vcd = (VCD) this;
            C14360o3.A0B(viewGroup, 0);
            long currentTimeMillis = System.currentTimeMillis();
            File file = vcd.A03;
            C14360o3.A0A(file);
            String absolutePath = file.getAbsolutePath();
            C14360o3.A07(absolutePath);
            Medium medium = new Medium(android.net.Uri.fromFile(vcd.A03), absolutePath, 0, 1, 0, 0, currentTimeMillis / 1000, currentTimeMillis);
            c81j = new C81J();
            C81J.A0H(c81j, vcd.A04, vcd);
            C81P c81p = C81O.A02;
            UserSession userSession = ((AbstractC67881V0m) vcd).A00;
            C14360o3.A06(userSession);
            C81J.A0D(userSession, c81p, c81j, vcd);
            c81j.A09 = viewGroup;
            c81j.A0B = C22P.A5a;
            c81j.A0O = vcd;
            C81J.A05(vcd.A00, vcd.A01, c81j);
            c81j.A3y = true;
            c81j.A3g = true;
            c81j.A0P = medium;
            c81j.A0w = null;
            c81j.A3Q = true;
            c81j.A3o = true;
            pendingRecipient = vcd.A02;
        } else {
            if (this instanceof VC4) {
                C14360o3.A0B(viewGroup, 0);
                float A0A = AbstractC13880nE.A0A(requireContext());
                float A09 = AbstractC13880nE.A09(requireContext());
                RectF rectF = new RectF(0.0f, 0.0f, A0A, A09);
                rectF.offsetTo(0.0f, A09);
                RectF rectF2 = new RectF(0.0f, 0.0f, A0A, A09);
                C23765Afc c23765Afc = new C23765Afc(this, 13);
                C81J c81j3 = new C81J();
                C81J.A0G(c81j3, c23765Afc, this);
                C81P c81p2 = C81O.A02;
                UserSession userSession2 = this.A00;
                C14360o3.A07(userSession2);
                C81J.A0C(userSession2, c81p2, C208509Kk.A00, c81j3);
                c81j3.A3h = true;
                c81j3.A0R = this.volumeKeyPressController;
                C81I c81i = this.A02;
                c81i.getClass();
                c81j3.A0t = c81i;
                c81j3.A09 = viewGroup;
                c81j3.A0B = C22P.A5N;
                c81j3.A0O = this;
                c81j3.A3F = true;
                C81J.A04(rectF, rectF2, c81j3);
                c81j3.A0y = C81K.A02;
                c81j3.A3g = true;
                c81j3.A3Q = true;
                AbstractC37302Gc3.A0n();
                c81j3.A1X = AbstractC69977Vyu.A01(VW4.A00(null, null, null, ChatStickerChannelType.A09, ChatStickerStickerType.A07, null, null, null, 0, 0, 0, 0, Long.valueOf(SandboxRepository.CACHE_TTL), null, null, null, AbstractC167027dH.A0L(this).Bhu().getUrl(), null, null, null, "", null, AbstractC31174DnI.A0w(this, AbstractC167027dH.A0L(this).getUsername(), 2131974812), null));
                return c81j3;
            }
            if (this instanceof VCA) {
                VCA vca = (VCA) this;
                C14360o3.A0B(viewGroup, 0);
                Context requireContext = vca.requireContext();
                float A0A2 = AbstractC13880nE.A0A(requireContext);
                float A092 = AbstractC13880nE.A09(requireContext);
                RectF rectF3 = new RectF(0.0f, 0.0f, A0A2, A092);
                rectF3.offsetTo(0.0f, A092);
                RectF rectF4 = new RectF(0.0f, 0.0f, A0A2, A092);
                C81J c81j4 = new C81J();
                C81J.A0G(c81j4, vca.A06, vca);
                C81P c81p3 = C81O.A02;
                UserSession userSession3 = ((AbstractC67881V0m) vca).A00;
                C14360o3.A06(userSession3);
                C81J.A0D(userSession3, c81p3, c81j4, vca);
                c81j4.A09 = viewGroup;
                c81j4.A0B = vca.A01;
                c81j4.A0O = vca;
                c81j4.A3F = true;
                C81J.A05(rectF3, rectF4, c81j4);
                c81j4.A0y = C81K.A02;
                c81j4.A3g = true;
                C81J.A0F(c81j4);
                c81j4.A3Q = true;
                c81j4.A1o = new C51853Mvx(AbstractC167027dH.A0L(vca).Bhu(), vca.A02, AbstractC25227BEk.A0v(vca, 2131976478), vca.A04, vca.A05, vca.A03, vca.A00);
                return c81j4;
            }
            if (this instanceof VC7) {
                VC7 vc7 = (VC7) this;
                C14360o3.A0B(viewGroup, 0);
                int A0A3 = AbstractC13880nE.A0A(vc7.requireContext());
                float A093 = AbstractC13880nE.A09(vc7.requireContext());
                new RectF(0.0f, 0.0f, A0A3, A093).offsetTo(0.0f, A093);
                c81j = new C81J();
                C81J.A0H(c81j, vc7.A03, vc7);
                C81P c81p4 = C81O.A02;
                UserSession userSession4 = ((AbstractC67881V0m) vc7).A00;
                C14360o3.A06(userSession4);
                C81J.A0D(userSession4, c81p4, c81j, vc7);
                c81j.A09 = viewGroup;
                c81j.A0B = vc7.A00;
                c81j.A0O = vc7;
                c81j.A3F = true;
                c81j.A3H = true;
                c81j.A0y = C81K.A02;
                c81j.A3g = true;
                c81j.A1u = vc7.A01;
                File file2 = vc7.A02;
                if (file2 != null) {
                    c81j.A0P = C8IU.A03(file2, 1, 0);
                    c81j.A0w = null;
                    c81j.A3y = true;
                    return c81j;
                }
            } else {
                if (this instanceof VC8) {
                    VC8 vc8 = (VC8) this;
                    C14360o3.A0B(viewGroup, 0);
                    C81J c81j5 = new C81J();
                    C81J.A0H(c81j5, ((AbstractC67881V0m) vc8).A03, vc8);
                    C81P c81p5 = C81O.A02;
                    UserSession userSession5 = ((AbstractC67881V0m) vc8).A00;
                    C14360o3.A06(userSession5);
                    C81J.A0D(userSession5, c81p5, c81j5, vc8);
                    c81j5.A09 = viewGroup;
                    C22P c22p2 = vc8.A00;
                    if (c22p2 == null) {
                        str = "entryPoint";
                    } else {
                        c81j5.A0B = c22p2;
                        c81j5.A0O = vc8;
                        c81j5.A3H = true;
                        c81j5.A3y = true;
                        c81j5.A3g = true;
                        c81j5.A0y = C81K.A02;
                        c81j5.A3Q = true;
                        String str2 = vc8.A01;
                        if (str2 == null) {
                            str = "backgroundFile";
                        } else {
                            c81j5.A0P = C8IU.A03(new File(str2), 1, 0);
                            c81j5.A0w = null;
                            String str3 = vc8.A03;
                            str = "shoutoutUsername";
                            if (str3 != null) {
                                String str4 = vc8.A02;
                                if (str4 == null) {
                                    str = "shoutoutTitle";
                                } else {
                                    c81j5.A11 = new C1816083n(str3, str4, AbstractC31177DnL.A0b(viewGroup.getContext(), AnonymousClass001.A0D(str3, '@'), 2131975239), vc8.A04);
                                    return c81j5;
                                }
                            }
                        }
                    }
                } else {
                    if (this instanceof VC6) {
                        VC6 vc6 = (VC6) this;
                        C14360o3.A0B(viewGroup, 0);
                        vc6.getContext();
                        float A0A4 = AbstractC13880nE.A0A(vc6.requireContext());
                        float A094 = AbstractC13880nE.A09(vc6.requireContext());
                        RectF rectF5 = new RectF(0.0f, 0.0f, A0A4, A094);
                        rectF5.offsetTo(0.0f, A094);
                        AbstractC37302Gc3.A0n();
                        JoinChatStickerData joinChatStickerData = vc6.A01;
                        String str5 = "stickerData";
                        String str6 = null;
                        if (joinChatStickerData != null) {
                            Integer valueOf = Integer.valueOf(joinChatStickerData.A00);
                            ChatStickerChannelType A00 = AbstractC69977Vyu.A00(joinChatStickerData.A02);
                            String str7 = joinChatStickerData.A04;
                            ImageUrl imageUrl = joinChatStickerData.A03;
                            if (imageUrl != null) {
                                str6 = imageUrl.getUrl();
                            }
                            C66645URj A002 = VW4.A00(null, null, null, A00, ChatStickerStickerType.A07, null, true, false, 0, valueOf, 0, Integer.valueOf(joinChatStickerData.A01), -1L, null, null, str7, str6, null, null, null, joinChatStickerData.A05, joinChatStickerData.A07, joinChatStickerData.A06, null);
                            JoinChatStickerData joinChatStickerData2 = vc6.A01;
                            if (joinChatStickerData2 != null) {
                                boolean z = joinChatStickerData2.A08;
                                boolean z2 = joinChatStickerData2.A0A;
                                boolean z3 = joinChatStickerData2.A09;
                                ?? obj = new Object();
                                obj.A00 = A002;
                                obj.A01 = z;
                                obj.A03 = z2;
                                obj.A02 = z3;
                                RectF rectF6 = new RectF(0.0f, 0.0f, A0A4, A094);
                                c81j = new C81J();
                                C81J.A0G(c81j, vc6.A03, vc6);
                                C81P c81p6 = C81O.A02;
                                UserSession userSession6 = ((AbstractC67881V0m) vc6).A00;
                                C14360o3.A06(userSession6);
                                C81J.A0D(userSession6, c81p6, c81j, vc6);
                                c81j.A09 = viewGroup;
                                C22P c22p3 = vc6.A00;
                                if (c22p3 == null) {
                                    str5 = "cameraEntryPoint";
                                } else {
                                    c81j.A0B = c22p3;
                                    c81j.A0O = vc6;
                                    C81J.A04(rectF5, rectF6, c81j);
                                    c81j.A0y = C81K.A02;
                                    c81j.A3g = true;
                                    C81J.A0F(c81j);
                                    c81j.A3Q = true;
                                    c81j.A1W = obj;
                                    File file3 = vc6.A02;
                                    if (file3 != null) {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        try {
                                            String canonicalPath = file3.getCanonicalPath();
                                            C14360o3.A07(canonicalPath);
                                            Medium medium2 = new Medium(android.net.Uri.fromFile(vc6.A02), canonicalPath, 0, 1, 0, 0, currentTimeMillis2 / 1000, currentTimeMillis2);
                                            c81j.A3y = true;
                                            Context context2 = vc6.getContext();
                                            if (context2 == null) {
                                                A012 = null;
                                            } else {
                                                A012 = new AGv(context2).A01();
                                                A012.A0E = true;
                                                A012.A0A = C81M.A01(context2);
                                            }
                                            c81j.A0P = medium2;
                                            c81j.A0w = A012;
                                            return c81j;
                                        } catch (IOException e) {
                                            C0K8.A0F("reels_join_chat_share_fragment", "Unable to open file", e);
                                            return c81j;
                                        }
                                    }
                                }
                            }
                        }
                        C14360o3.A0F(str5);
                        throw C00O.createAndThrow();
                    }
                    if (this instanceof VCF) {
                        VCF vcf = (VCF) this;
                        C14360o3.A0B(viewGroup, 0);
                        long currentTimeMillis3 = System.currentTimeMillis();
                        File file4 = vcf.A04;
                        if (file4 != null) {
                            String absolutePath2 = file4.getAbsolutePath();
                            C14360o3.A07(absolutePath2);
                            Medium medium3 = new Medium(android.net.Uri.fromFile(vcf.A04), absolutePath2, 0, 1, 0, 0, currentTimeMillis3 / 1000, currentTimeMillis3);
                            c81j = new C81J();
                            C81J.A0H(c81j, vcf.A05, vcf);
                            C81P c81p7 = C81O.A02;
                            UserSession userSession7 = ((AbstractC67881V0m) vcf).A00;
                            C14360o3.A06(userSession7);
                            C81J.A0D(userSession7, c81p7, c81j, vcf);
                            c81j.A09 = viewGroup;
                            c81j.A0B = C22P.A3H;
                            c81j.A0O = vcf;
                            C81J.A05(vcf.A00, vcf.A01, c81j);
                            c81j.A3y = true;
                            c81j.A3g = true;
                            c81j.A0P = medium3;
                            c81j.A0w = null;
                            c81j.A3Q = true;
                            c81j.A1G = vcf.A02;
                            pendingRecipient = vcf.A03;
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    } else if (this instanceof VCE) {
                        VCE vce = (VCE) this;
                        C14360o3.A0B(viewGroup, 0);
                        long currentTimeMillis4 = System.currentTimeMillis();
                        c81j = null;
                        try {
                            File file5 = vce.A04;
                            if (file5 != null) {
                                String canonicalPath2 = file5.getCanonicalPath();
                                if (canonicalPath2 != null) {
                                    long j = currentTimeMillis4 / 1000;
                                    File file6 = vce.A04;
                                    if (file6 != null) {
                                        Medium medium4 = new Medium(android.net.Uri.fromFile(file6), canonicalPath2, 0, 1, 0, 0, j, currentTimeMillis4);
                                        C81J c81j6 = new C81J();
                                        C81J.A0H(c81j6, vce.A05, vce);
                                        C81P c81p8 = C81O.A02;
                                        UserSession userSession8 = ((AbstractC67881V0m) vce).A00;
                                        C14360o3.A06(userSession8);
                                        C81J.A0D(userSession8, c81p8, c81j6, vce);
                                        c81j6.A09 = viewGroup;
                                        c81j6.A0B = C22P.A3G;
                                        c81j6.A0O = vce;
                                        C81J.A05(vce.A00, vce.A01, c81j6);
                                        c81j6.A3y = true;
                                        c81j6.A3g = true;
                                        c81j6.A0P = medium4;
                                        c81j6.A0w = null;
                                        c81j6.A3Q = true;
                                        InfoCenterFactShareInfoIntf infoCenterFactShareInfoIntf = vce.A02;
                                        if (infoCenterFactShareInfoIntf != null) {
                                            c81j6.A1F = infoCenterFactShareInfoIntf;
                                            PendingRecipient pendingRecipient2 = vce.A03;
                                            if (pendingRecipient2 != null) {
                                                c81j6.A1S = pendingRecipient2;
                                                c81k = C81K.A05;
                                            } else {
                                                c81k = C81K.A02;
                                            }
                                            c81j6.A0y = c81k;
                                            return c81j6;
                                        }
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } catch (IOException unused) {
                            i = 1607;
                            C0w9.A03(VCE.__redex_internal_original_name, AbstractC111324zv.A00(i));
                            return null;
                        } catch (SecurityException unused2) {
                            i = 1608;
                            C0w9.A03(VCE.__redex_internal_original_name, AbstractC111324zv.A00(i));
                            return null;
                        }
                    } else {
                        if (this instanceof VC5) {
                            VC5 vc5 = (VC5) this;
                            C14360o3.A0B(viewGroup, 0);
                            AlC alC = vc5.A01;
                            if (alC == null) {
                                return null;
                            }
                            User user = vc5.A02;
                            if (user != null) {
                                URL url = alC.A00;
                                alC.A00 = VP3.A00(user, url.A01, url.A02, url.A03, url.A04, url.A05, url.A06, url.A07, url.A08, url.A09, url.A0A, url.A0B, url.A0C);
                            }
                            Context requireContext2 = vc5.requireContext();
                            float A0A5 = AbstractC13880nE.A0A(requireContext2);
                            float A095 = AbstractC13880nE.A09(requireContext2);
                            RectF rectF7 = new RectF(0.0f, 0.0f, A0A5, A095);
                            rectF7.offsetTo(0.0f, A095);
                            RectF rectF8 = new RectF(0.0f, 0.0f, A0A5, A095);
                            C81J c81j7 = new C81J();
                            C81J.A0H(c81j7, vc5.A03, vc5);
                            C81P c81p9 = C81O.A02;
                            UserSession userSession9 = ((AbstractC67881V0m) vc5).A00;
                            C14360o3.A06(userSession9);
                            C81J.A0D(userSession9, c81p9, c81j7, vc5);
                            c81j7.A09 = viewGroup;
                            c81j7.A0B = vc5.A00;
                            c81j7.A0O = vc5;
                            c81j7.A3F = true;
                            C81J.A04(rectF7, rectF8, c81j7);
                            c81j7.A0y = C81K.A02;
                            c81j7.A3g = true;
                            C81J.A0F(c81j7);
                            c81j7.A1Y = vc5.A01;
                            c81j7.A3Q = true;
                            return c81j7;
                        }
                        if (this instanceof VCC) {
                            VCC vcc = (VCC) this;
                            C14360o3.A0B(viewGroup, 0);
                            float A013 = AbstractC13890nF.A01(vcc.requireContext());
                            float A003 = AbstractC13890nF.A00(vcc.requireContext());
                            RectF rectF9 = new RectF(0.0f, 0.0f, A013, A003);
                            rectF9.offsetTo(0.0f, A003);
                            long currentTimeMillis5 = System.currentTimeMillis();
                            File file7 = vcc.A02;
                            String str8 = "storyBackgroundFile";
                            if (file7 != null) {
                                String canonicalPath3 = file7.getCanonicalPath();
                                C14360o3.A07(canonicalPath3);
                                long j2 = currentTimeMillis5 / 1000;
                                File file8 = vcc.A02;
                                if (file8 != null) {
                                    Medium medium5 = new Medium(android.net.Uri.fromFile(file8), canonicalPath3, 0, 1, 0, 0, j2, currentTimeMillis5);
                                    c81j2 = new C81J();
                                    C81J.A0G(c81j2, vcc.A03, vcc);
                                    C81P c81p10 = C81O.A02;
                                    UserSession userSession10 = ((AbstractC67881V0m) vcc).A00;
                                    C14360o3.A06(userSession10);
                                    C81J.A0D(userSession10, c81p10, c81j2, vcc);
                                    c81j2.A09 = viewGroup;
                                    C22P c22p4 = vcc.A00;
                                    if (c22p4 == null) {
                                        str8 = "cameraEntryPoint";
                                    } else {
                                        c81j2.A0B = c22p4;
                                        c81j2.A0O = vcc;
                                        C81J.A05(rectF9, null, c81j2);
                                        c81j2.A3y = true;
                                        c81j2.A0y = C81K.A02;
                                        c81j2.A3g = true;
                                        Context context3 = vcc.getContext();
                                        if (context3 == null) {
                                            A01 = null;
                                        } else {
                                            A01 = new AGv(context3).A01();
                                            A01.A0E = true;
                                            A01.A0A = C81M.A02(context3);
                                            A01.A01 = 2;
                                        }
                                        c81j2.A0P = medium5;
                                        c81j2.A0w = A01;
                                        c81j2.A3Q = true;
                                        ChannelChallengeStickerData channelChallengeStickerData = vcc.A01;
                                        str8 = "stickerData";
                                        if (channelChallengeStickerData != null) {
                                            al9 = new Al9(new URJ(AbstractC69977Vyu.A00(channelChallengeStickerData.A01), ChatStickerStickerType.A05, Integer.valueOf(channelChallengeStickerData.A00), channelChallengeStickerData.A03, null, channelChallengeStickerData.A04, channelChallengeStickerData.A07, channelChallengeStickerData.A06, null), channelChallengeStickerData.A02, channelChallengeStickerData.A08, channelChallengeStickerData.A05, channelChallengeStickerData.A0B, channelChallengeStickerData.A0C, channelChallengeStickerData.A09, channelChallengeStickerData.A0A, channelChallengeStickerData.A0D, channelChallengeStickerData.A0E, channelChallengeStickerData.A0F, channelChallengeStickerData.A0G);
                                            c81j2.A1V = al9;
                                            return c81j2;
                                        }
                                    }
                                }
                            }
                            C14360o3.A0F(str8);
                            throw C00O.createAndThrow();
                        }
                        if (this instanceof VCB) {
                            VCB vcb = (VCB) this;
                            RectF A07 = AbstractC167027dH.A07(vcb, viewGroup);
                            c81j2 = new C81J();
                            C81J.A0G(c81j2, vcb.A03, vcb);
                            C81P c81p11 = C81O.A02;
                            UserSession userSession11 = ((AbstractC67881V0m) vcb).A00;
                            C14360o3.A06(userSession11);
                            C81J.A0D(userSession11, c81p11, c81j2, vcb);
                            c81j2.A09 = viewGroup;
                            C22P c22p5 = vcb.A00;
                            if (c22p5 == null) {
                                str = "cameraEntryPoint";
                            } else {
                                c81j2.A0B = c22p5;
                                c81j2.A0O = vcb;
                                C81J.A05(A07, null, c81j2);
                                c81j2.A0y = C81K.A02;
                                c81j2.A3g = true;
                                C81J.A0F(c81j2);
                                c81j2.A3Q = true;
                                ChannelChallengeStickerData channelChallengeStickerData2 = vcb.A01;
                                str = "stickerData";
                                if (channelChallengeStickerData2 != null) {
                                    al9 = new Al9(new URJ(AbstractC69977Vyu.A00(channelChallengeStickerData2.A01), ChatStickerStickerType.A05, Integer.valueOf(channelChallengeStickerData2.A00), channelChallengeStickerData2.A03, null, channelChallengeStickerData2.A04, channelChallengeStickerData2.A07, null, null), channelChallengeStickerData2.A02, null, channelChallengeStickerData2.A05, channelChallengeStickerData2.A0B, channelChallengeStickerData2.A0C, channelChallengeStickerData2.A09, channelChallengeStickerData2.A0A, channelChallengeStickerData2.A0D, null, null, false);
                                    c81j2.A1V = al9;
                                    return c81j2;
                                }
                            }
                        } else {
                            VC9 vc9 = (VC9) this;
                            C14360o3.A0B(viewGroup, 0);
                            long currentTimeMillis6 = System.currentTimeMillis();
                            File file9 = vc9.A02;
                            String str9 = "backgroundFile";
                            if (file9 != null) {
                                String absolutePath3 = file9.getAbsolutePath();
                                C14360o3.A07(absolutePath3);
                                String str10 = null;
                                long j3 = currentTimeMillis6 / 1000;
                                File file10 = vc9.A02;
                                if (file10 != null) {
                                    Medium medium6 = new Medium(android.net.Uri.fromFile(file10), absolutePath3, 0, 1, 0, 0, j3, currentTimeMillis6);
                                    c81j = new C81J();
                                    C81J.A0H(c81j, vc9.A05, vc9);
                                    C81P c81p12 = C81O.A02;
                                    UserSession userSession12 = ((AbstractC67881V0m) vc9).A00;
                                    C14360o3.A07(userSession12);
                                    C81J.A0D(userSession12, c81p12, c81j, vc9);
                                    c81j.A09 = viewGroup;
                                    if (vc9.A00 == 4) {
                                        c22p = C22P.A2a;
                                    } else {
                                        c22p = C22P.A2Z;
                                    }
                                    c81j.A0B = c22p;
                                    c81j.A0O = vc9;
                                    c81j.A3H = true;
                                    c81j.A0P = medium6;
                                    c81j.A0w = null;
                                    c81j.A3g = true;
                                    String username = AbstractC167027dH.A0L(vc9).getUsername();
                                    if (username.length() != 0 && (context = vc9.getContext()) != null) {
                                        str10 = AnonymousClass001.A0B(AbstractC167007dF.A0f(context, AnonymousClass001.A0D(username, '@'), 2131962018));
                                        C14360o3.A07(str10);
                                    }
                                    List list = vc9.A04;
                                    if (list == null) {
                                        str9 = "mediaIdList";
                                    } else {
                                        File file11 = vc9.A03;
                                        if (file11 == null) {
                                            str9 = "exploreGridFile";
                                        } else {
                                            c81j.A10 = new C1816183p(file11, str10, list);
                                            c81j.A3y = true;
                                            c81j.A0P = medium6;
                                            c81j.A0w = null;
                                            c81j.A3q = true;
                                            RectF rectF10 = vc9.A01;
                                            if (rectF10 != null) {
                                                RectF rectF11 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
                                                c81j.A06 = rectF10;
                                                c81j.A07 = rectF11;
                                                c81j.A3r = true;
                                                c81j.A3v = false;
                                                c81j.A33 = false;
                                                c81j.A04 = 0L;
                                            }
                                            c81k2 = C81K.A02;
                                            c81j.A0y = c81k2;
                                        }
                                    }
                                }
                            }
                            C14360o3.A0F(str9);
                            throw C00O.createAndThrow();
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            return c81j;
        }
        if (pendingRecipient != null) {
            c81j.A1S = pendingRecipient;
            c81k2 = C81K.A05;
            c81j.A0y = c81k2;
            return c81j;
        }
        c81k2 = C81K.A02;
        c81j.A0y = c81k2;
        return c81j;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C81Y c81y = this.A01;
        if (c81y != null && c81y.A06()) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1227348933);
        super.onCreate(bundle);
        this.A00 = AbstractC31176DnK.A0S(this);
        C0f9.A09(-1964628446, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1874856727);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.fragment_quick_capture);
        C0f9.A09(-1336188649, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-487491723);
        super.onDestroyView();
        C81Y c81y = this.A01;
        if (c81y != null) {
            c81y.A00();
        }
        this.A01 = null;
        unregisterLifecycleListener(this.A02);
        this.A02.onDestroyView();
        this.A02 = null;
        C0f9.A09(-1138242650, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onResume() {
        int A02 = C0f9.A02(-416629163);
        super.onResume();
        AbstractC65987Txg.A00(getRootActivity());
        C0f9.A09(526918836, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C81I c81i = new C81I();
        this.A02 = c81i;
        registerLifecycleListener(c81i);
        final C81J A02 = A02((ViewGroup) view.requireViewById(R.id.quick_capture_fragment_container));
        if (A02 != null) {
            AbstractC189688an.A00(A02.A0B);
            Runnable runnable = new Runnable() { // from class: X.Ax0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC67881V0m abstractC67881V0m = this;
                    C81J c81j = A02;
                    if (abstractC67881V0m.mView != null) {
                        C81Y c81y = new C81Y(c81j);
                        abstractC67881V0m.A01 = c81y;
                        if (abstractC67881V0m.isResumed()) {
                            c81y.A01();
                        }
                    }
                }
            };
            C57982lB.A0B.A05(requireActivity(), runnable);
        }
    }
}
