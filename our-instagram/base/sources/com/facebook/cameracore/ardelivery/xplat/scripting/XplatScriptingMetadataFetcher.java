package com.facebook.cameracore.ardelivery.xplat.scripting;

import X.C14360o3;
import X.C150096p8;
import X.C1Dk;
import X.C206999Ee;
import X.C28924CpY;
import X.C68661VZx;
import X.CXA;
import X.InterfaceC150106p9;
import X.InterfaceC48212Jk;
import X.WW4;
import com.facebook.cameracore.ardelivery.scripting.ScriptingPackageMetadata;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class XplatScriptingMetadataFetcher {
    public InterfaceC150106p9 metadataDownloader;

    public XplatScriptingMetadataFetcher(InterfaceC150106p9 interfaceC150106p9) {
        C14360o3.A0B(interfaceC150106p9, 1);
        this.metadataDownloader = interfaceC150106p9;
    }

    public final void fetchMetadata(String str, XplatScriptingMetadataCompletionCallback xplatScriptingMetadataCompletionCallback) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(xplatScriptingMetadataCompletionCallback, 1);
        InterfaceC150106p9 interfaceC150106p9 = this.metadataDownloader;
        C68661VZx c68661VZx = new C68661VZx(xplatScriptingMetadataCompletionCallback);
        C150096p8 c150096p8 = (C150096p8) interfaceC150106p9;
        synchronized (c150096p8) {
            ScriptingPackageMetadata scriptingPackageMetadata = (ScriptingPackageMetadata) c150096p8.A01.get(str);
            if (scriptingPackageMetadata != null) {
                c68661VZx.A00.onSuccess(scriptingPackageMetadata);
            } else {
                final C206999Ee c206999Ee = new C206999Ee(c68661VZx, 15);
                try {
                    C28924CpY c28924CpY = (C28924CpY) CXA.class.getMethod("create", new Class[0]).invoke(null, new Object[0]);
                    c28924CpY.A00.A04("package_hash", str);
                    c28924CpY.A02 = true;
                    C1Dk A00 = c28924CpY.A00();
                    C14360o3.A0A(A00);
                    c150096p8.A00.ATV(new InterfaceC48212Jk() { // from class: X.AXU
                        @Override // X.InterfaceC48212Jk
                        public final /* synthetic */ void invoke(Throwable th) {
                            InterfaceC16660sJ.this.invoke(th);
                        }
                    }, new WW4(c150096p8, c68661VZx, str, c206999Ee), A00);
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public final void setMetadataDownloader(InterfaceC150106p9 interfaceC150106p9) {
        C14360o3.A0B(interfaceC150106p9, 0);
        this.metadataDownloader = interfaceC150106p9;
    }

    public final InterfaceC150106p9 getMetadataDownloader() {
        return this.metadataDownloader;
    }
}
