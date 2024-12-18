package com.instagram.debug.devoptions.eventvisualizer;

import X.AbstractC11490j8;
import X.AbstractC167007dF;
import X.AbstractC37441oh;
import X.C0CA;
import X.C11T;
import X.C19280xC;
import X.C1HT;
import X.C42751y3;
import X.InterfaceC28041Xi;
import android.os.Handler;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public class EventVisualizerLogger extends AbstractC37441oh {
    public static EventVisualizerLogger sInstance;
    public EventDataListener mListener;
    public final InterfaceC28041Xi mFilterPredicate = new InterfaceC28041Xi() { // from class: com.instagram.debug.devoptions.eventvisualizer.EventVisualizerLogger.1
        @Override // X.InterfaceC28041Xi
        public boolean apply(EventData eventData) {
            if (eventData != null) {
                ArrayList arrayList = EventVisualizerLogger.this.mFilters;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!eventData.mName.contains(str) && !eventData.mDebugString.contains(str)) {
                        }
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
    };
    public final Handler mUiThreadHandler = AbstractC167007dF.A0J();
    public final ArrayList mFilters = new ArrayList();
    public final C1HT mData = new C1HT(200);
    public final C1HT mBuffer = new C1HT(200);

    /* loaded from: classes11.dex */
    public class EventData {
        public final String mDebugString;
        public final String mName;

        public String getDebugString() {
            return this.mDebugString;
        }

        public String getName() {
            return this.mName;
        }

        public EventData(String str, String str2) {
            this.mName = str;
            this.mDebugString = str2;
        }
    }

    /* loaded from: classes11.dex */
    public interface EventDataListener {
        void onNewEventsAdded(EventData eventData);
    }

    @Override // X.AbstractC37441oh
    public void onEventReceivedWithParamsCollectionMap(C0CA c0ca, C42751y3 c42751y3) {
        String str;
        int i = 0;
        while (true) {
            if (i < c0ca.A00) {
                if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(c0ca.A0D(i)) && (c0ca.A0C(i) instanceof String)) {
                    str = (String) c0ca.A0C(i);
                    break;
                }
                i++;
            } else {
                str = "";
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        AbstractC11490j8.A04(c0ca, "| ", sb);
        onEventReceived(new EventData(str, sb.toString()));
    }

    public static EventVisualizerLogger getInstance() {
        EventVisualizerLogger eventVisualizerLogger = sInstance;
        if (eventVisualizerLogger == null) {
            EventVisualizerLogger eventVisualizerLogger2 = new EventVisualizerLogger();
            sInstance = eventVisualizerLogger2;
            return eventVisualizerLogger2;
        }
        return eventVisualizerLogger;
    }

    public void onDebugEventReceived(C19280xC c19280xC) {
        onEventReceived(new EventData(c19280xC.A04, c19280xC.toString()));
    }

    public void onEventReceived(final EventData eventData) {
        this.mUiThreadHandler.post(new Runnable() { // from class: com.instagram.debug.devoptions.eventvisualizer.EventVisualizerLogger.2
            @Override // java.lang.Runnable
            public void run() {
                boolean A1N;
                EventVisualizerLogger.this.mData.A03(eventData);
                EventVisualizerLogger.this.mBuffer.A03(eventData);
                EventDataListener eventDataListener = EventVisualizerLogger.this.mListener;
                if (eventDataListener == null) {
                    return;
                }
                while (true) {
                    C1HT c1ht = EventVisualizerLogger.this.mBuffer;
                    synchronized (c1ht) {
                        A1N = AbstractC167007dF.A1N(c1ht.A00);
                    }
                    if (!A1N) {
                        EventData eventData2 = (EventData) EventVisualizerLogger.this.mBuffer.A00();
                        if (EventVisualizerLogger.this.mFilterPredicate.apply(eventData2)) {
                            eventDataListener.onNewEventsAdded(eventData2);
                        }
                    } else {
                        return;
                    }
                }
            }
        });
    }

    public void requestFilteredData() {
        C11T.A00();
        Iterator it = this.mData.A01().iterator();
        while (it.hasNext()) {
            EventData eventData = (EventData) it.next();
            if (this.mFilterPredicate.apply(eventData)) {
                EventDataListener eventDataListener = this.mListener;
                if (eventDataListener != null) {
                    eventDataListener.onNewEventsAdded(eventData);
                } else {
                    throw new RuntimeException("EventDataListener is null");
                }
            }
        }
    }

    public void setBufferListener(EventDataListener eventDataListener) {
        this.mListener = eventDataListener;
    }

    public void updateFilters(List list) {
        C11T.A00();
        ArrayList arrayList = this.mFilters;
        arrayList.clear();
        arrayList.addAll(list);
    }
}
