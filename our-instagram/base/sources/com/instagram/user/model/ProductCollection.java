package com.instagram.user.model;

import X.C1DV;
import X.C1DY;
import X.C41562IaB;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ProductCollectionV2Type;
import com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus;
import com.instagram.model.shopping.productcollection.ProductCollectionCover;
import com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata;
import java.util.List;

/* loaded from: classes7.dex */
public interface ProductCollection extends Parcelable {
    public static final C41562IaB A00 = C41562IaB.A00;

    String Ap3();

    ProductCollectionReviewStatus ApC();

    ProductCollectionV2Type ApF();

    ProductCollectionCover AsD();

    ProductCollectionDropsMetadata Azb();

    String BSZ();

    List CEC();

    ProductCollection ECD(C1DY c1dy);

    ProductCollectionImpl F7Q(C1DY c1dy);

    ProductCollectionImpl F7R(C1DV c1dv);

    TreeUpdaterJNI F7o();

    String getDescription();

    String getSubtitle();

    String getTitle();
}
