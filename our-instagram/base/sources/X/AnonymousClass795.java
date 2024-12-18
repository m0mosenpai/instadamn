package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.session.UserSession;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.795, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass795 {
    public final C98K A0C;
    public final AnonymousClass797 A02 = new AnonymousClass797() { // from class: X.796
        @Override // X.AnonymousClass797
        public final InterfaceC129555tK AXe(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
            C1120954b c1120954b;
            DirectAnimatedMedia directAnimatedMedia;
            AbstractC34108F3k abstractC34108F3k = AbstractC34108F3k.$redex_init_class;
            C83403nh c83403nh = c160787Im.A0e;
            C2EY c2ey = c83403nh.A10;
            int ordinal = c2ey.ordinal();
            if (ordinal != 22) {
                if (ordinal != 23 && ordinal != 57 && ordinal != 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected REEL_SHARE, XMA_REEL_SHARE or EXPIRED_PLACEHOLDER but found: ");
                    sb.append(c2ey);
                    throw new IllegalStateException(sb.toString());
                }
                c1120954b = c83403nh.A12;
            } else {
                Object obj = c83403nh.A1T;
                obj.getClass();
                c1120954b = ((C7QR) obj).A03;
            }
            if (c1120954b != null && c1120954b.A00 != null) {
                directAnimatedMedia = LHA.A01(c1120954b);
            } else {
                C0w9.A03("story_gif_reply", "Got a gif reply type without gif media information");
                directAnimatedMedia = null;
            }
            int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
            return AbstractC46795Kmq.A00(context, userSession, anonymousClass988, c160787Im, c7im, directAnimatedMedia);
        }
    };
    public final AnonymousClass797 A00 = new AnonymousClass797() { // from class: X.798
        @Override // X.AnonymousClass797
        public final InterfaceC129555tK AXe(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
            Object obj = c160787Im.A0e.A1T;
            obj.getClass();
            C1120954b c1120954b = ((C7QR) obj).A03;
            if (c1120954b != null && c1120954b.A00 != null) {
                DirectAnimatedMedia A01 = LHA.A01(c1120954b);
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return AbstractC46793Kmo.A00(context, userSession, anonymousClass988, c160787Im, A01);
            }
            C0w9.A03("story_animated_sticker_reply", "Got a animated sticker reply type without gif media information");
            throw new IllegalStateException("Got a animated sticker reply type without media information");
        }
    };
    public final AnonymousClass797 A0D = new AnonymousClass797() { // from class: X.799
        @Override // X.AnonymousClass797
        public final InterfaceC129555tK AXe(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
            DirectAnimatedMedia directAnimatedMedia = (DirectAnimatedMedia) c160787Im.A0e.A1T;
            if (directAnimatedMedia != null) {
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return AbstractC46793Kmo.A00(context, userSession, anonymousClass988, c160787Im, directAnimatedMedia);
            }
            C0w9.A03("animated_sticker_reply", "Got a animated sticker reply type without gif media information");
            throw new IllegalStateException("Got a animated sticker reply type without media information");
        }
    };
    public final AnonymousClass797 A0G = new AnonymousClass797() { // from class: X.79A
        @Override // X.AnonymousClass797
        public final InterfaceC129555tK AXe(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
            C83403nh c83403nh = c160787Im.A0e;
            DirectStoreSticker directStoreSticker = (DirectStoreSticker) c83403nh.A1T;
            if (directStoreSticker != null) {
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C14360o3.A0B(context, 0);
                C14360o3.A0B(userSession, 1);
                C14360o3.A0B(anonymousClass988, 4);
                return new KT9(C7QM.A00(context, userSession, anonymousClass988, c160787Im, c83403nh.A10), directStoreSticker.A00, directStoreSticker.A02, false);
            }
            C0w9.A03("store_sticker_reply", "Got a store sticker reply type without media information");
            throw new IllegalStateException("Got a store sticker reply type without media information");
        }
    };
    public final AnonymousClass797 A0E = new AnonymousClass797() { // from class: X.79B
        @Override // X.AnonymousClass797
        public final InterfaceC129555tK AXe(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
            DirectAnimatedMedia directAnimatedMedia = (DirectAnimatedMedia) c160787Im.A0e.A1T;
            if (directAnimatedMedia != null) {
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return AbstractC46795Kmq.A00(context, userSession, anonymousClass988, c160787Im, c7im, directAnimatedMedia);
            }
            C0w9.A03("gif_reply", "Got a animated sticker reply type without gif media information");
            throw new IllegalStateException("Got a animated sticker reply type without media information");
        }
    };
    public final AnonymousClass797 A05 = new AnonymousClass797() { // from class: X.79C
        @Override // X.AnonymousClass797
        public final InterfaceC129555tK AXe(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
            C83403nh c83403nh = c160787Im.A0e;
            if (c83403nh.A0Q() != null) {
                return new KT8(C76S.A00(context, userSession).A05(c83403nh, c83403nh.A1L, c160787Im.A0G.A0x), C7QM.A00(context, userSession, anonymousClass988, c160787Im, c83403nh.A10), c83403nh.A0V(), false);
            }
            C0w9.A03("seflie_reaction", "Got a selfie reaction reply type without selfie reaction media information");
            throw new IllegalStateException("Got a selfie reaction reply type without media information");
        }
    };
    public final AnonymousClass797 A07 = new AnonymousClass797() { // from class: X.79D
        @Override // X.AnonymousClass797
        public final InterfaceC129555tK AXe(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
            Object obj;
            C83403nh c83403nh = c160787Im.A0e;
            C2EY c2ey = c83403nh.A10;
            if (c2ey != C2EY.A0p && c2ey != C2EY.A0z) {
                obj = c83403nh.A1T;
            } else {
                obj = c83403nh.A0g;
            }
            if (obj != null) {
                C7QL A00 = C7QK.A00(userSession, anonymousClass988, c160787Im, c7im);
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return AbstractC43698JUi.A00(context, userSession, A00, anonymousClass988, c160787Im);
            }
            C0w9.A03("voice_reply", "Got a voice reply type without voice media information");
            throw new IllegalStateException("Got a voice reply type without voice media information");
        }
    };
    public final AnonymousClass797 A0F = new AnonymousClass797() { // from class: X.79E
        @Override // X.AnonymousClass797
        public final InterfaceC129555tK AXe(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
            C83403nh c83403nh = c160787Im.A0e;
            C38321qM c38321qM = c83403nh.A0s;
            C7Q4 c7q4 = c83403nh.A0v;
            if (c38321qM == null && c7q4 == null) {
                C0w9.A03("media_reply", "Got a media reply type without media information");
                throw new IllegalStateException("Got a media reply type without media information");
            }
            return C43702JUn.A05.A00(context, null, userSession, anonymousClass988, c160787Im, c7im);
        }
    };
    public final AnonymousClass797 A01 = new AnonymousClass797() { // from class: X.79F
        @Override // X.AnonymousClass797
        public final InterfaceC129555tK AXe(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
            C83403nh c83403nh = c160787Im.A0e;
            if (c83403nh.A10 == C2EY.A0p && c83403nh.A0i == null) {
                C0w9.A03("avatar_sticker", "Got an avatar sticker reply type without avatar sticker information");
                throw new IllegalStateException("Got an avatar sticker reply type without avatar sticker information");
            }
            return AnonymousClass795.A02(context, userSession, anonymousClass988, c160787Im, c7im);
        }
    };
    public final AnonymousClass797 A04 = new AnonymousClass797() { // from class: X.79G
        @Override // X.AnonymousClass797
        public final InterfaceC129555tK AXe(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
            C83403nh c83403nh = c160787Im.A0e;
            C38321qM c38321qM = c83403nh.A0s;
            C7Q4 c7q4 = c83403nh.A0v;
            if (c38321qM == null && c7q4 == null) {
                C0w9.A03("media_reply", "Got a media reply type without media information");
                throw new IllegalStateException("Got a media reply type without media information");
            }
            return AnonymousClass795.A0D(context, userSession, anonymousClass988, c160787Im, c7im);
        }
    };
    public final AnonymousClass797 A0H = new AnonymousClass797() { // from class: X.79H
        @Override // X.AnonymousClass797
        public final InterfaceC129555tK AXe(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
            C83403nh c83403nh = c160787Im.A0e;
            C101584hT c101584hT = c83403nh.A0e;
            C7Q5 c7q5 = c83403nh.A0w;
            if (c101584hT == null && c7q5 == null) {
                C0w9.A03("visual_reply", "Got a visual reply type without visual media information");
                throw new IllegalStateException("Got a  visual reply type without media information");
            }
            return JVP.A05.A00(context, userSession, anonymousClass988, c160787Im, c7im, "");
        }
    };
    public final AnonymousClass797 A0I = new AnonymousClass797() { // from class: X.79I
        @Override // X.AnonymousClass797
        public final InterfaceC129555tK AXe(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
            C83403nh c83403nh = c160787Im.A0e;
            C101584hT c101584hT = c83403nh.A0e;
            C7Q5 c7q5 = c83403nh.A0w;
            if (c101584hT == null && c7q5 == null) {
                C0w9.A03("visual_reply", "Got a visual thumbnail reply type without visual media information");
                throw new IllegalStateException("Got a  visual thumbnail reply type without media information");
            }
            return C45857KRm.A05.A00(context, userSession, anonymousClass988, c160787Im, c7im);
        }
    };
    public final AnonymousClass797 A0J = new AnonymousClass797() { // from class: X.79J
        @Override // X.AnonymousClass797
        public final InterfaceC129555tK AXe(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
            String str;
            String str2;
            String str3;
            Integer num;
            C38321qM c38321qM;
            int i;
            EnumC92794Ds A00;
            C83403nh c83403nh = c160787Im.A0e;
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36330402507408227L);
            C4G2 c4g2 = c83403nh.A0g;
            if (A06) {
                if (c4g2 == null) {
                    C18950wb.A01.AEp("ContextReplyViewModelGeneratorFactory: voiceMedia is null for VoiceReplyContentViewModel", 20134884).report();
                }
            } else {
                c4g2.getClass();
            }
            User A02 = AnonymousClass189.A00(userSession).A02(c83403nh.A1u);
            InterfaceC83733oI interfaceC83733oI = c160787Im.A0G.A0P;
            List list = null;
            if (interfaceC83733oI instanceof C83693oE) {
                str = ((C83693oE) interfaceC83733oI).A00;
            } else {
                str = null;
            }
            if (c4g2 != null) {
                str2 = c4g2.A02();
            } else {
                str2 = null;
            }
            String A0h = c83403nh.A0h();
            String A0g = c83403nh.A0g();
            C2EY c2ey = C2EY.A1m;
            DirectMessageIdentifier directMessageIdentifier = new DirectMessageIdentifier(c2ey, A0h, A0g);
            if (A02 != null) {
                str3 = A02.getUsername();
            } else {
                str3 = null;
            }
            if (c4g2 != null) {
                num = c4g2.A00();
            } else {
                num = null;
            }
            int intValue = ((Number) AbstractC43691JUa.A00(num, 0, "playbackDurationMs")).intValue();
            if (c4g2 != null) {
                c38321qM = c4g2.A02;
                i = c4g2.A00;
                list = c4g2.A03();
            } else {
                c38321qM = null;
                i = 0;
            }
            C7QL A04 = C7QK.A04(userSession, anonymousClass988, c160787Im, c7im, c2ey, AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.D2x
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return null;
                }
            }));
            C7QX A002 = C7QM.A00(context, userSession, anonymousClass988, c160787Im, c2ey);
            if (interfaceC83733oI == null) {
                A00 = EnumC92794Ds.A05;
            } else {
                A00 = AbstractC1345466e.A00(interfaceC83733oI);
            }
            return new C7SX(null, A002, A04, A00, c38321qM, directMessageIdentifier, C05F.A00, C05F.A0C, null, c83403nh.A1K, str2, str3, str, list, intValue, i, c83403nh.A1S(), c83403nh.A2P, false);
        }
    };
    public final C79L A0B = new C79L() { // from class: X.79K
        /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
        
            if (((java.lang.Boolean) r16.A1I.getValue()).booleanValue() == false) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00b4, code lost:
        
            if (r2.A0C.AdX() == null) goto L43;
         */
        @Override // X.C79L
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.CharSequence AXg(android.content.Context r14, com.instagram.common.session.UserSession r15, X.AnonymousClass988 r16, X.C160787Im r17, X.C18A r18) {
            /*
                r13 = this;
                r3 = r17
                X.3nh r4 = r3.A0e
                X.0cb r0 = X.C17060sy.A01
                r6 = r15
                com.instagram.user.model.User r0 = r0.A01(r15)
                boolean r10 = r4.A1j(r0)
                r5 = r14
                java.lang.CharSequence r8 = X.AbstractC162687Qf.A0D(r14, r15, r4, r10)
                if (r8 != 0) goto Lbb
                X.F3k r0 = X.AbstractC34108F3k.$redex_init_class
                X.2EY r2 = r4.A10
                int r1 = r2.ordinal()
                r8 = 0
                r0 = 22
                if (r1 == r0) goto L5c
                r0 = 23
                if (r1 == r0) goto L4f
                r0 = 57
                if (r1 == r0) goto L4a
                r0 = 49
                if (r1 == r0) goto Lbb
                r0 = 21
                if (r1 == r0) goto Lbb
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "Expected REEL_SHARE, XMA_REEL_SHARE, XMA_CLIPS_SHARE or GENERIC_XMA but found: "
                r1.append(r0)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>(r1)
                throw r0
            L4a:
                java.lang.String r8 = X.AnonymousClass795.A0H(r15, r3)
                return r8
            L4f:
                r0 = 2131960316(0x7f1321fc, float:1.9557297E38)
                if (r10 == 0) goto L57
                r0 = 2131960319(0x7f1321ff, float:1.9557303E38)
            L57:
                java.lang.String r8 = r14.getString(r0)
                return r8
            L5c:
                java.lang.Object r7 = r4.A1T
                r7.getClass()
                X.7QR r7 = (X.C7QR) r7
                X.1qM r2 = r7.A02
                boolean r0 = r2.A5V()
                if (r0 != 0) goto Lbb
                com.instagram.model.mediasize.ExtendedImageUrl r0 = r2.A1q(r14)
                if (r0 == 0) goto Lbb
                com.instagram.user.model.User r0 = r3.A0K
                if (r0 == 0) goto L79
                java.lang.String r8 = r0.getUsername()
            L79:
                X.7TT r0 = r3.A0G
                boolean r9 = r0.A0r
                com.instagram.model.reels.ReelType r0 = r7.A04
                r0.getClass()
                com.instagram.model.reels.ReelType r1 = com.instagram.model.reels.ReelType.A0P
                if (r0 == r1) goto L9d
                boolean r0 = r2.A69()
                if (r0 == 0) goto L9d
                r0 = r16
                X.0do r0 = r0.A1I
                java.lang.Object r0 = r0.getValue()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                r11 = 1
                if (r0 != 0) goto L9e
            L9d:
                r11 = 0
            L9e:
                com.instagram.model.reels.ReelType r0 = r7.A04
                r0.getClass()
                if (r0 == r1) goto Lb6
                X.3bi r1 = r2.A1x()
                X.3bi r0 = X.EnumC76383bi.A05
                if (r1 != r0) goto Lb6
                X.1rF r0 = r2.A0C
                java.util.List r0 = r0.AdX()
                r12 = 1
                if (r0 != 0) goto Lb7
            Lb6:
                r12 = 0
            Lb7:
                android.text.SpannableString r8 = X.LHA.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            Lbb:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C79K.AXg(android.content.Context, com.instagram.common.session.UserSession, X.988, X.7Im, X.18A):java.lang.CharSequence");
        }
    };
    public final C79L A0A = new C79L() { // from class: X.79M
        @Override // X.C79L
        public final CharSequence AXg(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C18A c18a) {
            C83403nh c83403nh = c160787Im.A0e;
            return AbstractC162687Qf.A0D(context, userSession, c83403nh, c83403nh.A1j(C17060sy.A01.A01(userSession)));
        }
    };
    public final C79O A09 = new C79O() { // from class: X.79N
        @Override // X.C79O
        public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
            return C158727Ai.A04(context, userSession, anonymousClass988, c160787Im, c7im, c18a);
        }
    };
    public final C79O A08 = new C79O() { // from class: X.79P
        @Override // X.C79O
        public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
            return JVG.A00(context, userSession, anonymousClass988, c160787Im, c7im);
        }
    };
    public final AnonymousClass797 A06 = new AnonymousClass797() { // from class: X.79Q
        @Override // X.AnonymousClass797
        public final InterfaceC129555tK AXe(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
            C83403nh c83403nh = c160787Im.A0e;
            return new KT5(c83403nh.A16, C7QM.A00(context, userSession, anonymousClass988, c160787Im, c83403nh.A10));
        }
    };
    public final AnonymousClass797 A03 = new AnonymousClass797() { // from class: X.79R
        @Override // X.AnonymousClass797
        public final InterfaceC129555tK AXe(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
            AnonymousClass795 anonymousClass795 = AnonymousClass795.this;
            return C1580677q.A06(context, userSession, anonymousClass795.A0C, anonymousClass988, c160787Im, c7im, false, c160787Im.A0V);
        }
    };

    public static C7QY A03(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, final C7IM c7im) {
        C910143t c910143t;
        C83403nh c83403nh = c160787Im.A0e;
        AnonymousClass442 A0P = c83403nh.A0P();
        if (A0P == null) {
            C7QL A03 = C7QK.A03(userSession, anonymousClass988, c160787Im, c7im, c83403nh.A10, AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.M8c
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return AbstractC43594JPz.A0C(C7IM.this);
                }
            }));
            new C1582378i();
            C14360o3.A0B(context, 0);
            C14360o3.A0B(userSession, 2);
            C14360o3.A0B(anonymousClass988, 4);
            ImmutableList A0H = c83403nh.A0H();
            if (A0H != null && (c910143t = (C910143t) AbstractC001800i.A0O(A0H, 0)) != null) {
                return C1583378t.A02(context, userSession, A03, anonymousClass988, c160787Im, c910143t, false);
            }
            return null;
        }
        return new C1582378i().A02(context, userSession, C7QK.A01(userSession, anonymousClass988, c160787Im, c7im, A0P, C2EY.A0q), anonymousClass988, c160787Im, A0P);
    }

    public static C7QY A04(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
        return A05(context, userSession, anonymousClass988, c160787Im, c7im, null, null);
    }

    public static C7QY A05(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, final C7IM c7im, Boolean bool, Boolean bool2) {
        C83403nh c83403nh = c160787Im.A0e;
        ImmutableList A0H = c83403nh.A0H();
        C2EY c2ey = c83403nh.A10;
        if ((c2ey == C2EY.A1u || c2ey == C2EY.A19) && (A0H == null || A0H.isEmpty())) {
            return null;
        }
        return new C1582378i().A01(context, userSession, C7QK.A02(userSession, anonymousClass988, c160787Im, c7im, c83403nh.A10, bool, bool2, AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.M8d
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return AbstractC43594JPz.A0C(C7IM.this);
            }
        }), false), anonymousClass988, c160787Im);
    }

    public static KT7 A00(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im) {
        String str;
        C1120954b c1120954b = c160787Im.A0e.A12;
        c1120954b.getClass();
        C9BH c9bh = c1120954b.A00;
        c9bh.getClass();
        GifUrlImpl gifUrlImpl = (GifUrlImpl) c9bh.A00;
        User user = c160787Im.A0K;
        if (user != null) {
            str = user.getUsername();
        } else {
            str = null;
        }
        return new KT7(C7QM.A00(context, userSession, anonymousClass988, c160787Im, C2EY.A0K), gifUrlImpl, str, false);
    }

    public static KT7 A01(UserSession userSession, C160787Im c160787Im) {
        String str;
        AnonymousClass442 A0P = c160787Im.A0e.A0P();
        A0P.getClass();
        DirectAnimatedMedia A01 = AbstractC1121154d.A01(A0P.A0G);
        A01.getClass();
        GifUrlImpl gifUrlImpl = A01.A02;
        User user = c160787Im.A0K;
        if (user != null) {
            str = user.getUsername();
        } else {
            str = null;
        }
        return new KT7(C7QM.A02(userSession, c160787Im, A0P), gifUrlImpl, str, true);
    }

    public static C7QY A02(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
        C7QL A00 = C7QK.A00(userSession, anonymousClass988, c160787Im, c7im);
        new C1582378i();
        C14360o3.A0B(context, 0);
        C14360o3.A0B(c160787Im, 1);
        C14360o3.A0B(anonymousClass988, 3);
        C14360o3.A0B(userSession, 4);
        C83403nh c83403nh = c160787Im.A0e;
        C14360o3.A07(c83403nh);
        C910143t A002 = AbstractC158887Ba.A00(c83403nh);
        C910143t c910143t = c83403nh.A0i;
        String str = null;
        if (c910143t == null) {
            ExtendedImageUrl extendedImageUrl = c83403nh.A16;
            if (extendedImageUrl != null) {
                A002.A0X = extendedImageUrl;
                A002.A0e = true;
            } else {
                A002 = AbstractC158887Ba.A00(c83403nh);
            }
        } else {
            A002 = c910143t;
        }
        DirectMessageIdentifier directMessageIdentifier = new DirectMessageIdentifier(c83403nh.A0z, c83403nh.A0h(), c83403nh.A0g());
        boolean A03 = AbstractC158887Ba.A03(userSession, c83403nh);
        String str2 = c83403nh.A1u;
        C14360o3.A07(str2);
        User user = c160787Im.A0K;
        if (user != null) {
            str = user.getUsername();
        }
        C2EY c2ey = c83403nh.A0z;
        if (c2ey != null) {
            C7QX A003 = C7QM.A00(context, userSession, anonymousClass988, c160787Im, c2ey);
            C7TT c7tt = c160787Im.A0G;
            InterfaceC83733oI interfaceC83733oI = c7tt.A0P;
            int i = c7tt.A08;
            C910143t c910143t2 = c83403nh.A0i;
            if (c910143t2 == null) {
                c910143t2 = AbstractC158887Ba.A00(c83403nh);
            }
            C1583678w A01 = C1583378t.A01(c910143t2, anonymousClass988.A19);
            String str3 = c83403nh.A1V;
            boolean z = false;
            if (c83403nh.A16 != null) {
                z = true;
            }
            return C1583378t.A04(context, null, A003, A00, anonymousClass988, A01, c83403nh, A002, null, directMessageIdentifier, interfaceC83733oI, str2, str, str3, null, null, C1583378t.A05(A002, interfaceC83733oI, i, true), i, A03, true, false, false, true, false, z, false);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static C163167Sb A06(UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
        String str;
        C83403nh c83403nh = c160787Im.A0e;
        AnonymousClass442 A0P = c83403nh.A0P();
        A0P.getClass();
        DirectAnimatedMedia A01 = AbstractC1121154d.A01(A0P.A0G);
        A01.getClass();
        GifUrlImpl gifUrlImpl = A01.A02;
        DirectMessageIdentifier A0V = c83403nh.A0V();
        User user = c160787Im.A0K;
        if (user != null) {
            str = user.getUsername();
        } else {
            str = null;
        }
        Boolean bool = Boolean.TRUE;
        boolean equals = bool.equals(A01.A04);
        return new C163167Sb(C7QM.A02(userSession, c160787Im, A0P), C7QK.A01(userSession, anonymousClass988, c160787Im, c7im, A0P, C2EY.A0K), A0V, gifUrlImpl, str, equals, true, bool.equals(A01.A03));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b4, code lost:
    
        if (r19 != false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.JUe A07(android.content.Context r69, com.instagram.common.session.UserSession r70, X.AnonymousClass988 r71, X.C160787Im r72, X.C7IM r73) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass795.A07(android.content.Context, com.instagram.common.session.UserSession, X.988, X.7Im, X.7IM):X.JUe");
    }

    public static KTK A08(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
        C910143t c910143t;
        boolean z;
        C7QL A02 = C7QK.A02(userSession, anonymousClass988, c160787Im, c7im, C2EY.A0z, false, false, AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.D2w
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return null;
            }
        }), true);
        new C1582378i();
        C14360o3.A0B(context, 0);
        C14360o3.A0B(c160787Im, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(anonymousClass988, 4);
        C83403nh c83403nh = c160787Im.A0e;
        C14360o3.A07(c83403nh);
        ImmutableList A0H = c83403nh.A0H();
        if (A0H != null && (c910143t = (C910143t) AbstractC001800i.A0J(A0H)) != null) {
            C7TT c7tt = c160787Im.A0G;
            if (c7tt.A08 == 29) {
                z = c7tt.A0n;
            } else {
                z = true;
            }
            return new KTK(null, C1583378t.A03(context, userSession, A02, anonymousClass988, c160787Im, c910143t, z), C1582378i.A00(c160787Im), null, 2, false, Boolean.TRUE.equals(c910143t.A0c), false, false);
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0129, code lost:
    
        if (((X.AbstractC129515tG) r4.get(0)).A00.CVC() != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C7SZ A09(android.content.Context r46, com.instagram.common.session.UserSession r47, X.AnonymousClass988 r48, X.C160787Im r49, X.C7IM r50) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass795.A09(android.content.Context, com.instagram.common.session.UserSession, X.988, X.7Im, X.7IM):X.7SZ");
    }

    public static KT9 A0A(UserSession userSession, C160787Im c160787Im) {
        AnonymousClass442 A0P = c160787Im.A0e.A0P();
        A0P.getClass();
        DirectStoreSticker A01 = LHH.A01(A0P.A0H);
        A01.getClass();
        return new KT9(C7QM.A02(userSession, c160787Im, A0P), A01.A00, A01.A02, true);
    }

    public static AnonymousClass781 A0B(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
        String str;
        C83403nh c83403nh = c160787Im.A0e;
        AnonymousClass442 A0P = c83403nh.A0P();
        A0P.getClass();
        User user = c160787Im.A0K;
        C1581377y c1581377y = C1581377y.A00;
        String A03 = A0P.A03();
        A03.getClass();
        CharSequence A00 = c1581377y.A00(context, A0P.A0A, userSession, A03);
        boolean A01 = C4GU.A01(c83403nh.A1F);
        boolean A0E = AbstractC13670mt.A0E(A0P.A03());
        C7QL A012 = C7QK.A01(userSession, anonymousClass988, c160787Im, c7im, A0P, C2EY.A1i);
        C7QX A02 = C7QM.A02(userSession, c160787Im, A0P);
        AnonymousClass541 anonymousClass541 = AnonymousClass541.A0J;
        if (user != null) {
            str = user.getId();
        } else {
            str = null;
        }
        boolean z = c83403nh.A2O;
        boolean z2 = false;
        if (c160787Im.A00 == 0) {
            z2 = true;
        }
        return new AnonymousClass781(anonymousClass541, A02, A012, A00, str, A01, A0E, z, A0I(userSession, user, z2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        if (((java.lang.Boolean) r19.A0y.getValue()).booleanValue() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.JVI A0C(com.instagram.common.session.UserSession r18, X.AnonymousClass988 r19, X.C160787Im r20, X.C7IM r21) {
        /*
            r2 = r20
            X.3nh r0 = r2.A0e
            X.442 r3 = r0.A0P()
            r3.getClass()
            X.4hT r1 = r3.A07
            r1.getClass()
            X.4hU r5 = r1.A04
            r15 = r18
            if (r5 != 0) goto L1c
            X.1qM r0 = r1.A05
            X.4hU r5 = X.AbstractC101604hV.A00(r15, r0)
        L1c:
            java.lang.String r4 = r1.A09
            java.lang.String r0 = "once"
            boolean r11 = r0.equals(r4)
            r12 = 0
            java.lang.Integer r7 = X.C05F.A0u
            java.lang.Integer r8 = X.C05F.A01
            r6 = 0
            X.7TT r0 = r2.A0G
            boolean r0 = r0.A1G
            r4 = r19
            if (r0 == 0) goto L41
            X.0do r0 = r4.A0y
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r14 = 1
            if (r0 != 0) goto L42
        L41:
            r14 = 0
        L42:
            X.2EY r20 = X.C2EY.A0q
            r18 = r21
            r17 = r2
            r19 = r3
            r16 = r4
            X.7QL r4 = X.C7QK.A01(r15, r16, r17, r18, r19, r20)
            X.7QX r3 = X.C7QM.A02(r15, r2, r3)
            java.lang.String r0 = r1.A0A
            r16 = 0
            if (r0 == 0) goto L5c
            r16 = 1
        L5c:
            com.instagram.user.model.User r0 = r2.A0K
            if (r0 == 0) goto L6e
            java.lang.String r9 = r0.getUsername()
        L64:
            java.lang.String r10 = r1.A0A
            X.JVI r2 = new X.JVI
            r13 = r12
            r15 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r2
        L6e:
            r9 = 0
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass795.A0C(com.instagram.common.session.UserSession, X.988, X.7Im, X.7IM):X.JVI");
    }

    public static C129565tL A0D(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
        AbstractC46453KhD abstractC46453KhD;
        boolean z;
        boolean z2;
        DirectThreadAnalyticsParams directThreadAnalyticsParams;
        ExtendedImageUrl A1q;
        C83403nh c83403nh = c160787Im.A0e;
        C7Q4 c7q4 = c83403nh.A0v;
        C38321qM c38321qM = c83403nh.A0s;
        String str = null;
        if (c38321qM != null && (A1q = c38321qM.A1q(context)) != null) {
            boolean z3 = false;
            if (c38321qM.A1t() != null) {
                z3 = true;
            }
            abstractC46453KhD = new KVM(A1q, c38321qM.A1t(), c38321qM.A18(), z3);
            z2 = c38321qM.A5x();
            z = c38321qM.Cff();
        } else if (c7q4 != null) {
            abstractC46453KhD = new KVL(c7q4.A06, null);
            z2 = false;
            if (c7q4.A01 == EnumC40111tc.A0Q) {
                z2 = true;
            }
            z = c7q4.A05();
        } else {
            abstractC46453KhD = null;
            z = false;
            z2 = false;
        }
        boolean equals = c83403nh.A1u.equals(userSession.userId);
        User user = c160787Im.A0K;
        if (user != null) {
            str = AbstractC101904i3.A05(user);
        }
        C9BR c9br = new C9BR(C05F.A01, 2, equals);
        C7QL A00 = C7QK.A00(userSession, anonymousClass988, c160787Im, c7im);
        C7QX A002 = C7QM.A00(context, userSession, anonymousClass988, c160787Im, C2EY.A1C);
        boolean A1S = c83403nh.A1S();
        if (!c83403nh.A1c()) {
            directThreadAnalyticsParams = AbstractC1578876x.A00(c160787Im.A0G, c83403nh.A2G);
        } else {
            directThreadAnalyticsParams = null;
        }
        return new C129565tL(c9br, A002, A00, abstractC46453KhD, directThreadAnalyticsParams, null, str, false, false, z, z2, A1S);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (r4.A0V == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r4.A0T == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d1, code lost:
    
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        if (r4 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C129565tL A0E(android.content.Context r23, com.instagram.common.session.UserSession r24, X.AnonymousClass988 r25, X.C160787Im r26, X.C7IM r27) {
        /*
            r1 = r26
            X.3nh r0 = r1.A0e
            X.442 r2 = r0.A0P()
            r2.getClass()
            X.4hT r8 = r2.A07
            r8.getClass()
            X.4hU r4 = r8.A04
            r17 = 1
            r12 = 0
            r7 = r23
            if (r4 == 0) goto Ldc
            com.instagram.model.mediasize.ExtendedImageUrl r3 = r4.A00(r7)
            if (r3 == 0) goto Ldc
            com.instagram.model.mediasize.ImageInfo r5 = r4.A06
            r23 = 0
            if (r5 == 0) goto L27
            r23 = 1
        L27:
            com.instagram.model.mediasize.ExtendedImageUrl r19 = r4.A00(r7)
            long r3 = r4.A02
            X.KVM r10 = new X.KVM
            r18 = r10
            r20 = r5
            r21 = r3
            r18.<init>(r19, r20, r21, r23)
        L38:
            java.lang.String r4 = r2.A0U
            r5 = r24
            java.lang.String r3 = r5.userId
            boolean r6 = r4.equals(r3)
            java.lang.Object r4 = r0.A1T
            boolean r3 = r4 instanceof X.C38321qM
            if (r3 == 0) goto Ld7
            X.1qM r4 = (X.C38321qM) r4
            boolean r16 = r4.Cff()
            boolean r9 = r4.A5x()
        L52:
            java.lang.Object r4 = r0.A1T
            boolean r3 = r4 instanceof X.C101584hT
            if (r3 == 0) goto Ld4
            X.4hT r4 = (X.C101584hT) r4
            X.4hU r4 = r4.A04
            if (r4 == 0) goto L64
            boolean r3 = r4.A0V
            r16 = 1
            if (r3 != 0) goto L68
        L64:
            r16 = 0
            if (r4 == 0) goto Ld1
        L68:
            boolean r3 = r4.A0T
            if (r3 == 0) goto Ld1
        L6c:
            com.instagram.user.model.User r3 = r1.A0K
            if (r3 == 0) goto Lcf
            java.lang.String r13 = X.AbstractC101904i3.A05(r3)
        L74:
            X.1qM r3 = r8.A05
            if (r3 == 0) goto L97
            java.lang.String r3 = r3.getId()
            if (r3 == 0) goto L97
            X.1qM r3 = r8.A05
            java.lang.String r3 = r3.getId()
            X.75q r4 = new X.75q
            r4.<init>(r5, r0, r3)
            boolean r3 = r4.A06()
            if (r3 == 0) goto L97
            r3 = 0
            X.C14360o3.A0B(r7, r3)
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r12 = r4.A04(r7, r3)
        L97:
            r14 = 1
            r15 = 0
            java.lang.Integer r4 = X.C05F.A01
            r3 = 2
            X.9BR r7 = new X.9BR
            r7.<init>(r4, r3, r6)
            X.2EY r23 = X.C2EY.A0q
            r19 = r25
            r21 = r27
            r20 = r1
            r22 = r2
            r18 = r5
            X.7QL r9 = X.C7QK.A01(r18, r19, r20, r21, r22, r23)
            X.7QX r8 = X.C7QM.A02(r5, r1, r2)
            boolean r18 = r0.A1S()
            boolean r2 = r0.A1c()
            if (r2 != 0) goto Lcd
            X.7TT r1 = r1.A0G
            boolean r0 = r0.A2G
            com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams r11 = X.AbstractC1578876x.A00(r1, r0)
        Lc7:
            X.5tL r6 = new X.5tL
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r6
        Lcd:
            r11 = 0
            goto Lc7
        Lcf:
            r13 = r12
            goto L74
        Ld1:
            r17 = 0
            goto L6c
        Ld4:
            r17 = r9
            goto L6c
        Ld7:
            r9 = 0
            r16 = 0
            goto L52
        Ldc:
            r10 = r12
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass795.A0E(android.content.Context, com.instagram.common.session.UserSession, X.988, X.7Im, X.7IM):X.5tL");
    }

    public static C7SX A0F(UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
        String str;
        EnumC92794Ds A00;
        C83403nh c83403nh = c160787Im.A0e;
        AnonymousClass442 A0P = c83403nh.A0P();
        A0P.getClass();
        C4G2 c4g2 = A0P.A08;
        c4g2.getClass();
        User A02 = AnonymousClass189.A00(userSession).A02(A0P.A0U);
        InterfaceC83733oI interfaceC83733oI = c160787Im.A0G.A0P;
        String str2 = null;
        if (interfaceC83733oI instanceof C83693oE) {
            str = ((C83693oE) interfaceC83733oI).A00;
        } else {
            str = null;
        }
        String A022 = c4g2.A02();
        String A0h = c83403nh.A0h();
        String A0g = c83403nh.A0g();
        C2EY c2ey = C2EY.A1m;
        DirectMessageIdentifier directMessageIdentifier = new DirectMessageIdentifier(c2ey, A0h, A0g);
        if (A02 != null) {
            str2 = A02.getUsername();
        }
        int intValue = ((Number) AbstractC43691JUa.A00(c4g2.A00(), 0, "playbackDurationMs")).intValue();
        C38321qM c38321qM = c4g2.A02;
        int i = c4g2.A00;
        List A03 = c4g2.A03();
        C7QL A01 = C7QK.A01(userSession, anonymousClass988, c160787Im, c7im, A0P, c2ey);
        C7QX A023 = C7QM.A02(userSession, c160787Im, A0P);
        if (interfaceC83733oI == null) {
            A00 = EnumC92794Ds.A05;
        } else {
            A00 = AbstractC1345466e.A00(interfaceC83733oI);
        }
        return new C7SX(null, A023, A01, A00, c38321qM, directMessageIdentifier, C05F.A00, C05F.A0C, null, c83403nh.A1K, A022, str2, str, A03, intValue, i, c83403nh.A1S(), c83403nh.A2P, false);
    }

    public static CharSequence A0G(Context context, UserSession userSession, C160787Im c160787Im) {
        C83403nh c83403nh = c160787Im.A0e;
        if (c83403nh.A2F) {
            return AbstractC47009KqS.A00(context, userSession, c160787Im);
        }
        return AbstractC162687Qf.A0D(context, userSession, c83403nh, c83403nh.A1j(C17060sy.A01.A01(userSession)));
    }

    public static String A0H(UserSession userSession, C160787Im c160787Im) {
        C83403nh c83403nh = c160787Im.A0e;
        String str = c83403nh.A1V;
        if (str == null) {
            String A0o = c83403nh.A0o();
            String A0m = c83403nh.A0m();
            String A0n = c83403nh.A0n();
            if (A0o != null && A0m != null && A0n != null) {
                String str2 = c83403nh.A1u;
                C7TT c7tt = c160787Im.A0G;
                return AbstractC28053CYh.A01(EnumC46252KdU.A00(A0o), EnumC46251KdT.A00(A0m), userSession, str2, A0n, c7tt.A0b, c7tt.A0r);
            }
            return str;
        }
        return str;
    }

    public static boolean A0I(UserSession userSession, User user, boolean z) {
        if (!z && user != null && (user.A03.Aah() == IGAIAgentType.A05 || user.A03.Aah() == IGAIAgentType.A06 || user.A1U())) {
            C14360o3.A0B(userSession, 0);
            if (C18U.A06(C06090Tz.A05, userSession, 36324767510639041L)) {
                return true;
            }
        }
        return false;
    }

    public final C1584879i A0J() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.LkA
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new C45236K0q((KT7) interfaceC129555tK, (KT7) interfaceC129555tK2, c1585879t, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0D, new C79O() { // from class: X.YEu
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A01(userSession, c160787Im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0K() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.LkX
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new C45237K0r((KT7) interfaceC129555tK, c1585879t, (C163167Sb) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0D, new C79O() { // from class: X.Liu
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A06(userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0L() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Ljn
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new C45238K0s((KT7) interfaceC129555tK, c1585879t, (JUe) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0D, new C79O() { // from class: X.LiP
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A07(context, userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0M() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.LkP
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new C45239K0t((KT7) interfaceC129555tK, c1585879t, (KT9) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0D, new C79O() { // from class: X.Lim
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0A(userSession, c160787Im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0N() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Lku
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new C45240K0u((KT7) interfaceC129555tK, c1585879t, (AnonymousClass781) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0D, new C79O() { // from class: X.LjB
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0B(context, userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0O() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Lka
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new C45242K0w((KT7) interfaceC129555tK, c1585879t, (JVI) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0D, new C79O() { // from class: X.YF1
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0C(userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0P() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Ljs
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new C45241K0v((KT7) interfaceC129555tK, c1585879t, (C129565tL) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0D, new C79O() { // from class: X.LiR
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0E(context, userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0Q() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Lk5
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new C45243K0x((KT7) interfaceC129555tK, c1585879t, (C7SX) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0D, new C79O() { // from class: X.YEr
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0F(userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0R() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Ljz
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new C45244K0y((KT7) interfaceC129555tK2, c1585879t, (C163167Sb) interfaceC129555tK, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0E, new C79O() { // from class: X.YEo
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A01(userSession, c160787Im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0S() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.LkE
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new C45245K0z(c1585879t, (C163167Sb) interfaceC129555tK, (C163167Sb) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0E, new C79O() { // from class: X.Lih
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A06(userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0T() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Lkm
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new K10(c1585879t, (C163167Sb) interfaceC129555tK, (JUe) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0E, new C79O() { // from class: X.Lj5
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A07(context, userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0U() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Lki
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new K11(c1585879t, (C163167Sb) interfaceC129555tK, (KT9) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0E, new C79O() { // from class: X.Lj1
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0A(userSession, c160787Im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0V() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Ljm
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new K12(c1585879t, (C163167Sb) interfaceC129555tK, (AnonymousClass781) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0E, new C79O() { // from class: X.LiO
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0B(context, userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0W() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Lk1
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new K14(c1585879t, (C163167Sb) interfaceC129555tK, (JVI) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0E, new C79O() { // from class: X.YEp
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0C(userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0X() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.LkJ
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new K13(c1585879t, (C163167Sb) interfaceC129555tK, (C129565tL) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0E, new C79O() { // from class: X.Lij
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0E(context, userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0Y() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Lks
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new K15(c1585879t, (C163167Sb) interfaceC129555tK, (C7SX) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0E, new C79O() { // from class: X.YF3
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0F(userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0Z() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.LkL
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new K16((KT7) interfaceC129555tK2, c1585879t, (JUe) interfaceC129555tK, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0F, new C79O() { // from class: X.YEx
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A01(userSession, c160787Im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0a() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Ljp
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new K17(c1585879t, (C163167Sb) interfaceC129555tK2, (JUe) interfaceC129555tK, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0F, new C79O() { // from class: X.LiQ
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A06(userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0b() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Ljf
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new K18(c1585879t, (JUe) interfaceC129555tK, (JUe) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0F, new C79O() { // from class: X.LiI
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A07(context, userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0c() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.LkI
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new K19(c1585879t, (JUe) interfaceC129555tK, (AnonymousClass781) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0F, new C79O() { // from class: X.Lii
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0B(context, userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0d() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Lkv
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new K1B(c1585879t, (JUe) interfaceC129555tK, (JVI) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0F, new C79O() { // from class: X.YF4
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0C(userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0e() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.LkC
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new K1A(c1585879t, (JUe) interfaceC129555tK, (C129565tL) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0F, new C79O() { // from class: X.Lif
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0E(context, userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0f() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.LkK
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new K1C(c1585879t, (JUe) interfaceC129555tK, (C7SX) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0F, new C79O() { // from class: X.YEw
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0F(userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0g() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Lk9
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new K1J(c1585879t, (KT9) interfaceC129555tK, (AnonymousClass781) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0G, new C79O() { // from class: X.Lid
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0B(context, userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0h() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Lk7
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new K1L((KT7) interfaceC129555tK2, c1585879t, (AnonymousClass781) interfaceC129555tK, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A03, new C79O() { // from class: X.YEs
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A01(userSession, c160787Im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0i() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Lkj
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new C45266K1u(c1585879t, (C7QY) interfaceC129555tK2, (AnonymousClass781) interfaceC129555tK, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A03, new C79O() { // from class: X.Lj2
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A03(context, userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0j() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.79f
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new C1584079a(c1585879t, (AnonymousClass781) interfaceC129555tK, (AnonymousClass781) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A03, new C79O() { // from class: X.79h
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0B(context, userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0k() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.LkO
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new K1Q(c1585879t, (AnonymousClass781) interfaceC129555tK, (JVI) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A03, new C79O() { // from class: X.YEy
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0C(userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0l() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Lk8
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new K1S(c1585879t, (AnonymousClass781) interfaceC129555tK, (C7SX) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A03, new C79O() { // from class: X.YEt
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0F(userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0m() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Lk4
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new K1T((KT7) interfaceC129555tK2, c1585879t, (JVI) interfaceC129555tK, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0H, new C79O() { // from class: X.YEq
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A01(userSession, c160787Im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0n() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.JTp
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new K1U(c1585879t, (C163167Sb) interfaceC129555tK2, (JVI) interfaceC129555tK, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0H, new C79O() { // from class: X.JTo
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A06(userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0o() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.LkU
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new K1V(c1585879t, (JUe) interfaceC129555tK2, (JVI) interfaceC129555tK, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0H, new C79O() { // from class: X.Liq
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A07(context, userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0p() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Lke
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new K1W(c1585879t, (AnonymousClass781) interfaceC129555tK2, (JVI) interfaceC129555tK, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0H, new C79O() { // from class: X.Liy
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0B(context, userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0q() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.LkT
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new K1Y(c1585879t, (JVI) interfaceC129555tK, (JVI) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0H, new C79O() { // from class: X.YEz
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0C(userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0r() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Ljc
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new K1X(c1585879t, (JVI) interfaceC129555tK, (C129565tL) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0H, new C79O() { // from class: X.LiH
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0E(context, userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0s() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Lje
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new K1Z(c1585879t, (JVI) interfaceC129555tK, (C7SX) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0H, new C79O() { // from class: X.YEm
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0F(userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0t() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.LkZ
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new C45246K1a((KT7) interfaceC129555tK2, c1585879t, (C129565tL) interfaceC129555tK, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0I, new C79O() { // from class: X.YF0
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A01(userSession, c160787Im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0u() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Lkk
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new C45247K1b(c1585879t, (C163167Sb) interfaceC129555tK2, (C129565tL) interfaceC129555tK, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0I, new C79O() { // from class: X.Lj3
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A06(userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0v() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Lkx
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new C45248K1c(c1585879t, (JUe) interfaceC129555tK2, (C129565tL) interfaceC129555tK, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0I, new C79O() { // from class: X.LjC
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A07(context, userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0w() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Lji
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new C45249K1d(c1585879t, (AnonymousClass781) interfaceC129555tK2, (C129565tL) interfaceC129555tK, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0I, new C79O() { // from class: X.LiK
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0B(context, userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0x() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Ljd
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new C45251K1f(c1585879t, (JVI) interfaceC129555tK2, (C129565tL) interfaceC129555tK, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0I, new C79O() { // from class: X.YEl
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0C(userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0y() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Lkc
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new C45250K1e(c1585879t, (C129565tL) interfaceC129555tK, (C129565tL) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0I, new C79O() { // from class: X.Lix
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0E(context, userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A0z() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.LkF
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new C45252K1g(c1585879t, (C129565tL) interfaceC129555tK, (C7SX) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A0I, new C79O() { // from class: X.YEv
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0F(userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A10() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Ljj
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new C45253K1h((KT7) interfaceC129555tK2, c1585879t, (C7SX) interfaceC129555tK, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A07, new C79O() { // from class: X.YEn
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A01(userSession, c160787Im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A11() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Lkd
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new C45258K1m(c1585879t, (JVI) interfaceC129555tK2, (C7SX) interfaceC129555tK, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A07, new C79O() { // from class: X.YF2
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0C(userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A12() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Lkw
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new C45259K1n(c1585879t, (C7SX) interfaceC129555tK, (C7SX) interfaceC129555tK2, str);
            }
        };
        C76N c76n = new C76N(this);
        return new C1584879i(this.A07, new C79O() { // from class: X.YF5
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A0F(userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c76n, interfaceC1584679g);
    }

    public final C1584879i A13() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Ljv
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new C45233K0n(c1585879t, (C7QY) interfaceC129555tK2, (C7SX) interfaceC129555tK, str);
            }
        };
        C79L c79l = new C79L() { // from class: X.LjH
            @Override // X.C79L
            public final CharSequence AXg(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C18A c18a) {
                C83403nh c83403nh = c160787Im.A0e;
                return AbstractC162687Qf.A0D(context, userSession, c83403nh, AbstractC43594JPz.A1Y(userSession, c83403nh));
            }
        };
        return new C1584879i(this.A0J, new C79O() { // from class: X.LiU
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A04(context, userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c79l, interfaceC1584679g);
    }

    public final C1584879i A14() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.LjZ
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new C45935KUm(c1585879t, (C7QY) interfaceC129555tK2, (AnonymousClass781) interfaceC129555tK, str);
            }
        };
        C79L c79l = new C79L() { // from class: X.LjK
            @Override // X.C79L
            public final CharSequence AXg(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C18A c18a) {
                return AnonymousClass795.A0H(userSession, c160787Im);
            }
        };
        return new C1584879i(new AnonymousClass797() { // from class: X.Li7
            @Override // X.AnonymousClass797
            public final InterfaceC129555tK AXe(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
                return C1580677q.A03(context, userSession, AnonymousClass795.this.A0C, anonymousClass988, c160787Im, c7im);
            }
        }, new C79O() { // from class: X.Lis
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return new C1582378i().A01(context, userSession, C7QK.A04(userSession, anonymousClass988, c160787Im, c7im, c160787Im.A0e.A10, AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.M8a
                    @Override // X.InterfaceC16820sZ
                    public final Object invoke() {
                        return null;
                    }
                })), anonymousClass988, c160787Im);
            }
        }, c79l, interfaceC1584679g);
    }

    public final C1584879i A15() {
        InterfaceC1584679g interfaceC1584679g = new InterfaceC1584679g() { // from class: X.Ljo
            @Override // X.InterfaceC1584679g
            public final InterfaceC66482zP AMY(C1585879t c1585879t, InterfaceC129555tK interfaceC129555tK, InterfaceC129555tK interfaceC129555tK2, String str) {
                return new K21(c1585879t, (C7QY) interfaceC129555tK2, (C7SX) interfaceC129555tK, str);
            }
        };
        C79L c79l = new C79L() { // from class: X.LjQ
            @Override // X.C79L
            public final CharSequence AXg(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C18A c18a) {
                return AnonymousClass795.A0G(context, userSession, c160787Im);
            }
        };
        return new C1584879i(this.A0J, new C79O() { // from class: X.LiV
            @Override // X.C79O
            public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
                return AnonymousClass795.A04(context, userSession, anonymousClass988, c160787Im, c7im);
            }
        }, c79l, interfaceC1584679g);
    }

    public AnonymousClass795(C98K c98k) {
        this.A0C = c98k;
    }
}
