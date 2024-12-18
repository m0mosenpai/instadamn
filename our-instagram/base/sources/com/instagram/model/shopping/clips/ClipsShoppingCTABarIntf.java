package com.instagram.model.shopping.clips;

import X.IZV;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public interface ClipsShoppingCTABarIntf extends Parcelable {
    public static final IZV A00 = IZV.A00;

    Float Abx();

    Integer Azv();

    List BhF();

    ClipsShoppingCTABar F5y();

    TreeUpdaterJNI F7o();

    String getCtaBarType();

    String getDestination();

    String getDominantColor();

    String getSubtitle();

    String getTitle();

    String getToggledDestination();

    String getToggledTitle();
}
