package com.instagram.share.handleractivity;

import X.AbstractC002300n;
import X.AbstractC12860lY;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC43591JPw;
import X.AbstractC54199Nxd;
import X.AbstractC54200Nxe;
import X.C05F;
import X.C06090Tz;
import X.C0f9;
import X.C12260kU;
import X.C14360o3;
import X.C14H;
import X.C18U;
import X.C54815OKq;
import X.InterfaceC11380iw;
import X.InterfaceC12850lX;
import X.InterfaceC57868PlY;
import X.MSX;
import android.app.Activity;
import android.content.Intent;
import com.instagram.base.activity.IgActivity;
import com.instagram.common.session.UserSession;
import com.instagram.nux.activity.SignedOutFragmentActivity;
import java.io.IOException;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes9.dex */
public abstract class BaseShareHandlerActivity extends IgActivity implements InterfaceC11380iw, InterfaceC12850lX {
    @Override // X.InterfaceC12850lX
    public final void Cuw(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cux(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cuy(Activity activity) {
        C14360o3.A0B(activity, 0);
        if ((activity instanceof InterfaceC57868PlY) || (activity instanceof SignedOutFragmentActivity)) {
            finish();
        }
    }

    @Override // X.InterfaceC12850lX
    public final void Cv0(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cv5(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cv6(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cv7(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cv8(Activity activity, boolean z) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "share_handler";
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        C14360o3.A0B(intent, 0);
        setIntent(intent);
        A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0171, code lost:
    
        if (r2 != null) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00() {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.share.handleractivity.BaseShareHandlerActivity.A00():void");
    }

    public final void A02(Exception exc) {
        String str;
        UserSession A01;
        if (this instanceof ClipsShareHandlerActivity) {
            if (exc instanceof IOException) {
                str = "io_exception";
            } else if (exc instanceof SecurityException) {
                str = "internal_file";
            } else {
                str = "unknown";
            }
            A01 = A01();
            if (A01 == null) {
                return;
            }
        } else {
            if (!(this instanceof ClipsMusicShareHandlerActivity)) {
                return;
            }
            if (exc instanceof IOException) {
                str = "io_exception";
            } else if (exc instanceof SecurityException) {
                str = "internal_file";
            } else {
                str = "unknown";
            }
            A01 = A01();
            if (A01 == null) {
                return;
            }
        }
        C54815OKq A00 = AbstractC54199Nxd.A00(A01);
        if (A00 == null) {
            return;
        }
        A00.A00(str);
    }

    public final boolean A04() {
        if (this instanceof ShareHandlerActivity) {
            UserSession A01 = A01();
            if (A01 == null) {
                return false;
            }
            boolean A0K = C14360o3.A0K(MSX.A0c(this), "android.intent.action.SEND");
            Intent intent = getIntent();
            if (A0K) {
                String type = intent.getType();
                if (type == null || !AbstractC002300n.A0h(type, MediaStreamTrack.VIDEO_TRACK_KIND, false)) {
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (!C18U.A06(c06090Tz, A01, 36323848387309194L) && !C18U.A06(c06090Tz, A01, 36323848387440268L)) {
                        return false;
                    }
                }
            } else {
                if (!C14360o3.A0K(intent.getAction(), "android.intent.action.SEND_MULTIPLE")) {
                    return false;
                }
                return C18U.A06(C06090Tz.A05, A01, 36323848387505805L);
            }
        } else if (!(this instanceof ReelShareHandlerActivity) && !(this instanceof ClipsThreadShareHandlerActivity) && !(this instanceof ClipsShareHandlerActivity)) {
            return false;
        }
        return true;
    }

    public final UserSession A01() {
        AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
        if (A0F instanceof UserSession) {
            return (UserSession) A0F;
        }
        return null;
    }

    public final void A03(boolean z) {
        Integer num;
        UserSession A01;
        Intent intent = getIntent();
        int i = 0;
        if (!intent.getBooleanExtra(AbstractC43591JPw.A00(702), false)) {
            i = 335544320;
        }
        Intent A03 = C14H.A03.A00().A03(this, i);
        if (!z) {
            if (this instanceof ShareHandlerActivity) {
                num = C05F.A0N;
            } else if (this instanceof ReelShareHandlerActivity) {
                num = C05F.A0Y;
            } else if (this instanceof ClipsThreadShareHandlerActivity) {
                num = C05F.A0C;
            } else if (this instanceof ClipsShareHandlerActivity) {
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
            A03.putExtra(AbstractC54200Nxe.A00(num), intent);
            if (!(this instanceof ClipsShareHandlerActivity) ? !(!(this instanceof ClipsMusicShareHandlerActivity) || (A01 = A01()) == null) : (A01 = A01()) != null) {
                C54815OKq A00 = AbstractC54199Nxd.A00(A01);
                if (A00 != null) {
                    long j = A00.A01;
                    if (j != 0) {
                        A00.A02.flowEndSuccess(j);
                        A00.A01 = 0L;
                    }
                }
            }
        }
        C12260kU.A0C(this, A03);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    @Override // com.instagram.base.activity.IgActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            r0 = -2139465065(0xffffffff807a5a97, float:-1.1236428E-38)
            int r3 = X.C0f9.A00(r0)
            X.0vz r0 = X.AbstractC12960li.A00
            X.18s r4 = X.C226218q.A01(r0)
            boolean r2 = r6 instanceof com.instagram.share.handleractivity.ShareHandlerActivity
            if (r2 == 0) goto L92
            java.lang.Integer r1 = X.C05F.A02
        L13:
            android.content.Intent r0 = r6.getIntent()
            r4.A0L(r0, r1)
            com.instagram.common.session.UserSession r0 = r6.A01()
            r4 = 1
            if (r0 == 0) goto L4d
            if (r7 == 0) goto L4d
            java.lang.String r0 = "async_app_init_recreate"
            boolean r0 = r7.getBoolean(r0)
            if (r0 != r4) goto L4d
            if (r2 == 0) goto L7c
            com.instagram.common.session.UserSession r5 = r6.A01()
            if (r5 == 0) goto L4d
            java.lang.String r1 = X.MSX.A0c(r6)
            java.lang.String r0 = "android.intent.action.SEND"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L68
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323848387833487(0x810c5900082e8f, double:3.034686212638802E-306)
        L46:
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto L4d
            r7 = 0
        L4d:
            super.onCreate(r7)
            if (r7 != 0) goto L55
            r6.A00()
        L55:
            X.AbstractC917648y.A00(r6, r4)
            X.AbstractC12860lY.A07(r6)
            r0 = 2131624229(0x7f0e0125, float:1.8875632E38)
            r6.setContentView(r0)
            r0 = -4622978(0xffffffffffb9757e, float:NaN)
            X.C0f9.A07(r0, r3)
            return
        L68:
            java.lang.String r1 = X.MSX.A0c(r6)
            java.lang.String r0 = "android.intent.action.SEND_MULTIPLE"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L4d
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323848387899024(0x810c5900092e90, double:3.034686212680248E-306)
            goto L46
        L7c:
            boolean r0 = r6 instanceof com.instagram.share.handleractivity.ReelShareHandlerActivity
            if (r0 != 0) goto L84
            boolean r0 = r6 instanceof com.instagram.share.handleractivity.ClipsShareHandlerActivity
            if (r0 == 0) goto L4d
        L84:
            com.instagram.common.session.UserSession r5 = r6.A01()
            if (r5 == 0) goto L4d
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323848387964561(0x810c59000a2e91, double:3.034686212721694E-306)
            goto L46
        L92:
            boolean r0 = r6 instanceof com.instagram.share.handleractivity.ReelShareHandlerActivity
            if (r0 == 0) goto L9a
            java.lang.Integer r1 = X.C05F.A03
            goto L13
        L9a:
            boolean r0 = r6 instanceof com.instagram.share.handleractivity.ClipsThreadShareHandlerActivity
            if (r0 == 0) goto La2
            java.lang.Integer r1 = X.C05F.A05
            goto L13
        La2:
            java.lang.Integer r1 = X.C05F.A04
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.share.handleractivity.BaseShareHandlerActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.instagram.base.activity.IgActivity, android.app.Activity
    public final void onDestroy() {
        int A00 = C0f9.A00(-2095995398);
        super.onDestroy();
        AbstractC12860lY.A08(this);
        C0f9.A07(-1857569707, A00);
    }
}
