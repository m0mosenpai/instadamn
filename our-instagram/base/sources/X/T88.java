package X;

import android.content.Context;
import android.util.JsonReader;
import android.util.Pair;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes10.dex */
public final class T88 implements InterfaceC216113n {
    public final int A00;
    public final Object A01;

    public T88(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC216113n
    public final /* bridge */ /* synthetic */ Object get() {
        String str;
        switch (this.A00) {
            case 0:
                C62532SFj c62532SFj = (C62532SFj) this.A01;
                String str2 = null;
                try {
                    String[] list = c62532SFj.A00.getAssets().list("dev_dod_folder");
                    if (list != null) {
                        int length = list.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                String str3 = list[i];
                                C14360o3.A0A(str3);
                                if (AbstractC002300n.A0h(str3, "manifest", false) && AbstractC002300n.A0f(str3, RealtimeLogsProvider.LOG_SUFFIX, false)) {
                                    str2 = AnonymousClass001.A0g("dev_dod_folder", File.separator, str3);
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                } catch (IOException e) {
                    C0K8.A0I("DebugDeveloperOverrides", "Failed to list APK assets", e);
                }
                if (str2 == null) {
                    C0K8.A0D("DebugDeveloperOverrides", "Manifest file is missing in APK assets");
                    return null;
                }
                Context context = c62532SFj.A00;
                File A0w = MSW.A0w(MSW.A0w(context.getFilesDir(), str2), "file");
                File parentFile = A0w.getParentFile();
                if (parentFile != null) {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Executor executor = C03220Df.A07;
                    String name = A0w.getName();
                    A1E.add(new AbstractC03210De(str2, A0w.getName()));
                    for (int i2 = 0; i2 < A1E.size(); i2++) {
                        AbstractC03210De abstractC03210De = (AbstractC03210De) A1E.get(i2);
                        abstractC03210De.A00 = MSW.A0w(parentFile, abstractC03210De.A01);
                    }
                    new C03220Df(context, parentFile, name, A1E, executor).A03();
                    try {
                        HashMap A1G = AbstractC166987dD.A1G();
                        JsonReader jsonReader = new JsonReader(new FileReader(A0w));
                        try {
                            jsonReader.beginArray();
                            while (true) {
                                String str4 = null;
                                if (jsonReader.hasNext()) {
                                    jsonReader.beginObject();
                                    String str5 = null;
                                    String str6 = null;
                                    while (jsonReader.hasNext()) {
                                        String nextName = jsonReader.nextName();
                                        if (nextName != null) {
                                            int hashCode = nextName.hashCode();
                                            if (hashCode != -1272046946) {
                                                if (hashCode != -341064690) {
                                                    if (hashCode == 1901043637 && nextName.equals("location")) {
                                                        str6 = jsonReader.nextString();
                                                    }
                                                } else if (nextName.equals("resource")) {
                                                    str4 = jsonReader.nextString();
                                                }
                                            } else if (nextName.equals("flavor")) {
                                                str5 = jsonReader.nextString();
                                            }
                                        }
                                        jsonReader.skipValue();
                                    }
                                    jsonReader.endObject();
                                    if (str4 != null && str5 != null && str6 != null) {
                                        A1G.put(new Pair(str4, str5), str6);
                                    }
                                } else {
                                    jsonReader.endArray();
                                    jsonReader.close();
                                    return new C62424SAz(A1G);
                                }
                            }
                            throw new JSONException("Manifest file is missing required fields");
                        } finally {
                        }
                    } catch (IOException | JSONException e2) {
                        C0K8.A0I("DebugDeveloperOverrides", "Failed to parse manifest file", e2);
                        return null;
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            case 1:
                Object obj = this.A01;
                try {
                    List A02 = AbstractC92144Au.A02(new C70557Wcn(obj, 2), Arrays.asList(Locale.getISOCountries()));
                    C70557Wcn c70557Wcn = new C70557Wcn(obj, 1);
                    if (A02 instanceof Collection) {
                        Iterator it = A02.iterator();
                        int size = A02.size();
                        AbstractC24841Jd.A00(size, "expectedSize");
                        return S35.A00(c70557Wcn, new ImmutableMap.Builder(size), it);
                    }
                    return S35.A00(c70557Wcn, AbstractC58319PtB.A0Z(), A02.iterator());
                } catch (RuntimeException e3) {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("Failed to construct a unique ISO3 index of items: ");
                    throw AbstractC58318PtA.A0e(AbstractC166997dE.A0v(AbstractC92144Au.A02(new C70557Wcn(obj, 2), Arrays.asList(Locale.getISOCountries())), A1C), e3);
                }
            default:
                C1Ee c1Ee = new C1Ee();
                Boolean CdJ = C17060sy.A01.A01((UserSession) this.A01).A03.CdJ();
                if (CdJ != null && CdJ.booleanValue()) {
                    str = "True";
                } else {
                    str = "False";
                }
                c1Ee.A05("remove_birthday_selfie", str);
                return c1Ee;
        }
    }
}
