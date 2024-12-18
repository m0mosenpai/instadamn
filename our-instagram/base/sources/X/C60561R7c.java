package X;

import android.content.Context;
import android.os.Parcelable;
import com.facebook.smartcapture.ig.logging.IgSmartCaptureLoggerProvider;
import com.facebook.smartcapture.logging.CommonLoggingFields;
import com.facebook.smartcapture.logging.SmartCaptureLogger;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.R7c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60561R7c extends OMB {
    public static WeakReference A00;
    public static final C60561R7c A01 = new OMB();

    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        String str2;
        InterfaceC65447TkJ tEf;
        LinkedHashMap A07;
        Object obj;
        Object obj2;
        Object obj3;
        C6FG A09 = C6BQ.A09(c6fq);
        C60561R7c c60561R7c = A01;
        Context context = A09.A00;
        A00 = AbstractC25225BEi.A16(context);
        ArrayList A012 = c60561R7c.A01(c6fq, c6fw);
        if (A012 == null) {
            return null;
        }
        List list = c6fw.A00;
        Object obj4 = list.get(1);
        C14360o3.A0C(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        Map map = (Map) obj4;
        LinkedHashMap A0y = AbstractC43594JPz.A0y(map);
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            Object key = A1K.getKey();
            C6BS c6bs = C6BS.A02;
            A0y.put(key, C6BX.A01(AbstractC25227BEk.A0B(AbstractC58318PtA.A0p(A1K)), true).toString());
        }
        Object obj5 = list.get(2);
        C14360o3.A0C(obj5, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        Map map2 = (Map) obj5;
        ArrayList A0q = AbstractC167017dG.A0q(A012);
        Iterator it = A012.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            Object A0E = AbstractC001800i.A0E(A0y.values(), i);
            C14360o3.A07(A0E);
            Iterator A14 = AbstractC166997dE.A14(A0y);
            while (true) {
                if (A14.hasNext()) {
                    obj2 = A14.next();
                    if (C14360o3.A0K(((Map.Entry) obj2).getValue(), A0E)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj2;
            if (entry != null) {
                obj3 = entry.getKey();
            } else {
                obj3 = null;
            }
            C14360o3.A0A(obj3);
            Object obj6 = map2.get(obj3);
            C14360o3.A0A(obj6);
            A0q.add(new C51u(obj3, next, obj6));
            i = i2;
        }
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 3);
        InterfaceC103384lE A0I2 = AbstractC31175DnJ.A0I(c6fw, 4);
        String A0s = AbstractC31173DnH.A0s(list, 5);
        C102884kP c102884kP = (C102884kP) c6fw.A03(6);
        C14360o3.A0A(c102884kP);
        String A0E2 = c102884kP.A0E();
        long A04 = c102884kP.A04(38, 0L);
        Long valueOf = Long.valueOf(A04);
        Long l = null;
        if (A04 != 0) {
            l = valueOf;
        }
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        SmartCaptureLogger smartCaptureLogger = new IgSmartCaptureLoggerProvider(A0B).get(context);
        Parcelable.Creator creator = CommonLoggingFields.CREATOR;
        EnumC61146Rg7 enumC61146Rg7 = EnumC61146Rg7.A04;
        String A0p = AbstractC58318PtA.A0p((Map.Entry) AbstractC001800i.A09(map2.entrySet()));
        Locale locale = Locale.ROOT;
        String A10 = AbstractC166997dE.A10(locale, A0p);
        if (!A10.equals("SELFIE_VIDEO_NATIVE") && !A10.equals("SELFIE_PHOTO_NATIVE")) {
            str = "v2_id";
        } else {
            str = "v1_selfie";
        }
        C14360o3.A0A(A0s);
        smartCaptureLogger.setCommonFields(new CommonLoggingFields(enumC61146Rg7, str, A0s, String.valueOf(l), null, String.valueOf(l)));
        String A0G = c102884kP.A0G();
        C14360o3.A0B(A0B, 2);
        if (A0G != null) {
            str2 = AbstractC31172DnG.A16(locale, A0G);
        } else {
            str2 = null;
        }
        if (!C14360o3.A0K(str2, "graph_api") && str2 != null) {
            if (str2.equals("upload_service")) {
                if (A0B instanceof UserSession) {
                    tEf = new C64446TEg((UserSession) A0B);
                } else {
                    throw AbstractC166987dD.A12("This session type isn't supported by upload service");
                }
            } else {
                throw AbstractC167007dF.A0c("Unknown uploader name: ", str2);
            }
        } else {
            tEf = new TEf(context);
        }
        InterfaceC65447TkJ interfaceC65447TkJ = tEf;
        if (A0G == null) {
            A07 = null;
        } else {
            A07 = AbstractC06930Yk.A07(AbstractC25230BEn.A1b("upload_infra", A0G));
        }
        smartCaptureLogger.logEvent("upload_started", A07);
        C50150MDd c50150MDd = new C50150MDd(new Object(), 22);
        C50259MHo c50259MHo = new C50259MHo(A09, 17);
        Collection values = A0y.values();
        C14360o3.A0B(values, 3);
        if (AbstractC166987dD.A1a(c50150MDd.invoke())) {
            obj = new T1v(smartCaptureLogger, (Collection) c50259MHo.invoke(values));
        } else {
            obj = new Object();
        }
        interfaceC65447TkJ.FDB(new SO9(smartCaptureLogger, (InterfaceC65374Tj6) obj, A09, c6fq, A0I, A0I2, A0G), l, A0s, A0E2, A0q);
        return null;
    }

    @Override // X.OMB
    public final List A03(C6FW c6fw) {
        Object A10 = MSW.A10(c6fw, 1);
        C14360o3.A0C(A10, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        return AbstractC001800i.A0a(((Map) A10).values());
    }

    @Override // X.OMB
    public final void A04(C6FQ c6fq, C6FW c6fw, String str) {
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 4);
        Object A0a = MSY.A0a(c6fw);
        C14360o3.A0A(A0a);
        C131845xK.A00(c6fq, new C6FW(AbstractC166987dD.A1J(A0a)), A0I);
    }

    @Override // X.OMB
    public final File A02(String str) {
        Context context;
        WeakReference weakReference = A00;
        if (weakReference != null && (context = (Context) weakReference.get()) != null) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("scp_temp_");
            return File.createTempFile(AbstractC166997dE.A0v(UUID.randomUUID(), A1C), AnonymousClass001.A0D(str, '.'), context.getCacheDir());
        }
        return null;
    }
}
