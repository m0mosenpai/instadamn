package X;

import android.content.res.AssetManager;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import com.facebook.mobileconfig.MobileConfigManagerParamsHolder;
import com.facebook.mobileconfig.MobileConfigUsingPureJavaDependencies;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.OoP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55698OoP implements InterfaceC227319b {
    public final /* synthetic */ AssetManager A00;
    public final /* synthetic */ MobileConfigManagerParamsHolder A01;
    public final /* synthetic */ AbstractC12990ll A02;
    public final /* synthetic */ C19W A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ HashMap A07;

    public C55698OoP(AssetManager assetManager, MobileConfigManagerParamsHolder mobileConfigManagerParamsHolder, AbstractC12990ll abstractC12990ll, C19W c19w, String str, String str2, String str3, HashMap hashMap) {
        this.A02 = abstractC12990ll;
        this.A03 = c19w;
        this.A06 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A00 = assetManager;
        this.A01 = mobileConfigManagerParamsHolder;
        this.A07 = hashMap;
    }

    @Override // X.InterfaceC227319b
    public final MobileConfigManagerHolderImpl ALC(File file, String str) {
        MobileConfigUsingPureJavaDependencies mobileConfigUsingPureJavaDependencies = MobileConfigUsingPureJavaDependencies.$redex_init_class;
        AbstractC12990ll abstractC12990ll = this.A02;
        return new MobileConfigUsingPureJavaDependencies(null, new C1A4(abstractC12990ll, false), abstractC12990ll instanceof UserSession, this.A03, null).createManager(file, this.A06, this.A04, str, 2, this.A05, this.A00, false, this.A01, this.A07, null, null, null, false, null);
    }
}
