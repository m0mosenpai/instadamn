package X;

import android.content.DialogInterface;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.ARDRemoteModelVersionFetcher;
import com.instagram.common.session.UserSession;

/* renamed from: X.IfF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41799IfF implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public DialogInterfaceOnClickListenerC41799IfF(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2;
        int i3;
        Integer num;
        String str;
        switch (this.A00) {
            case 0:
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4 && this.A02) {
                                    i2 = 60;
                                } else {
                                    ((JH0) this.A01).onCancel();
                                    return;
                                }
                            } else {
                                i2 = -1;
                            }
                        } else {
                            i3 = 24;
                        }
                    } else {
                        i3 = 8;
                    }
                    i2 = i3 * ARDRemoteModelVersionFetcher.REQUEST_CACHE_TTL_SECONDS;
                } else {
                    i2 = ARDRemoteModelVersionFetcher.REQUEST_CACHE_TTL_SECONDS;
                }
                ((JH0) this.A01).DCh(i2);
                return;
            case 1:
                HDJ hdj = (HDJ) this.A01;
                boolean z = this.A02;
                if (z) {
                    InterfaceC19610xo A0e = AbstractC31176DnK.A0e(hdj.A03);
                    A0e.E77(AbstractC111324zv.A00(2242), true);
                    A0e.apply();
                }
                Integer num2 = hdj.A0B;
                if (num2 != null) {
                    UserSession userSession = hdj.A03;
                    InterfaceC11380iw interfaceC11380iw = hdj.A01;
                    if (z) {
                        num = C05F.A0N;
                    } else {
                        num = C05F.A0Y;
                    }
                    AbstractC35091Fd2.A00(interfaceC11380iw, userSession, num2, num);
                }
                hdj.A02.A02(hdj.A07.A01(z), new GKL(hdj, 2));
                return;
            default:
                MVS mvs = (MVS) this.A01;
                boolean z2 = this.A02;
                UserSession userSession2 = mvs.A03;
                C37522Gfe c37522Gfe = mvs.A01;
                if (c37522Gfe != null) {
                    String str2 = c37522Gfe.A03.A01;
                    boolean A1U = AbstractC167007dF.A1U(str2);
                    InterfaceC02590Ai A10 = AbstractC25232BEp.A10(c37522Gfe, userSession2);
                    if (A10.isSampled()) {
                        if (z2) {
                            str = "translation_all_keep";
                        } else {
                            str = "translation_audio_keep";
                        }
                        A10.AAP("organic_tap_action", str);
                        A10.AAP("organic_tap_action_source", AbstractC111324zv.A00(3252));
                        AbstractC25225BEi.A1O(A10, c37522Gfe.getModuleName());
                        AbstractC25229BEm.A19(A10, A1U ? 1 : 0);
                        AbstractC25225BEi.A1P(A10, str2);
                        A10.Cht();
                        return;
                    }
                    return;
                }
                C14360o3.A0F("analyticsModule");
                throw C00O.createAndThrow();
        }
    }
}
