package X;

import android.content.Context;
import android.content.res.AssetManager;

/* renamed from: X.8q3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198548q3 {
    public final /* synthetic */ AssetManager A00;
    public final /* synthetic */ boolean A01;

    public C198548q3(AssetManager assetManager, boolean z) {
        this.A00 = assetManager;
        this.A01 = z;
    }

    public static C198548q3 A00(Context context, boolean z) {
        AssetManager assets = context.getAssets();
        C14360o3.A07(assets);
        return new C198548q3(assets, z);
    }
}
