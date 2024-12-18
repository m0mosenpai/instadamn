package com.facebook.cameracore.mediapipeline.services.persistence.interfaces;

import X.AbstractC61636Rr0;
import X.C09530e4;
import X.C14360o3;
import X.C83Y;
import X.C83Z;
import X.C90Q;
import X.C90R;
import X.C9YD;
import X.InterfaceC19610xo;
import X.InterfaceC19630xq;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.jni.HybridData;
import com.facebook.native_bridge.NativeDataPromise;
import com.facebook.react.modules.intent.IntentModule;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class PersistenceServiceDelegateJavaHybrid extends PersistenceServiceDelegateHybrid {
    public final C83Z mDelegate;

    private native HybridData initHybrid();

    public void get(String str, NativeDataPromise nativeDataPromise) {
        Object obj;
        String str2;
        C83Z c83z = this.mDelegate;
        if (c83z instanceof C9YD) {
            C9YD c9yd = (C9YD) c83z;
            C14360o3.A0B(str, 0);
            C14360o3.A0B(nativeDataPromise, 1);
            HashMap hashMap = c9yd.A01;
            if (hashMap != null) {
                Object obj2 = hashMap.get(str);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    hashMap.put(str, obj2);
                }
                ((AbstractCollection) obj2).add(nativeDataPromise);
                c9yd.A05.add(AbstractC61636Rr0.A00(new C09530e4("serviceType", 64), new C09530e4("commandType", 2), new C09530e4("delegateScope", Integer.valueOf(c9yd.A00)), new C09530e4("key", str)));
                return;
            }
            return;
        }
        if (c83z instanceof C83Y) {
            C14360o3.A0B(str, 0);
            C14360o3.A0B(nativeDataPromise, 1);
            obj = ((C83Y) c83z).A00.get(str);
        } else {
            if (c83z instanceof C90Q) {
                C90Q c90q = (C90Q) c83z;
                C14360o3.A0B(str, 0);
                C14360o3.A0B(nativeDataPromise, 1);
                if (c90q.A00 == null) {
                    str2 = "Invalid or missing user session";
                } else {
                    InterfaceC19630xq A00 = C90Q.A00(c90q);
                    String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s_%s", c90q.A01, str);
                    C14360o3.A07(formatStrLocaleSafe);
                    obj = A00.getString(formatStrLocaleSafe, null);
                }
            } else {
                obj = ((C90R) c83z).A00.get(str);
                if (obj == null) {
                    str2 = "Key not found";
                }
                nativeDataPromise.setValue(obj);
            }
            nativeDataPromise.setException(str2);
            return;
        }
        if (obj == null) {
            str2 = "Invalid persistence key";
            nativeDataPromise.setException(str2);
            return;
        }
        nativeDataPromise.setValue(obj);
    }

    public void getV2(String str, String str2, String str3, int i, int i2, NativeDataPromise nativeDataPromise) {
        String str4 = str2;
        String str5 = str3;
        C83Z c83z = this.mDelegate;
        if (c83z instanceof C9YD) {
            C9YD c9yd = (C9YD) c83z;
            C14360o3.A0B(str, 0);
            C14360o3.A0B(nativeDataPromise, 5);
            HashMap hashMap = c9yd.A02;
            if (hashMap != null) {
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new ArrayList();
                    hashMap.put(str, obj);
                }
                ((AbstractCollection) obj).add(nativeDataPromise);
                List list = c9yd.A05;
                C09530e4 c09530e4 = new C09530e4("serviceType", 64);
                C09530e4 c09530e42 = new C09530e4("commandType", 3);
                C09530e4 c09530e43 = new C09530e4("delegateScope", Integer.valueOf(c9yd.A00));
                C09530e4 c09530e44 = new C09530e4("key", str);
                if (str2 == null) {
                    str4 = "";
                }
                C09530e4 c09530e45 = new C09530e4("storageIdentifier", str4);
                if (str3 == null) {
                    str5 = "";
                }
                list.add(AbstractC61636Rr0.A00(c09530e4, c09530e42, c09530e43, c09530e44, c09530e45, new C09530e4("assetFBId", str5), new C09530e4("assetType", Integer.valueOf(i2)), new C09530e4("persistenceLocation", Integer.valueOf(i))));
            }
        }
    }

    public void remove(String str, NativeDataPromise nativeDataPromise) {
        boolean z;
        boolean z2;
        C83Z c83z = this.mDelegate;
        if (c83z instanceof C9YD) {
            C9YD c9yd = (C9YD) c83z;
            C14360o3.A0B(str, 0);
            C14360o3.A0B(nativeDataPromise, 1);
            HashMap hashMap = c9yd.A03;
            if (hashMap != null) {
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new ArrayList();
                    hashMap.put(str, obj);
                }
                ((AbstractCollection) obj).add(nativeDataPromise);
                c9yd.A05.add(AbstractC61636Rr0.A00(new C09530e4("serviceType", 64), new C09530e4("commandType", 1), new C09530e4("delegateScope", Integer.valueOf(c9yd.A00)), new C09530e4("key", str)));
                return;
            }
            return;
        }
        if (c83z instanceof C83Y) {
            C14360o3.A0B(str, 0);
            z = true;
            C14360o3.A0B(nativeDataPromise, 1);
            ((C83Y) c83z).A00.remove(str);
        } else if (c83z instanceof C90Q) {
            C90Q c90q = (C90Q) c83z;
            C14360o3.A0B(str, 0);
            z = true;
            C14360o3.A0B(nativeDataPromise, 1);
            if (c90q.A00 == null) {
                z2 = false;
                nativeDataPromise.setValue(z2);
            } else {
                InterfaceC19610xo ARD = C90Q.A00(c90q).ARD();
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s_%s", c90q.A01, str);
                C14360o3.A07(formatStrLocaleSafe);
                ARD.EEj(formatStrLocaleSafe);
                ARD.apply();
            }
        } else {
            ((C90R) c83z).A00.remove(str);
            z = true;
        }
        z2 = Boolean.valueOf(z);
        nativeDataPromise.setValue(z2);
    }

    public void removeV2(String str, String str2, String str3, int i, int i2) {
        String str4 = str2;
        String str5 = str3;
        C83Z c83z = this.mDelegate;
        if (c83z instanceof C9YD) {
            C9YD c9yd = (C9YD) c83z;
            C14360o3.A0B(str, 0);
            List list = c9yd.A05;
            C09530e4 c09530e4 = new C09530e4("serviceType", 64);
            C09530e4 c09530e42 = new C09530e4("commandType", 5);
            C09530e4 c09530e43 = new C09530e4("delegateScope", Integer.valueOf(c9yd.A00));
            C09530e4 c09530e44 = new C09530e4("key", str);
            if (str2 == null) {
                str4 = "";
            }
            C09530e4 c09530e45 = new C09530e4("storageIdentifier", str4);
            if (str3 == null) {
                str5 = "";
            }
            list.add(AbstractC61636Rr0.A00(c09530e4, c09530e42, c09530e43, c09530e44, c09530e45, new C09530e4("assetFBId", str5), new C09530e4("assetType", Integer.valueOf(i2)), new C09530e4("persistenceLocation", Integer.valueOf(i))));
        }
    }

    public void set(String str, String str2, NativeDataPromise nativeDataPromise) {
        boolean z;
        boolean z2;
        C83Z c83z = this.mDelegate;
        if (c83z instanceof C9YD) {
            C9YD c9yd = (C9YD) c83z;
            C14360o3.A0B(str, 0);
            C14360o3.A0B(str2, 1);
            HashMap hashMap = c9yd.A04;
            if (hashMap != null) {
                if (nativeDataPromise != null) {
                    Object obj = hashMap.get(str);
                    if (obj == null) {
                        obj = new ArrayList();
                        hashMap.put(str, obj);
                    }
                    ((AbstractCollection) obj).add(nativeDataPromise);
                }
                c9yd.A05.add(AbstractC61636Rr0.A00(new C09530e4("serviceType", 64), new C09530e4("commandType", 0), new C09530e4("delegateScope", Integer.valueOf(c9yd.A00)), new C09530e4("key", str), new C09530e4(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, str2)));
                return;
            }
            return;
        }
        if (c83z instanceof C83Y) {
            C14360o3.A0B(str, 0);
            z = true;
            C14360o3.A0B(str2, 1);
            ((C83Y) c83z).A00.put(str, str2);
        } else if (c83z instanceof C90Q) {
            C90Q c90q = (C90Q) c83z;
            C14360o3.A0B(str, 0);
            z = true;
            C14360o3.A0B(str2, 1);
            if (c90q.A00 == null) {
                if (nativeDataPromise == null) {
                    return;
                }
                z2 = false;
                nativeDataPromise.setValue(z2);
            }
            InterfaceC19610xo ARD = C90Q.A00(c90q).ARD();
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s_%s", c90q.A01, str);
            C14360o3.A07(formatStrLocaleSafe);
            ARD.E7K(formatStrLocaleSafe, str2);
            ARD.apply();
        } else {
            ((C90R) c83z).A00.put(str, str2);
            if (nativeDataPromise == null) {
                return;
            }
            z = true;
            z2 = Boolean.valueOf(z);
            nativeDataPromise.setValue(z2);
        }
        if (nativeDataPromise == null) {
            return;
        }
        z2 = Boolean.valueOf(z);
        nativeDataPromise.setValue(z2);
    }

    public void setV2(String str, String str2, String str3, String str4, int i, int i2) {
        String str5 = str4;
        String str6 = str3;
        C83Z c83z = this.mDelegate;
        if (c83z instanceof C9YD) {
            C9YD c9yd = (C9YD) c83z;
            C14360o3.A0B(str, 0);
            C14360o3.A0B(str2, 1);
            List list = c9yd.A05;
            C09530e4 c09530e4 = new C09530e4("serviceType", 64);
            C09530e4 c09530e42 = new C09530e4("commandType", 4);
            C09530e4 c09530e43 = new C09530e4("delegateScope", Integer.valueOf(c9yd.A00));
            C09530e4 c09530e44 = new C09530e4("key", str);
            C09530e4 c09530e45 = new C09530e4(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, str2);
            if (str3 == null) {
                str6 = "";
            }
            C09530e4 c09530e46 = new C09530e4("storageIdentifier", str6);
            if (str4 == null) {
                str5 = "";
            }
            list.add(AbstractC61636Rr0.A00(c09530e4, c09530e42, c09530e43, c09530e44, c09530e45, c09530e46, new C09530e4("assetFBId", str5), new C09530e4("assetType", Integer.valueOf(i2)), new C09530e4("persistenceLocation", Integer.valueOf(i))));
        }
    }

    public PersistenceServiceDelegateJavaHybrid(C83Z c83z) {
        this.mDelegate = c83z;
        this.mHybridData = initHybrid();
    }
}
