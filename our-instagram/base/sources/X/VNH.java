package X;

import com.facebookpay.expresscheckout.logging.ComponentLoggingData;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.listcell.ListCell;
import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public abstract class VNH {
    public static final LinkedHashMap A00(InterfaceC71852X7k interfaceC71852X7k) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ListCell listCell = (ListCell) interfaceC71852X7k;
        LoggingContext loggingContext = listCell.A0N;
        if (loggingContext != null) {
            linkedHashMap.put("logging_context", loggingContext);
            ComponentLoggingData componentLoggingData = listCell.A0M;
            if (componentLoggingData != null) {
                linkedHashMap.put("component_logging_data", componentLoggingData);
                return linkedHashMap;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
