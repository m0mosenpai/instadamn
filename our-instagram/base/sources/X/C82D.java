package X;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* renamed from: X.82D, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C82D {
    public final C81Z A00;
    public final boolean A01;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f0, code lost:
    
        if (r1 == null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A00(int r10, android.content.Intent r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82D.A00(int, android.content.Intent):void");
    }

    public static void A01(Intent intent, C82D c82d, int i) {
        C81Z c81z;
        View view;
        if (i != -1) {
            ((AH4) AH4.A02.getValue()).A00();
            if (intent != null && intent.getBooleanExtra("arguments_open_hall_pass_creation_flow", false)) {
                ((C1809981b) c82d.A00.A1e).A01.A04(new Object());
            }
            c81z = c82d.A00;
            C89F c89f = c81z.A0W;
            if (c89f.A0S.A04 != null) {
                c89f.A06();
            } else {
                c89f.A0P.A01();
            }
            if (intent == null) {
                return;
            }
        } else {
            if (intent == null) {
                return;
            }
            Collection parcelableArrayListExtra = intent.getParcelableArrayListExtra(MSV.A00(1003));
            Collection parcelableArrayListExtra2 = intent.getParcelableArrayListExtra(MSV.A00(1004));
            c81z = c82d.A00;
            UserSession userSession = c81z.A0Q;
            if (parcelableArrayListExtra == null) {
                parcelableArrayListExtra = Collections.emptyList();
            }
            if (parcelableArrayListExtra2 == null) {
                parcelableArrayListExtra2 = Collections.emptyList();
            }
            C14360o3.A0B(userSession, 0);
            C14360o3.A0B(parcelableArrayListExtra, 1);
            C14360o3.A0B(parcelableArrayListExtra2, 2);
            LinkedHashSet linkedHashSet = OTT.A02;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(parcelableArrayListExtra);
            LinkedHashSet linkedHashSet3 = new LinkedHashSet(parcelableArrayListExtra2);
            if (!linkedHashSet2.isEmpty() || linkedHashSet3.size() >= 2) {
                try {
                    LinkedHashSet<DirectShareTarget> A00 = AbstractC53955NtS.A00(linkedHashSet2, linkedHashSet3);
                    StringWriter stringWriter = new StringWriter();
                    C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                    A0A.A0d();
                    C16V.A03(A0A, MSV.A00(1128));
                    for (DirectShareTarget directShareTarget : A00) {
                        if (directShareTarget != null) {
                            C7NS.A00(A0A, directShareTarget);
                        }
                    }
                    A0A.A0Z();
                    A0A.A0a();
                    A0A.close();
                    String obj = stringWriter.toString();
                    C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                    A002.A6u.Egi(A002, obj, C23031Ai.A8c[237]);
                } catch (IOException e) {
                    C0w9.A07("BlastListCandidatesManager_error_serializing_last_send", e);
                }
            }
            if (intent.getBooleanExtra("bundle_extra_user_tapped_done_button", false)) {
                if (c81z.A0u.A3h) {
                    InterfaceC188718Xl interfaceC188718Xl = c81z.A15;
                    WeakReference weakReference = ((AH4) AH4.A02.getValue()).A01;
                    if (weakReference != null) {
                        view = (View) weakReference.get();
                    } else {
                        view = null;
                    }
                    C188708Xk c188708Xk = (C188708Xk) interfaceC188718Xl;
                    boolean z = false;
                    if (c188708Xk.A0A != null) {
                        z = true;
                    }
                    c188708Xk.DEv(view, "button", z);
                } else {
                    ((AH4) AH4.A02.getValue()).A00();
                }
            }
        }
        c81z.A0d.A1r.A04(intent.getBooleanExtra("DirectPrivateStoryRecipientFragment.DIRECT_SHOULD_SHARE_TO_FB", false));
    }

    public final void A02(Object obj) {
        String str;
        if (obj instanceof C8VK) {
            C8VK c8vk = (C8VK) obj;
            int i = c8vk.A00;
            Intent intent = c8vk.A01;
            if (i != 0) {
                if (i != 9683) {
                    if (i != 9685) {
                        str = null;
                    } else {
                        str = "draft";
                    }
                } else {
                    str = "share";
                }
            } else {
                str = "back";
            }
            C81Z c81z = this.A00;
            Activity activity = c81z.A09;
            UserSession userSession = c81z.A0Q;
            C14360o3.A0B(activity, 0);
            C14360o3.A0B(userSession, 1);
            if (C1VN.A00 != null) {
                HashMap hashMap = new HashMap();
                if (str != null && str.length() != 0) {
                    hashMap.put(MSV.A00(204), str);
                }
                AbstractC31282Dp4.A00().A00(activity, userSession, "795323564647144", hashMap);
            }
            if (this.A01 && i == 9683) {
                A00(9685, null);
            } else if (i != 9683 && i != 9685) {
                A01(intent, this, i);
            } else {
                ((AH4) AH4.A02.getValue()).A00();
                A00(i, intent);
            }
        }
    }

    public C82D(C81Z c81z, boolean z) {
        this.A00 = c81z;
        this.A01 = z;
    }
}
