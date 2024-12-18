package com.facebook.smartcapture.logging;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC31171DnF;
import X.C14360o3;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class InMemoryLogger {
    public JSONArray log;
    public final SmartCaptureLogger logger;
    public final long referenceTime;
    public final TimestampProvider timestamp;

    /* loaded from: classes10.dex */
    public final class LogEntryBuilder {
        public final RoundingMode TIMESTAMP_ROUNDING_MODE;
        public final int TIMESTAMP_SCALE;
        public final String event;
        public final JSONObject json;
        public final /* synthetic */ InMemoryLogger this$0;

        public LogEntryBuilder(InMemoryLogger inMemoryLogger, String str, float f) {
            C14360o3.A0B(str, 2);
            this.this$0 = inMemoryLogger;
            this.event = str;
            this.TIMESTAMP_SCALE = 3;
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            this.TIMESTAMP_ROUNDING_MODE = roundingMode;
            JSONObject A0q = AbstractC31171DnF.A0q();
            this.json = A0q;
            try {
                A0q.put(str, BigDecimal.valueOf(f).setScale(3, roundingMode));
            } catch (JSONException e) {
                this.this$0.logJsonError(this.event, e);
            }
        }

        public final LogEntryBuilder put(String str, int i) {
            C14360o3.A0B(str, 0);
            try {
                this.json.put(str, i);
                return this;
            } catch (JSONException e) {
                this.this$0.logJsonError(this.event, e);
                return this;
            }
        }

        public final void submit() {
            this.this$0.logJson(this.json);
        }

        public final LogEntryBuilder put(String str, boolean z) {
            C14360o3.A0B(str, 0);
            try {
                this.json.put(str, z);
                return this;
            } catch (JSONException e) {
                this.this$0.logJsonError(this.event, e);
                return this;
            }
        }

        public final LogEntryBuilder put(String str, Object obj) {
            C14360o3.A0B(str, 0);
            try {
                this.json.put(str, obj);
                return this;
            } catch (JSONException e) {
                this.this$0.logJsonError(this.event, e);
                return this;
            }
        }

        public final LogEntryBuilder put(String str, String str2) {
            C14360o3.A0B(str, 0);
            try {
                this.json.put(str, str2);
                return this;
            } catch (JSONException e) {
                this.this$0.logJsonError(this.event, e);
                return this;
            }
        }
    }

    public final LogEntryBuilder addEntry(String str) {
        C14360o3.A0B(str, 0);
        return new LogEntryBuilder(this, str, ((float) (System.currentTimeMillis() - this.referenceTime)) / 1000.0f);
    }

    public final synchronized void clear() {
        this.log = AbstractC31171DnF.A0p();
    }

    public final synchronized void logJson(JSONObject jSONObject) {
        C14360o3.A0B(jSONObject, 0);
        this.log.put(jSONObject);
    }

    public final void logJsonError(String str, JSONException jSONException) {
        C14360o3.A0B(str, 0);
        this.logger.logError(str, jSONException);
    }

    public synchronized String toString() {
        return AbstractC166987dD.A19(this.log);
    }

    public InMemoryLogger(SmartCaptureLogger smartCaptureLogger, TimestampProvider timestampProvider) {
        AbstractC167017dG.A1P(smartCaptureLogger, timestampProvider);
        this.log = AbstractC31171DnF.A0p();
        this.timestamp = timestampProvider;
        this.logger = smartCaptureLogger;
        this.referenceTime = System.currentTimeMillis();
    }

    public InMemoryLogger(SmartCaptureLogger smartCaptureLogger) {
        C14360o3.A0B(smartCaptureLogger, 1);
        this.log = AbstractC31171DnF.A0p();
        this.timestamp = TimestampProvider.INSTANCE;
        this.logger = smartCaptureLogger;
        this.referenceTime = System.currentTimeMillis();
    }
}
