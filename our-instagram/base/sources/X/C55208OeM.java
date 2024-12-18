package X;

import android.content.Context;
import android.view.TextureView;
import com.facebook.common.dextricks.Constants;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.OeM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55208OeM {
    public static final String[] A0R = {"post_cap", "post_cap_draft", "post_cap_stories", "reel_memory_share_stories", "mention_reshare_stories", "shoutout_share_stories", "igtv_share_stories", "reels_reshare_stories", "photo_credit_stories"};
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public InterfaceC58201Pr7 A04;
    public C69464Vnn A05;
    public InterfaceC58028PoE A06;
    public C219919nd A07;
    public boolean A08;
    public boolean A09;
    public MediaComposition A0A;
    public final Context A0B;
    public final XC1 A0C;
    public final XC9 A0D;
    public final C58647PzK A0E;
    public final X9S A0F;
    public final C68920VeK A0G;
    public final C8NS A0H;
    public final XD9 A0I;
    public final ACM A0J;
    public final W5s A0K;
    public final Boolean A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final Map A0P;
    public final InterfaceC09390do A0Q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.facebook.videolite.transcoder.base.composition.MediaEffect, java.lang.Object, X.AbJ] */
    public final void A08(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (Float.compare(f, this.A01) != 0) {
            this.A01 = f;
            if (this.A0K.A0k) {
                InterfaceC58201Pr7 interfaceC58201Pr7 = this.A04;
                if (interfaceC58201Pr7 != 0) {
                    EnumC1125356h enumC1125356h = EnumC1125356h.AUDIO;
                    ?? obj = new Object();
                    obj.A00 = f;
                    if (interfaceC58201Pr7.FAr(enumC1125356h, obj, "global_volume")) {
                        return;
                    }
                } else {
                    return;
                }
            }
            A04(this, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A(com.facebook.videolite.transcoder.base.composition.MediaComposition r30, int r31, int r32, int r33, int r34, int r35, boolean r36) {
        /*
            r29 = this;
            r1 = 0
            r5 = r30
            X.C14360o3.A0B(r5, r1)
            r2 = r29
            r0 = r36
            r2.A09 = r0
            java.util.HashSet r14 = X.AbstractC166987dD.A1H()
            X.W5s r4 = r2.A0K
            boolean r0 = r4.A1D
            if (r0 == 0) goto L28
            boolean r0 = r4.A0G
            if (r0 == 0) goto L28
            X.56h r3 = X.EnumC1125356h.AUDIO
            java.lang.String r0 = "video_audio_0"
            int r3 = r5.A02(r3, r0)
            r0 = -1
            if (r3 == r0) goto L28
            X.AbstractC166997dE.A1W(r14, r3)
        L28:
            r8 = 0
            r0 = 1
            com.facebook.videolite.transcoder.base.composition.MediaComposition r10 = r2.A01(r5, r8)
            X.U7W r13 = r4.A0B
            java.lang.Boolean r3 = r2.A0L
            boolean r20 = X.AbstractC166997dE.A1Z(r3, r0)
            r11 = 0
            boolean r3 = r4.A0g     // Catch: java.lang.Throwable -> L80
            if (r3 == 0) goto L86
            java.lang.String r6 = r2.A0M     // Catch: java.lang.Throwable -> L80
            if (r6 == 0) goto L86
            java.lang.String[] r7 = X.C55208OeM.A0R     // Catch: java.lang.Throwable -> L80
            java.util.Map r5 = r2.A0P     // Catch: java.lang.Throwable -> L80
            if (r5 == 0) goto L7e
            java.lang.String r3 = "source_type"
            java.lang.String r3 = X.AbstractC166987dD.A1A(r3, r5)     // Catch: java.lang.Throwable -> L80
        L4b:
            boolean r3 = X.AbstractC009903n.A0O(r3, r7)     // Catch: java.lang.Throwable -> L80
            if (r3 == 0) goto L86
            java.lang.String r5 = "ig4a_media_accuracy_dyn_sampling"
            boolean r3 = r4.A0h     // Catch: java.lang.Throwable -> L80
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L80
            java.util.Map r27 = X.AbstractC167007dF.A0n(r5, r3)     // Catch: java.lang.Throwable -> L80
            android.content.Context r3 = r2.A0B     // Catch: java.lang.Throwable -> L80
            java.io.File r24 = r3.getCacheDir()     // Catch: java.lang.Throwable -> L80
            X.C14360o3.A07(r24)     // Catch: java.lang.Throwable -> L80
            java.lang.String r7 = r4.A0D     // Catch: java.lang.Throwable -> L80
            X.8NS r5 = r2.A0H     // Catch: java.lang.Throwable -> L80
            boolean r4 = r4.A0f     // Catch: java.lang.Throwable -> L80
            X.OR5 r23 = X.OR5.A00     // Catch: java.lang.Throwable -> L80
            X.OJQ r3 = new X.OJQ     // Catch: java.lang.Throwable -> L80
            r21 = r3
            r22 = r5
            r25 = r7
            r26 = r6
            r28 = r4
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)     // Catch: java.lang.Throwable -> L80
            goto L87
        L7e:
            r3 = r11
            goto L4b
        L80:
            r3 = move-exception
            X.0e5 r3 = X.MSW.A1D(r3)
            goto L87
        L86:
            r3 = r11
        L87:
            boolean r4 = r3 instanceof X.C09540e5
            if (r4 != 0) goto L8c
            r11 = r3
        L8c:
            X.OJQ r11 = (X.OJQ) r11
            X.VeK r7 = r2.A0G
            r15 = 3000000(0x2dc6c0, float:4.203895E-39)
            r16 = 5
            X.Vnn r6 = new X.Vnn
            r19 = r31
            r18 = r32
            r9 = r8
            r12 = r8
            r21 = r0
            r17 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r2.A05 = r6
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = r6.A09
            r2.A0A = r0
            r0 = r33
            r2.A03 = r0
            r0 = r34
            r2.A02 = r0
            r0 = r35
            A03(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55208OeM.A0A(com.facebook.videolite.transcoder.base.composition.MediaComposition, int, int, int, int, int, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C55208OeM(Context context, XC1 xc1, XC9 xc9, C58647PzK c58647PzK, X9S x9s, C68920VeK c68920VeK, C8NS c8ns, XD9 xd9, W5s w5s, AbstractC53442NkV abstractC53442NkV, String str, String str2, String str3, Map map, int i) {
        C17050sx c17050sx;
        ACM c52042N0q;
        C68920VeK c68920VeK2 = c68920VeK;
        String str4 = str;
        XC9 xc92 = xc9;
        String str5 = str3;
        W5s w5s2 = w5s;
        Map map2 = map;
        C8NS c8ns2 = c8ns;
        String str6 = str2;
        X9S x9s2 = x9s;
        C58647PzK c58647PzK2 = c58647PzK;
        XC1 xc12 = (i & 8) != 0 ? null : xc1;
        c68920VeK2 = (i & 16) != 0 ? null : c68920VeK2;
        str4 = (i & 32) != 0 ? AbstractC166997dE.A0n() : str4;
        xc92 = (i & 64) != 0 ? new Object() : xc92;
        w5s2 = (i & 256) != 0 ? new W5s("", "0", 5, 5000, -1, -1, -1, -1, -1L, 0L, 0L, 10L, false, false, false, false, false, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false) : w5s2;
        if ((i & 512) != 0) {
            c17050sx = AbstractC09440dt.A01(new J7Q(context, 39));
        } else {
            c17050sx = null;
        }
        Boolean A0a = (i & 1024) != 0 ? AbstractC166997dE.A0a() : null;
        map2 = (i & C3OO.FLAG_MOVED) != 0 ? null : map2;
        x9s2 = (i & 4096) != 0 ? null : x9s2;
        c8ns2 = (i & 8192) != 0 ? null : c8ns2;
        str6 = (i & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0 ? null : str6;
        str5 = (32768 & i) != 0 ? null : str5;
        c58647PzK2 = (i & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0 ? new Object() : c58647PzK2;
        AbstractC25229BEm.A1J(str4, 6, c17050sx);
        this.A0B = context;
        this.A0I = xd9;
        this.A0C = xc12;
        this.A0G = c68920VeK2;
        this.A0O = str4;
        this.A0D = xc92;
        this.A0K = w5s2;
        this.A0Q = c17050sx;
        this.A0L = A0a;
        this.A0P = map2;
        this.A0F = x9s2;
        this.A0H = c8ns2;
        this.A0N = str6;
        this.A0M = str5;
        this.A0E = c58647PzK2;
        if (abstractC53442NkV instanceof C52250NAo) {
            AQ2 aq2 = new AQ2(this, 2);
            C52250NAo c52250NAo = (C52250NAo) abstractC53442NkV;
            TextureView textureView = c52250NAo.A00;
            textureView.setSurfaceTextureListener(aq2);
            c52042N0q = new C52041N0p(textureView, c52250NAo.A02, c52250NAo.A01);
        } else if (abstractC53442NkV instanceof C52249NAn) {
            c52042N0q = new C52043N0r(((C52249NAn) abstractC53442NkV).A00);
        } else if (abstractC53442NkV instanceof C52248NAm) {
            c52042N0q = new C52042N0q(((C52248NAm) abstractC53442NkV).A00);
        } else {
            throw B4Z.A00();
        }
        this.A0J = c52042N0q;
        this.A03 = -1;
        this.A02 = -1;
        this.A09 = true;
        this.A01 = 1.0f;
        this.A00 = -1.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (X.C14360o3.A0K(r4.A01(), "") != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.X9T A00() {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55208OeM.A00():X.X9T");
    }

    private final Map A02() {
        int i;
        int A02;
        C69464Vnn c69464Vnn = this.A05;
        if (c69464Vnn != null) {
            MediaComposition mediaComposition = c69464Vnn.A09;
            HashSet A1H = AbstractC166987dD.A1H();
            W5s w5s = this.A0K;
            if (w5s.A1D && w5s.A0G && (A02 = mediaComposition.A02(EnumC1125356h.AUDIO, "video_audio_0")) != -1) {
                AbstractC166997dE.A1W(A1H, A02);
            }
            Number number = (Number) AbstractC001800i.A0A(A1H);
            if (number != null) {
                C1125956n A04 = mediaComposition.A04(EnumC1125356h.AUDIO, number.intValue());
                if (A04 != null) {
                    long A01 = AbstractC66047Tyk.A01(new C55772Opg(this.A0B, VYI.A00), A04);
                    if (Long.valueOf(A01) != null) {
                        Map map = this.A0P;
                        if (map != null) {
                            i = map.size();
                        } else {
                            i = 0;
                        }
                        C06860Yd c06860Yd = new C06860Yd(i + 1);
                        c06860Yd.put("video_duration", String.valueOf(TimeUnit.MICROSECONDS.toMillis(A01)));
                        if (map != null) {
                            c06860Yd.putAll(map);
                        }
                        return AbstractC16850sd.A0N(c06860Yd);
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.Object, X.XDf] */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.lang.Object, X.XDf] */
    public static final void A03(C55208OeM c55208OeM, int i) {
        C69464Vnn c69464Vnn;
        Object obj;
        InterfaceC58201Pr7 wzf;
        Object obj2;
        ACM acm = c55208OeM.A0J;
        if (acm.A01() && (c69464Vnn = c55208OeM.A05) != null) {
            MediaComposition A01 = c55208OeM.A01(c69464Vnn.A09, null);
            InterfaceC58201Pr7 interfaceC58201Pr7 = c55208OeM.A04;
            if (interfaceC58201Pr7 != null) {
                interfaceC58201Pr7.ET1(null);
                interfaceC58201Pr7.Ee0(c55208OeM.A09);
                if (i >= 0) {
                    interfaceC58201Pr7.FBN(A01, TimeUnit.MILLISECONDS.toNanos(i));
                } else {
                    interfaceC58201Pr7.FBM(A01);
                }
                int i2 = c55208OeM.A03;
                if (i2 != -1 || c55208OeM.A02 != -1) {
                    interfaceC58201Pr7.Eaw(new C1125456i(TimeUnit.MILLISECONDS, i2, c55208OeM.A02));
                }
                c55208OeM.A06();
                return;
            }
            W5s w5s = c55208OeM.A0K;
            if (w5s.A0x) {
                Context context = c55208OeM.A0B;
                String str = c55208OeM.A0O;
                C55772Opg c55772Opg = new C55772Opg(context, VYI.A00);
                WZ2 wz2 = new WZ2();
                if (w5s.A0Z) {
                    obj2 = new WZ4(context, w5s.A0B);
                } else {
                    obj2 = new Object();
                }
                InterfaceC58105PpU interfaceC58105PpU = (InterfaceC58105PpU) obj2;
                WZY wzy = new WZY(new U7T(), c55208OeM.A0I);
                C69464Vnn c69464Vnn2 = c55208OeM.A05;
                if (c69464Vnn2 != null) {
                    C58647PzK c58647PzK = c55208OeM.A0E;
                    File file = (File) c55208OeM.A0Q.getValue();
                    wzf = new WZG(context, c55208OeM.A0C, c55208OeM.A0D, c58647PzK, c55208OeM.A0F, c55208OeM.A00(), c55772Opg, wz2, interfaceC58105PpU, new Object(), acm, c69464Vnn2, wzy, file, str, c55208OeM.A0N, c55208OeM.A0P, w5s.A09, w5s.A08);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                Context context2 = c55208OeM.A0B;
                String str2 = c55208OeM.A0O;
                C55772Opg c55772Opg2 = new C55772Opg(context2, VYI.A00);
                WZ2 wz22 = new WZ2();
                if (w5s.A0Z) {
                    obj = new WZ4(context2, w5s.A0B);
                } else {
                    obj = new Object();
                }
                InterfaceC58105PpU interfaceC58105PpU2 = (InterfaceC58105PpU) obj;
                WZY wzy2 = new WZY(new U7T(), c55208OeM.A0I);
                C69464Vnn c69464Vnn3 = c55208OeM.A05;
                if (c69464Vnn3 != null) {
                    C58647PzK c58647PzK2 = c55208OeM.A0E;
                    File file2 = (File) c55208OeM.A0Q.getValue();
                    wzf = new WZF(context2, c55208OeM.A0C, c55208OeM.A0D, c58647PzK2, c55208OeM.A0F, c55208OeM.A00(), c55772Opg2, wz22, interfaceC58105PpU2, new Object(), acm, c69464Vnn3, wzy2, file2, str2, c55208OeM.A0N, c55208OeM.A0P);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            InterfaceC58201Pr7 interfaceC58201Pr72 = wzf;
            interfaceC58201Pr72.APT();
            interfaceC58201Pr72.ET1(null);
            interfaceC58201Pr72.Ee0(c55208OeM.A09);
            interfaceC58201Pr72.Eb3(new C55783Ops(c55208OeM));
            interfaceC58201Pr72.Eb0(new C54386O1s(c55208OeM), 50L);
            interfaceC58201Pr72.Eay(new C23520Aba(interfaceC58201Pr72, c55208OeM));
            if (i >= 0) {
                interfaceC58201Pr72.E5Z(TimeUnit.MILLISECONDS.toNanos(i));
            } else {
                interfaceC58201Pr72.E5P();
            }
            interfaceC58201Pr72.Eaw(new C1125456i(TimeUnit.MILLISECONDS, c55208OeM.A03, c55208OeM.A02));
            c55208OeM.A04 = interfaceC58201Pr72;
            c55208OeM.A0A = A01;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.facebook.videolite.transcoder.base.composition.MediaEffect, java.lang.Object, X.AbJ] */
    public static final void A04(C55208OeM c55208OeM, List list) {
        InterfaceC58201Pr7 interfaceC58201Pr7 = c55208OeM.A04;
        MediaComposition mediaComposition = c55208OeM.A0A;
        if (c55208OeM.A0K.A12) {
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C09530e4 A17 = AbstractC43592JPx.A17(it);
                    if (interfaceC58201Pr7 != 0) {
                        EnumC1125356h enumC1125356h = EnumC1125356h.AUDIO;
                        float A09 = AbstractC166987dD.A09(A17.A01);
                        ?? obj = new Object();
                        obj.A00 = A09;
                        interfaceC58201Pr7.FAr(enumC1125356h, obj, (String) A17.A00);
                    }
                }
                return;
            }
            return;
        }
        if (interfaceC58201Pr7 != 0 && mediaComposition != null) {
            MediaComposition A01 = c55208OeM.A01(mediaComposition, list);
            if (VN0.A00(mediaComposition, A01)) {
                EnumC1125356h enumC1125356h2 = EnumC1125356h.AUDIO;
                if (!(!mediaComposition.A06(enumC1125356h2).equals(A01.A06(enumC1125356h2)))) {
                    return;
                }
            }
            interfaceC58201Pr7.FBM(A01);
            c55208OeM.A0A = A01;
        }
    }

    public final void A05() {
        InterfaceC58201Pr7 interfaceC58201Pr7 = this.A04;
        if (interfaceC58201Pr7 != null) {
            interfaceC58201Pr7.pause();
            InterfaceC58028PoE interfaceC58028PoE = this.A06;
            if (interfaceC58028PoE != null) {
                interfaceC58028PoE.DZC(null, EnumC222789sJ.PAUSED);
            }
        }
    }

    public final void A06() {
        boolean z;
        if (!this.A0J.A01()) {
            z = true;
        } else {
            InterfaceC58201Pr7 interfaceC58201Pr7 = this.A04;
            if (interfaceC58201Pr7 == null) {
                return;
            }
            interfaceC58201Pr7.E4S();
            InterfaceC58028PoE interfaceC58028PoE = this.A06;
            if (interfaceC58028PoE != null) {
                interfaceC58028PoE.DZC(null, EnumC222789sJ.PLAYING);
            }
            z = false;
        }
        this.A08 = z;
    }

    public final void A07() {
        InterfaceC58201Pr7 interfaceC58201Pr7 = this.A04;
        if (interfaceC58201Pr7 != null) {
            interfaceC58201Pr7.release();
        }
        this.A04 = null;
    }

    public final void A09(int i) {
        InterfaceC58201Pr7 interfaceC58201Pr7 = this.A04;
        if (interfaceC58201Pr7 != null) {
            interfaceC58201Pr7.EMh(TimeUnit.MILLISECONDS.toNanos(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.facebook.videolite.transcoder.base.composition.MediaEffect, java.lang.Object, X.8bb] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.facebook.videolite.transcoder.base.composition.MediaEffect, java.lang.Object, X.AbJ] */
    private final MediaComposition A01(MediaComposition mediaComposition, List list) {
        boolean A0a;
        C1126256q A03 = mediaComposition.A03();
        EnumC1125356h enumC1125356h = EnumC1125356h.AUDIO;
        List A18 = MSW.A18(enumC1125356h, mediaComposition.A00);
        if (A18 != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : A18) {
                if (((C69688VtY) obj).A01 instanceof C23503AbJ) {
                    A1E.add(obj);
                }
            }
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                List A182 = MSW.A18(enumC1125356h, A03.A00);
                if (A182 != null) {
                    A182.remove(next);
                }
                C0K8.A0D("VirtualVideoPlayerWrapper", "A global volume effect was already applied");
            }
        }
        W5s w5s = this.A0K;
        boolean z = w5s.A0k;
        float f = this.A01;
        ?? obj2 = new Object();
        obj2.A00 = f;
        if (z) {
            A03.A02(new C1125456i(TimeUnit.MILLISECONDS, -1L, -1L), enumC1125356h, obj2, "global_volume");
        } else {
            A03.A03(enumC1125356h, obj2);
        }
        if (list != null) {
            Map map = (Map) A03.A02.get(enumC1125356h);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C09530e4 A17 = AbstractC43592JPx.A17(it2);
                String str = (String) A17.A00;
                if (str.length() != 0) {
                    LinkedHashSet A0l = AbstractC31171DnF.A0l();
                    if (map != null) {
                        Iterator A15 = AbstractC166997dE.A15(map);
                        while (A15.hasNext()) {
                            Map.Entry A1K = AbstractC166987dD.A1K(A15);
                            boolean A0h = AbstractC002300n.A0h(str, "video_audio_", false);
                            String str2 = ((C1125956n) A1K.getValue()).A02;
                            if (A0h) {
                                C14360o3.A07(str2);
                                if (AbstractC002300n.A0h(str2, "video_audio_", false)) {
                                    String str3 = ((C1125956n) A1K.getValue()).A02;
                                    C14360o3.A07(str3);
                                    if (AbstractC001900j.A0K(str3, str, str3).length() != 0) {
                                        String str4 = ((C1125956n) A1K.getValue()).A02;
                                        C14360o3.A07(str4);
                                        A0a = AbstractC001900j.A0W(AbstractC001900j.A0K(str4, str, str4), '_');
                                    } else {
                                        Object key = A1K.getKey();
                                        C14360o3.A07(key);
                                        A0l.add(key);
                                    }
                                }
                            } else {
                                C14360o3.A07(str2);
                                A0a = AbstractC001900j.A0a(str2, str, false);
                            }
                            if (A0a) {
                                Object key2 = A1K.getKey();
                                C14360o3.A07(key2);
                                A0l.add(key2);
                            }
                        }
                    }
                    Iterator it3 = A0l.iterator();
                    while (it3.hasNext()) {
                        int A0B = AbstractC167007dF.A0B(it3);
                        if (map != null) {
                            Integer valueOf = Integer.valueOf(A0B);
                            C1125956n c1125956n = (C1125956n) map.get(valueOf);
                            if (c1125956n != null) {
                                C1125856m A00 = c1125956n.A00();
                                List<C69688VtY> list2 = A00.A05;
                                for (C69688VtY c69688VtY : list2) {
                                    if (c69688VtY.A01 instanceof C23503AbJ) {
                                        list2.remove(c69688VtY);
                                        AbstractC50522MSa.A1J(c69688VtY.A00, A00, AbstractC166987dD.A09(A17.A01));
                                        map.put(valueOf, new C1125956n(A00));
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            continue;
                        }
                    }
                }
            }
        }
        if (w5s.A1D && this.A00 != -1.0f) {
            C1125456i c1125456i = new C1125456i(TimeUnit.MILLISECONDS, -1L, -1L);
            float f2 = this.A00;
            ?? obj3 = new Object();
            obj3.A00 = f2;
            C69688VtY c69688VtY2 = new C69688VtY(c1125456i, obj3);
            AbstractMap abstractMap = (AbstractMap) A03.A02.get(enumC1125356h);
            if (abstractMap != null) {
                Iterator A14 = AbstractC166997dE.A14(abstractMap);
                while (A14.hasNext()) {
                    Map.Entry A1K2 = AbstractC166987dD.A1K(A14);
                    C1125956n c1125956n2 = (C1125956n) A1K2.getValue();
                    C14360o3.A0B(c1125956n2, 0);
                    String str5 = c1125956n2.A02;
                    C14360o3.A07(str5);
                    if (AbstractC001900j.A0a(str5, "video_audio_", false)) {
                        Object key3 = A1K2.getKey();
                        C1125956n c1125956n3 = (C1125956n) A1K2.getValue();
                        C1125856m A002 = c1125956n3.A00();
                        for (C69688VtY c69688VtY3 : c1125956n3.A05) {
                            if (c69688VtY3.A01.getClass().equals(c69688VtY2.A01.getClass())) {
                                A002.A05.remove(c69688VtY3);
                                A002.A03(c69688VtY2, null);
                            }
                        }
                        abstractMap.put(key3, new C1125956n(A002));
                    }
                }
            }
        }
        return new MediaComposition(A03);
    }
}
