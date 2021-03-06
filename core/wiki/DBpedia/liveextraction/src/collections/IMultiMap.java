package collections;

import java.util.Collection;
import java.util.Map;

public interface IMultiMap<TKey, TValue>
	extends Map<TKey, Collection<TValue>>
{
	void put(TKey key, TValue value);
	
	
	// Returns an empty collection if a key doesn't exist
	Collection<TValue> safeGet(Object key);
}
