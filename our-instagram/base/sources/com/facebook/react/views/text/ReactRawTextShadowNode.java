package com.facebook.react.views.text;

import X.AbstractC05810Sj;
import X.AnonymousClass001;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.annotations.ReactProp;

/* loaded from: classes10.dex */
public class ReactRawTextShadowNode extends ReactShadowNodeImpl {
    public String A00 = null;

    @ReactProp(name = "text")
    public void setText(String str) {
        this.A00 = str;
        A07();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    public final String toString() {
        String str = this.A0E;
        AbstractC05810Sj.A00(str);
        return AnonymousClass001.A0u(str, " [text: ", this.A00, "]");
    }
}
