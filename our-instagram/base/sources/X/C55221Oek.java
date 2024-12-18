package X;

import android.content.Context;
import com.facebook.rsys.mediasync.gen.ActionMetadata;
import com.facebook.rsys.mediasync.gen.AudioAttribution;
import com.facebook.rsys.mediasync.gen.CaptionLocales;
import com.facebook.rsys.mediasync.gen.FacebookVideoContent;
import com.facebook.rsys.mediasync.gen.Fallback;
import com.facebook.rsys.mediasync.gen.InstagramContent;
import com.facebook.rsys.mediasync.gen.InstagramContentOwner;
import com.facebook.rsys.mediasync.gen.MediaSyncContent;
import com.facebook.rsys.mediasync.gen.MediaSyncState;
import com.facebook.rsys.mediasync.gen.Placeholder;
import com.facebook.rsys.mediasync.gen.SizedUrl;
import com.facebook.rsys.mediasync.gen.Video;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Oek, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55221Oek {
    public final Context A00;
    public final UserSession A01;

    public static long A00(MediaSyncState mediaSyncState) {
        int i = mediaSyncState.action;
        if (i != 0) {
            if (i != 1) {
                return 0L;
            }
            return mediaSyncState.actionMetadata.mediaPositionMs;
        }
        long currentTimeMillis = System.currentTimeMillis() + mediaSyncState.localClockOffsetMs;
        ActionMetadata actionMetadata = mediaSyncState.actionMetadata;
        return (currentTimeMillis - actionMetadata.actionTimeMs) + actionMetadata.mediaPositionMs;
    }

    private final long A01(InterfaceC58104PpT interfaceC58104PpT, long j) {
        C51600Mqs c51600Mqs;
        long j2;
        if (interfaceC58104PpT instanceof C51768MuY) {
            c51600Mqs = ((C51768MuY) interfaceC58104PpT).A02;
        } else {
            if (interfaceC58104PpT instanceof C51767MuX) {
                c51600Mqs = ((C51767MuX) interfaceC58104PpT).A01;
                j2 = c51600Mqs.A01;
                if (Long.valueOf(j2) == null && j2 > 0 && j >= j2) {
                    return j % j2;
                }
                return j;
            }
            if (!(interfaceC58104PpT instanceof C51766MuW)) {
                return j;
            }
            c51600Mqs = ((C51766MuW) interfaceC58104PpT).A00;
        }
        if (c51600Mqs == null) {
            return j;
        }
        j2 = c51600Mqs.A01;
        return Long.valueOf(j2) == null ? j : j;
    }

    public static final MVC A02(SizedUrl sizedUrl) {
        Integer num;
        String str = sizedUrl.url;
        C14360o3.A06(str);
        int i = sizedUrl.height;
        int i2 = sizedUrl.width;
        String str2 = sizedUrl.type;
        if (str2 != null) {
            num = AbstractC003100w.A0i(str2);
        } else {
            num = null;
        }
        return new MVC(num, str, i, i2);
    }

    public static final MediaSyncContent A04(InterfaceC58104PpT interfaceC58104PpT, C55221Oek c55221Oek) {
        FacebookVideoContent facebookVideoContent;
        InstagramContent instagramContent;
        Placeholder placeholder;
        C51766MuW c51766MuW;
        Video video;
        C51765MuV c51765MuV;
        C51768MuY c51768MuY;
        C51767MuX c51767MuX;
        SizedUrl sizedUrl;
        Fallback fallback = null;
        if ((interfaceC58104PpT instanceof C51767MuX) && (c51767MuX = (C51767MuX) interfaceC58104PpT) != null) {
            String str = c51767MuX.A02;
            Video A05 = c55221Oek.A05(c51767MuX.A01);
            MVC mvc = c51767MuX.A00;
            if (mvc != null) {
                sizedUrl = new SizedUrl(mvc.A03, mvc.A00, mvc.A01, AbstractC31180DnO.A0k(mvc.A02));
            } else {
                sizedUrl = null;
            }
            facebookVideoContent = new FacebookVideoContent(str, A05, sizedUrl, c51767MuX.A04, c51767MuX.A03, c51767MuX.A06, c51767MuX.A07, AbstractC166987dD.A1E());
        } else {
            facebookVideoContent = null;
        }
        if ((interfaceC58104PpT instanceof C51768MuY) && (c51768MuY = (C51768MuY) interfaceC58104PpT) != null) {
            instagramContent = c55221Oek.A03(c51768MuY);
        } else {
            instagramContent = null;
        }
        if ((interfaceC58104PpT instanceof C51765MuV) && (c51765MuV = (C51765MuV) interfaceC58104PpT) != null) {
            placeholder = new Placeholder(c51765MuV.A01, c51765MuV.A03, c51765MuV.A02);
        } else {
            placeholder = null;
        }
        if ((interfaceC58104PpT instanceof C51766MuW) && (c51766MuW = (C51766MuW) interfaceC58104PpT) != null) {
            String str2 = c51766MuW.A04;
            String str3 = c51766MuW.A05;
            String str4 = c51766MuW.A06;
            C51600Mqs c51600Mqs = c51766MuW.A00;
            if (c51600Mqs != null) {
                video = c55221Oek.A05(c51600Mqs);
            } else {
                video = null;
            }
            fallback = new Fallback(str2, str3, str4, video, c51766MuW.A03, c51766MuW.A02);
        }
        return new MediaSyncContent(instagramContent, facebookVideoContent, placeholder, fallback);
    }

    private final Video A05(C51600Mqs c51600Mqs) {
        SizedUrl sizedUrl;
        MVC mvc = c51600Mqs.A02;
        if (mvc != null) {
            sizedUrl = new SizedUrl(mvc.A03, mvc.A00, mvc.A01, AbstractC31180DnO.A0k(mvc.A02));
        } else {
            sizedUrl = null;
        }
        return new Video(sizedUrl, c51600Mqs.A03, c51600Mqs.A01, c51600Mqs.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    private final C51768MuY A06(InstagramContent instagramContent) {
        ?? r12;
        ArrayList arrayList;
        C51600Mqs c51600Mqs;
        Integer num;
        Integer num2;
        ArrayList arrayList2 = instagramContent.images;
        if (arrayList2 != null) {
            r12 = AbstractC167007dF.A0i(arrayList2);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                SizedUrl sizedUrl = (SizedUrl) it.next();
                C14360o3.A0A(sizedUrl);
                r12.add(A02(sizedUrl));
            }
        } else {
            r12 = C16930sl.A00;
        }
        ArrayList arrayList3 = instagramContent.carousel;
        C50679MYx c50679MYx = null;
        if (arrayList3 != null) {
            arrayList = AbstractC167007dF.A0i(arrayList3);
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                InstagramContent instagramContent2 = (InstagramContent) it2.next();
                C14360o3.A0A(instagramContent2);
                arrayList.add(A06(instagramContent2));
            }
        } else {
            arrayList = null;
        }
        String str = instagramContent.contentId;
        C14360o3.A06(str);
        String str2 = instagramContent.thumbnailUrl;
        C14360o3.A06(str2);
        Video video = instagramContent.video;
        if (video != null) {
            c51600Mqs = A07(video);
        } else {
            c51600Mqs = null;
        }
        InstagramContentOwner instagramContentOwner = instagramContent.owner;
        C14360o3.A06(instagramContentOwner);
        String str3 = instagramContentOwner.userId;
        C14360o3.A06(str3);
        String str4 = instagramContentOwner.username;
        C14360o3.A06(str4);
        String str5 = instagramContentOwner.avatarUrl;
        C14360o3.A06(str5);
        C45116Jxl c45116Jxl = new C45116Jxl(str3, str4, str5, 0);
        int i = instagramContent.mediaType;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        num = C05F.A0Y;
                    } else {
                        num = C05F.A0C;
                    }
                } else {
                    num = C05F.A0N;
                }
            } else {
                num = C05F.A01;
            }
        } else {
            num = C05F.A00;
        }
        AudioAttribution audioAttribution = instagramContent.audioAttribution;
        if (audioAttribution != null) {
            c50679MYx = new C50679MYx(audioAttribution.artistName, audioAttribution.songTitle, 3);
        }
        String str6 = instagramContent.trackingToken;
        if (str6 == null) {
            str6 = "";
        }
        int i2 = instagramContent.productType;
        if (i2 != 1) {
            if (i2 != 2) {
                num2 = C05F.A0C;
            } else {
                num2 = C05F.A01;
            }
        } else {
            num2 = C05F.A00;
        }
        return new C51768MuY(c50679MYx, c45116Jxl, c51600Mqs, num, num2, str, str2, str6, r12, arrayList);
    }

    private final C51600Mqs A07(Video video) {
        MVC mvc;
        SizedUrl sizedUrl = video.url;
        if (sizedUrl != null) {
            mvc = A02(sizedUrl);
        } else {
            mvc = null;
        }
        return new C51600Mqs(mvc, video.dashManifest, video.aspectRatio, video.durationMs);
    }

    public static final Integer A08(MediaSyncState mediaSyncState) {
        int i = mediaSyncState.contentSource;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    return C05F.A00;
                }
                return C05F.A0N;
            }
            return C05F.A0C;
        }
        return C05F.A01;
    }

    public static final Integer A09(MediaSyncState mediaSyncState) {
        int i = mediaSyncState.action;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return C05F.A0C;
                }
                throw AbstractC166987dD.A14("Unsupported action");
            }
            return C05F.A01;
        }
        return C05F.A00;
    }

    public final C51630MrN A0A(MediaSyncContent mediaSyncContent, MediaSyncState mediaSyncState) {
        C51600Mqs c51600Mqs;
        InterfaceC58104PpT c51766MuW;
        MVC mvc;
        Integer A09 = A09(mediaSyncState);
        Integer A08 = A08(mediaSyncState);
        InstagramContent instagramContent = mediaSyncContent.instagramContent;
        if (instagramContent != null) {
            c51766MuW = A06(instagramContent);
        } else {
            FacebookVideoContent facebookVideoContent = mediaSyncContent.facebookVideoContent;
            if (facebookVideoContent != null) {
                ArrayList arrayList = facebookVideoContent.availableCaptionLocales;
                C14360o3.A06(arrayList);
                ArrayList A0q = AbstractC167017dG.A0q(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    CaptionLocales captionLocales = (CaptionLocales) it.next();
                    C14360o3.A0A(captionLocales);
                    String str = captionLocales.locale;
                    C14360o3.A06(str);
                    String str2 = captionLocales.localizedLanguage;
                    C14360o3.A06(str2);
                    A0q.add(new QIj(str, str2, captionLocales.localizedCountry, captionLocales.localizedCreationMethod, captionLocales.captionsUrl, 1));
                }
                String str3 = facebookVideoContent.contentId;
                C14360o3.A06(str3);
                Video video = facebookVideoContent.video;
                C14360o3.A06(video);
                C51600Mqs A07 = A07(video);
                SizedUrl sizedUrl = facebookVideoContent.thumbnail;
                if (sizedUrl != null) {
                    mvc = A02(sizedUrl);
                } else {
                    mvc = null;
                }
                c51766MuW = new C51767MuX(mvc, A07, str3, facebookVideoContent.title, facebookVideoContent.subtitle, A0q, facebookVideoContent.isLiveStreaming, facebookVideoContent.isReportable);
            } else {
                Placeholder placeholder = mediaSyncContent.placeholder;
                if (placeholder != null) {
                    String str4 = placeholder.contentId;
                    C14360o3.A06(str4);
                    String str5 = placeholder.title;
                    C14360o3.A06(str5);
                    String str6 = placeholder.message;
                    C14360o3.A06(str6);
                    c51766MuW = new C51765MuV(A08, str4, str5, str6);
                } else {
                    Fallback fallback = mediaSyncContent.fallback;
                    if (fallback != null) {
                        String str7 = fallback.contentId;
                        C14360o3.A06(str7);
                        String str8 = fallback.coverImageUrl;
                        C14360o3.A06(str8);
                        String str9 = fallback.message;
                        Video video2 = fallback.video;
                        if (video2 != null) {
                            c51600Mqs = A07(video2);
                        } else {
                            c51600Mqs = null;
                        }
                        c51766MuW = new C51766MuW(c51600Mqs, A08, str7, str8, str9, fallback.attributionImageUrl, fallback.attribution);
                    } else {
                        throw AbstractC166987dD.A14("No content type found");
                    }
                }
            }
        }
        InterfaceC58104PpT interfaceC58104PpT = c51766MuW;
        long A01 = A01(interfaceC58104PpT, A00(mediaSyncState));
        String str10 = mediaSyncState.tabSource;
        String str11 = mediaSyncState.adminMessage;
        return new C51630MrN(interfaceC58104PpT, A09, mediaSyncState.actionMetadata.carouselItemIndex, Long.valueOf(A01), str10, str11, mediaSyncState.actorId, mediaSyncState.seedContentId, false);
    }

    public final C51630MrN A0C(MediaSyncState mediaSyncState, InterfaceC58104PpT interfaceC58104PpT) {
        if (mediaSyncState != null && interfaceC58104PpT != null) {
            long A01 = A01(interfaceC58104PpT, A00(mediaSyncState));
            Integer A09 = A09(mediaSyncState);
            String str = mediaSyncState.tabSource;
            String str2 = mediaSyncState.adminMessage;
            return new C51630MrN(interfaceC58104PpT, A09, mediaSyncState.actionMetadata.carouselItemIndex, Long.valueOf(A01), str, str2, mediaSyncState.actorId, mediaSyncState.seedContentId, false);
        }
        return null;
    }

    public C55221Oek(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        r9 = new com.facebook.rsys.mediasync.gen.InstagramContentOwner(r3, r1, r0);
        r7 = r19.A03.intValue();
        r10 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        if (r7 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        if (r7 == 1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        if (r7 == 2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        r10 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        if (r7 == 3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
    
        r0 = r19.A04.intValue();
        r11 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
    
        if (r0 == 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        if (r0 == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
    
        if (r0 != 2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c7, code lost:
    
        throw X.B4Z.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bd, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
    
        r12 = r19.A06;
        r0 = r19.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
    
        if (r0 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
    
        r14 = A05(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        r0 = r19.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a2, code lost:
    
        r1 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a4, code lost:
    
        if (r1 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a9, code lost:
    
        r0 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
    
        if (r0 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ad, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ba, code lost:
    
        return new com.facebook.rsys.mediasync.gen.InstagramContent(r8, r9, r10, r11, r12, r13, r14, r15, new com.facebook.rsys.mediasync.gen.AudioAttribution(r1, r2), "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a6, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a7, code lost:
    
        if (r0 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bb, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bf, code lost:
    
        r10 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c1, code lost:
    
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0067, code lost:
    
        r0 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0069, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x005e, code lost:
    
        if (r0 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.rsys.mediasync.gen.InstagramContent A03(X.C51768MuY r19) {
        /*
            r18 = this;
            java.util.ArrayList r13 = X.AbstractC166987dD.A1E()
            r5 = r19
            java.util.List r0 = r5.A09
            java.util.Iterator r6 = r0.iterator()
        Lc:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r6.next()
            X.MVC r0 = (X.MVC) r0
            java.lang.String r4 = r0.A03
            int r3 = r0.A00
            int r2 = r0.A01
            java.lang.Object r0 = r0.A02
            java.lang.String r1 = X.AbstractC31180DnO.A0k(r0)
            com.facebook.rsys.mediasync.gen.SizedUrl r0 = new com.facebook.rsys.mediasync.gen.SizedUrl
            r0.<init>(r4, r3, r2, r1)
            r13.add(r0)
            goto Lc
        L2d:
            java.util.ArrayList r15 = X.AbstractC166987dD.A1E()
            java.util.List r0 = r5.A08
            r6 = r18
            if (r0 == 0) goto L4f
            java.util.Iterator r1 = r0.iterator()
        L3b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r1.next()
            X.MuY r0 = (X.C51768MuY) r0
            com.facebook.rsys.mediasync.gen.InstagramContent r0 = r6.A03(r0)
            r15.add(r0)
            goto L3b
        L4f:
            java.lang.String r8 = r5.A05
            X.Jxl r0 = r5.A01
            java.lang.String r2 = ""
            r17 = r2
            if (r0 == 0) goto L5d
            java.lang.String r3 = r0.A01
            if (r3 != 0) goto L60
        L5d:
            r3 = r2
            if (r0 == 0) goto L64
        L60:
            java.lang.String r1 = r0.A02
            if (r1 != 0) goto L67
        L64:
            r1 = r2
            if (r0 == 0) goto L6b
        L67:
            java.lang.String r0 = r0.A00
            if (r0 != 0) goto L6c
        L6b:
            r0 = r2
        L6c:
            com.facebook.rsys.mediasync.gen.InstagramContentOwner r9 = new com.facebook.rsys.mediasync.gen.InstagramContentOwner
            r9.<init>(r3, r1, r0)
            java.lang.Integer r0 = r5.A03
            int r7 = r0.intValue()
            r10 = 4
            r0 = 3
            r4 = 2
            r3 = 1
            r1 = 0
            if (r7 == r1) goto Lc1
            if (r7 == r3) goto Lbf
            if (r7 == r4) goto L86
            r10 = 3
            if (r7 == r0) goto L86
            r10 = 0
        L86:
            java.lang.Integer r0 = r5.A04
            int r0 = r0.intValue()
            r11 = 2
            if (r0 == r3) goto L94
            if (r0 == r1) goto Lbd
            if (r0 != r4) goto Lc3
            r11 = 0
        L94:
            java.lang.String r12 = r5.A06
            X.Mqs r0 = r5.A02
            if (r0 == 0) goto Lbb
            com.facebook.rsys.mediasync.gen.Video r14 = r6.A05(r0)
        L9e:
            X.MYx r0 = r5.A00
            if (r0 == 0) goto La6
            java.lang.String r1 = r0.A00
            if (r1 != 0) goto La9
        La6:
            r1 = r2
            if (r0 == 0) goto Lae
        La9:
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto Lae
            r2 = r0
        Lae:
            com.facebook.rsys.mediasync.gen.AudioAttribution r0 = new com.facebook.rsys.mediasync.gen.AudioAttribution
            r0.<init>(r1, r2)
            com.facebook.rsys.mediasync.gen.InstagramContent r7 = new com.facebook.rsys.mediasync.gen.InstagramContent
            r16 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r7
        Lbb:
            r14 = 0
            goto L9e
        Lbd:
            r11 = 1
            goto L94
        Lbf:
            r10 = 2
            goto L86
        Lc1:
            r10 = 1
            goto L86
        Lc3:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55221Oek.A03(X.MuY):com.facebook.rsys.mediasync.gen.InstagramContent");
    }

    public final C51630MrN A0B(MediaSyncState mediaSyncState) {
        Integer A09 = A09(mediaSyncState);
        String str = mediaSyncState.contentId;
        C14360o3.A06(str);
        return new C51630MrN(new C51763MuT(A08(mediaSyncState), str), A09, mediaSyncState.actionMetadata.carouselItemIndex, AbstractC167007dF.A0d(), mediaSyncState.tabSource, mediaSyncState.adminMessage, mediaSyncState.actorId, null, true);
    }
}
