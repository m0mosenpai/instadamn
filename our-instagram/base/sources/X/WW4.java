package X;

import com.facebook.cameracore.ardelivery.scripting.ScriptingPackageMetadata;

/* loaded from: classes11.dex */
public final class WW4 implements InterfaceC48192Ji {
    public final /* synthetic */ C150096p8 A00;
    public final /* synthetic */ C68661VZx A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ InterfaceC16660sJ A03;

    public WW4(C150096p8 c150096p8, C68661VZx c68661VZx, String str, InterfaceC16660sJ interfaceC16660sJ) {
        this.A03 = interfaceC16660sJ;
        this.A02 = str;
        this.A00 = c150096p8;
        this.A01 = c68661VZx;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        C2JS optionalTreeField;
        C2JS c2js = (C2JS) anonymousClass436.Bos();
        if (c2js != null && (optionalTreeField = c2js.getOptionalTreeField(0, "ar_scripting_modules_package_download(package_hash:$package_hash)", C66716UZa.class, -1279245700)) != null) {
            InterfaceC16660sJ interfaceC16660sJ = this.A03;
            String str = this.A02;
            C150096p8 c150096p8 = this.A00;
            C68661VZx c68661VZx = this.A01;
            String optionalStringField = optionalTreeField.getOptionalStringField(0, "cdn_uri");
            if (optionalStringField != null) {
                ScriptingPackageMetadata scriptingPackageMetadata = new ScriptingPackageMetadata(str, optionalTreeField.getCoercedIntField(1, "revision"), optionalStringField);
                c150096p8.A01.put(str, scriptingPackageMetadata);
                c68661VZx.A00.onSuccess(scriptingPackageMetadata);
                return;
            }
            interfaceC16660sJ.invoke(new IllegalStateException("Graphql result CdnUri is null."));
            return;
        }
        this.A03.invoke(new IllegalStateException("Graphql result is null."));
    }
}
