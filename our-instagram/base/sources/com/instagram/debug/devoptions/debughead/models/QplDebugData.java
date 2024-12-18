package com.instagram.debug.devoptions.debughead.models;

import X.AbstractC07060Yy;
import X.AbstractC166987dD;
import X.AbstractC61879RvB;
import X.C0XX;
import X.C0w9;
import android.util.JsonWriter;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public class QplDebugData {
    public int mDuration;
    public String mEndThreadName;
    public ArrayList mExtras;
    public short mLastActionId;
    public final int mMarkerId;
    public final String mMarkerName;
    public final long mMonotonicStartTimestamp;
    public final List mPoints;
    public String mStartThreadName;
    public final int mUniqueIdentifier;

    public void addPoint(QplPointDebugData qplPointDebugData) {
        this.mPoints.add(qplPointDebugData);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof QplDebugData) && ((QplDebugData) obj).mUniqueIdentifier == this.mUniqueIdentifier) {
            return true;
        }
        return false;
    }

    public String getStatus() {
        return AbstractC07060Yy.A00(this.mLastActionId);
    }

    public int hashCode() {
        return Integer.valueOf(this.mUniqueIdentifier).hashCode();
    }

    public String toFormattedString() {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        jsonWriter.setIndent("\t");
        try {
            jsonWriter.beginObject();
            jsonWriter.name("action").value(AbstractC07060Yy.A00(this.mLastActionId));
            jsonWriter.name("annotations").beginObject();
            ArrayList arrayList = this.mExtras;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jsonWriter.name(AbstractC166987dD.A1B(it)).value(AbstractC166987dD.A1B(it));
                }
            }
            jsonWriter.endObject();
            jsonWriter.name("points").beginArray();
            for (QplPointDebugData qplPointDebugData : this.mPoints) {
                jsonWriter.beginObject();
                jsonWriter.name(PublicKeyCredentialControllerUtility.JSON_KEY_NAME).value(qplPointDebugData.mName);
                if (!qplPointDebugData.mData.isEmpty()) {
                    jsonWriter.name("data").value(qplPointDebugData.mData);
                }
                jsonWriter.name("timestamp").value(qplPointDebugData.mTimestamp - this.mMonotonicStartTimestamp);
                jsonWriter.endObject();
            }
            jsonWriter.endArray();
            jsonWriter.name("threads").beginObject();
            jsonWriter.name("end").value(this.mEndThreadName);
            jsonWriter.name("start").value(this.mStartThreadName);
            jsonWriter.endObject();
            jsonWriter.endObject();
            jsonWriter.close();
        } catch (IOException e) {
            C0w9.A06("QplDebugData", "failed to format QPL event details", e);
        }
        return stringWriter.toString();
    }

    public QplDebugData(C0XX c0xx) {
        ArrayList arrayList;
        this.mMonotonicStartTimestamp = c0xx.BUq();
        this.mMarkerId = c0xx.getMarkerId();
        this.mUniqueIdentifier = c0xx.CCe();
        this.mMarkerName = AbstractC61879RvB.A00(c0xx.getMarkerId());
        this.mDuration = c0xx.Azm();
        this.mLastActionId = c0xx.BLD();
        if (c0xx.B3f() != null) {
            arrayList = AbstractC166987dD.A1F(c0xx.B3f());
        } else {
            arrayList = null;
        }
        this.mExtras = arrayList;
        this.mStartThreadName = Thread.currentThread().getName();
        this.mPoints = AbstractC166987dD.A1E();
    }

    public void updateData(C0XX c0xx) {
        ArrayList arrayList;
        this.mDuration = c0xx.Azm();
        this.mLastActionId = c0xx.BLD();
        if (c0xx.B3f() != null) {
            arrayList = AbstractC166987dD.A1F(c0xx.B3f());
        } else {
            arrayList = null;
        }
        this.mExtras = arrayList;
        this.mEndThreadName = Thread.currentThread().getName();
    }
}
