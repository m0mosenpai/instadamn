package com.facebook.react.uimanager;

import X.AbstractC166997dE;
import X.AbstractC63177Sec;
import X.AnonymousClass001;
import X.C0I2;
import X.C63369SiY;
import android.view.View;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class ViewManagerPropertyUpdater$FallbackViewManagerSetter implements ViewManagerPropertyUpdater$ViewManagerSetter {
    public final Map A00;

    @Override // com.facebook.react.uimanager.ViewManagerPropertyUpdater$Settable
    public final void Bir(Map map) {
        Iterator A16 = AbstractC166997dE.A16(this.A00);
        while (A16.hasNext()) {
            AbstractC63177Sec abstractC63177Sec = (AbstractC63177Sec) A16.next();
            map.put(abstractC63177Sec.A01, abstractC63177Sec.A02);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManagerPropertyUpdater$ViewManagerSetter
    public final void Ebp(View view, ViewManager viewManager, Object obj, String str) {
        Object[] objArr;
        AbstractC63177Sec abstractC63177Sec = (AbstractC63177Sec) this.A00.get(str);
        if (abstractC63177Sec != null) {
            try {
                Integer num = abstractC63177Sec.A00;
                if (num == null) {
                    objArr = (Object[]) AbstractC63177Sec.A06.get();
                    objArr[0] = view;
                    objArr[1] = abstractC63177Sec.A00(view.getContext(), obj);
                } else {
                    objArr = (Object[]) AbstractC63177Sec.A07.get();
                    objArr[0] = view;
                    objArr[1] = num;
                    objArr[2] = abstractC63177Sec.A00(view.getContext(), obj);
                }
                abstractC63177Sec.A03.invoke(viewManager, objArr);
                Arrays.fill(objArr, (Object) null);
            } catch (Throwable th) {
                String str2 = abstractC63177Sec.A01;
                C0I2.A01(ViewManager.class, AnonymousClass001.A0R("Error while updating prop ", str2), th);
                throw new RuntimeException(AnonymousClass001.A0u("Error while updating property '", str2, "' of a view managed by: ", viewManager.getName()), th);
            }
        }
    }

    public ViewManagerPropertyUpdater$FallbackViewManagerSetter(Class cls) {
        this.A00 = C63369SiY.A03(cls);
    }
}
