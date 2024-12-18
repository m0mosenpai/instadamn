package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder;

import X.AbstractC167007dF;
import X.C09170dP;
import com.facebook.onecamera.components.mediapipeline.gl.context.igl.IglTexture;

/* loaded from: classes4.dex */
public final class IgluExternalRenderDelegateWrapper {
    public String key;

    public final boolean doRender(IglTexture iglTexture, IglTexture iglTexture2) {
        AbstractC167007dF.A1K(iglTexture, iglTexture2);
        return false;
    }

    public IgluExternalRenderDelegateWrapper() {
        C09170dP.A0C("mediapipeline-iglufilter-holder");
    }
}
