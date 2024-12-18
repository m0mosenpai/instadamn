package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.provider.Settings;
import android.util.Pair;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.direct.burner.BurnerSendThreadDetailsFragment;
import com.instagram.direct.armadilloexpress.encryptedbackup.fakereverb.ArmadilloExpressEncryptedBackupDatabase;
import com.instagram.direct.prompts.DirectEditAddYoursParams;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger;
import com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.1Zo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28531Zo {
    public static C28531Zo A04;
    public final Context A00;
    public final C28511Zm A01;
    public final C28501Zl A02;
    public final List A03;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.1Zp] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, X.1nj] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.1nk] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.1nn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.1nq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.1nT] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.1nU] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.1nX, java.lang.Object] */
    public C28531Zo(Context context, C28511Zm c28511Zm, C28501Zl c28501Zl, List list) {
        C14360o3.A0B(context, 1);
        this.A00 = context;
        this.A02 = c28501Zl;
        this.A01 = c28511Zm;
        this.A03 = list;
        C28541Zp.A00 = new Object();
        C28551Zq.A00(context).A01(Settings.System.DEFAULT_NOTIFICATION_URI);
        C36701nT.A00 = new Object();
        C36711nU.A00 = new Object();
        C36721nV.A01 = new C36721nV();
        C36741nX.A00 = new Object();
        C0KV c0kv = new C0KV() { // from class: X.1nY
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
                int A03 = C0f9.A03(305421826);
                int A032 = C0f9.A03(-2093082701);
                C14360o3.A0B(userSession, 0);
                final C2DS A00 = AbstractC28761aE.A00(userSession);
                final List list2 = C28531Zo.this.A03;
                InterfaceC452826l interfaceC452826l = new InterfaceC452826l(userSession, A00, list2) { // from class: X.5bs
                    public final UserSession A00;
                    public final C2DS A01;
                    public final List A02;

                    private void A01(DirectThreadKey directThreadKey, String str, boolean z, boolean z2) {
                        C81663kb A033;
                        DirectShareTarget directShareTarget = null;
                        if (directThreadKey != null && (A033 = C2DU.A03((C2DU) this.A01, directThreadKey)) != null) {
                            ArrayList A01 = C4GO.A01(A033.BSH());
                            directShareTarget = new DirectShareTarget(AbstractC31232DoF.A00(A033.C7I(), A01), A033.C7l(), A01, A033.CRD());
                        }
                        Iterator it = this.A02.iterator();
                        while (it.hasNext()) {
                            ((C28521Zn) it.next()).A00(this.A00, directShareTarget, str, z, z2);
                        }
                    }

                    @Override // X.InterfaceC452826l
                    public final void D1t(C1OW c1ow) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DB8(C1OW c1ow, String str, boolean z) {
                    }

                    @Override // X.InterfaceC452826l
                    public final /* synthetic */ void DB9(C1OW c1ow, boolean z) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DCa(C1OW c1ow) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DUo(C19260xA c19260xA, C1OW c1ow, boolean z) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DUp(C19260xA c19260xA, C1OW c1ow, C114675Fx c114675Fx, boolean z) {
                    }

                    @Override // X.InterfaceC452826l
                    public final /* synthetic */ void Da4(String str, String str2, String str3) {
                    }

                    @Override // X.InterfaceC452826l
                    public final /* synthetic */ void Da8(C1OW c1ow, String str, String str2) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DhF(C1OW c1ow, String str, boolean z) {
                    }

                    {
                        this.A01 = A00;
                        this.A02 = list2;
                        this.A00 = userSession;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
                    
                        if (r6.A08 != null) goto L11;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    private void A00(X.C1OW r6) {
                        /*
                            r5 = this;
                            java.lang.String r1 = r6.A02()
                            int r0 = r1.hashCode()
                            r3 = 0
                            switch(r0) {
                                case -1607135103: goto L67;
                                case 296381094: goto L53;
                                case 413267943: goto L39;
                                case 1870272601: goto Ld;
                                default: goto Lc;
                            }
                        Lc:
                            return
                        Ld:
                            java.lang.String r0 = "send_reel_share_message"
                            boolean r0 = r1.equals(r0)
                            if (r0 == 0) goto Lc
                            X.1bn r6 = (X.C29721bn) r6
                            java.util.List r0 = r6.C7R()
                            java.lang.Object r4 = r0.get(r3)
                            com.instagram.model.direct.DirectThreadKey r4 = (com.instagram.model.direct.DirectThreadKey) r4
                            java.lang.String r3 = r6.A0C
                            java.lang.String r0 = r6.A0H
                            if (r0 != 0) goto L2c
                            java.lang.String r0 = r6.A08
                            r2 = 0
                            if (r0 == 0) goto L2d
                        L2c:
                            r2 = 1
                        L2d:
                            java.lang.Boolean r1 = java.lang.Boolean.TRUE
                            java.lang.Boolean r0 = r6.A02
                            boolean r0 = r1.equals(r0)
                            r5.A01(r4, r3, r2, r0)
                            return
                        L39:
                            java.lang.String r0 = "send_live_video_share_message"
                            boolean r0 = r1.equals(r0)
                            if (r0 == 0) goto Lc
                            X.1c8 r6 = (X.C29931c8) r6
                            java.util.List r0 = r6.C7R()
                            java.lang.Object r1 = r0.get(r3)
                            com.instagram.model.direct.DirectThreadKey r1 = (com.instagram.model.direct.DirectThreadKey) r1
                            java.lang.String r0 = r6.A02
                            r5.A01(r1, r0, r3, r3)
                            return
                        L53:
                            java.lang.String r0 = "send_story_share_message"
                            boolean r0 = r1.equals(r0)
                            if (r0 == 0) goto Lc
                            X.1cC r6 = (X.C29971cC) r6
                            boolean r0 = r6.A05
                            if (r0 == 0) goto Lc
                            r1 = 0
                            r0 = 1
                            r5.A01(r1, r1, r3, r0)
                            return
                        L67:
                            java.lang.String r0 = "configure_visual_message"
                            boolean r0 = r1.equals(r0)
                            if (r0 == 0) goto Lc
                            boolean r0 = r6 instanceof X.C31311ea
                            if (r0 == 0) goto Lc
                            X.1ea r6 = (X.C31311ea) r6
                            java.lang.String r1 = r6.A03
                            java.lang.String r0 = "story_remix_reply"
                            boolean r0 = r0.equals(r1)
                            if (r0 != 0) goto L87
                            java.lang.String r0 = "story_selfie_reply"
                            boolean r0 = r0.equals(r1)
                            if (r0 == 0) goto Lc
                        L87:
                            java.util.List r0 = r6.C7R()
                            int r0 = r0.size()
                            if (r0 <= 0) goto Lc
                            java.util.List r0 = r6.C7R()
                            java.lang.Object r2 = r0.get(r3)
                            com.instagram.model.direct.DirectThreadKey r2 = (com.instagram.model.direct.DirectThreadKey) r2
                            r1 = 1
                            java.lang.String r0 = "reel"
                            r5.A01(r2, r0, r1, r3)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C119945bs.A00(X.1OW):void");
                    }

                    @Override // X.InterfaceC452826l
                    public final void D6x(C1OW c1ow) {
                        A00(c1ow);
                    }

                    @Override // X.InterfaceC452826l
                    public final void DUt(C19260xA c19260xA, C1OW c1ow) {
                        A00(c1ow);
                    }
                };
                C0f9.A0A(-1529592783, A032);
                C0f9.A0A(1850424194, A03);
                return interfaceC452826l;
            }
        };
        List list2 = C26141Ov.A0T;
        list2.add(c0kv);
        list2.add(new C0KV() { // from class: X.1nZ
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
                int A03 = C0f9.A03(-1053260767);
                int A032 = C0f9.A03(-135867667);
                C14360o3.A0B(userSession, 0);
                InterfaceC452826l interfaceC452826l = new InterfaceC452826l(userSession) { // from class: X.5bt
                    public final UserSession A00;

                    @Override // X.InterfaceC452826l
                    public final void D1t(C1OW c1ow) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void D6x(C1OW c1ow) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DB8(C1OW c1ow, String str, boolean z) {
                    }

                    @Override // X.InterfaceC452826l
                    public final /* synthetic */ void DB9(C1OW c1ow, boolean z) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DCa(C1OW c1ow) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DUo(C19260xA c19260xA, C1OW c1ow, boolean z) {
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.1vN] */
                    @Override // X.InterfaceC452826l
                    public final void DUp(C19260xA c19260xA, C1OW c1ow, C114675Fx c114675Fx, boolean z) {
                        C14360o3.A0B(c1ow, 0);
                        if (c1ow instanceof C35451lR) {
                            AbstractC25651Mw.A00(this.A00).E4s(new Object());
                        }
                    }

                    @Override // X.InterfaceC452826l
                    public final void DUt(C19260xA c19260xA, C1OW c1ow) {
                    }

                    @Override // X.InterfaceC452826l
                    public final /* synthetic */ void Da4(String str, String str2, String str3) {
                    }

                    @Override // X.InterfaceC452826l
                    public final /* synthetic */ void Da8(C1OW c1ow, String str, String str2) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DhF(C1OW c1ow, String str, boolean z) {
                    }

                    {
                        this.A00 = userSession;
                    }
                };
                C0f9.A0A(-654923225, A032);
                C0f9.A0A(-1142151406, A03);
                return interfaceC452826l;
            }
        });
        list2.add(new C0KV() { // from class: X.1na
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
                int A03 = C0f9.A03(434918725);
                int A032 = C0f9.A03(1827570682);
                C14360o3.A0B(userSession, 0);
                InterfaceC452826l interfaceC452826l = new InterfaceC452826l(userSession) { // from class: X.5bu
                    public final UserSession A00;

                    @Override // X.InterfaceC452826l
                    public final void D1t(C1OW c1ow) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void D6x(C1OW c1ow) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DB8(C1OW c1ow, String str, boolean z) {
                    }

                    @Override // X.InterfaceC452826l
                    public final /* synthetic */ void DB9(C1OW c1ow, boolean z) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DCa(C1OW c1ow) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DUo(C19260xA c19260xA, C1OW c1ow, boolean z) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DUp(C19260xA c19260xA, C1OW c1ow, C114675Fx c114675Fx, boolean z) {
                    }

                    @Override // X.InterfaceC452826l
                    public final /* synthetic */ void Da4(String str, String str2, String str3) {
                    }

                    @Override // X.InterfaceC452826l
                    public final /* synthetic */ void Da8(C1OW c1ow, String str, String str2) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DhF(C1OW c1ow, String str, boolean z) {
                    }

                    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000c. Please report as an issue. */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
                    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
                    /* JADX WARN: Removed duplicated region for block: B:41:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
                    @Override // X.InterfaceC452826l
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void DUt(X.C19260xA r6, X.C1OW r7) {
                        /*
                            r5 = this;
                            if (r7 == 0) goto Lf
                            java.lang.String r1 = r7.A02()
                            if (r1 == 0) goto Lf
                            int r0 = r1.hashCode()
                            switch(r0) {
                                case -1698180071: goto L2c;
                                case -1507386093: goto L29;
                                case 373889219: goto L13;
                                case 1174963788: goto L10;
                                default: goto Lf;
                            }
                        Lf:
                            return
                        L10:
                            java.lang.String r0 = "send_text_message"
                            goto L2e
                        L13:
                            java.lang.String r0 = "ig_me_referral"
                            boolean r0 = r1.equals(r0)
                            if (r0 == 0) goto Lf
                            X.1i7 r7 = (X.C33451i7) r7
                            com.instagram.model.direct.DirectThreadKey r0 = r7.C7Q()
                            java.util.List r0 = java.util.Collections.singletonList(r0)
                            X.C14360o3.A07(r0)
                            goto L3c
                        L29:
                            java.lang.String r0 = "configure_media_message"
                            goto L2e
                        L2c:
                            java.lang.String r0 = "send_link_message"
                        L2e:
                            boolean r0 = r1.equals(r0)
                            if (r0 == 0) goto Lf
                            X.1ae r7 = (X.AbstractC29011ae) r7
                            java.util.List r0 = r7.C7R()
                            if (r0 == 0) goto Lf
                        L3c:
                            java.util.ArrayList r4 = new java.util.ArrayList
                            r4.<init>()
                            java.util.Iterator r3 = r0.iterator()
                        L45:
                            boolean r0 = r3.hasNext()
                            if (r0 == 0) goto L63
                            java.lang.Object r2 = r3.next()
                            com.instagram.model.direct.DirectThreadKey r2 = (com.instagram.model.direct.DirectThreadKey) r2
                            java.lang.String r1 = r2.A00
                            if (r1 == 0) goto L5b
                            int r0 = r1.length()
                            if (r0 != 0) goto L5f
                        L5b:
                            java.lang.String r1 = r2.A01
                            if (r1 == 0) goto L45
                        L5f:
                            r4.add(r1)
                            goto L45
                        L63:
                            java.util.Iterator r3 = r4.iterator()
                        L67:
                            boolean r0 = r3.hasNext()
                            if (r0 == 0) goto Lf
                            java.lang.Object r2 = r3.next()
                            com.instagram.common.session.UserSession r0 = r5.A00
                            X.7NF r1 = X.C7ND.A00(r0)
                            java.lang.String r0 = r1.A04
                            boolean r0 = X.C14360o3.A0K(r0, r2)
                            if (r0 == 0) goto L67
                            java.lang.String r0 = ""
                            r1.A03 = r0
                            r1.A02 = r0
                            r1.A04 = r0
                            r0 = 0
                            r1.A06 = r0
                            goto L67
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C119965bu.DUt(X.0xA, X.1OW):void");
                    }

                    {
                        this.A00 = userSession;
                    }
                };
                C0f9.A0A(-1162766152, A032);
                C0f9.A0A(-1424680120, A03);
                return interfaceC452826l;
            }
        });
        list2.add(new C0KV() { // from class: X.1nb
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(-94129028);
                int A032 = C0f9.A03(-964318707);
                C14360o3.A0B(userSession, 0);
                final C25671My A00 = AbstractC25651Mw.A00(userSession);
                InterfaceC452826l interfaceC452826l = new InterfaceC452826l(A00) { // from class: X.5bv
                    public final C25671My A00;

                    {
                        C14360o3.A0B(A00, 1);
                        this.A00 = A00;
                    }

                    @Override // X.InterfaceC452826l
                    public final void D1t(C1OW c1ow) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void D6x(C1OW c1ow) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DB8(C1OW c1ow, String str, boolean z) {
                    }

                    @Override // X.InterfaceC452826l
                    public final /* synthetic */ void DB9(C1OW c1ow, boolean z) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DCa(C1OW c1ow) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DUo(C19260xA c19260xA, C1OW c1ow, boolean z) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DUp(C19260xA c19260xA, C1OW c1ow, C114675Fx c114675Fx, boolean z) {
                    }

                    @Override // X.InterfaceC452826l
                    public final /* synthetic */ void Da4(String str, String str2, String str3) {
                    }

                    @Override // X.InterfaceC452826l
                    public final /* synthetic */ void Da8(C1OW c1ow, String str, String str2) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DhF(C1OW c1ow, String str, boolean z) {
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.1vN] */
                    @Override // X.InterfaceC452826l
                    public final void DUt(C19260xA c19260xA, C1OW c1ow) {
                        String str;
                        if (c1ow != null) {
                            str = c1ow.A02();
                        } else {
                            str = null;
                        }
                        if (C14360o3.A0K(str, "configure_media_message") && "direct_video_call_send_attribution_photobooth".equals(c1ow.A02.A04)) {
                            this.A00.E4s(new Object());
                        }
                    }
                };
                C0f9.A0A(1882792724, A032);
                C0f9.A0A(1340975911, A03);
                return interfaceC452826l;
            }
        });
        list2.add(new C0KV() { // from class: X.1nc
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1478560040);
                int A032 = C0f9.A03(852879648);
                C14360o3.A0B(userSession, 0);
                C119985bw c119985bw = new C119985bw(C28531Zo.this.A00, userSession);
                C0f9.A0A(1211921130, A032);
                C0f9.A0A(-1962117945, A03);
                return c119985bw;
            }
        });
        list2.add(new C0KV() { // from class: X.1nd
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
                int A03 = C0f9.A03(-1757964449);
                int A032 = C0f9.A03(660205965);
                C14360o3.A0B(userSession, 0);
                final C2DS A00 = AbstractC28761aE.A00(userSession);
                InterfaceC452826l interfaceC452826l = new InterfaceC452826l(userSession, A00) { // from class: X.5bx
                    public final UserSession A00;
                    public final C120025c0 A01;
                    public final C120005by A02;
                    public final C2DS A03;
                    public final List A04;

                    {
                        C14360o3.A0B(A00, 2);
                        this.A00 = userSession;
                        this.A03 = A00;
                        C120005by A002 = C120005by.A00(userSession);
                        C14360o3.A07(A002);
                        this.A02 = A002;
                        this.A01 = new C120025c0(userSession);
                        this.A04 = AbstractC16960so.A1Q(1, 4, 13, 15);
                    }

                    @Override // X.InterfaceC452826l
                    public final void D1t(C1OW c1ow) {
                        C14360o3.A0B(c1ow, 0);
                        String A002 = A00(c1ow.A05);
                        if (A002 != null) {
                            C120005by.A03(A002, null, 0, 7007, 0);
                        }
                    }

                    @Override // X.InterfaceC452826l
                    public final void D6x(C1OW c1ow) {
                        C14360o3.A0B(c1ow, 0);
                        String A002 = A00(c1ow.A05);
                        if (A002 != null) {
                            C120005by.A03(A002, null, 0, 7005, 0);
                            C120005by.A03(A002, null, 0, 203, 0);
                            A02(c1ow, A002, true);
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:103:0x01ec  */
                    /* JADX WARN: Removed duplicated region for block: B:106:0x01f7  */
                    /* JADX WARN: Removed duplicated region for block: B:109:0x01fd  */
                    /* JADX WARN: Removed duplicated region for block: B:118:0x0228  */
                    /* JADX WARN: Removed duplicated region for block: B:120:0x023e  */
                    /* JADX WARN: Removed duplicated region for block: B:121:0x0241  */
                    /* JADX WARN: Removed duplicated region for block: B:122:0x0243  */
                    /* JADX WARN: Removed duplicated region for block: B:124:0x023a  */
                    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:82:0x018c  */
                    /* JADX WARN: Removed duplicated region for block: B:85:0x01b7  */
                    @Override // X.InterfaceC452826l
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void DB8(X.C1OW r19, java.lang.String r20, boolean r21) {
                        /*
                            Method dump skipped, instructions count: 628
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C119995bx.DB8(X.1OW, java.lang.String, boolean):void");
                    }

                    @Override // X.InterfaceC452826l
                    public final /* synthetic */ void DB9(C1OW c1ow, boolean z) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DCa(C1OW c1ow) {
                        C14360o3.A0B(c1ow, 0);
                        String A002 = A00(c1ow.A05);
                        if (A002 != null) {
                            C120005by.A03(A002, null, 0, 7006, 0);
                        }
                    }

                    @Override // X.InterfaceC452826l
                    public final void DUo(C19260xA c19260xA, C1OW c1ow, boolean z) {
                        C14360o3.A0B(c1ow, 0);
                        String A002 = A00(c1ow.A05);
                        if (A002 != null) {
                            C120005by.A03(A002, null, 0, 7001, 0);
                        }
                    }

                    @Override // X.InterfaceC452826l
                    public final void DUp(C19260xA c19260xA, C1OW c1ow, C114675Fx c114675Fx, boolean z) {
                        List list3;
                        C14360o3.A0B(c1ow, 0);
                        String A002 = A00(c1ow.A05);
                        if (A002 != null) {
                            if (c114675Fx != null) {
                                Long valueOf = Long.valueOf(c114675Fx.A01.A00);
                                String str = c114675Fx.A03;
                                C14360o3.A0B(str, 0);
                                list3 = AbstractC16960so.A1R(valueOf, AbstractC003100w.A0k(10, str));
                            } else {
                                list3 = null;
                            }
                            C120005by.A03(A002, list3, 0, 7003, 0);
                            if (!z) {
                                A02(c1ow, A002, false);
                            }
                        }
                    }

                    @Override // X.InterfaceC452826l
                    public final void DUt(C19260xA c19260xA, C1OW c1ow) {
                        C14360o3.A0B(c1ow, 0);
                        String A002 = A00(c1ow.A05);
                        if (A002 != null) {
                            C120005by.A03(A002, null, 0, 7002, 0);
                            C120005by.A03(A002, null, 0, 203, 0);
                            A02(c1ow, A002, true);
                        }
                    }

                    @Override // X.InterfaceC452826l
                    public final /* synthetic */ void Da4(String str, String str2, String str3) {
                    }

                    @Override // X.InterfaceC452826l
                    public final /* synthetic */ void Da8(C1OW c1ow, String str, String str2) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DhF(C1OW c1ow, String str, boolean z) {
                        C14360o3.A0B(c1ow, 0);
                        String A002 = A00(c1ow.A05);
                        if (A002 != null) {
                            C120005by.A03(A002, null, 0, 7004, 0);
                        }
                    }

                    private final String A00(String str) {
                        return (String) AbstractC224517h.A01(AbstractC224517h.A06(new C207409Ft(str, this, 4), AbstractC001800i.A0o(this.A04)));
                    }

                    private final void A02(C1OW c1ow, String str, boolean z) {
                        long j;
                        int i = z ? 84 : 85;
                        if (A03(c1ow)) {
                            UserSession userSession2 = this.A00;
                            C06090Tz c06090Tz = C06090Tz.A05;
                            if (z) {
                                j = 36604606106047586L;
                            } else {
                                j = 36604606104736863L;
                            }
                            long A01 = C18U.A01(c06090Tz, userSession2, j);
                            C14360o3.A0A(Long.valueOf(A01));
                            if (A01 > 0) {
                                C14270nr.A00().A01(new KMF(this, str, i), A01);
                                return;
                            }
                        }
                        C120005by.A03(str, null, 0, i, 0);
                    }

                    private final boolean A03(C1OW c1ow) {
                        EnumC159397Cz A01;
                        if (c1ow instanceof C34851kQ) {
                            A01 = ((C34851kQ) c1ow).A03();
                        } else if (c1ow instanceof AbstractC29011ae) {
                            A01 = AbstractC159387Cy.A01(this.A00, (AbstractC29011ae) c1ow);
                        } else {
                            return false;
                        }
                        return A01.A01();
                    }

                    private final void A01(long j, String str, List list3) {
                        if (!list3.isEmpty()) {
                            C01L A1I = C0eM.A1I();
                            A1I.add(Long.valueOf(j));
                            int size = list3.size();
                            int i = 5;
                            if (5 > size) {
                                i = size;
                            }
                            List subList = list3.subList(0, i);
                            ArrayList arrayList = new ArrayList();
                            Iterator it = subList.iterator();
                            while (it.hasNext()) {
                                Long A0k = AbstractC003100w.A0k(10, ((C1OW) it.next()).A05);
                                if (A0k != null) {
                                    arrayList.add(A0k);
                                }
                            }
                            A1I.addAll(arrayList);
                            C120005by.A03(str, C0eM.A1J(A1I), 0, 7046, 0);
                        }
                    }
                };
                C0f9.A0A(-1366543143, A032);
                C0f9.A0A(-548010844, A03);
                return interfaceC452826l;
            }
        });
        list2.add(new C0KV() { // from class: X.1ne
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
                int A03 = C0f9.A03(157531384);
                int A032 = C0f9.A03(-1349822397);
                C14360o3.A0B(userSession, 0);
                InterfaceC452826l interfaceC452826l = new InterfaceC452826l(userSession) { // from class: X.5c1
                    public final UserSession A00;
                    public final C120025c0 A01;

                    @Override // X.InterfaceC452826l
                    public final void D1t(C1OW c1ow) {
                        C14360o3.A0B(c1ow, 0);
                        IGFOAMessagingSendToSentLogger A00 = C163307Sp.A00(this.A00, c1ow.A05.hashCode());
                        if (A00 != null) {
                            A00.onLogDirectMutationCancel();
                        }
                    }

                    @Override // X.InterfaceC452826l
                    public final void D6x(C1OW c1ow) {
                        C14360o3.A0B(c1ow, 0);
                        IGFOAMessagingSendToSentLogger A00 = C163307Sp.A00(this.A00, c1ow.A05.hashCode());
                        if (A00 != null) {
                            A00.onLogDirectMutationConfirm();
                            A00.annotateEndPointReason("confirm_mutation");
                            A00.onEndFlowSucceed();
                        }
                    }

                    @Override // X.InterfaceC452826l
                    public final void DB8(C1OW c1ow, String str, boolean z) {
                        C14360o3.A0B(c1ow, 0);
                        int hashCode = c1ow.A05.hashCode();
                        UserSession userSession2 = this.A00;
                        IGFOAMessagingSendToSentLogger A00 = C163307Sp.A00(userSession2, hashCode);
                        JTb A002 = this.A01.A00(c1ow);
                        if (A00 != null) {
                            A00.onLogDirectMutationDispatch();
                            A00.annotateDirectMutationType(AbstractC46881KoO.A00(c1ow));
                            A00.annotateDirectMutationTypeStr(c1ow.A02());
                            if (A002.A02) {
                                String str2 = c1ow.A05;
                                String A003 = AbstractC46882KoP.A00(A002.A00);
                                A00.annotateFirstSend(A003);
                                PlatformLogger.platformEventStructuredLoggerAddFirtSendAnnotationWithAliasId(str2, A003);
                            }
                        }
                        IGFOAMessagingLocalSendSpeedLogger A004 = C7R5.A00(userSession2, Integer.valueOf(c1ow.A05.hashCode()));
                        if (A004 != null && A002.A02) {
                            A004.annotateFirstSendType(AbstractC46882KoP.A00(A002.A00));
                        }
                    }

                    @Override // X.InterfaceC452826l
                    public final void DB9(C1OW c1ow, boolean z) {
                        C14360o3.A0B(c1ow, 0);
                        if (z && (c1ow instanceof AbstractC29011ae) && C14360o3.A0K(c1ow.A02(), "send_text_message")) {
                            Integer num = C05F.A00;
                            UserSession userSession2 = this.A00;
                            AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
                            C46105Kb5 A01 = C163307Sp.A01(userSession2, num, abstractC29011ae.A06().hashCode(), AbstractC159387Cy.A01(userSession2, abstractC29011ae).A01(), true);
                            if (A01 != null) {
                                A01.onStartFlow();
                                A01.annotateDispatchedFromDisk();
                            }
                        }
                    }

                    @Override // X.InterfaceC452826l
                    public final void DCa(C1OW c1ow) {
                        C14360o3.A0B(c1ow, 0);
                        IGFOAMessagingSendToSentLogger A00 = C163307Sp.A00(this.A00, c1ow.A05.hashCode());
                        if (A00 != null) {
                            A00.onLogDirectMutationDrop();
                        }
                    }

                    @Override // X.InterfaceC452826l
                    public final void DUo(C19260xA c19260xA, C1OW c1ow, boolean z) {
                        C14360o3.A0B(c1ow, 0);
                        IGFOAMessagingSendToSentLogger A00 = C163307Sp.A00(this.A00, c1ow.A05.hashCode());
                        if (A00 != null) {
                            A00.onLogDirectMutationExecute();
                        }
                    }

                    @Override // X.InterfaceC452826l
                    public final void DUp(C19260xA c19260xA, C1OW c1ow, C114675Fx c114675Fx, boolean z) {
                        C14360o3.A0B(c1ow, 0);
                        if (!z) {
                            IGFOAMessagingSendToSentLogger A00 = C163307Sp.A00(this.A00, c1ow.A05.hashCode());
                            if (A00 != null) {
                                if (c114675Fx != null) {
                                    A00.onLogMQTTFailure(c114675Fx.toString());
                                    PlatformLogger.platformEventStructuredLoggerInstamadilloAddFailReasonAnnotationWithAliasId(c1ow.A05, c114675Fx.toString());
                                }
                                A00.annotateEndPointReason("direct_mutation_failure");
                                A00.onEndFlowFail("direct_mutation_failure");
                            }
                        }
                    }

                    @Override // X.InterfaceC452826l
                    public final void DUt(C19260xA c19260xA, C1OW c1ow) {
                        C14360o3.A0B(c1ow, 0);
                        IGFOAMessagingSendToSentLogger A00 = C163307Sp.A00(this.A00, c1ow.A05.hashCode());
                        if (A00 != null) {
                            A00.onLogDirectMutationSuccess();
                            A00.annotateEndPointReason("success");
                            A00.onEndFlowSucceed();
                        }
                    }

                    @Override // X.InterfaceC452826l
                    public final /* synthetic */ void Da4(String str, String str2, String str3) {
                    }

                    @Override // X.InterfaceC452826l
                    public final /* synthetic */ void Da8(C1OW c1ow, String str, String str2) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DhF(C1OW c1ow, String str, boolean z) {
                        C14360o3.A0B(c1ow, 0);
                        IGFOAMessagingSendToSentLogger A00 = C163307Sp.A00(this.A00, c1ow.A05.hashCode());
                        if (A00 != null) {
                            A00.onLogDirectMutationRetry();
                        }
                    }

                    {
                        this.A00 = userSession;
                        this.A01 = new C120025c0(userSession);
                    }
                };
                C0f9.A0A(1859217794, A032);
                C0f9.A0A(625152957, A03);
                return interfaceC452826l;
            }
        });
        list2.add(C36821nf.A00);
        list2.add(new C0KV() { // from class: X.1ng
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
                int A03 = C0f9.A03(976504505);
                int A032 = C0f9.A03(1477486020);
                C14360o3.A0B(userSession, 0);
                InterfaceC452826l interfaceC452826l = new InterfaceC452826l(userSession) { // from class: X.5c5
                    public final UserSession A00;

                    @Override // X.InterfaceC452826l
                    public final void D1t(C1OW c1ow) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void D6x(C1OW c1ow) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DB8(C1OW c1ow, String str, boolean z) {
                    }

                    @Override // X.InterfaceC452826l
                    public final /* synthetic */ void DB9(C1OW c1ow, boolean z) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DCa(C1OW c1ow) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DUo(C19260xA c19260xA, C1OW c1ow, boolean z) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DUp(C19260xA c19260xA, C1OW c1ow, C114675Fx c114675Fx, boolean z) {
                        C14360o3.A0B(c1ow, 0);
                        if (c1ow instanceof C1l5) {
                            AbstractC25651Mw.A00(this.A00).E4s(new LYH(false));
                        }
                    }

                    @Override // X.InterfaceC452826l
                    public final void DUt(C19260xA c19260xA, C1OW c1ow) {
                        C14360o3.A0B(c1ow, 0);
                        if (c1ow instanceof C1l5) {
                            AbstractC25651Mw.A00(this.A00).E4s(new LYH(true));
                        }
                    }

                    @Override // X.InterfaceC452826l
                    public final /* synthetic */ void Da4(String str, String str2, String str3) {
                    }

                    @Override // X.InterfaceC452826l
                    public final /* synthetic */ void Da8(C1OW c1ow, String str, String str2) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DhF(C1OW c1ow, String str, boolean z) {
                    }

                    {
                        this.A00 = userSession;
                    }
                };
                C0f9.A0A(-1163062494, A032);
                C0f9.A0A(-1876460535, A03);
                return interfaceC452826l;
            }
        });
        C26141Ov.A0U.add(new C0KV() { // from class: X.1nh
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(-1105168752);
                int A032 = C0f9.A03(-139640425);
                C14360o3.A0B(userSession, 0);
                final C25671My A00 = AbstractC25651Mw.A00(userSession);
                InterfaceC29421bJ interfaceC29421bJ = new InterfaceC29421bJ(A00) { // from class: X.5cE
                    public final C25671My A00;

                    {
                        C14360o3.A0B(A00, 1);
                        this.A00 = A00;
                    }

                    @Override // X.InterfaceC29421bJ
                    public final void DUn(C1OW c1ow, MNP mnp) {
                    }

                    @Override // X.InterfaceC29421bJ
                    public final void DUr(C1OW c1ow, MNP mnp) {
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC29421bJ
                    public final void DUs(C1OW c1ow, MNP mnp, MNP mnp2) {
                        C14360o3.A0B(c1ow, 0);
                        C14360o3.A0B(mnp2, 2);
                        JTV jtv = (JTV) mnp2;
                        String str = jtv.A02;
                        if ("upload_failed_transient".equals(str) || "upload_failed_permanent".equals(str)) {
                            C114675Fx c114675Fx = jtv.A01;
                            if (c114675Fx != null) {
                                if (c114675Fx.A0B) {
                                    if (c1ow instanceof AbstractC29011ae) {
                                        List<DirectThreadKey> C7R = ((AbstractC29011ae) c1ow).C7R();
                                        C14360o3.A07(C7R);
                                        for (DirectThreadKey directThreadKey : C7R) {
                                            C25671My c25671My = this.A00;
                                            C14360o3.A0A(directThreadKey);
                                            c25671My.E4s(new C7M9(directThreadKey));
                                        }
                                        return;
                                    }
                                    if (c1ow instanceof InterfaceC29171au) {
                                        C25671My c25671My2 = this.A00;
                                        DirectThreadKey C7Q = ((InterfaceC29171au) c1ow).C7Q();
                                        C14360o3.A07(C7Q);
                                        c25671My2.E4s(new C7M9(C7Q));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                };
                C0f9.A0A(968455589, A032);
                C0f9.A0A(-1102250139, A03);
                return interfaceC29421bJ;
            }
        });
        C26141Ov.A0V.add(C36851ni.A00);
        C36861nj.A00 = new Object();
        C36881nl.A13 = new Object() { // from class: X.1nk
        };
        C36911no.A00 = new Object();
        AbstractC36931nq.A00 = new Object();
        C36961nt.A00 = new C36941nr(context);
    }

    public final C189478aR A00(Activity activity, Context context, ZonePolicy zonePolicy, UserSession userSession, C3o9 c3o9, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str3, 5);
        C14360o3.A0B(c3o9, 9);
        C14360o3.A0B(zonePolicy, 10);
        AbstractC13880nE.A0K(activity);
        C26852BtE c26852BtE = new C26852BtE();
        LE0.A00(AbstractC46703KlM.A00(userSession), "INTERSTITIAL_SHOWN");
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0a = false;
        c189448aO.A0g = context.getString(2131956794);
        c189448aO.A1J = true;
        c189448aO.A10 = z;
        c189448aO.A0K = new ViewOnClickListenerC28657Cl5(activity, context, zonePolicy, c26852BtE, userSession, this, c3o9, str, str2, str3, str4, str5, str6);
        c189448aO.A06 = activity.getColor(AbstractC53242c7.A0H(context, R.attr.actionBarBackgroundColor));
        c189448aO.A0U = new C49616Lw9(userSession);
        C189478aR A00 = c189448aO.A00();
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC24793AyF(activity, c26852BtE, A00), 200L);
        return A00;
    }

    public final void A02(Activity activity, UserSession userSession, DirectEditAddYoursParams directEditAddYoursParams, DirectPromptTypes directPromptTypes, DirectThreadKey directThreadKey, int i, int i2) {
        if (directPromptTypes == DirectPromptTypes.A04 && C18U.A06(C06090Tz.A05, userSession, 36324071726067578L)) {
            String string = activity.getResources().getString(C34984FbF.A00.A00(userSession));
            C14360o3.A07(string);
            String lowerCase = string.toLowerCase(Locale.ROOT);
            C14360o3.A07(lowerCase);
            String string2 = activity.getResources().getString(2131959291, lowerCase);
            C14360o3.A07(string2);
            C193328hC c193328hC = new C193328hC(activity);
            c193328hC.A0A(2131959292);
            c193328hC.A0r(string2);
            c193328hC.A0J(DialogInterfaceOnClickListenerC28555Cin.A00, 2131959290);
            c193328hC.A0s(true);
            c193328hC.A0t(true);
            C0fJ.A00(c193328hC.A02());
            return;
        }
        C32351EMy c32351EMy = new C32351EMy();
        Bundle bundle = new Bundle();
        AbstractC03240Dh.A00(bundle, userSession);
        bundle.putParcelable(BurnerSendThreadDetailsFragment.ARGUMENT_DIRECT_THREAD_KEY, directThreadKey);
        bundle.putInt("direct_thread_sub_type", i);
        bundle.putInt("direct_thread_audience_type", i2);
        bundle.putParcelable("direct_recurring_prompt_type", directPromptTypes);
        bundle.putParcelable("direct_edit_add_yours_params", directEditAddYoursParams);
        c32351EMy.setArguments(bundle);
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0a = false;
        c189448aO.A0T = c32351EMy;
        c189448aO.A00().A02(activity, c32351EMy);
    }

    public final void A03(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4, int i) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(fragmentActivity, 1);
        A04(fragmentActivity, interfaceC11380iw, userSession, str, str2, str3, str4, null, i);
    }

    public final void A04(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4, String str5, int i) {
        C14360o3.A0B(fragmentActivity, 1);
        C14360o3.A0B(interfaceC11380iw, 8);
        if (FU1.A01(userSession, str, i)) {
            FU1.A00(fragmentActivity, interfaceC11380iw, userSession, str, str4, str5);
            return;
        }
        if (str2 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("s", str4));
        arrayList.add(new Pair("st", "29"));
        if (str3 != null) {
            arrayList.add(new Pair("cid", str3));
        }
        if (str5 != null) {
            arrayList.add(new Pair("ad_id", str5));
        }
        AbstractC41776Ies.A0C(fragmentActivity, userSession, AbstractC35186Ffe.A02(str2, arrayList), interfaceC11380iw.getModuleName());
    }

    public final void A05(SocialContextType socialContextType, UserSession userSession, C38321qM c38321qM, DirectShareTarget directShareTarget, String str, String str2, String str3) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 3);
        C7TL.A00(userSession).ENj(socialContextType, null, new C32068E6u(str, "", false, false), c38321qM, directShareTarget, null, str2, str3, null);
    }

    public final void A0E(UserSession userSession, Product product, String str, String str2, String str3) {
        String str4;
        String str5;
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str3, 4);
        String A0j = AnonymousClass001.A0j(str, str2, product.A0H, ':', ':');
        C7TL A00 = C7TL.A00(userSession);
        Parcelable.Creator creator = PendingRecipient.CREATOR;
        User user = product.A0B;
        ImageUrl imageUrl = null;
        if (user != null) {
            str4 = AbstractC76433bn.A00(user);
        } else {
            str4 = null;
        }
        C14360o3.A0A(str4);
        if (user != null) {
            str5 = user.A03.getUsername();
        } else {
            str5 = null;
        }
        C14360o3.A0A(str5);
        if (user != null) {
            imageUrl = user.A03.Bhu();
        }
        C14360o3.A0A(imageUrl);
        A00.EO4(new DirectShareTarget(new PendingRecipient(imageUrl, str4, str5)), product, str3, A0j, false);
    }

    public final void A0G(UserSession userSession, String str, List list, List list2) {
        ArrayList arrayList;
        int i;
        Integer num;
        Long l;
        C14360o3.A0B(userSession, 0);
        Integer num2 = null;
        if (list != null) {
            arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((User) it.next()).getId());
            }
        } else {
            arrayList = null;
        }
        int i2 = 0;
        if (list2 != null) {
            i = list2.size();
        } else {
            i = 0;
        }
        if (arrayList != null) {
            i2 = arrayList.size();
        }
        int i3 = i - i2;
        if (arrayList != null) {
            num = Integer.valueOf(arrayList.size());
        } else {
            num = null;
        }
        if (list2 != null) {
            num2 = Integer.valueOf(list2.size());
        }
        C18920wW A00 = new C12210kP(userSession).A00();
        InterfaceC02590Ai A002 = A00.A00(A00.A00, "direct_mentions_lists");
        if (A002.isSampled()) {
            A002.A9K("mentions_size_difference", Long.valueOf(i3));
            A002.AAP("mentions_type", str);
            Long l2 = null;
            if (num != null) {
                l = Long.valueOf(num.intValue());
            } else {
                l = null;
            }
            A002.A9K("server_mentions_list_size", l);
            if (num2 != null) {
                l2 = Long.valueOf(num2.intValue());
            }
            A002.A9K("client_mentions_list_size", l2);
            A002.Cht();
        }
    }

    public final boolean A0I(UserSession userSession, DirectShareTarget directShareTarget) {
        C2EC A00 = AbstractC140396Wt.A00(userSession, directShareTarget.A01());
        if (A00 != null && A00.CWO()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0Jk, java.lang.Object] */
    public final void A06(UserSession userSession) {
        if (C18U.A06(C06090Tz.A05, userSession, 36318861939514079L)) {
            C023409i.A0A.A0A(new Object(), GG5.A00, null, userSession.userId);
        }
    }

    public final void A07(UserSession userSession) {
        if (C18U.A06(C06090Tz.A05, userSession, 2342161871146130061L)) {
            AbstractC207749He.A00();
            C1YZ.A01(C99V.A00(userSession).A00, ArmadilloExpressEncryptedBackupDatabase.A00);
            AbstractC207749He.A00();
            JVE.A01(userSession);
        }
        C17110t6 c17110t6 = (C17110t6) C0BQ.A00(userSession);
        c17110t6.A02.A06(C17060sy.A01.A01(userSession));
    }

    public final void A09(UserSession userSession, C84923qg c84923qg, DirectShareTarget directShareTarget) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c84923qg, 3);
        if (directShareTarget.A01() instanceof InterfaceC83703oF) {
            C7YG A00 = C7YF.A00(userSession);
            InterfaceC83713oG A01 = directShareTarget.A01();
            C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadTarget");
            List unmodifiableList = Collections.unmodifiableList(directShareTarget.A0Q);
            C14360o3.A07(unmodifiableList);
            A00.A02((InterfaceC83703oF) A01, unmodifiableList, new C9G5(directShareTarget, userSession, c84923qg, "", 1), true);
        }
    }

    public final void A0A(UserSession userSession, C38321qM c38321qM, DirectShareTarget directShareTarget) {
        if (directShareTarget.A01() instanceof InterfaceC83703oF) {
            C7YG A00 = C7YF.A00(userSession);
            InterfaceC83713oG A01 = directShareTarget.A01();
            C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadTarget");
            List unmodifiableList = Collections.unmodifiableList(directShareTarget.A0Q);
            C14360o3.A07(unmodifiableList);
            A00.A02((InterfaceC83703oF) A01, unmodifiableList, new C9G5(directShareTarget, userSession, c38321qM, "", 0), true);
        }
    }

    public final void A0B(UserSession userSession, C38321qM c38321qM, DirectShareTarget directShareTarget) {
        C14360o3.A0B(userSession, 1);
        if (directShareTarget.A01() instanceof InterfaceC83703oF) {
            C7YG A00 = C7YF.A00(userSession);
            InterfaceC83713oG A01 = directShareTarget.A01();
            C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadTarget");
            List unmodifiableList = Collections.unmodifiableList(directShareTarget.A0Q);
            C14360o3.A07(unmodifiableList);
            A00.A02((InterfaceC83703oF) A01, unmodifiableList, new C9G5(directShareTarget, userSession, c38321qM, "", 2), true);
        }
    }

    public final void A0C(UserSession userSession, C38321qM c38321qM, User user) {
        C14360o3.A0B(user, 1);
        if (c38321qM != null) {
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                if (A2E.A0M() != C05F.A0C || user.B7L() == FollowStatus.A05) {
                    DirectShareTarget directShareTarget = new DirectShareTarget(user);
                    if (directShareTarget.A01() instanceof InterfaceC83703oF) {
                        C7YG A00 = C7YF.A00(userSession);
                        InterfaceC83713oG A01 = directShareTarget.A01();
                        C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadTarget");
                        List unmodifiableList = Collections.unmodifiableList(directShareTarget.A0Q);
                        C14360o3.A07(unmodifiableList);
                        A00.A02((InterfaceC83703oF) A01, unmodifiableList, new C9G5(directShareTarget, userSession, c38321qM, "", 3), true);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("story_mentions", "Media to share is null");
        AbstractC12120kG.A0I("DirectPluginImpl", null, hashMap);
    }

    public final /* bridge */ /* synthetic */ void A01(Activity activity, MediaUploadMetadata mediaUploadMetadata, UserSession userSession, Boolean bool, String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        boolean booleanValue = bool.booleanValue();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        bundle.putParcelableArrayList("bundle_external_share_uris", arrayList);
        if (str != null) {
            bundle.putString("bundle_external_share_mime_type", str);
        }
        if (str2 != null) {
            bundle.putString("bundle_share_text", str2);
        }
        bundle.putBoolean("DirectPrivateStoryRecipientFragment.DIRECT_SHOULD_SHOW_MESSAGE_COMPOSER", z);
        bundle.putBoolean("DirectPrivateStoryRecipientFragment.DIRECT_SHOULD_SHOW_ACCOUNT_LABEL", true);
        bundle.putBoolean("DirectShareSheetFragment.DIRECT_SHARE_INCLUDE_CANCEL_COPY_TITLE_CTAS", booleanValue);
        if (str3 != null) {
            bundle.putString("DirectPrivateStoryRecipientFragment.DIRECT_STORY_RECIPIENT_FRAGMENT_EXTERNAL_SHARE_APP_ID", str3);
        }
        if (arrayList2 != null) {
            bundle.putStringArrayList("DirectPrivateStoryRecipientFragment.DIRECT_STORY_RECIPIENT_FRAGMENT_EXTERNAL_MEDIA_IDS", arrayList2);
        }
        if (mediaUploadMetadata != null) {
            bundle.putParcelable("DirectPrivateStoryRecipientFragment.DIRECT_STORY_RECIPIENT_FRAGMENT_EXTERNAL_MEDIA_UPLOAD_METADATA", mediaUploadMetadata);
        }
        new C6XJ(activity, bundle, userSession, TransparentModalActivity.class, "direct_private_story_recipients").A0A(activity, 4919);
    }

    public final /* bridge */ /* synthetic */ void A08(UserSession userSession, ImageUrl imageUrl, DirectShareTarget directShareTarget, ExtendedImageUrl extendedImageUrl, User user, Boolean bool, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        long longValue = l.longValue();
        boolean booleanValue = bool.booleanValue();
        C14360o3.A0B(str2, 4);
        C14360o3.A0B(str3, 5);
        if (directShareTarget.A01() instanceof InterfaceC83703oF) {
            C7YG A00 = C7YF.A00(userSession);
            InterfaceC83713oG A01 = directShareTarget.A01();
            C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadTarget");
            List unmodifiableList = Collections.unmodifiableList(directShareTarget.A0Q);
            C14360o3.A07(unmodifiableList);
            A00.A02((InterfaceC83703oF) A01, unmodifiableList, new C50284MIn(userSession, imageUrl, directShareTarget, extendedImageUrl, user, str, str3, str2, str4, str5, str6, str7, longValue, booleanValue), true);
        }
    }

    public final void A0D(UserSession userSession, C45001Jvr c45001Jvr, String str, String str2) {
        AbstractC140396Wt.A02(userSession, c45001Jvr.A01).EOB(c45001Jvr, str, str2, "reel");
    }

    public final void A0F(UserSession userSession, String str) {
        if (!userSession.isStopped()) {
            C2DG A00 = C2DG.A00(userSession);
            C2DG.A07(A00, str, C2DG.A08(A00.A09));
        }
    }

    public final boolean A0H(UserSession userSession, DirectShareTarget directShareTarget) {
        return C6X6.A0M(userSession, AbstractC140396Wt.A00(userSession, directShareTarget.A01()));
    }

    public final boolean A0J(UserSession userSession, C2EY c2ey) {
        AbstractC23021Ah.A00(userSession).A0f(System.currentTimeMillis());
        if (!C34976Fb3.A00(userSession, c2ey)) {
            if (c2ey == C2EY.A1B && C18U.A06(C06090Tz.A05, userSession, 36319003664194369L)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public C28531Zo() {
    }
}
