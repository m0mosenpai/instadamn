package com.facebook.cameracore.ardelivery.xplat.effectmanager;

import X.C14360o3;
import X.C174407pa;
import X.C203678zW;
import X.C203748zi;
import X.C203768zk;
import android.text.TextUtils;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.xplat.models.XplatModelPaths;
import java.io.File;

/* loaded from: classes3.dex */
public final class AREngineMaskEffectAdapter implements AREngineEffectAdapter {
    @Override // com.facebook.cameracore.ardelivery.xplat.effectmanager.AREngineEffectAdapter
    public C203678zW toAREngineEffect(File file, XplatModelPaths xplatModelPaths, C203748zi c203748zi, ARRequestAsset aRRequestAsset, String str, String str2) {
        C14360o3.A0B(file, 0);
        C14360o3.A0B(xplatModelPaths, 1);
        C14360o3.A0B(c203748zi, 2);
        C14360o3.A0B(aRRequestAsset, 3);
        C14360o3.A0B(str, 4);
        C14360o3.A0B(str2, 5);
        C203678zW c203678zW = new C203678zW(xplatModelPaths.aRModelPaths, c203748zi);
        C174407pa c174407pa = aRRequestAsset.A02;
        String str3 = c174407pa.A09;
        String str4 = c174407pa.A0A;
        String absolutePath = file.getAbsolutePath();
        if (!TextUtils.isEmpty(absolutePath) && str3 != null) {
            c203678zW.A05.add(new C203768zk(aRRequestAsset.A04, str3, str4, c174407pa.A0B, absolutePath));
        }
        c203678zW.A01 = str;
        c203678zW.A02 = str2;
        return c203678zW;
    }
}
