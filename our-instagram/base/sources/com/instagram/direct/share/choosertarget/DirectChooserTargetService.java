package com.instagram.direct.share.choosertarget;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC28761aE;
import X.AbstractC31171DnF;
import X.AbstractC31314Dpa;
import X.C14360o3;
import X.C16930sl;
import X.C1NC;
import X.C25821No;
import X.C2DU;
import X.C2EC;
import X.C4I1;
import android.content.ComponentName;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.service.chooser.ChooserTarget;
import androidx.sharetarget.ChooserTargetServiceCompat;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class DirectChooserTargetService extends ChooserTargetServiceCompat {
    @Override // androidx.sharetarget.ChooserTargetServiceCompat, android.service.chooser.ChooserTargetService
    public final List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        UserSession userSession;
        Icon createWithResource;
        Bitmap A05;
        C14360o3.A0B(componentName, 0);
        AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
        if ((A0F instanceof UserSession) && (userSession = (UserSession) A0F) != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            List A0F2 = ((C2DU) AbstractC28761aE.A00(userSession)).A0C.A0F(C4I1.A00);
            int min = Math.min(A0F2.size(), 8);
            for (int i = 0; i < min; i++) {
                C2EC c2ec = (C2EC) A0F2.get(i);
                if (c2ec.C7I() != null) {
                    String C7l = c2ec.C7l();
                    ImageUrl A00 = AbstractC31314Dpa.A00(userSession, c2ec.BSH());
                    C25821No A002 = C25821No.A00();
                    if (A00 != null) {
                        Bitmap A0I = A002.A0I(A00, "DirectChooserTargetService");
                        if (A0I != null && (A05 = C1NC.A05(A0I)) != null) {
                            createWithResource = Icon.createWithBitmap(A05);
                        } else {
                            createWithResource = Icon.createWithResource(this, R.drawable.profile_anonymous_user);
                        }
                        C14360o3.A07(createWithResource);
                        Bundle A0b = AbstractC166987dD.A0b();
                        A0b.putString("com.instagram.share.choosertarget.DirectChooserTargetService.THREAD_ID", c2ec.C7I());
                        A1E.add(new ChooserTarget(C7l, createWithResource, 0.9f, componentName, A0b));
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
            }
            return A1E;
        }
        return C16930sl.A00;
    }
}
