package com.facebook.react.uimanager;

import X.AbstractC05810Sj;
import X.AbstractC166997dE;
import X.AbstractC63177Sec;
import X.AnonymousClass001;
import X.C0I2;
import X.C63369SiY;
import X.R3N;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class ViewManagerPropertyUpdater$FallbackShadowNodeSetter implements ViewManagerPropertyUpdater$ShadowNodeSetter {
    public final Map A00;

    @Override // com.facebook.react.uimanager.ViewManagerPropertyUpdater$Settable
    public final void Bir(Map map) {
        Iterator A16 = AbstractC166997dE.A16(this.A00);
        while (A16.hasNext()) {
            AbstractC63177Sec abstractC63177Sec = (AbstractC63177Sec) A16.next();
            map.put(abstractC63177Sec.A01, abstractC63177Sec.A02);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManagerPropertyUpdater$ShadowNodeSetter
    public final void Ebo(ReactShadowNode reactShadowNode, Object obj, String str) {
        Object[] objArr;
        AbstractC63177Sec abstractC63177Sec = (AbstractC63177Sec) this.A00.get(str);
        if (abstractC63177Sec != null) {
            try {
                Integer num = abstractC63177Sec.A00;
                if (num == null) {
                    objArr = (Object[]) AbstractC63177Sec.A04.get();
                    R3N r3n = ((ReactShadowNodeImpl) reactShadowNode).A0A;
                    AbstractC05810Sj.A00(r3n);
                    objArr[0] = abstractC63177Sec.A00(r3n, obj);
                } else {
                    objArr = (Object[]) AbstractC63177Sec.A05.get();
                    objArr[0] = num;
                    R3N r3n2 = ((ReactShadowNodeImpl) reactShadowNode).A0A;
                    AbstractC05810Sj.A00(r3n2);
                    objArr[1] = abstractC63177Sec.A00(r3n2, obj);
                }
                abstractC63177Sec.A03.invoke(reactShadowNode, objArr);
                Arrays.fill(objArr, (Object) null);
            } catch (Throwable th) {
                String str2 = abstractC63177Sec.A01;
                C0I2.A01(ViewManager.class, AnonymousClass001.A0R("Error while updating prop ", str2), th);
                String str3 = ((ReactShadowNodeImpl) reactShadowNode).A0E;
                AbstractC05810Sj.A00(str3);
                throw new RuntimeException(AnonymousClass001.A0u("Error while updating property '", str2, "' in shadow node of type: ", str3), th);
            }
        }
    }

    public ViewManagerPropertyUpdater$FallbackShadowNodeSetter(Class cls) {
        this.A00 = C63369SiY.A02(cls);
    }
}
