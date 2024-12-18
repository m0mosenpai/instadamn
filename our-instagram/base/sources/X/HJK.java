package X;

import com.facebook.stash.core.FileStash;
import com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.ParcelableSignalData;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public final class HJK extends AbstractRunnableC14200nk {
    public final /* synthetic */ C42285Io9 A00;

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C42285Io9 c42285Io9 = this.A00;
        ConcurrentHashMap concurrentHashMap = c42285Io9.A04;
        FileStash fileStash = c42285Io9.A00;
        HashMap A1G = AbstractC166987dD.A1G();
        java.util.Set allKeys = fileStash.getAllKeys();
        C14360o3.A07(allKeys);
        int size = allKeys.size();
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = allKeys.iterator();
        int i = 0;
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            InputStream read = fileStash.read(A1B);
            if (read != null) {
                try {
                    C102274j2 A02 = C102274j2.A02();
                    A02.A0I(EnumC912645f.FAIL_ON_EMPTY_BEANS);
                    ParcelableSignalData parcelableSignalData = (ParcelableSignalData) A02.A0B(A02.A09.A01(read), A02.A05.A09(ParcelableSignalData.class));
                    C82603mO c82603mO = C82603mO.A00;
                    C14360o3.A0A(parcelableSignalData);
                    C9BW A022 = c82603mO.A02(parcelableSignalData);
                    A1G.put(A1B, A022);
                    c42285Io9.A02.EID(A022, A1B);
                    i++;
                } catch (IOException e) {
                    e = e;
                    str = "Error reading SignalBundle file into JsonNode: ";
                    C0K8.A0F("AsyncSignalDataPersistentStorage", str, e);
                } catch (Exception e2) {
                    e = e2;
                    str = MSV.A00(762);
                    C0K8.A0F("AsyncSignalDataPersistentStorage", str, e);
                } catch (ExceptionInInitializerError e3) {
                    e = e3;
                    str = "Error init objectMapper: ";
                    C0K8.A0F("AsyncSignalDataPersistentStorage", str, e);
                } catch (NoClassDefFoundError unused) {
                    C0K8.A0C("AsyncSignalDataPersistentStorage", "FbObjectMapper class not found, skipping init");
                }
            }
        }
        c42285Io9.A02.EIG(size, i, AbstractC37300Gc1.A00(currentTimeMillis));
        fileStash.getItemCount();
        A1G.size();
        concurrentHashMap.putAll(A1G);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HJK(C42285Io9 c42285Io9, int i) {
        super(213216919, i, false, false);
        this.A00 = c42285Io9;
    }
}
