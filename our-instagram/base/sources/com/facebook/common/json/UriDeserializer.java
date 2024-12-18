package com.facebook.common.json;

import android.net.Uri;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;

/* loaded from: classes2.dex */
public class UriDeserializer extends FromStringDeserializer {
    public UriDeserializer() {
        super(Uri.class);
    }
}
